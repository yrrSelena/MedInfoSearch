package com.yrr.bean;

import java.io.Serializable;

public class MethodSERS implements Serializable {
    private Integer medId;

    private String charPeak1;

    private String charPeak2;

    private String charPeak3;

    private String charPeak4;

    private String charPeak5;

    private String charPeak6;

    private String charPeak7;

    private String charPeak8;

    private String detectionLimit;

    private String featureMap;

    private String reference;

    private String samples;

    private String otherDeterminants;

    private static final long serialVersionUID = 1L;

    public Integer getMedId() {
        return medId;
    }

    public void setMedId(Integer medId) {
        this.medId = medId;
    }

    public String getCharPeak1() {
        return charPeak1;
    }

    public void setCharPeak1(String charPeak1) {
        this.charPeak1 = charPeak1 == null ? null : charPeak1.trim();
    }

    public String getCharPeak2() {
        return charPeak2;
    }

    public void setCharPeak2(String charPeak2) {
        this.charPeak2 = charPeak2 == null ? null : charPeak2.trim();
    }

    public String getCharPeak3() {
        return charPeak3;
    }

    public void setCharPeak3(String charPeak3) {
        this.charPeak3 = charPeak3 == null ? null : charPeak3.trim();
    }

    public String getCharPeak4() {
        return charPeak4;
    }

    public void setCharPeak4(String charPeak4) {
        this.charPeak4 = charPeak4 == null ? null : charPeak4.trim();
    }

    public String getCharPeak5() {
        return charPeak5;
    }

    public void setCharPeak5(String charPeak5) {
        this.charPeak5 = charPeak5 == null ? null : charPeak5.trim();
    }

    public String getCharPeak6() {
        return charPeak6;
    }

    public void setCharPeak6(String charPeak6) {
        this.charPeak6 = charPeak6 == null ? null : charPeak6.trim();
    }

    public String getCharPeak7() {
        return charPeak7;
    }

    public void setCharPeak7(String charPeak7) {
        this.charPeak7 = charPeak7 == null ? null : charPeak7.trim();
    }

    public String getCharPeak8() {
        return charPeak8;
    }

    public void setCharPeak8(String charPeak8) {
        this.charPeak8 = charPeak8 == null ? null : charPeak8.trim();
    }

    public String getDetectionLimit() {
        return detectionLimit;
    }

    public void setDetectionLimit(String detectionLimit) {
        this.detectionLimit = detectionLimit == null ? null : detectionLimit.trim();
    }

    public String getFeatureMap() {
        return featureMap;
    }

    public void setFeatureMap(String featureMap) {
        this.featureMap = featureMap == null ? null : featureMap.trim();
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getSamples() {
        return samples;
    }

    public void setSamples(String samples) {
        this.samples = samples == null ? null : samples.trim();
    }

    public String getOtherDeterminants() {
        return otherDeterminants;
    }

    public void setOtherDeterminants(String otherDeterminants) {
        this.otherDeterminants = otherDeterminants == null ? null : otherDeterminants.trim();
    }
}