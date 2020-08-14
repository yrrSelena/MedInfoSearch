package com.yrr.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yrr.bean.CNAlias;
import com.yrr.bean.CNAliasExample;
import com.yrr.dao.CNAliasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class CNAliasService {
	@Autowired
	CNAliasMapper cnAliasMapper;

	public String findCNAliasAjax() {
		CNAliasExample cnAliasExample = new CNAliasExample();
		JSONArray jarray = new JSONArray();
		List<CNAlias> list = cnAliasMapper.selectByExample(cnAliasExample);
		// String res="";
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				JSONObject jobject = new JSONObject();
				jobject.put("value", list.get(i).getCnAlias());
				jarray.add(jobject);
				// if(i>0){
				// res += ",";
				// }
				// res += list.get(i).getCnAlias();
			}
		}
		return jarray.toJSONString();
	}

	// public String findCNAliasAjax(String cnAlias){
	// CNAliasExample cnAliasExample = new CNAliasExample();
	// cnAliasExample.createCriteria().andCnAliasLike(cnAlias);
	// List<CNAlias> list = cnAliasMapper.selectByExample(cnAliasExample);
	// String res="";
	// if(list.size()>0) {
	// for(int i= 0; i<list.size();i++) {
	// if(i>0){
	// res += ",";
	// }
	// res += list.get(i).getCnAlias();
	// }
	// }
	// return res;
	// }

	// 通过药品序号medId获得所有的中文别名
	public List<String> selectCNAliasByMedId(Integer medId) {
		CNAliasExample cnAliasExample = new CNAliasExample();
		cnAliasExample.createCriteria().andMedIdEqualTo(medId);
		List<CNAlias> cnAliasList = cnAliasMapper.selectByExample(cnAliasExample);
		List<String> cnAlias = new ArrayList<>();
		Integer len = cnAliasList.size();
		if (len > 0) {
			for (int i = 0; i < len; i++) {
				cnAlias.add(cnAliasList.get(i).getCnAlias());
			}
		}
		return cnAlias;
	}

	// 通过中文别名cnAlias查找medId
	public Set<Integer> selectByCNAlias(String keyword) {
		CNAliasExample cnAliasExample = new CNAliasExample();
		Set<Integer> medIdSet = new HashSet<Integer>();
		String[] keywords = keyword.split(" ");
		for (int i = 0; i < keywords.length; i++) {
			keywords[i] = "%" + keywords[i] + "%";
			cnAliasExample.createCriteria().andCnAliasLike(keywords[i]);
			List<CNAlias> list = cnAliasMapper.selectByExample(cnAliasExample);
			if (list.size() > 0) {
				for (int j = 0; j < list.size(); j++) {
					medIdSet.add(list.get(j).getMedId());
				}
			}
		}
		return medIdSet;
	}

	/*
	 * public List<CNAlias> selectByCNAlias(String cnAlias) { CNAliasExample
	 * cnAliasExample = new CNAliasExample(); cnAlias = "%" + cnAlias + "%";
	 * cnAliasExample.createCriteria().andCnAliasLike(cnAlias); List<CNAlias>
	 * list = cnAliasMapper.selectByExample(cnAliasExample); return list; }
	 */

	public List<CNAlias> selectByExample(CNAliasExample cnAliasExample) {
		return cnAliasMapper.selectByExample(cnAliasExample);
	}

}
