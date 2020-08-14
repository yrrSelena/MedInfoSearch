package com.yrr.bean;

import java.io.Serializable;

public class CNAlias implements Serializable {
    private Integer cnAliasId;

    private String cnAlias;

    private Integer medId;

    private static final long serialVersionUID = 1L;

    public Integer getCnAliasId() {
        return cnAliasId;
    }

    public void setCnAliasId(Integer cnAliasId) {
        this.cnAliasId = cnAliasId;
    }

    public String getCnAlias() {
        return cnAlias;
    }

    public void setCnAlias(String cnAlias) {
        this.cnAlias = cnAlias == null ? null : cnAlias.trim();
    }

    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }
}