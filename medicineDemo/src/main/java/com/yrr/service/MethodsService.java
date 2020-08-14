package com.yrr.service;

import com.yrr.bean.MethodSERS;
import com.yrr.bean.MethodSERSExample;
import com.yrr.dao.MethodSERSMapper;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yrr.bean.Med;
import com.yrr.bean.MedExample;
import com.yrr.bean.MethodGCMS;
import com.yrr.bean.MethodGCMSExample;
import com.yrr.dao.MethodGCMSMapper;
import com.yrr.bean.MethodLC;
import com.yrr.bean.MethodLCExample;
import com.yrr.dao.MethodLCMapper;
import com.yrr.bean.MethodLCMS;
import com.yrr.bean.MethodLCMSExample;
import com.yrr.dao.MethodLCMSMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class MethodsService {
    @Autowired
    MethodSERSMapper methodSERSMapper;
    @Autowired
    MethodGCMSMapper methodGCMSMapper;
    @Autowired
    MethodLCMapper methodLCMapper;
    @Autowired
    MethodLCMSMapper methodLCMSMapper;
    //通过药品序号medId获得所有的检测方法
    public List<String> getMethodsByMedId(Integer medId){
    	List<String> results = new ArrayList<>();
    	MethodSERSExample methodSERSExample=new MethodSERSExample();
    	methodSERSExample.createCriteria().andMedIdEqualTo(medId);
    	List<MethodSERS> methodSERSList = methodSERSMapper.selectByExample(methodSERSExample);
    	Integer len = methodSERSList.size();
    	if(len>0)results.add("表面增强拉曼光谱法");
    	MethodGCMSExample methodGCMSExample=new MethodGCMSExample();
    	methodGCMSExample.createCriteria().andMedIdEqualTo(medId);
    	List<MethodGCMS> methodGCMSList = methodGCMSMapper.selectByExample(methodGCMSExample);
    	len = methodGCMSList.size();
    	if(len>0)results.add("气相色谱质谱法");
    	MethodLCExample methodLCExample=new MethodLCExample();
    	methodLCExample.createCriteria().andMedIdEqualTo(medId);
    	List<MethodLC> methodLCList = methodLCMapper.selectByExample(methodLCExample);
    	len = methodLCList.size();
    	if(len>0)results.add("液相色谱法");
    	MethodLCMSExample methodLCMSExample=new MethodLCMSExample();
    	methodLCMSExample.createCriteria().andMedIdEqualTo(medId);
    	List<MethodLCMS> methodLCMSList = methodLCMSMapper.selectByExample(methodLCMSExample);
    	len = methodLCMSList.size();
    	if(len>0)results.add("液相色谱质谱法");
        return results;
    }
 // 通过method查找medId
 		public Set<Integer> selectByMethod(String keyword) {
 			Set<Integer> medIdSet = new HashSet<Integer>();
 			String[] keywords = keyword.split(" ");
 			for (int i = 0; i < keywords.length; i++) {
 				if("表面增强拉曼光谱法".contains(keywords[i]))
 				{
 					MethodSERSExample methodSERSExample=new MethodSERSExample();
 			    	List<MethodSERS> methodSERSList = methodSERSMapper.selectByExample(methodSERSExample);
 	 				if (methodSERSList.size() > 0) {
 	 					for (int j = 0; j < methodSERSList.size(); j++) {
 	 						medIdSet.add(methodSERSList.get(j).getMedId());
 	 					}
 	 				}
 				}else if("气相色谱质谱法".contains(keywords[i]))
 				{
 					MethodGCMSExample methodGCMSExample=new MethodGCMSExample();
 			    	List<MethodGCMS> methodGCMSList = methodGCMSMapper.selectByExample(methodGCMSExample);
 	 				if (methodGCMSList.size() > 0) {
 	 					for (int j = 0; j < methodGCMSList.size(); j++) {
 	 						medIdSet.add(methodGCMSList.get(j).getMedId());
 	 					}
 	 				}
 				}
 				else if("液相色谱法".contains(keywords[i]))
 				{
 					MethodLCExample methodLCExample=new MethodLCExample();
 			    	List<MethodLC> methodLCList = methodLCMapper.selectByExample(methodLCExample);
 	 				if (methodLCList.size() > 0) {
 	 					for (int j = 0; j < methodLCList.size(); j++) {
 	 						medIdSet.add(methodLCList.get(j).getMedId());
 	 					}
 	 				}
 				}
 				else if("液相色谱质谱法".contains(keywords[i]))
 				{
 					MethodLCMSExample methodLCMSExample=new MethodLCMSExample();
 			    	List<MethodLCMS> methodLCMSList = methodLCMSMapper.selectByExample(methodLCMSExample);
 	 				if (methodLCMSList.size() > 0) {
 	 					for (int j = 0; j < methodLCMSList.size(); j++) {
 	 						medIdSet.add(methodLCMSList.get(j).getMedId());
 	 					}
 	 				}
 				}
 			}
 			return medIdSet;
 		}
 		
 		public String findMethodnamesAjax() {
 			JSONArray jarray = new JSONArray();
        	JSONObject jobject = new JSONObject();
			jobject.put("value", "表面增强拉曼光谱法");
			jarray.add(jobject);
			jobject = new JSONObject();
			jobject.put("value", "气相色谱质谱法");
			jarray.add(jobject);
			jobject = new JSONObject();
			jobject.put("value", "液相色谱法");
			jarray.add(jobject);
			jobject = new JSONObject();
			jobject.put("value", "液相色谱质谱法");
			jarray.add(jobject);
 			return jarray.toJSONString();
 		}
    //
    public MethodSERS getMethodSERS(Integer medId){
    	return methodSERSMapper.selectByPrimaryKey(medId);
    }
    public MethodGCMS getMethodGCMS(Integer medId){
    	return methodGCMSMapper.selectByPrimaryKey(medId);
    }
    public MethodLC getMethodLC(Integer medId){
    	return methodLCMapper.selectByPrimaryKey(medId);
    }
    public MethodLCMS getMethodLCMS(Integer medId){
    	return methodLCMSMapper.selectByPrimaryKey(medId);
    }
}
