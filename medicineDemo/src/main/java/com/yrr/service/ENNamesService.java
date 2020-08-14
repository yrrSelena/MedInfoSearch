package com.yrr.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yrr.bean.ENNames;
import com.yrr.bean.ENNamesExample;
import com.yrr.dao.ENNamesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ENNamesService {
    @Autowired
    ENNamesMapper enNamesMapper;

	public String findENNamesAjax(){
        ENNamesExample enNamesExample = new ENNamesExample();
        List<ENNames> list = enNamesMapper.selectByExample(enNamesExample);
        JSONArray jarray=new JSONArray();
        if(list.size()>0) {
            for(int i= 0; i<list.size();i++) {
            	JSONObject jobject=new JSONObject();
            	jobject.put("value", list.get(i).getEnNames());
            	jarray.add(jobject);
            }
        }
        return jarray.toJSONString();
    }

    //通过药品序号获得所有的英文名称
    public List<String> selectENNamesByMedId(Integer medId){
        ENNamesExample enNamesExample = new ENNamesExample();
        enNamesExample.createCriteria().andMedIdEqualTo(medId);
        List<ENNames> enNamesList = enNamesMapper.selectByExample(enNamesExample);
        List<String> enNames = new ArrayList<>();
        Integer len = enNamesList.size();
        if(len>0) {
            for (int i = 0; i < len; i++) {
                enNames.add(enNamesList.get(i).getEnNames());
            }
        }
        return enNames;
    }

    //通过英文别名enNames查找medId
    public Set<Integer> selectByENName(String enName) {
        ENNamesExample enNamesExample = new ENNamesExample();
        enNamesExample.createCriteria().andEnNamesLike(enName);
        List<ENNames> list = enNamesMapper.selectByExample(enNamesExample);
        Set<Integer> medIdSet = new HashSet<Integer>();
        if(list.size()>0) {
            for(int i= 0; i<list.size();i++) {
                medIdSet.add(list.get(i).getMedId());
            }
        }
        return medIdSet;
    }

}
