package com.yrr.bean;

import java.io.Serializable;

public class ENAlias implements Serializable {
    private Integer enAliasId;

    private String enAlias;

    private Integer medId;

    private static final long serialVersionUID = 1L;

    public Integer getEnAliasId() {
        return enAliasId;
    }

    public void setEnAliasId(Integer enAliasId) {
        this.enAliasId = enAliasId;
    }

    public String getEnAlias() {
        return enAlias;
    }

    public void setEnAlias(String enAlias) {
        this.enAlias = enAlias == null ? null : enAlias.trim();
    }

    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }
}