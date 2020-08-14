package com.yrr.bean;

import java.io.Serializable;

public class MethodGCMS implements Serializable {
    private Integer medId;

    private String ionizationMode;

    private String chromatographicCol;

    private String determinationMethod;

    private String qualityScanRange;

    private String quantitativeIon1;

    private String quantitativeIon2;

    private String quantitativeIon3;

    private String qualitativeIon1;

    private String qualitativeIon2;

    private String qualitativeIon3;

    private String samplePreparation;

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

    public String getIonizationMode() {
        return ionizationMode;
    }

    public void setIonizationMode(String ionizationMode) {
        this.ionizationMode = ionizationMode == null ? null : ionizationMode.trim();
    }

    public String getChromatographicCol() {
        return chromatographicCol;
    }

    public void setChromatographicCol(String chromatographicCol) {
        this.chromatographicCol = chromatographicCol == null ? null : chromatographicCol.trim();
    }

    public String getDeterminationMethod() {
        return determinationMethod;
    }

    public void setDeterminationMethod(String determinationMethod) {
        this.determinationMethod = determinationMethod == null ? null : determinationMethod.trim();
    }

    public String getQualityScanRange() {
        return qualityScanRange;
    }

    public void setQualityScanRange(String qualityScanRange) {
        this.qualityScanRange = qualityScanRange == null ? null : qualityScanRange.trim();
    }

    public String getQuantitativeIon1() {
        return quantitativeIon1;
    }

    public void setQuantitativeIon1(String quantitativeIon1) {
        this.quantitativeIon1 = quantitativeIon1 == null ? null : quantitativeIon1.trim();
    }

    public String getQuantitativeIon2() {
        return quantitativeIon2;
    }

    public void setQuantitativeIon2(String quantitativeIon2) {
        this.quantitativeIon2 = quantitativeIon2 == null ? null : quantitativeIon2.trim();
    }

    public String getQuantitativeIon3() {
        return quantitativeIon3;
    }

    public void setQuantitativeIon3(String quantitativeIon3) {
        this.quantitativeIon3 = quantitativeIon3 == null ? null : quantitativeIon3.trim();
    }

    public String getQualitativeIon1() {
        return qualitativeIon1;
    }

    public void setQualitativeIon1(String qualitativeIon1) {
        this.qualitativeIon1 = qualitativeIon1 == null ? null : qualitativeIon1.trim();
    }

    public String getQualitativeIon2() {
        return qualitativeIon2;
    }

    public void setQualitativeIon2(String qualitativeIon2) {
        this.qualitativeIon2 = qualitativeIon2 == null ? null : qualitativeIon2.trim();
    }

    public String getQualitativeIon3() {
        return qualitativeIon3;
    }

    public void setQualitativeIon3(String qualitativeIon3) {
        this.qualitativeIon3 = qualitativeIon3 == null ? null : qualitativeIon3.trim();
    }

    public String getSamplePreparation() {
        return samplePreparation;
    }

    public void setSamplePreparation(String samplePreparation) {
        this.samplePreparation = samplePreparation == null ? null : samplePreparation.trim();
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