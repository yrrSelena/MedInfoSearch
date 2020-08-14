package com.yrr.controller;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.yrr.bean.Med;
import com.yrr.bean.MethodGCMS;
import com.yrr.bean.MethodLC;
import com.yrr.bean.MethodLCMS;
import com.yrr.bean.MethodSERS;
import com.yrr.model.BriefInfo;
import com.yrr.model.DetailInfo;
import com.yrr.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
public class MedInfoController {
    @Autowired
    CNAliasService cnAliasService;
    @Autowired
    ENNamesService enNamesService;
    @Autowired
    ENAliasService enAliasService;
    @Autowired
    FormulaService formulaService;
    @Autowired
    MedService medService;
    @Autowired
    HistoryService historyService;
    @Autowired
    MethodsService methodsService;
//    @Autowired
//    static AjaxServlet ajaxServlet;
//
//    public static final Map<Integer,String> map = ajaxServlet.initMap();


//    //划分搜索关键词
//    public String[] splitStr(String keyword){
//        String[] keywords= keyword.split(" ");
//        for(int i =0; i<keywords.length;i++){
//            keywords[i]="%"+ keywords[i] +"%";
//        }
//        return keywords;
//    }

    @RequestMapping(value="getHistory",method = RequestMethod.POST)
    public void getHistory(HttpServletResponse response) throws Exception {
        String res = historyService.findHistory();
        System.out.println(res);
        response.getWriter().write(res);
    }
    //自动补全，获取相关词条
    @RequestMapping(value="findRelated",method= RequestMethod.POST)
    public void findRelated(HttpServletRequest request, HttpServletResponse response) throws Exception {
    	
    	String autoDataType = request.getParameter("autoDataType");
    	System.out.print("******findRelated"+autoDataType+"******");
        String res="";
        //cnt+=1;
        switch(autoDataType){
            case "中文名称":
                res=medService.findCNNamesAjax();
                break;
            case "中文别名":
                res=cnAliasService.findCNAliasAjax();
                break;
            case "英文名称":
                res=enNamesService.findENNamesAjax();
                break;
            case "英文别名":
                res=enAliasService.findENAliasAjax();
                break;
            case "检测方法":
                res=methodsService.findMethodnamesAjax();
                break;
        }
        //String res=cnAliasService.findCNAliasAjax(cnAlias);
        //System.out.println(res);
        //System.out.println(cnt);
        //将结果传回前端
        response.getWriter().write(res);
    }
    @RequestMapping(value = "easySearch", method= RequestMethod.POST)
    public String easySearch(HttpServletRequest request, Model model) {
    	System.out.print("******easySearch******");
        //SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Set<Integer> medIdSet = new HashSet<Integer>();
        String keyword = request.getParameter("keyword");
        System.out.println(keyword);
        //String data = request.getParameter("create_time");//= new Date(); //获取当前时间
        //System.out.println(data);
        Date create_time = new Date();
        historyService.insertHistory(keyword,create_time);
        //System.out.println(date);
        medIdSet.addAll(medService.multipleSelect(keyword));
        medIdSet.addAll(enNamesService.selectByENName(keyword));
        medIdSet.addAll(enAliasService.selectByENAlias(keyword));
        medIdSet.addAll(cnAliasService.selectByCNAlias(keyword));
        Integer len = medIdSet.size();

        if (len >= 1) {
            model.addAttribute("medBriefList", getBriefInfoList(medIdSet)); //getMedBriefInfo(model,medIdSet);
            return "medBriefInfo";
        } else {
            return "cannotFind";
        }
    }

    @RequestMapping( "advancedSearch")
    public String advancedSearch(HttpServletRequest request, Model model) {
        Set<Integer> medIdSet = new HashSet<Integer>();
        String submit_txt = request.getParameter("submit_txt");
        String submit_oper = request.getParameter("submit_oper");
        System.out.println(submit_oper);
        System.out.println(submit_txt);
        String[] txtArray = submit_txt.split(";");
        int arr_len = txtArray.length;
        String[][] txtArray2d = new String[arr_len][];
        for (int i = 0; i < arr_len; i++) {
            txtArray2d[i] = txtArray[i].split("=");
        }
        //输出显示字符串
//        for(String [] row:txtArray2d){
//            for(String s:row){
//                System.out.println(s);
//            }
//        }
//        for (int i = 0;i<txtArray.length; i++) {
//            System.out.println(txtArray[i]);
//        }

        //medIdSet = medService.selectByComplexSearch(submit_txt);
        Integer oper_cnt = -1;
        Set<Integer> medIds = new HashSet<>();
        for(int i = 0; i<arr_len; i++){
            //System.out.println(txtArray2d[i][1]);
            switch(txtArray2d[i][0]){
                case "cnName":
                    medIds = medService.selectByCNName(txtArray2d[i][1]);
                    break;
                case "cnAlias":
                    medIds = cnAliasService.selectByCNAlias(txtArray2d[i][1]);
                    break;
                case "enName":
                    medIds = enNamesService.selectByENName(txtArray2d[i][1]);
                    break;
                case "enAlias":
                    medIds = enAliasService.selectByENAlias(txtArray2d[i][1]);
                    break;
                case "casNum":
                    medIds = medService.selectByCasNum(txtArray2d[i][1]);
                    break;
                case "ecNum":
                    medIds = medService.selectByEcNum(txtArray2d[i][1]);
                    break;
                case "method":
                	medIds=methodsService.selectByMethod(txtArray2d[i][1]);
                	break;
            }

            //逻辑运算符判断
            if(oper_cnt == -1){
                medIdSet.addAll(medIds);
                System.out.println(medIdSet);
            }
            else{
                switch(submit_oper.charAt(oper_cnt))
                {
                    case '&':
                        medIdSet.retainAll(medIds);
                        break;
                    case '|':
                        medIdSet.addAll(medIds);
                        break;
                    case '!':
                        medIdSet.removeAll(medIds);
                        break;
                }
            }
            oper_cnt++;
            //System.out.println(oper_cnt);
            //System.out.println(medIdSet);
        }
        //System.out.println(medIdSet);
        Integer len = medIdSet.size();

        if (len >= 1) {
            model.addAttribute("medBriefList", getBriefInfoList(medIdSet)); //getMedBriefInfo(model,medIdSet);
            return "medBriefInfo";
        } else {
            return "cannotFind";
        }


    }

