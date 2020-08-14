package com.yrr.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yrr.bean.Med;
import com.yrr.bean.MedExample;
import com.yrr.dao.MedMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MedService {
	@Autowired
	MedMapper medMapper;

	// public Set<Integer> selectByComplexSearch(String str)
	// {
	// List<Med> list = medMapper.selectByComplexSearch(str);
	// Set<Integer> medIdSet = new HashSet<Integer>();
	// if (list.size() > 0) {
	// for (int i = 0; i < list.size(); i++) {
	// medIdSet.add(list.get(i).getMedId());
	// }
	// }
	// return medIdSet;
	// }

	public String findCNNamesAjax() {
		MedExample medExample = new MedExample();
		List<Med> list = medMapper.selectByExample(medExample);
		JSONArray jarray = new JSONArray();
		// String res="";
		if (list.size() > 0) {
			for (int i = 0; i < list.size(); i++) {
				JSONObject jobject = new JSONObject();
				jobject.put("value", list.get(i).getCnName());
				jarray.add(jobject);
				// if(i>0){
				// res += ",";
				// }
				// res += list.get(i).getCnAlias();
			}
		}
		return jarray.toJSONString();
	}

	// 通过中文名cnNames查找medId
	public Set<Integer> selectByCNName(String keyword) {
		MedExample medExample = new MedExample();
		Set<Integer> medIdSet = new HashSet<Integer>();
		String[] keywords = keyword.split(" ");
		for (int i = 0; i < keywords.length; i++) {
			keywords[i] = "%" + keywords[i] + "%";
			medExample.createCriteria().andCnNameLike(keywords[i]);
			List<Med> list = medMapper.selectByExample(medExample);
			if (list.size() > 0) {
				for (int j = 0; j < list.size(); j++) {
					medIdSet.add(list.get(j).getMedId());
				}
			}
		}
		return medIdSet;
	}
		
	// 通过casNum查找信息
	public Set<Integer> selectByCasNum(String keyword) {
		MedExample medExample = new MedExample();
		Set<Integer> medIdSet = new HashSet<Integer>();
		String[] keywords = keyword.split(" ");
		for (int i = 0; i < keywords.length; i++) {
			keywords[i] = "%" + keywords[i] + "%";
			medExample.createCriteria().andCasNumLike(keywords[i]);
			List<Med> list = medMapper.selectByExample(medExample);
			if (list.size() > 0) {
				for (int j = 0; j < list.size(); j++) {
					medIdSet.add(list.get(j).getMedId());
				}
			}
		}
		return medIdSet;
	}

	public Set<Integer> multipleSelect(String keyword) {
		MedExample medExample = new MedExample();
		Set<Integer> medIdSet = new HashSet<Integer>();
		String[] keywords = keyword.split(" ");
		for (int i = 0; i < keywords.length; i++) {
			keywords[i] = "%" + keywords[i] + "%";
			medExample.createCriteria().andCasNumLike(keywords[i]);
			List<Med> list = medMapper.selectByExample(medExample);
			if (list.size() > 0) {
				for (int j = 0; j < list.size(); j++) {
					medIdSet.add(list.get(j).getMedId());
				}
			}
			medExample = new MedExample();
			medExample.createCriteria().andCasNumLike(keywords[i]);
			list = medMapper.selectByExample(medExample);
			if (list.size() > 0) {
				for (int j = 0; j < list.size(); j++) {
					medIdSet.add(list.get(j).getMedId());
				}
			}
			medExample = new MedExample();
			medExample.createCriteria().andEcNumLike(keywords[i]);
			list = medMapper.selectByExample(medExample);
			if (list.size() > 0) {
				for (int j = 0; j < list.size(); j++) {
					medIdSet.add(list.get(j).getMedId());
				}
			}
		}
		return medIdSet;
	}

	// 通过ecNum查找信息
	public Set<Integer> selectByEcNum(String keyword) {
		MedExample medExample = new MedExample();
		Set<Integer> medIdSet = new HashSet<Integer>();
		String[] keywords = keyword.split(" ");
		for (int i = 0; i < keywords.length; i++) {
			keywords[i] = "%" + keywords[i] + "%";
			medExample.createCriteria().andEcNumLike(keywords[i]);
			List<Med> list = medMapper.selectByExample(medExample);
			if (list.size() > 0) {
				for (int j = 0; j < list.size(); j++) {
					medIdSet.add(list.get(j).getMedId());
				}
			}
		}
		return medIdSet;
	}

	public Med getMedInfo(Integer medId) {
		return medMapper.selectByPrimaryKey(medId);
	}

}
