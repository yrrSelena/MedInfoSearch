package com.yrr.bean;

import java.io.Serializable;
import java.util.Date;

public class History implements Serializable {
    private Integer hisId;

    private String content;

    private Date create_time;

    private static final long serialVersionUID = 1L;

    public Integer getHisId() {
        return hisId;
    }

    public void setHisId(Integer hisId) {
        this.hisId = hisId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }
}