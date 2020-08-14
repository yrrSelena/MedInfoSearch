package com.yrr.bean;

import java.io.Serializable;

public class ENNames implements Serializable {
    private Integer enNamesId;

    private String enNames;

    private Integer medId;

    private static final long serialVersionUID = 1L;

    public Integer getEnNamesId() {
        return enNamesId;
    }

    public void setEnNamesId(Integer enNamesId) {
        this.enNamesId = enNamesId;
    }

    public String getEnNames() {
        return enNames;
    }

    public void setEnNames(String enNames) {
        this.enNames = enNames == null ? null : enNames.trim();
    }

    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }
}