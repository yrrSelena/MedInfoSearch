package com.yrr.bean;

import java.io.Serializable;

public class MethodLCMS implements Serializable {
    private Integer medId;

    private String detector;

    private String chromatographicCol;

    private String colTemperature;

    private String mobilePhase;

    private String injectionVolume;

    private String icoSource;

    private String detectionMode;

    private String interStandardSub;

    private String quantitativeIonPair1;

    private String quantitativeIonPair2;

    private String quantitativeIonPair3;

    private String qualitativeIonPair1;

    private String qualitativeIonPair2;

    private String qualitativeIonPair3;

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

    public String getInjectionVolume() {
        return injectionVolume;
    }

    public void setInjectionVolume(String injectionVolume) {
        this.injectionVolume = injectionVolume == null ? null : injectionVolume.trim();
    }

    public String getIcoSource() {
        return icoSource;
    }

    public void setIcoSource(String icoSource) {
        this.icoSource = icoSource == null ? null : icoSource.trim();
    }

    public String getDetectionMode() {
        return detectionMode;
    }

    public void setDetectionMode(String detectionMode) {
        this.detectionMode = detectionMode == null ? null : detectionMode.trim();
    }

    public String getInterStandardSub() {
        return interStandardSub;
    }

    public void setInterStandardSub(String interStandardSub) {
        this.interStandardSub = interStandardSub == null ? null : interStandardSub.trim();
    }

    public String getQuantitativeIonPair1() {
        return quantitativeIonPair1;
    }

    public void setQuantitativeIonPair1(String quantitativeIonPair1) {
        this.quantitativeIonPair1 = quantitativeIonPair1 == null ? null : quantitativeIonPair1.trim();
    }

    public String getQuantitativeIonPair2() {
        return quantitativeIonPair2;
    }

    public void setQuantitativeIonPair2(String quantitativeIonPair2) {
        this.quantitativeIonPair2 = quantitativeIonPair2 == null ? null : quantitativeIonPair2.trim();
    }

    public String getQuantitativeIonPair3() {
        return quantitativeIonPair3;
    }

    public void setQuantitativeIonPair3(String quantitativeIonPair3) {
        this.quantitativeIonPair3 = quantitativeIonPair3 == null ? null : quantitativeIonPair3.trim();
    }

    public String getQualitativeIonPair1() {
        return qualitativeIonPair1;
    }

    public void setQualitativeIonPair1(String qualitativeIonPair1) {
        this.qualitativeIonPair1 = qualitativeIonPair1 == null ? null : qualitativeIonPair1.trim();
    }

    public String getQualitativeIonPair2() {
        return qualitativeIonPair2;
    }

    public void setQualitativeIonPair2(String qualitativeIonPair2) {
        this.qualitativeIonPair2 = qualitativeIonPair2 == null ? null : qualitativeIonPair2.trim();
    }

    public String getQualitativeIonPair3() {
        return qualitativeIonPair3;
    }

    public void setQualitativeIonPair3(String qualitativeIonPair3) {
        this.qualitativeIonPair3 = qualitativeIonPair3 == null ? null : qualitativeIonPair3.trim();
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