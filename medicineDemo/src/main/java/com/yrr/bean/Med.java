package com.yrr.bean;

import java.io.Serializable;
import java.util.Date;

public class Med implements Serializable {
    private Integer medId;

    private String cnName;

    private Date time;

    private String casNum;

    private String ecNum;

    private String molWt;

    private String mpmin;

    private String mpmax;

    private String bpmin;

    private String bpmax;

    private String iarc;

    private String introduction;

    private String appearance;

    private String solubility;

    private String toxicity;

    private String limitRequirement;

    private String clinicalCharacter;

    private String metabolicPathway;

    private String metabolite;

    private String food;

    private static final long serialVersionUID = 1L;

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
        this.cnName = cnName == null ? null : cnName.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCasNum() {
        return casNum;
    }

    public void setCasNum(String casNum) {
        this.casNum = casNum == null ? null : casNum.trim();
    }

    public String getEcNum() {
        return ecNum;
    }

    public void setEcNum(String ecNum) {
        this.ecNum = ecNum == null ? null : ecNum.trim();
    }

    public String getMolWt() {
        return molWt;
    }

    public void setMolWt(String molWt) {
        this.molWt = molWt == null ? null : molWt.trim();
    }

    public String getMpmin() {
        return mpmin;
    }

    public void setMpmin(String mpmin) {
        this.mpmin = mpmin == null ? null : mpmin.trim();
    }

    public String getMpmax() {
        return mpmax;
    }

    public void setMpmax(String mpmax) {
        this.mpmax = mpmax == null ? null : mpmax.trim();
    }

    public String getBpmin() {
        return bpmin;
    }

    public void setBpmin(String bpmin) {
        this.bpmin = bpmin == null ? null : bpmin.trim();
    }

    public String getBpmax() {
        return bpmax;
    }

    public void setBpmax(String bpmax) {
        this.bpmax = bpmax == null ? null : bpmax.trim();
    }

    public String getIarc() {
        return iarc;
    }

    public void setIarc(String iarc) {
        this.iarc = iarc == null ? null : iarc.trim();
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction == null ? null : introduction.trim();
    }

    public String getAppearance() {
        return appearance;
    }

    public void setAppearance(String appearance) {
        this.appearance = appearance == null ? null : appearance.trim();
    }

    public String getSolubility() {
        return solubility;
    }

    public void setSolubility(String solubility) {
        this.solubility = solubility == null ? null : solubility.trim();
    }

    public String getToxicity() {
        return toxicity;
    }

    public void setToxicity(String toxicity) {
        this.toxicity = toxicity == null ? null : toxicity.trim();
    }

    public String getLimitRequirement() {
        return limitRequirement;
    }

    public void setLimitRequirement(String limitRequirement) {
        this.limitRequirement = limitRequirement == null ? null : limitRequirement.trim();
    }

    public String getClinicalCharacter() {
        return clinicalCharacter;
    }

    public void setClinicalCharacter(String clinicalCharacter) {
        this.clinicalCharacter = clinicalCharacter == null ? null : clinicalCharacter.trim();
    }

    public String getMetabolicPathway() {
        return metabolicPathway;
    }

    public void setMetabolicPathway(String metabolicPathway) {
        this.metabolicPathway = metabolicPathway == null ? null : metabolicPathway.trim();
    }

    public String getMetabolite() {
        return metabolite;
    }

    public void setMetabolite(String metabolite) {
        this.metabolite = metabolite == null ? null : metabolite.trim();
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food == null ? null : food.trim();
    }
}