package com.yrr.bean;

import java.util.ArrayList;
import java.util.List;

public class MethodLCExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MethodLCExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andMedIdIsNull() {
            addCriterion("medId is null");
            return (Criteria) this;
        }

        public Criteria andMedIdIsNotNull() {
            addCriterion("medId is not null");
            return (Criteria) this;
        }

        public Criteria andMedIdEqualTo(Integer value) {
            addCriterion("medId =", value, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdNotEqualTo(Integer value) {
            addCriterion("medId <>", value, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdGreaterThan(Integer value) {
            addCriterion("medId >", value, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("medId >=", value, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdLessThan(Integer value) {
            addCriterion("medId <", value, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdLessThanOrEqualTo(Integer value) {
            addCriterion("medId <=", value, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdIn(List<Integer> values) {
            addCriterion("medId in", values, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdNotIn(List<Integer> values) {
            addCriterion("medId not in", values, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdBetween(Integer value1, Integer value2) {
            addCriterion("medId between", value1, value2, "medId");
            return (Criteria) this;
        }

        public Criteria andMedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("medId not between", value1, value2, "medId");
            return (Criteria) this;
        }

        public Criteria andDetectorIsNull() {
            addCriterion("detector is null");
            return (Criteria) this;
        }

        public Criteria andDetectorIsNotNull() {
            addCriterion("detector is not null");
            return (Criteria) this;
        }

        public Criteria andDetectorEqualTo(String value) {
            addCriterion("detector =", value, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorNotEqualTo(String value) {
            addCriterion("detector <>", value, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorGreaterThan(String value) {
            addCriterion("detector >", value, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorGreaterThanOrEqualTo(String value) {
            addCriterion("detector >=", value, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorLessThan(String value) {
            addCriterion("detector <", value, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorLessThanOrEqualTo(String value) {
            addCriterion("detector <=", value, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorLike(String value) {
            addCriterion("detector like", value, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorNotLike(String value) {
            addCriterion("detector not like", value, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorIn(List<String> values) {
            addCriterion("detector in", values, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorNotIn(List<String> values) {
            addCriterion("detector not in", values, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorBetween(String value1, String value2) {
            addCriterion("detector between", value1, value2, "detector");
            return (Criteria) this;
        }

        public Criteria andDetectorNotBetween(String value1, String value2) {
            addCriterion("detector not between", value1, value2, "detector");
            return (Criteria) this;
        }

        public Criteria andExcitationWLIsNull() {
            addCriterion("excitationWL is null");
            return (Criteria) this;
        }

        public Criteria andExcitationWLIsNotNull() {
            addCriterion("excitationWL is not null");
            return (Criteria) this;
        }

        public Criteria andExcitationWLEqualTo(String value) {
            addCriterion("excitationWL =", value, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLNotEqualTo(String value) {
            addCriterion("excitationWL <>", value, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLGreaterThan(String value) {
            addCriterion("excitationWL >", value, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLGreaterThanOrEqualTo(String value) {
            addCriterion("excitationWL >=", value, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLLessThan(String value) {
            addCriterion("excitationWL <", value, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLLessThanOrEqualTo(String value) {
            addCriterion("excitationWL <=", value, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLLike(String value) {
            addCriterion("excitationWL like", value, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLNotLike(String value) {
            addCriterion("excitationWL not like", value, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLIn(List<String> values) {
            addCriterion("excitationWL in", values, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLNotIn(List<String> values) {
            addCriterion("excitationWL not in", values, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLBetween(String value1, String value2) {
            addCriterion("excitationWL between", value1, value2, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andExcitationWLNotBetween(String value1, String value2) {
            addCriterion("excitationWL not between", value1, value2, "excitationWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLIsNull() {
            addCriterion("emissionWL is null");
            return (Criteria) this;
        }

        public Criteria andEmissionWLIsNotNull() {
            addCriterion("emissionWL is not null");
            return (Criteria) this;
        }

        public Criteria andEmissionWLEqualTo(String value) {
            addCriterion("emissionWL =", value, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLNotEqualTo(String value) {
            addCriterion("emissionWL <>", value, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLGreaterThan(String value) {
            addCriterion("emissionWL >", value, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLGreaterThanOrEqualTo(String value) {
            addCriterion("emissionWL >=", value, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLLessThan(String value) {
            addCriterion("emissionWL <", value, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLLessThanOrEqualTo(String value) {
            addCriterion("emissionWL <=", value, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLLike(String value) {
            addCriterion("emissionWL like", value, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLNotLike(String value) {
            addCriterion("emissionWL not like", value, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLIn(List<String> values) {
            addCriterion("emissionWL in", values, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLNotIn(List<String> values) {
            addCriterion("emissionWL not in", values, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLBetween(String value1, String value2) {
            addCriterion("emissionWL between", value1, value2, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andEmissionWLNotBetween(String value1, String value2) {
            addCriterion("emissionWL not between", value1, value2, "emissionWL");
            return (Criteria) this;
        }

        public Criteria andChromatographicColIsNull() {
            addCriterion("chromatographicCol is null");
            return (Criteria) this;
        }

        public Criteria andChromatographicColIsNotNull() {
            addCriterion("chromatographicCol is not null");
            return (Criteria) this;
        }

        public Criteria andChromatographicColEqualTo(String value) {
            addCriterion("chromatographicCol =", value, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColNotEqualTo(String value) {
            addCriterion("chromatographicCol <>", value, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColGreaterThan(String value) {
            addCriterion("chromatographicCol >", value, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColGreaterThanOrEqualTo(String value) {
            addCriterion("chromatographicCol >=", value, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColLessThan(String value) {
            addCriterion("chromatographicCol <", value, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColLessThanOrEqualTo(String value) {
            addCriterion("chromatographicCol <=", value, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColLike(String value) {
            addCriterion("chromatographicCol like", value, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColNotLike(String value) {
            addCriterion("chromatographicCol not like", value, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColIn(List<String> values) {
            addCriterion("chromatographicCol in", values, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColNotIn(List<String> values) {
            addCriterion("chromatographicCol not in", values, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColBetween(String value1, String value2) {
            addCriterion("chromatographicCol between", value1, value2, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andChromatographicColNotBetween(String value1, String value2) {
            addCriterion("chromatographicCol not between", value1, value2, "chromatographicCol");
            return (Criteria) this;
        }

        public Criteria andColTemperatureIsNull() {
            addCriterion("colTemperature is null");
            return (Criteria) this;
        }

        public Criteria andColTemperatureIsNotNull() {
            addCriterion("colTemperature is not null");
            return (Criteria) this;
        }

        public Criteria andColTemperatureEqualTo(String value) {
            addCriterion("colTemperature =", value, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureNotEqualTo(String value) {
            addCriterion("colTemperature <>", value, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureGreaterThan(String value) {
            addCriterion("colTemperature >", value, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureGreaterThanOrEqualTo(String value) {
            addCriterion("colTemperature >=", value, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureLessThan(String value) {
            addCriterion("colTemperature <", value, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureLessThanOrEqualTo(String value) {
            addCriterion("colTemperature <=", value, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureLike(String value) {
            addCriterion("colTemperature like", value, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureNotLike(String value) {
            addCriterion("colTemperature not like", value, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureIn(List<String> values) {
            addCriterion("colTemperature in", values, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureNotIn(List<String> values) {
            addCriterion("colTemperature not in", values, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureBetween(String value1, String value2) {
            addCriterion("colTemperature between", value1, value2, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andColTemperatureNotBetween(String value1, String value2) {
            addCriterion("colTemperature not between", value1, value2, "colTemperature");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseIsNull() {
            addCriterion("mobilePhase is null");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseIsNotNull() {
            addCriterion("mobilePhase is not null");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseEqualTo(String value) {
            addCriterion("mobilePhase =", value, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseNotEqualTo(String value) {
            addCriterion("mobilePhase <>", value, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseGreaterThan(String value) {
            addCriterion("mobilePhase >", value, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseGreaterThanOrEqualTo(String value) {
            addCriterion("mobilePhase >=", value, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseLessThan(String value) {
            addCriterion("mobilePhase <", value, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseLessThanOrEqualTo(String value) {
            addCriterion("mobilePhase <=", value, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseLike(String value) {
            addCriterion("mobilePhase like", value, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseNotLike(String value) {
            addCriterion("mobilePhase not like", value, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseIn(List<String> values) {
            addCriterion("mobilePhase in", values, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseNotIn(List<String> values) {
            addCriterion("mobilePhase not in", values, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseBetween(String value1, String value2) {
            addCriterion("mobilePhase between", value1, value2, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andMobilePhaseNotBetween(String value1, String value2) {
            addCriterion("mobilePhase not between", value1, value2, "mobilePhase");
            return (Criteria) this;
        }

        public Criteria andFlowRateIsNull() {
            addCriterion("flowRate is null");
            return (Criteria) this;
        }

        public Criteria andFlowRateIsNotNull() {
            addCriterion("flowRate is not null");
            return (Criteria) this;
        }

        public Criteria andFlowRateEqualTo(String value) {
            addCriterion("flowRate =", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateNotEqualTo(String value) {
            addCriterion("flowRate <>", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateGreaterThan(String value) {
            addCriterion("flowRate >", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateGreaterThanOrEqualTo(String value) {
            addCriterion("flowRate >=", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateLessThan(String value) {
            addCriterion("flowRate <", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateLessThanOrEqualTo(String value) {
            addCriterion("flowRate <=", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateLike(String value) {
            addCriterion("flowRate like", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateNotLike(String value) {
            addCriterion("flowRate not like", value, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateIn(List<String> values) {
            addCriterion("flowRate in", values, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateNotIn(List<String> values) {
            addCriterion("flowRate not in", values, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateBetween(String value1, String value2) {
            addCriterion("flowRate between", value1, value2, "flowRate");
            return (Criteria) this;
        }

        public Criteria andFlowRateNotBetween(String value1, String value2) {
            addCriterion("flowRate not between", value1, value2, "flowRate");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeIsNull() {
            addCriterion("injectionVolume is null");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeIsNotNull() {
            addCriterion("injectionVolume is not null");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeEqualTo(String value) {
            addCriterion("injectionVolume =", value, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeNotEqualTo(String value) {
            addCriterion("injectionVolume <>", value, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeGreaterThan(String value) {
            addCriterion("injectionVolume >", value, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeGreaterThanOrEqualTo(String value) {
            addCriterion("injectionVolume >=", value, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeLessThan(String value) {
            addCriterion("injectionVolume <", value, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeLessThanOrEqualTo(String value) {
            addCriterion("injectionVolume <=", value, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeLike(String value) {
            addCriterion("injectionVolume like", value, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeNotLike(String value) {
            addCriterion("injectionVolume not like", value, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeIn(List<String> values) {
            addCriterion("injectionVolume in", values, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeNotIn(List<String> values) {
            addCriterion("injectionVolume not in", values, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeBetween(String value1, String value2) {
            addCriterion("injectionVolume between", value1, value2, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andInjectionVolumeNotBetween(String value1, String value2) {
            addCriterion("injectionVolume not between", value1, value2, "injectionVolume");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodIsNull() {
            addCriterion("pretreatmentMethod is null");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodIsNotNull() {
            addCriterion("pretreatmentMethod is not null");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodEqualTo(String value) {
            addCriterion("pretreatmentMethod =", value, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodNotEqualTo(String value) {
            addCriterion("pretreatmentMethod <>", value, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodGreaterThan(String value) {
            addCriterion("pretreatmentMethod >", value, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pretreatmentMethod >=", value, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodLessThan(String value) {
            addCriterion("pretreatmentMethod <", value, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodLessThanOrEqualTo(String value) {
            addCriterion("pretreatmentMethod <=", value, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodLike(String value) {
            addCriterion("pretreatmentMethod like", value, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodNotLike(String value) {
            addCriterion("pretreatmentMethod not like", value, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodIn(List<String> values) {
            addCriterion("pretreatmentMethod in", values, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodNotIn(List<String> values) {
            addCriterion("pretreatmentMethod not in", values, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodBetween(String value1, String value2) {
            addCriterion("pretreatmentMethod between", value1, value2, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andPretreatmentMethodNotBetween(String value1, String value2) {
            addCriterion("pretreatmentMethod not between", value1, value2, "pretreatmentMethod");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitIsNull() {
            addCriterion("detectionLimit is null");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitIsNotNull() {
            addCriterion("detectionLimit is not null");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitEqualTo(String value) {
            addCriterion("detectionLimit =", value, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitNotEqualTo(String value) {
            addCriterion("detectionLimit <>", value, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitGreaterThan(String value) {
            addCriterion("detectionLimit >", value, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitGreaterThanOrEqualTo(String value) {
            addCriterion("detectionLimit >=", value, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitLessThan(String value) {
            addCriterion("detectionLimit <", value, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitLessThanOrEqualTo(String value) {
            addCriterion("detectionLimit <=", value, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitLike(String value) {
            addCriterion("detectionLimit like", value, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitNotLike(String value) {
            addCriterion("detectionLimit not like", value, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitIn(List<String> values) {
            addCriterion("detectionLimit in", values, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitNotIn(List<String> values) {
            addCriterion("detectionLimit not in", values, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitBetween(String value1, String value2) {
            addCriterion("detectionLimit between", value1, value2, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andDetectionLimitNotBetween(String value1, String value2) {
            addCriterion("detectionLimit not between", value1, value2, "detectionLimit");
            return (Criteria) this;
        }

        public Criteria andFeatureMapIsNull() {
            addCriterion("featureMap is null");
            return (Criteria) this;
        }

        public Criteria andFeatureMapIsNotNull() {
            addCriterion("featureMap is not null");
            return (Criteria) this;
        }

        public Criteria andFeatureMapEqualTo(String value) {
            addCriterion("featureMap =", value, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapNotEqualTo(String value) {
            addCriterion("featureMap <>", value, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapGreaterThan(String value) {
            addCriterion("featureMap >", value, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapGreaterThanOrEqualTo(String value) {
            addCriterion("featureMap >=", value, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapLessThan(String value) {
            addCriterion("featureMap <", value, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapLessThanOrEqualTo(String value) {
            addCriterion("featureMap <=", value, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapLike(String value) {
            addCriterion("featureMap like", value, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapNotLike(String value) {
            addCriterion("featureMap not like", value, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapIn(List<String> values) {
            addCriterion("featureMap in", values, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapNotIn(List<String> values) {
            addCriterion("featureMap not in", values, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapBetween(String value1, String value2) {
            addCriterion("featureMap between", value1, value2, "featureMap");
            return (Criteria) this;
        }

        public Criteria andFeatureMapNotBetween(String value1, String value2) {
            addCriterion("featureMap not between", value1, value2, "featureMap");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNull() {
            addCriterion("reference is null");
            return (Criteria) this;
        }

        public Criteria andReferenceIsNotNull() {
            addCriterion("reference is not null");
            return (Criteria) this;
        }

        public Criteria andReferenceEqualTo(String value) {
            addCriterion("reference =", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotEqualTo(String value) {
            addCriterion("reference <>", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThan(String value) {
            addCriterion("reference >", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceGreaterThanOrEqualTo(String value) {
            addCriterion("reference >=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThan(String value) {
            addCriterion("reference <", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLessThanOrEqualTo(String value) {
            addCriterion("reference <=", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceLike(String value) {
            addCriterion("reference like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotLike(String value) {
            addCriterion("reference not like", value, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceIn(List<String> values) {
            addCriterion("reference in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotIn(List<String> values) {
            addCriterion("reference not in", values, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceBetween(String value1, String value2) {
            addCriterion("reference between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andReferenceNotBetween(String value1, String value2) {
            addCriterion("reference not between", value1, value2, "reference");
            return (Criteria) this;
        }

        public Criteria andSamplesIsNull() {
            addCriterion("samples is null");
            return (Criteria) this;
        }

        public Criteria andSamplesIsNotNull() {
            addCriterion("samples is not null");
            return (Criteria) this;
        }

        public Criteria andSamplesEqualTo(String value) {
            addCriterion("samples =", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesNotEqualTo(String value) {
            addCriterion("samples <>", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesGreaterThan(String value) {
            addCriterion("samples >", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesGreaterThanOrEqualTo(String value) {
            addCriterion("samples >=", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesLessThan(String value) {
            addCriterion("samples <", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesLessThanOrEqualTo(String value) {
            addCriterion("samples <=", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesLike(String value) {
            addCriterion("samples like", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesNotLike(String value) {
            addCriterion("samples not like", value, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesIn(List<String> values) {
            addCriterion("samples in", values, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesNotIn(List<String> values) {
            addCriterion("samples not in", values, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesBetween(String value1, String value2) {
            addCriterion("samples between", value1, value2, "samples");
            return (Criteria) this;
        }

        public Criteria andSamplesNotBetween(String value1, String value2) {
            addCriterion("samples not between", value1, value2, "samples");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsIsNull() {
            addCriterion("otherDeterminants is null");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsIsNotNull() {
            addCriterion("otherDeterminants is not null");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsEqualTo(String value) {
            addCriterion("otherDeterminants =", value, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsNotEqualTo(String value) {
            addCriterion("otherDeterminants <>", value, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsGreaterThan(String value) {
            addCriterion("otherDeterminants >", value, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsGreaterThanOrEqualTo(String value) {
            addCriterion("otherDeterminants >=", value, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsLessThan(String value) {
            addCriterion("otherDeterminants <", value, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsLessThanOrEqualTo(String value) {
            addCriterion("otherDeterminants <=", value, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsLike(String value) {
            addCriterion("otherDeterminants like", value, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsNotLike(String value) {
            addCriterion("otherDeterminants not like", value, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsIn(List<String> values) {
            addCriterion("otherDeterminants in", values, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsNotIn(List<String> values) {
            addCriterion("otherDeterminants not in", values, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsBetween(String value1, String value2) {
            addCriterion("otherDeterminants between", value1, value2, "otherDeterminants");
            return (Criteria) this;
        }

        public Criteria andOtherDeterminantsNotBetween(String value1, String value2) {
            addCriterion("otherDeterminants not between", value1, value2, "otherDeterminants");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}