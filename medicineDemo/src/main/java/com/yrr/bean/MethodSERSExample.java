package com.yrr.bean;

import java.util.ArrayList;
import java.util.List;

public class MethodSERSExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MethodSERSExample() {
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

        public Criteria andCharPeak1IsNull() {
            addCriterion("charPeak1 is null");
            return (Criteria) this;
        }

        public Criteria andCharPeak1IsNotNull() {
            addCriterion("charPeak1 is not null");
            return (Criteria) this;
        }

        public Criteria andCharPeak1EqualTo(String value) {
            addCriterion("charPeak1 =", value, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1NotEqualTo(String value) {
            addCriterion("charPeak1 <>", value, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1GreaterThan(String value) {
            addCriterion("charPeak1 >", value, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1GreaterThanOrEqualTo(String value) {
            addCriterion("charPeak1 >=", value, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1LessThan(String value) {
            addCriterion("charPeak1 <", value, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1LessThanOrEqualTo(String value) {
            addCriterion("charPeak1 <=", value, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1Like(String value) {
            addCriterion("charPeak1 like", value, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1NotLike(String value) {
            addCriterion("charPeak1 not like", value, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1In(List<String> values) {
            addCriterion("charPeak1 in", values, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1NotIn(List<String> values) {
            addCriterion("charPeak1 not in", values, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1Between(String value1, String value2) {
            addCriterion("charPeak1 between", value1, value2, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak1NotBetween(String value1, String value2) {
            addCriterion("charPeak1 not between", value1, value2, "charPeak1");
            return (Criteria) this;
        }

        public Criteria andCharPeak2IsNull() {
            addCriterion("charPeak2 is null");
            return (Criteria) this;
        }

        public Criteria andCharPeak2IsNotNull() {
            addCriterion("charPeak2 is not null");
            return (Criteria) this;
        }

        public Criteria andCharPeak2EqualTo(String value) {
            addCriterion("charPeak2 =", value, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2NotEqualTo(String value) {
            addCriterion("charPeak2 <>", value, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2GreaterThan(String value) {
            addCriterion("charPeak2 >", value, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2GreaterThanOrEqualTo(String value) {
            addCriterion("charPeak2 >=", value, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2LessThan(String value) {
            addCriterion("charPeak2 <", value, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2LessThanOrEqualTo(String value) {
            addCriterion("charPeak2 <=", value, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2Like(String value) {
            addCriterion("charPeak2 like", value, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2NotLike(String value) {
            addCriterion("charPeak2 not like", value, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2In(List<String> values) {
            addCriterion("charPeak2 in", values, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2NotIn(List<String> values) {
            addCriterion("charPeak2 not in", values, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2Between(String value1, String value2) {
            addCriterion("charPeak2 between", value1, value2, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak2NotBetween(String value1, String value2) {
            addCriterion("charPeak2 not between", value1, value2, "charPeak2");
            return (Criteria) this;
        }

        public Criteria andCharPeak3IsNull() {
            addCriterion("charPeak3 is null");
            return (Criteria) this;
        }

        public Criteria andCharPeak3IsNotNull() {
            addCriterion("charPeak3 is not null");
            return (Criteria) this;
        }

        public Criteria andCharPeak3EqualTo(String value) {
            addCriterion("charPeak3 =", value, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3NotEqualTo(String value) {
            addCriterion("charPeak3 <>", value, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3GreaterThan(String value) {
            addCriterion("charPeak3 >", value, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3GreaterThanOrEqualTo(String value) {
            addCriterion("charPeak3 >=", value, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3LessThan(String value) {
            addCriterion("charPeak3 <", value, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3LessThanOrEqualTo(String value) {
            addCriterion("charPeak3 <=", value, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3Like(String value) {
            addCriterion("charPeak3 like", value, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3NotLike(String value) {
            addCriterion("charPeak3 not like", value, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3In(List<String> values) {
            addCriterion("charPeak3 in", values, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3NotIn(List<String> values) {
            addCriterion("charPeak3 not in", values, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3Between(String value1, String value2) {
            addCriterion("charPeak3 between", value1, value2, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak3NotBetween(String value1, String value2) {
            addCriterion("charPeak3 not between", value1, value2, "charPeak3");
            return (Criteria) this;
        }

        public Criteria andCharPeak4IsNull() {
            addCriterion("charPeak4 is null");
            return (Criteria) this;
        }

        public Criteria andCharPeak4IsNotNull() {
            addCriterion("charPeak4 is not null");
            return (Criteria) this;
        }

        public Criteria andCharPeak4EqualTo(String value) {
            addCriterion("charPeak4 =", value, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4NotEqualTo(String value) {
            addCriterion("charPeak4 <>", value, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4GreaterThan(String value) {
            addCriterion("charPeak4 >", value, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4GreaterThanOrEqualTo(String value) {
            addCriterion("charPeak4 >=", value, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4LessThan(String value) {
            addCriterion("charPeak4 <", value, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4LessThanOrEqualTo(String value) {
            addCriterion("charPeak4 <=", value, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4Like(String value) {
            addCriterion("charPeak4 like", value, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4NotLike(String value) {
            addCriterion("charPeak4 not like", value, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4In(List<String> values) {
            addCriterion("charPeak4 in", values, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4NotIn(List<String> values) {
            addCriterion("charPeak4 not in", values, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4Between(String value1, String value2) {
            addCriterion("charPeak4 between", value1, value2, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak4NotBetween(String value1, String value2) {
            addCriterion("charPeak4 not between", value1, value2, "charPeak4");
            return (Criteria) this;
        }

        public Criteria andCharPeak5IsNull() {
            addCriterion("charPeak5 is null");
            return (Criteria) this;
        }

        public Criteria andCharPeak5IsNotNull() {
            addCriterion("charPeak5 is not null");
            return (Criteria) this;
        }

        public Criteria andCharPeak5EqualTo(String value) {
            addCriterion("charPeak5 =", value, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5NotEqualTo(String value) {
            addCriterion("charPeak5 <>", value, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5GreaterThan(String value) {
            addCriterion("charPeak5 >", value, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5GreaterThanOrEqualTo(String value) {
            addCriterion("charPeak5 >=", value, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5LessThan(String value) {
            addCriterion("charPeak5 <", value, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5LessThanOrEqualTo(String value) {
            addCriterion("charPeak5 <=", value, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5Like(String value) {
            addCriterion("charPeak5 like", value, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5NotLike(String value) {
            addCriterion("charPeak5 not like", value, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5In(List<String> values) {
            addCriterion("charPeak5 in", values, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5NotIn(List<String> values) {
            addCriterion("charPeak5 not in", values, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5Between(String value1, String value2) {
            addCriterion("charPeak5 between", value1, value2, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak5NotBetween(String value1, String value2) {
            addCriterion("charPeak5 not between", value1, value2, "charPeak5");
            return (Criteria) this;
        }

        public Criteria andCharPeak6IsNull() {
            addCriterion("charPeak6 is null");
            return (Criteria) this;
        }

        public Criteria andCharPeak6IsNotNull() {
            addCriterion("charPeak6 is not null");
            return (Criteria) this;
        }

        public Criteria andCharPeak6EqualTo(String value) {
            addCriterion("charPeak6 =", value, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6NotEqualTo(String value) {
            addCriterion("charPeak6 <>", value, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6GreaterThan(String value) {
            addCriterion("charPeak6 >", value, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6GreaterThanOrEqualTo(String value) {
            addCriterion("charPeak6 >=", value, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6LessThan(String value) {
            addCriterion("charPeak6 <", value, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6LessThanOrEqualTo(String value) {
            addCriterion("charPeak6 <=", value, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6Like(String value) {
            addCriterion("charPeak6 like", value, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6NotLike(String value) {
            addCriterion("charPeak6 not like", value, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6In(List<String> values) {
            addCriterion("charPeak6 in", values, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6NotIn(List<String> values) {
            addCriterion("charPeak6 not in", values, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6Between(String value1, String value2) {
            addCriterion("charPeak6 between", value1, value2, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak6NotBetween(String value1, String value2) {
            addCriterion("charPeak6 not between", value1, value2, "charPeak6");
            return (Criteria) this;
        }

        public Criteria andCharPeak7IsNull() {
            addCriterion("charPeak7 is null");
            return (Criteria) this;
        }

        public Criteria andCharPeak7IsNotNull() {
            addCriterion("charPeak7 is not null");
            return (Criteria) this;
        }

        public Criteria andCharPeak7EqualTo(String value) {
            addCriterion("charPeak7 =", value, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7NotEqualTo(String value) {
            addCriterion("charPeak7 <>", value, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7GreaterThan(String value) {
            addCriterion("charPeak7 >", value, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7GreaterThanOrEqualTo(String value) {
            addCriterion("charPeak7 >=", value, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7LessThan(String value) {
            addCriterion("charPeak7 <", value, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7LessThanOrEqualTo(String value) {
            addCriterion("charPeak7 <=", value, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7Like(String value) {
            addCriterion("charPeak7 like", value, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7NotLike(String value) {
            addCriterion("charPeak7 not like", value, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7In(List<String> values) {
            addCriterion("charPeak7 in", values, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7NotIn(List<String> values) {
            addCriterion("charPeak7 not in", values, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7Between(String value1, String value2) {
            addCriterion("charPeak7 between", value1, value2, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak7NotBetween(String value1, String value2) {
            addCriterion("charPeak7 not between", value1, value2, "charPeak7");
            return (Criteria) this;
        }

        public Criteria andCharPeak8IsNull() {
            addCriterion("charPeak8 is null");
            return (Criteria) this;
        }

        public Criteria andCharPeak8IsNotNull() {
            addCriterion("charPeak8 is not null");
            return (Criteria) this;
        }

        public Criteria andCharPeak8EqualTo(String value) {
            addCriterion("charPeak8 =", value, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8NotEqualTo(String value) {
            addCriterion("charPeak8 <>", value, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8GreaterThan(String value) {
            addCriterion("charPeak8 >", value, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8GreaterThanOrEqualTo(String value) {
            addCriterion("charPeak8 >=", value, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8LessThan(String value) {
            addCriterion("charPeak8 <", value, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8LessThanOrEqualTo(String value) {
            addCriterion("charPeak8 <=", value, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8Like(String value) {
            addCriterion("charPeak8 like", value, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8NotLike(String value) {
            addCriterion("charPeak8 not like", value, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8In(List<String> values) {
            addCriterion("charPeak8 in", values, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8NotIn(List<String> values) {
            addCriterion("charPeak8 not in", values, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8Between(String value1, String value2) {
            addCriterion("charPeak8 between", value1, value2, "charPeak8");
            return (Criteria) this;
        }

        public Criteria andCharPeak8NotBetween(String value1, String value2) {
            addCriterion("charPeak8 not between", value1, value2, "charPeak8");
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