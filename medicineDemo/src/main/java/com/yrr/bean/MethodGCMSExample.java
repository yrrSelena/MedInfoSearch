package com.yrr.bean;

import java.util.ArrayList;
import java.util.List;

public class MethodGCMSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MethodGCMSExample() {
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

        public Criteria andIonizationModeIsNull() {
            addCriterion("ionizationMode is null");
            return (Criteria) this;
        }

        public Criteria andIonizationModeIsNotNull() {
            addCriterion("ionizationMode is not null");
            return (Criteria) this;
        }

        public Criteria andIonizationModeEqualTo(String value) {
            addCriterion("ionizationMode =", value, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeNotEqualTo(String value) {
            addCriterion("ionizationMode <>", value, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeGreaterThan(String value) {
            addCriterion("ionizationMode >", value, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeGreaterThanOrEqualTo(String value) {
            addCriterion("ionizationMode >=", value, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeLessThan(String value) {
            addCriterion("ionizationMode <", value, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeLessThanOrEqualTo(String value) {
            addCriterion("ionizationMode <=", value, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeLike(String value) {
            addCriterion("ionizationMode like", value, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeNotLike(String value) {
            addCriterion("ionizationMode not like", value, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeIn(List<String> values) {
            addCriterion("ionizationMode in", values, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeNotIn(List<String> values) {
            addCriterion("ionizationMode not in", values, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeBetween(String value1, String value2) {
            addCriterion("ionizationMode between", value1, value2, "ionizationMode");
            return (Criteria) this;
        }

        public Criteria andIonizationModeNotBetween(String value1, String value2) {
            addCriterion("ionizationMode not between", value1, value2, "ionizationMode");
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

        public Criteria andDeterminationMethodIsNull() {
            addCriterion("DeterminationMethod is null");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodIsNotNull() {
            addCriterion("DeterminationMethod is not null");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodEqualTo(String value) {
            addCriterion("DeterminationMethod =", value, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodNotEqualTo(String value) {
            addCriterion("DeterminationMethod <>", value, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodGreaterThan(String value) {
            addCriterion("DeterminationMethod >", value, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodGreaterThanOrEqualTo(String value) {
            addCriterion("DeterminationMethod >=", value, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodLessThan(String value) {
            addCriterion("DeterminationMethod <", value, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodLessThanOrEqualTo(String value) {
            addCriterion("DeterminationMethod <=", value, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodLike(String value) {
            addCriterion("DeterminationMethod like", value, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodNotLike(String value) {
            addCriterion("DeterminationMethod not like", value, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodIn(List<String> values) {
            addCriterion("DeterminationMethod in", values, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodNotIn(List<String> values) {
            addCriterion("DeterminationMethod not in", values, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodBetween(String value1, String value2) {
            addCriterion("DeterminationMethod between", value1, value2, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andDeterminationMethodNotBetween(String value1, String value2) {
            addCriterion("DeterminationMethod not between", value1, value2, "determinationMethod");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeIsNull() {
            addCriterion("qualityScanRange is null");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeIsNotNull() {
            addCriterion("qualityScanRange is not null");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeEqualTo(String value) {
            addCriterion("qualityScanRange =", value, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeNotEqualTo(String value) {
            addCriterion("qualityScanRange <>", value, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeGreaterThan(String value) {
            addCriterion("qualityScanRange >", value, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeGreaterThanOrEqualTo(String value) {
            addCriterion("qualityScanRange >=", value, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeLessThan(String value) {
            addCriterion("qualityScanRange <", value, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeLessThanOrEqualTo(String value) {
            addCriterion("qualityScanRange <=", value, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeLike(String value) {
            addCriterion("qualityScanRange like", value, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeNotLike(String value) {
            addCriterion("qualityScanRange not like", value, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeIn(List<String> values) {
            addCriterion("qualityScanRange in", values, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeNotIn(List<String> values) {
            addCriterion("qualityScanRange not in", values, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeBetween(String value1, String value2) {
            addCriterion("qualityScanRange between", value1, value2, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQualityScanRangeNotBetween(String value1, String value2) {
            addCriterion("qualityScanRange not between", value1, value2, "qualityScanRange");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1IsNull() {
            addCriterion("quantitativeIon1 is null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1IsNotNull() {
            addCriterion("quantitativeIon1 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1EqualTo(String value) {
            addCriterion("quantitativeIon1 =", value, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1NotEqualTo(String value) {
            addCriterion("quantitativeIon1 <>", value, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1GreaterThan(String value) {
            addCriterion("quantitativeIon1 >", value, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1GreaterThanOrEqualTo(String value) {
            addCriterion("quantitativeIon1 >=", value, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1LessThan(String value) {
            addCriterion("quantitativeIon1 <", value, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1LessThanOrEqualTo(String value) {
            addCriterion("quantitativeIon1 <=", value, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1Like(String value) {
            addCriterion("quantitativeIon1 like", value, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1NotLike(String value) {
            addCriterion("quantitativeIon1 not like", value, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1In(List<String> values) {
            addCriterion("quantitativeIon1 in", values, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1NotIn(List<String> values) {
            addCriterion("quantitativeIon1 not in", values, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1Between(String value1, String value2) {
            addCriterion("quantitativeIon1 between", value1, value2, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon1NotBetween(String value1, String value2) {
            addCriterion("quantitativeIon1 not between", value1, value2, "quantitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2IsNull() {
            addCriterion("quantitativeIon2 is null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2IsNotNull() {
            addCriterion("quantitativeIon2 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2EqualTo(String value) {
            addCriterion("quantitativeIon2 =", value, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2NotEqualTo(String value) {
            addCriterion("quantitativeIon2 <>", value, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2GreaterThan(String value) {
            addCriterion("quantitativeIon2 >", value, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2GreaterThanOrEqualTo(String value) {
            addCriterion("quantitativeIon2 >=", value, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2LessThan(String value) {
            addCriterion("quantitativeIon2 <", value, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2LessThanOrEqualTo(String value) {
            addCriterion("quantitativeIon2 <=", value, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2Like(String value) {
            addCriterion("quantitativeIon2 like", value, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2NotLike(String value) {
            addCriterion("quantitativeIon2 not like", value, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2In(List<String> values) {
            addCriterion("quantitativeIon2 in", values, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2NotIn(List<String> values) {
            addCriterion("quantitativeIon2 not in", values, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2Between(String value1, String value2) {
            addCriterion("quantitativeIon2 between", value1, value2, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon2NotBetween(String value1, String value2) {
            addCriterion("quantitativeIon2 not between", value1, value2, "quantitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3IsNull() {
            addCriterion("quantitativeIon3 is null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3IsNotNull() {
            addCriterion("quantitativeIon3 is not null");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3EqualTo(String value) {
            addCriterion("quantitativeIon3 =", value, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3NotEqualTo(String value) {
            addCriterion("quantitativeIon3 <>", value, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3GreaterThan(String value) {
            addCriterion("quantitativeIon3 >", value, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3GreaterThanOrEqualTo(String value) {
            addCriterion("quantitativeIon3 >=", value, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3LessThan(String value) {
            addCriterion("quantitativeIon3 <", value, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3LessThanOrEqualTo(String value) {
            addCriterion("quantitativeIon3 <=", value, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3Like(String value) {
            addCriterion("quantitativeIon3 like", value, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3NotLike(String value) {
            addCriterion("quantitativeIon3 not like", value, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3In(List<String> values) {
            addCriterion("quantitativeIon3 in", values, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3NotIn(List<String> values) {
            addCriterion("quantitativeIon3 not in", values, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3Between(String value1, String value2) {
            addCriterion("quantitativeIon3 between", value1, value2, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQuantitativeIon3NotBetween(String value1, String value2) {
            addCriterion("quantitativeIon3 not between", value1, value2, "quantitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1IsNull() {
            addCriterion("qualitativeIon1 is null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1IsNotNull() {
            addCriterion("qualitativeIon1 is not null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1EqualTo(String value) {
            addCriterion("qualitativeIon1 =", value, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1NotEqualTo(String value) {
            addCriterion("qualitativeIon1 <>", value, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1GreaterThan(String value) {
            addCriterion("qualitativeIon1 >", value, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1GreaterThanOrEqualTo(String value) {
            addCriterion("qualitativeIon1 >=", value, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1LessThan(String value) {
            addCriterion("qualitativeIon1 <", value, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1LessThanOrEqualTo(String value) {
            addCriterion("qualitativeIon1 <=", value, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1Like(String value) {
            addCriterion("qualitativeIon1 like", value, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1NotLike(String value) {
            addCriterion("qualitativeIon1 not like", value, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1In(List<String> values) {
            addCriterion("qualitativeIon1 in", values, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1NotIn(List<String> values) {
            addCriterion("qualitativeIon1 not in", values, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1Between(String value1, String value2) {
            addCriterion("qualitativeIon1 between", value1, value2, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon1NotBetween(String value1, String value2) {
            addCriterion("qualitativeIon1 not between", value1, value2, "qualitativeIon1");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2IsNull() {
            addCriterion("qualitativeIon2 is null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2IsNotNull() {
            addCriterion("qualitativeIon2 is not null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2EqualTo(String value) {
            addCriterion("qualitativeIon2 =", value, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2NotEqualTo(String value) {
            addCriterion("qualitativeIon2 <>", value, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2GreaterThan(String value) {
            addCriterion("qualitativeIon2 >", value, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2GreaterThanOrEqualTo(String value) {
            addCriterion("qualitativeIon2 >=", value, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2LessThan(String value) {
            addCriterion("qualitativeIon2 <", value, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2LessThanOrEqualTo(String value) {
            addCriterion("qualitativeIon2 <=", value, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2Like(String value) {
            addCriterion("qualitativeIon2 like", value, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2NotLike(String value) {
            addCriterion("qualitativeIon2 not like", value, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2In(List<String> values) {
            addCriterion("qualitativeIon2 in", values, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2NotIn(List<String> values) {
            addCriterion("qualitativeIon2 not in", values, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2Between(String value1, String value2) {
            addCriterion("qualitativeIon2 between", value1, value2, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon2NotBetween(String value1, String value2) {
            addCriterion("qualitativeIon2 not between", value1, value2, "qualitativeIon2");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3IsNull() {
            addCriterion("qualitativeIon3 is null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3IsNotNull() {
            addCriterion("qualitativeIon3 is not null");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3EqualTo(String value) {
            addCriterion("qualitativeIon3 =", value, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3NotEqualTo(String value) {
            addCriterion("qualitativeIon3 <>", value, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3GreaterThan(String value) {
            addCriterion("qualitativeIon3 >", value, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3GreaterThanOrEqualTo(String value) {
            addCriterion("qualitativeIon3 >=", value, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3LessThan(String value) {
            addCriterion("qualitativeIon3 <", value, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3LessThanOrEqualTo(String value) {
            addCriterion("qualitativeIon3 <=", value, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3Like(String value) {
            addCriterion("qualitativeIon3 like", value, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3NotLike(String value) {
            addCriterion("qualitativeIon3 not like", value, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3In(List<String> values) {
            addCriterion("qualitativeIon3 in", values, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3NotIn(List<String> values) {
            addCriterion("qualitativeIon3 not in", values, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3Between(String value1, String value2) {
            addCriterion("qualitativeIon3 between", value1, value2, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andQualitativeIon3NotBetween(String value1, String value2) {
            addCriterion("qualitativeIon3 not between", value1, value2, "qualitativeIon3");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationIsNull() {
            addCriterion("samplePreparation is null");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationIsNotNull() {
            addCriterion("samplePreparation is not null");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationEqualTo(String value) {
            addCriterion("samplePreparation =", value, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationNotEqualTo(String value) {
            addCriterion("samplePreparation <>", value, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationGreaterThan(String value) {
            addCriterion("samplePreparation >", value, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationGreaterThanOrEqualTo(String value) {
            addCriterion("samplePreparation >=", value, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationLessThan(String value) {
            addCriterion("samplePreparation <", value, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationLessThanOrEqualTo(String value) {
            addCriterion("samplePreparation <=", value, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationLike(String value) {
            addCriterion("samplePreparation like", value, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationNotLike(String value) {
            addCriterion("samplePreparation not like", value, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationIn(List<String> values) {
            addCriterion("samplePreparation in", values, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationNotIn(List<String> values) {
            addCriterion("samplePreparation not in", values, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationBetween(String value1, String value2) {
            addCriterion("samplePreparation between", value1, value2, "samplePreparation");
            return (Criteria) this;
        }

        public Criteria andSamplePreparationNotBetween(String value1, String value2) {
            addCriterion("samplePreparation not between", value1, value2, "samplePreparation");
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