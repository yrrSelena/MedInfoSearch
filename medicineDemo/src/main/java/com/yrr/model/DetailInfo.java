package com.yrr.model;

import java.util.List;

public class DetailInfo {

    private BriefInfo briefInfo;

    private String mpmin;

    private String mpmax;

    private String bpmin;

    private String bpmax;

    private String iarc;

    private String introduction;

    private String appearance;

    private String solubility;

    private String toxicity;

    private String clinicalCharacter;

    private String metabolicPathway;

    private String food;
//    private String testMethod;

    private String limitRequirement;

    public BriefInfo getBriefInfo() {
        return briefInfo;
    }

    public void setBriefInfo(BriefInfo briefInfo) {
        this.briefInfo = briefInfo;
    }

    public String getMpmin() {
        return mpmin;
    }

    public void setMpmin(String mpmin) {
        this.mpmin = mpmin;
    }

    public String getMpmax() {
        return mpmax;
    }

    public void setMpmax(String mpmax) {
        this.mpmax = mpmax;
    }

    public String getBpmin() {
        return bpmin;
    }

    public void setBpmin(String bpmin) {
        this.bpmin = bpmin;
    }

    public String getBpmax() {
        return bpmax;
    }

    public void setBpmax(String bpmax) {
        this.bpmax = bpmax;
    }

    public String getIarc() {
        return iarc;
    }

    public void setIarc(String iarc) {
        this.iarc = iarc;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance;
    }

    public String getSolubility() {
        return solubility;
    }

    public void setSolubility(String solubility) {
        this.solubility = solubility;
    }

    public String getToxicity() {
        return toxicity;
    }

    public void setToxicity(String toxicity) {
        this.toxicity = toxicity;
    }

    public String getClinicalCharacter() {
        return clinicalCharacter;
    }

    public void setClinicalCharacter(String clinicalCharacter) {
        this.clinicalCharacter = clinicalCharacter;
    }

    public String getMetabolicPathway() {
        return metabolicPathway;
    }

    public void setMetabolicPathway(String metabolicPathway) {
        this.metabolicPathway = metabolicPathway;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

//    public String getTestMethod() {
//        return testMethod;
//    }
//
//    public void setTestMethod(String testMethod) {
//        this.testMethod = testMethod;
//    }

    public String getLimitRequirement() {
        return limitRequirement;
    }

	public void setLimitRequirement(String limitRequirement) {
        this.limitRequirement = limitRequirement;
    }

}
