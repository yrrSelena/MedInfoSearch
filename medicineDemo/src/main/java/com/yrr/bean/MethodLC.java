package com.yrr.bean;

import java.io.Serializable;

public class MethodLC implements Serializable {
    private Integer medId;

    private String detector;

    private String excitationWL;

    private String emissionWL;

    private String chromatographicCol;

    private String colTemperature;

    private String mobilePhase;

    private String flowRate;

    private String injectionVolume;

    private String pretreatmentMethod;

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

    public String getDetector() {
        return detector;
    }

    public void setDetector(String detector) {
        this.detector = detector == null ? null : detector.trim();
    }

    public String getExcitationWL() {
        return excitationWL;
    }

    public void setExcitationWL(String excitationWL) {
        this.excitationWL = excitationWL == null ? null : excitationWL.trim();
    }

    public String getEmissionWL() {
        return emissionWL;
    }

    public void setEmissionWL(String emissionWL) {
        this.emissionWL = emissionWL == null ? null : emissionWL.trim();
    }

    public String getChromatographicCol() {
        return chromatographicCol;
    }

    public void setChromatographicCol(String chromatographicCol) {
        this.chromatographicCol = chromatographicCol == null ? null : chromatographicCol.trim();
    }

    public String getColTemperature() {
        return colTemperature;
    }

    public void setColTemperature(String colTemperature) {
        this.colTemperature = colTemperature == null ? null : colTemperature.trim();
    }

    public String getMobilePhase() {
        return mobilePhase;
    }

    public void setMobilePhase(String mobilePhase) {
        this.mobilePhase = mobilePhase == null ? null : mobilePhase.trim();
    }

    public String getFlowRate() {
        return flowRate;
    }

    public void setFlowRate(String flowRate) {
        this.flowRate = flowRate == null ? null : flowRate.trim();
    }

    public String getInjectionVolume() {
        return injectionVolume;
    }

    public void setInjectionVolume(String injectionVolume) {
        this.injectionVolume = injectionVolume == null ? null : injectionVolume.trim();
    }

    public String getPretreatmentMethod() {
        return pretreatmentMethod;
    }

    public void setPretreatmentMethod(String pretreatmentMethod) {
        this.pretreatmentMethod = pretreatmentMethod == null ? null : pretreatmentMethod.trim();
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