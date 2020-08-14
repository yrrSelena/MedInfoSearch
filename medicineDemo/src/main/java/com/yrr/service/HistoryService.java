package com.yrr.service;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yrr.bean.History;
import com.yrr.bean.HistoryExample;
import com.yrr.dao.HistoryMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class HistoryService {
	@Autowired
	HistoryMapper historyMapper;

	public String findHistory() {
		HistoryExample historyExample = new HistoryExample();
		historyExample.setOrderByClause("create_time desc");
		List<History> historyList = historyMapper.selectByExample(historyExample);
		// List<String> list = new ArrayList<>();
		// String res = "";
		JSONArray jarray = new JSONArray();
		if (historyList.size() > 0) {
			for (int i = 0; i < historyList.size(); i++) {
				// if(i>0){
				// res += ",";
				// }
				// res += historyList.get(i).getContent();
				JSONObject jobject = new JSONObject();
				jobject.put("value", historyList.get(i).getContent());
				jarray.add(jobject);
			}
		}
		return jarray.toJSONString();
	}

	public void insertHistory(String content, Date create_time) {
		HistoryExample historyExample = new HistoryExample();
		Long his_cnt = historyMapper.countByExample(historyExample);
		History history = new History();
		history.setContent(content);
		history.setCreate_time(create_time);

		historyExample.createCriteria().andContentEqualTo(content);
		List<History> commonHis = historyMapper.selectByExample(historyExample);
		System.out.println(commonHis.size());
		if (commonHis.size() > 0) {
			historyMapper.updateByExampleSelective(history, historyExample);
		} else {
			// 如果历史记录少于10，则直接插入
			if (his_cnt < 6) {
				historyMapper.insert(history);
			}
			// 如果历史记录大于10，则将搜索时间最久的历史记录替换为新的记录
			else {
				historyExample.clear();
				historyExample.setOrderByClause("create_time asc");
				List<History> historyList = historyMapper.selectByExample(historyExample);
				history.setHisId(historyList.get(0).getHisId());
				historyMapper.updateByPrimaryKey(history);
				System.out.println(historyList.get(0).getHisId());
			}
		}

	}
}
