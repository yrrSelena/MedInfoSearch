package com.yrr.bean;

import java.util.ArrayList;
import java.util.List;

public class MethodLCMSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MethodLCMSExample() {
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

        public Criteria andIcoSourceIsNull() {
            addCriterion("icoSource is null");
            return (Criteria) this;
        }

        public Criteria andIcoSourceIsNotNull() {
            addCriterion("icoSource is not null");
            return (Criteria) this;
        }

        public Criteria andIcoSourceEqualTo(String value) {
            addCriterion("icoSource =", value, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceNotEqualTo(String value) {
            addCriterion("icoSource <>", value, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceGreaterThan(String value) {
            addCriterion("icoSource >", value, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceGreaterThanOrEqualTo(String value) {
            addCriterion("icoSource >=", value, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceLessThan(String value) {
            addCriterion("icoSource <", value, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceLessThanOrEqualTo(String value) {
            addCriterion("icoSource <=", value, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceLike(String value) {
            addCriterion("icoSource like", value, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceNotLike(String value) {
            addCriterion("icoSource not like", value, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceIn(List<String> values) {
            addCriterion("icoSource in", values, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceNotIn(List<String> values) {
            addCriterion("icoSource not in", values, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceBetween(String value1, String value2) {
            addCriterion("icoSource between", value1, value2, "icoSource");
            return (Criteria) this;
        }

        public Criteria andIcoSourceNotBetween(String value1, String value2) {
            addCriterion("icoSource not between", value1, value2, "icoSource");
            return (Criteria) this;
        }

        public Criteria andDetectionModeIsNull() {
            addCriterion("detectionMode is null");
            return (Criteria) this;
        }

        public Criteria andDetectionModeIsNotNull() {
            addCriterion("detectionMode is not null");
            return (Criteria) this;
        }

        public Criteria andDetectionModeEqualTo(String value) {
            addCriterion("detectionMode =", value, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeNotEqualTo(String value) {
            addCriterion("detectionMode <>", value, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeGreaterThan(String value) {
            addCriterion("detectionMode >", value, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeGreaterThanOrEqualTo(String value) {
            addCriterion("detectionMode >=", value, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeLessThan(String value) {
            addCriterion("detectionMode <", value, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeLessThanOrEqualTo(String value) {
            addCriterion("detectionMode <=", value, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeLike(String value) {
            addCriterion("detectionMode like", value, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeNotLike(String value) {
            addCriterion("detectionMode not like", value, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeIn(List<String> values) {
            addCriterion("detectionMode in", values, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeNotIn(List<String> values) {
            addCriterion("detectionMode not in", values, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeBetween(String value1, String value2) {
            addCriterion("detectionMode between", value1, value2, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andDetectionModeNotBetween(String value1, String value2) {
            addCriterion("detectionMode not between", value1, value2, "detectionMode");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubIsNull() {
            addCriterion("interStandardSub is null");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubIsNotNull() {
            addCriterion("interStandardSub is not null");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubEqualTo(String value) {
            addCriterion("interStandardSub =", value, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubNotEqualTo(String value) {
            addCriterion("interStandardSub <>", value, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubGreaterThan(String value) {
            addCriterion("interStandardSub >", value, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubGreaterThanOrEqualTo(String value) {
            addCriterion("interStandardSub >=", value, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubLessThan(String value) {
            addCriterion("interStandardSub <", value, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubLessThanOrEqualTo(String value) {
            addCriterion("interStandardSub <=", value, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubLike(String value) {
            addCriterion("interStandardSub like", value, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubNotLike(String value) {
            addCriterion("interStandardSub not like", value, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubIn(List<String> values) {
            addCriterion("interStandardSub in", values, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubNotIn(List<String> values) {
            addCriterion("interStandardSub not in", values, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubBetween(String value1, String value2) {
            addCriterion("interStandardSub between", value1, value2, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andInterStandardSubNotBetween(String value1, String value2) {
            addCriterion("interStandardSub not between", value1, value2, "interStandardSub");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1IsNull() {
            addCriterion("quantitativeIonPair1 is null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1IsNotNull() {
            addCriterion("quantitativeIonPair1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1EqualTo(String value) {
            addCriterion("quantitativeIonPair1 =", value, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1NotEqualTo(String value) {
            addCriterion("quantitativeIonPair1 <>", value, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1GreaterThan(String value) {
            addCriterion("quantitativeIonPair1 >", value, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1GreaterThanOrEqualTo(String value) {
            addCriterion("quantitativeIonPair1 >=", value, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1LessThan(String value) {
            addCriterion("quantitativeIonPair1 <", value, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1LessThanOrEqualTo(String value) {
            addCriterion("quantitativeIonPair1 <=", value, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1Like(String value) {
            addCriterion("quantitativeIonPair1 like", value, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1NotLike(String value) {
            addCriterion("quantitativeIonPair1 not like", value, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1In(List<String> values) {
            addCriterion("quantitativeIonPair1 in", values, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1NotIn(List<String> values) {
            addCriterion("quantitativeIonPair1 not in", values, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1Between(String value1, String value2) {
            addCriterion("quantitativeIonPair1 between", value1, value2, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair1NotBetween(String value1, String value2) {
            addCriterion("quantitativeIonPair1 not between", value1, value2, "quantitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2IsNull() {
            addCriterion("quantitativeIonPair2 is null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2IsNotNull() {
            addCriterion("quantitativeIonPair2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2EqualTo(String value) {
            addCriterion("quantitativeIonPair2 =", value, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2NotEqualTo(String value) {
            addCriterion("quantitativeIonPair2 <>", value, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2GreaterThan(String value) {
            addCriterion("quantitativeIonPair2 >", value, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2GreaterThanOrEqualTo(String value) {
            addCriterion("quantitativeIonPair2 >=", value, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2LessThan(String value) {
            addCriterion("quantitativeIonPair2 <", value, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2LessThanOrEqualTo(String value) {
            addCriterion("quantitativeIonPair2 <=", value, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2Like(String value) {
            addCriterion("quantitativeIonPair2 like", value, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2NotLike(String value) {
            addCriterion("quantitativeIonPair2 not like", value, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2In(List<String> values) {
            addCriterion("quantitativeIonPair2 in", values, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2NotIn(List<String> values) {
            addCriterion("quantitativeIonPair2 not in", values, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2Between(String value1, String value2) {
            addCriterion("quantitativeIonPair2 between", value1, value2, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair2NotBetween(String value1, String value2) {
            addCriterion("quantitativeIonPair2 not between", value1, value2, "quantitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3IsNull() {
            addCriterion("quantitativeIonPair3 is null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3IsNotNull() {
            addCriterion("quantitativeIonPair3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3EqualTo(String value) {
            addCriterion("quantitativeIonPair3 =", value, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3NotEqualTo(String value) {
            addCriterion("quantitativeIonPair3 <>", value, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3GreaterThan(String value) {
            addCriterion("quantitativeIonPair3 >", value, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3GreaterThanOrEqualTo(String value) {
            addCriterion("quantitativeIonPair3 >=", value, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3LessThan(String value) {
            addCriterion("quantitativeIonPair3 <", value, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3LessThanOrEqualTo(String value) {
            addCriterion("quantitativeIonPair3 <=", value, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3Like(String value) {
            addCriterion("quantitativeIonPair3 like", value, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3NotLike(String value) {
            addCriterion("quantitativeIonPair3 not like", value, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3In(List<String> values) {
            addCriterion("quantitativeIonPair3 in", values, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3NotIn(List<String> values) {
            addCriterion("quantitativeIonPair3 not in", values, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3Between(String value1, String value2) {
            addCriterion("quantitativeIonPair3 between", value1, value2, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIonPair3NotBetween(String value1, String value2) {
            addCriterion("quantitativeIonPair3 not between", value1, value2, "quantitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1IsNull() {
            addCriterion("qualitativeIonPair1 is null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1IsNotNull() {
            addCriterion("qualitativeIonPair1 is not null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1EqualTo(String value) {
            addCriterion("qualitativeIonPair1 =", value, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1NotEqualTo(String value) {
            addCriterion("qualitativeIonPair1 <>", value, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1GreaterThan(String value) {
            addCriterion("qualitativeIonPair1 >", value, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1GreaterThanOrEqualTo(String value) {
            addCriterion("qualitativeIonPair1 >=", value, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1LessThan(String value) {
            addCriterion("qualitativeIonPair1 <", value, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1LessThanOrEqualTo(String value) {
            addCriterion("qualitativeIonPair1 <=", value, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1Like(String value) {
            addCriterion("qualitativeIonPair1 like", value, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1NotLike(String value) {
            addCriterion("qualitativeIonPair1 not like", value, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1In(List<String> values) {
            addCriterion("qualitativeIonPair1 in", values, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1NotIn(List<String> values) {
            addCriterion("qualitativeIonPair1 not in", values, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1Between(String value1, String value2) {
            addCriterion("qualitativeIonPair1 between", value1, value2, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair1NotBetween(String value1, String value2) {
            addCriterion("qualitativeIonPair1 not between", value1, value2, "qualitativeIonPair1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2IsNull() {
            addCriterion("qualitativeIonPair2 is null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2IsNotNull() {
            addCriterion("qualitativeIonPair2 is not null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2EqualTo(String value) {
            addCriterion("qualitativeIonPair2 =", value, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2NotEqualTo(String value) {
            addCriterion("qualitativeIonPair2 <>", value, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2GreaterThan(String value) {
            addCriterion("qualitativeIonPair2 >", value, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2GreaterThanOrEqualTo(String value) {
            addCriterion("qualitativeIonPair2 >=", value, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2LessThan(String value) {
            addCriterion("qualitativeIonPair2 <", value, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2LessThanOrEqualTo(String value) {
            addCriterion("qualitativeIonPair2 <=", value, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2Like(String value) {
            addCriterion("qualitativeIonPair2 like", value, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2NotLike(String value) {
            addCriterion("qualitativeIonPair2 not like", value, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2In(List<String> values) {
            addCriterion("qualitativeIonPair2 in", values, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2NotIn(List<String> values) {
            addCriterion("qualitativeIonPair2 not in", values, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2Between(String value1, String value2) {
            addCriterion("qualitativeIonPair2 between", value1, value2, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair2NotBetween(String value1, String value2) {
            addCriterion("qualitativeIonPair2 not between", value1, value2, "qualitativeIonPair2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3IsNull() {
            addCriterion("qualitativeIonPair3 is null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3IsNotNull() {
            addCriterion("qualitativeIonPair3 is not null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3EqualTo(String value) {
            addCriterion("qualitativeIonPair3 =", value, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3NotEqualTo(String value) {
            addCriterion("qualitativeIonPair3 <>", value, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3GreaterThan(String value) {
            addCriterion("qualitativeIonPair3 >", value, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3GreaterThanOrEqualTo(String value) {
            addCriterion("qualitativeIonPair3 >=", value, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3LessThan(String value) {
            addCriterion("qualitativeIonPair3 <", value, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3LessThanOrEqualTo(String value) {
            addCriterion("qualitativeIonPair3 <=", value, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3Like(String value) {
            addCriterion("qualitativeIonPair3 like", value, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3NotLike(String value) {
            addCriterion("qualitativeIonPair3 not like", value, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3In(List<String> values) {
            addCriterion("qualitativeIonPair3 in", values, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3NotIn(List<String> values) {
            addCriterion("qualitativeIonPair3 not in", values, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3Between(String value1, String value2) {
            addCriterion("qualitativeIonPair3 between", value1, value2, "qualitativeIonPair3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIonPair3NotBetween(String value1, String value2) {
            addCriterion("qualitativeIonPair3 not between", value1, value2, "qualitativeIonPair3");
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