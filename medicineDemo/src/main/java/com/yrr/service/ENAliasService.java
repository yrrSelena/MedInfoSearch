package com.yrr.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yrr.bean.ENAlias;
import com.yrr.bean.ENAliasExample;
import com.yrr.dao.ENAliasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class ENAliasService {
    @Autowired
    ENAliasMapper enAliasMapper;

	public String findENAliasAjax(){
        ENAliasExample enAliasExample = new ENAliasExample();
        List<ENAlias> list = enAliasMapper.selectByExample(enAliasExample);
        JSONArray jarray=new JSONArray();
        if(list.size()>0) {
            for(int i= 0; i<list.size();i++) {
            	JSONObject jobject=new JSONObject();
            	jobject.put("value", list.get(i).getEnAlias());
            	jarray.add(jobject);
            }
        }
        return jarray.toJSONString();
    }

    //通过药品序号medId获得所有的英文别名
    public List<String> selectENAliasByMedId(Integer medId){
        ENAliasExample enAliasExample = new ENAliasExample();
        enAliasExample.createCriteria().andMedIdEqualTo(medId);
        List<ENAlias> enAliasList = enAliasMapper.selectByExample(enAliasExample);
        List<String> enAlias = new ArrayList<>();
        Integer len = enAliasList.size();
        if(len>0) {
            for (int i = 0; i < len; i++) {
                enAlias.add(enAliasList.get(i).getEnAlias());
            }
        }
        return enAlias;
    }
    //通过英文别名enAlias查找medId
    public Set<Integer> selectByENAlias(String keyword) {
        ENAliasExample enAliasExample = new ENAliasExample();
        Set<Integer> medIdSet = new HashSet<Integer>();
        String[] keywords= keyword.split(" ");
        for(int i =0; i<keywords.length;i++){
            keywords[i]="%"+ keywords[i] +"%";
            enAliasExample.createCriteria().andEnAliasLike(keywords[i]);
            List<ENAlias> list = enAliasMapper.selectByExample(enAliasExample);
            if(list.size()>0) {
                for(int j= 0; j<list.size();j++) {
                    medIdSet.add(list.get(j).getMedId());
                }
            }
        }
        return medIdSet;
    }

}