    @RequestMapping( "getDetail")
    public String getDetailInfo(HttpServletRequest request, Model model){
        Integer medId = Integer.parseInt(request.getParameter("medId"));
        model.addAttribute("detailInfo",getMedDetailInfo(medId));
        //model = getMedInfo(model,medId);
        return "medDetailInfo";
    }
    @RequestMapping( "getMethodDetail")
    public String getMethodDetail(HttpServletRequest request, Model model){
        Integer medId = Integer.parseInt(request.getParameter("medId"));
        System.out.print(medId);
        String method=String.valueOf(request.getParameter("method"));
        System.out.print(method);
        BriefInfo briefInfo=getMedBriefInfo(medId);
        model.addAttribute("CNName",briefInfo.getCnName());
        switch(method){
        case "表面增强拉曼光谱法":
        	MethodSERS methodSERS=methodsService.getMethodSERS(medId);
        	model.addAttribute("SERSInfo",methodSERS);
        	return "SERSDetailInfo";
        case "气相色谱质谱法":
        	MethodGCMS methodGCMS=methodsService.getMethodGCMS(medId);
        	model.addAttribute("GCMSInfo",methodGCMS);
        	return "GCMSDetailInfo";
        case "液相色谱法":
        	MethodLC methodLC=methodsService.getMethodLC(medId);
        	model.addAttribute("LCInfo",methodLC);
        	return "LCDetailInfo";
        case "液相色谱质谱法":
        	MethodLCMS methodLCMS=methodsService.getMethodLCMS(medId);
        	model.addAttribute("LCMSInfo",methodLCMS);
        	return "LCMSDetailInfo";
        }
        return "success";
    }
    public List<BriefInfo> getBriefInfoList(Set<Integer> medIdSet){
        List<BriefInfo> medBriefList= new ArrayList<>();
        for( Integer medId :medIdSet){
            medBriefList.add(getMedBriefInfo(medId));
        }
        return medBriefList;
    }

    //查找得到药物简要信息
    public BriefInfo getMedBriefInfo(Integer medId){
        Med med= medService.getMedInfo(medId);
        //通过药品编号medId获得cnAlias表中药物的中文别名
        List<String> cnAliasList = cnAliasService.selectCNAliasByMedId(medId);
        //System.out.println(cnAliasList.size());
        //通过药品编号medId获得cnAlias表中药物的英文名称
        List<String> enNamesList = enNamesService.selectENNamesByMedId(medId);
        //通过药品编号medId获得cnAlias表中药物的英文别名
        List<String> enAliasList = enAliasService.selectENAliasByMedId(medId);
        //System.out.println(enAliasList.size());
        //通过药品编号medId获得cnAlias表中药物的分子式
        List<String> formulaList = formulaService.selectFormulaByMedId(medId);
        BriefInfo briefInfo = new BriefInfo();
        briefInfo.setMedId(medId);
        briefInfo.setCnName(med.getCnName());
        briefInfo.setCnAlias(cnAliasList);
        briefInfo.setEnName(enNamesList);
        briefInfo.setEnAlias(enAliasList);
        briefInfo.setCasNum(med.getCasNum());
        briefInfo.setEcNum(med.getEcNum());
        briefInfo.setFormula(formulaList);
        briefInfo.setMolWt(med.getMolWt());
        briefInfo.setTestMethods(methodsService.getMethodsByMedId(medId));
        return briefInfo;
    }

    //查找得到药物的详细信息
    public DetailInfo getMedDetailInfo(Integer medId){
        Med med= medService.getMedInfo(medId);
        DetailInfo detailInfo = new DetailInfo();
        detailInfo.setBriefInfo(getMedBriefInfo(medId));
        detailInfo.setAppearance(med.getAppearance());
        detailInfo.setBpmax(med.getBpmax());
        detailInfo.setBpmin(med.getBpmin());
        detailInfo.setClinicalCharacter(med.getClinicalCharacter());
        detailInfo.setIarc(med.getIarc());
        detailInfo.setIntroduction(med.getIntroduction());
        detailInfo.setLimitRequirement(med.getLimitRequirement());
        detailInfo.setMetabolicPathway(med.getMetabolicPathway());
        detailInfo.setMpmax(med.getMpmax());
        detailInfo.setMpmin(med.getMpmin());
        detailInfo.setSolubility(med.getSolubility());
//        detailInfo.setTestMethod(med.getTestMethod());
        detailInfo.setToxicity(med.getToxicity());
        detailInfo.setFood(med.getFood());
        return detailInfo;
    }


}
