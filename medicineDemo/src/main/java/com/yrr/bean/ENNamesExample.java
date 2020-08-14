package com.yrr.bean;

import java.util.ArrayList;
import java.util.List;

public class ENNamesExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ENNamesExample() {
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

        public Criteria andEnNamesIdIsNull() {
            addCriterion("enNamesId is null");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdIsNotNull() {
            addCriterion("enNamesId is not null");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdEqualTo(Integer value) {
            addCriterion("enNamesId =", value, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdNotEqualTo(Integer value) {
            addCriterion("enNamesId <>", value, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdGreaterThan(Integer value) {
            addCriterion("enNamesId >", value, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("enNamesId >=", value, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdLessThan(Integer value) {
            addCriterion("enNamesId <", value, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdLessThanOrEqualTo(Integer value) {
            addCriterion("enNamesId <=", value, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdIn(List<Integer> values) {
            addCriterion("enNamesId in", values, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdNotIn(List<Integer> values) {
            addCriterion("enNamesId not in", values, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdBetween(Integer value1, Integer value2) {
            addCriterion("enNamesId between", value1, value2, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIdNotBetween(Integer value1, Integer value2) {
            addCriterion("enNamesId not between", value1, value2, "enNamesId");
            return (Criteria) this;
        }

        public Criteria andEnNamesIsNull() {
            addCriterion("enNames is null");
            return (Criteria) this;
        }

        public Criteria andEnNamesIsNotNull() {
            addCriterion("enNames is not null");
            return (Criteria) this;
        }

        public Criteria andEnNamesEqualTo(String value) {
            addCriterion("enNames =", value, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesNotEqualTo(String value) {
            addCriterion("enNames <>", value, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesGreaterThan(String value) {
            addCriterion("enNames >", value, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesGreaterThanOrEqualTo(String value) {
            addCriterion("enNames >=", value, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesLessThan(String value) {
            addCriterion("enNames <", value, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesLessThanOrEqualTo(String value) {
            addCriterion("enNames <=", value, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesLike(String value) {
            addCriterion("enNames like", value, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesNotLike(String value) {
            addCriterion("enNames not like", value, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesIn(List<String> values) {
            addCriterion("enNames in", values, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesNotIn(List<String> values) {
            addCriterion("enNames not in", values, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesBetween(String value1, String value2) {
            addCriterion("enNames between", value1, value2, "enNames");
            return (Criteria) this;
        }

        public Criteria andEnNamesNotBetween(String value1, String value2) {
            addCriterion("enNames not between", value1, value2, "enNames");
            return (Criteria) this;
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