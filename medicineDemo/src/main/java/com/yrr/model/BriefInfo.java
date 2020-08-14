package com.yrr.model;

import java.util.List;

//药物简要信息包括中文名称、别名，英文名称、别名，cas编号，ec编号，分子量等信息
public class BriefInfo {

    private  Integer medId;

    private String cnName;

    private List<String> cnAlias;

    private List<String> enName;

    private List<String> enAlias;

    private String casNum;

    private String ecNum;

    private List<String> formula;

    private String molWt;
    private List<String> testMethods;
    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public List<String> getEnName() {
        return enName;
    }

    public void setEnName(List<String> enName) {
        this.enName = enName;
    }

    public List<String> getCnAlias() {
        return cnAlias;
    }

    public void setCnAlias(List<String> cnAlias) {
        this.cnAlias = cnAlias;
    }

    public List<String> getEnAlias() {
        return enAlias;
    }

    public void setEnAlias(List<String> enAlias) {
        this.enAlias = enAlias;
    }

    public String getCasNum() {
        return casNum;
    }

    public void setCasNum(String casNum) {
        this.casNum = casNum;
    }

    public String getEcNum() {
        return ecNum;
    }

    public void setEcNum(String ecNum) {
        this.ecNum = ecNum;
    }

    public String getMolWt() {
        return molWt;
    }

    public void setMolWt(String molWt) {
        this.molWt = molWt;
    }

    public List<String> getFormula() {
        return formula;
    }

    public void setFormula(List<String> formula) {
        this.formula = formula;
    }

	public List<String> getTestMethods() {
		return testMethods;
	}

	public void setTestMethods(List<String> testMethods) {
		this.testMethods = testMethods;
	}
}
