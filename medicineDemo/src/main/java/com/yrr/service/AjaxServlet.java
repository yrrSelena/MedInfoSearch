package com.yrr.service;

import com.yrr.bean.CNAlias;
import com.yrr.bean.CNAliasExample;
import com.yrr.dao.CNAliasMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AjaxServlet {
    @Autowired
    CNAliasMapper cnAliasMapper;

    public static Map<Integer,String> map = new HashMap<Integer, String>();
    public Map<Integer,String> initMap() {
        if (map.isEmpty()) {
            CNAliasExample cnAliasExample = new CNAliasExample();
            List<CNAlias> list = cnAliasMapper.selectByExample(cnAliasExample);
            String res = "";
            if (list.size() > 0) {
                for (int i = 0; i < list.size(); i++) {
                    if (i > 0) {
                        res += ",";
                    }
                    res += list.get(i).getCnAlias();
                }
                map.put(1,res);
            }
            System.out.println(res);
        }
        return map;
    }

    public static Map<Integer,String> getMap(){
        return map;
    }

    public static void setMap(Map<Integer,String> map){
        AjaxServlet.map = map;
    }
}
