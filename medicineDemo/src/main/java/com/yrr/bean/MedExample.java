package com.yrr.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MedExample() {
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

        public Criteria andCnNameIsNull() {
            addCriterion("cnName is null");
            return (Criteria) this;
        }

        public Criteria andCnNameIsNotNull() {
            addCriterion("cnName is not null");
            return (Criteria) this;
        }

        public Criteria andCnNameEqualTo(String value) {
            addCriterion("cnName =", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotEqualTo(String value) {
            addCriterion("cnName <>", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThan(String value) {
            addCriterion("cnName >", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameGreaterThanOrEqualTo(String value) {
            addCriterion("cnName >=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThan(String value) {
            addCriterion("cnName <", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLessThanOrEqualTo(String value) {
            addCriterion("cnName <=", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameLike(String value) {
            addCriterion("cnName like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotLike(String value) {
            addCriterion("cnName not like", value, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameIn(List<String> values) {
            addCriterion("cnName in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotIn(List<String> values) {
            addCriterion("cnName not in", values, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameBetween(String value1, String value2) {
            addCriterion("cnName between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andCnNameNotBetween(String value1, String value2) {
            addCriterion("cnName not between", value1, value2, "cnName");
            return (Criteria) this;
        }

        public Criteria andTimeIsNull() {
            addCriterion("time is null");
            return (Criteria) this;
        }

        public Criteria andTimeIsNotNull() {
            addCriterion("time is not null");
            return (Criteria) this;
        }

        public Criteria andTimeEqualTo(Date value) {
            addCriterion("time =", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotEqualTo(Date value) {
            addCriterion("time <>", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThan(Date value) {
            addCriterion("time >", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("time >=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThan(Date value) {
            addCriterion("time <", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeLessThanOrEqualTo(Date value) {
            addCriterion("time <=", value, "time");
            return (Criteria) this;
        }

        public Criteria andTimeIn(List<Date> values) {
            addCriterion("time in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotIn(List<Date> values) {
            addCriterion("time not in", values, "time");
            return (Criteria) this;
        }

        public Criteria andTimeBetween(Date value1, Date value2) {
            addCriterion("time between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andTimeNotBetween(Date value1, Date value2) {
            addCriterion("time not between", value1, value2, "time");
            return (Criteria) this;
        }

        public Criteria andCasNumIsNull() {
            addCriterion("casNum is null");
            return (Criteria) this;
        }

        public Criteria andCasNumIsNotNull() {
            addCriterion("casNum is not null");
            return (Criteria) this;
        }

        public Criteria andCasNumEqualTo(String value) {
            addCriterion("casNum =", value, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumNotEqualTo(String value) {
            addCriterion("casNum <>", value, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumGreaterThan(String value) {
            addCriterion("casNum >", value, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumGreaterThanOrEqualTo(String value) {
            addCriterion("casNum >=", value, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumLessThan(String value) {
            addCriterion("casNum <", value, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumLessThanOrEqualTo(String value) {
            addCriterion("casNum <=", value, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumLike(String value) {
            addCriterion("casNum like", value, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumNotLike(String value) {
            addCriterion("casNum not like", value, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumIn(List<String> values) {
            addCriterion("casNum in", values, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumNotIn(List<String> values) {
            addCriterion("casNum not in", values, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumBetween(String value1, String value2) {
            addCriterion("casNum between", value1, value2, "casNum");
            return (Criteria) this;
        }

        public Criteria andCasNumNotBetween(String value1, String value2) {
            addCriterion("casNum not between", value1, value2, "casNum");
            return (Criteria) this;
        }

        public Criteria andEcNumIsNull() {
            addCriterion("ecNum is null");
            return (Criteria) this;
        }

        public Criteria andEcNumIsNotNull() {
            addCriterion("ecNum is not null");
            return (Criteria) this;
        }

        public Criteria andEcNumEqualTo(String value) {
            addCriterion("ecNum =", value, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumNotEqualTo(String value) {
            addCriterion("ecNum <>", value, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumGreaterThan(String value) {
            addCriterion("ecNum >", value, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumGreaterThanOrEqualTo(String value) {
            addCriterion("ecNum >=", value, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumLessThan(String value) {
            addCriterion("ecNum <", value, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumLessThanOrEqualTo(String value) {
            addCriterion("ecNum <=", value, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumLike(String value) {
            addCriterion("ecNum like", value, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumNotLike(String value) {
            addCriterion("ecNum not like", value, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumIn(List<String> values) {
            addCriterion("ecNum in", values, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumNotIn(List<String> values) {
            addCriterion("ecNum not in", values, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumBetween(String value1, String value2) {
            addCriterion("ecNum between", value1, value2, "ecNum");
            return (Criteria) this;
        }

        public Criteria andEcNumNotBetween(String value1, String value2) {
            addCriterion("ecNum not between", value1, value2, "ecNum");
            return (Criteria) this;
        }

        public Criteria andMolWtIsNull() {
            addCriterion("molWt is null");
            return (Criteria) this;
        }

        public Criteria andMolWtIsNotNull() {
            addCriterion("molWt is not null");
            return (Criteria) this;
        }

        public Criteria andMolWtEqualTo(String value) {
            addCriterion("molWt =", value, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtNotEqualTo(String value) {
            addCriterion("molWt <>", value, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtGreaterThan(String value) {
            addCriterion("molWt >", value, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtGreaterThanOrEqualTo(String value) {
            addCriterion("molWt >=", value, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtLessThan(String value) {
            addCriterion("molWt <", value, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtLessThanOrEqualTo(String value) {
            addCriterion("molWt <=", value, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtLike(String value) {
            addCriterion("molWt like", value, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtNotLike(String value) {
            addCriterion("molWt not like", value, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtIn(List<String> values) {
            addCriterion("molWt in", values, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtNotIn(List<String> values) {
            addCriterion("molWt not in", values, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtBetween(String value1, String value2) {
            addCriterion("molWt between", value1, value2, "molWt");
            return (Criteria) this;
        }

        public Criteria andMolWtNotBetween(String value1, String value2) {
            addCriterion("molWt not between", value1, value2, "molWt");
            return (Criteria) this;
        }

        public Criteria andMpminIsNull() {
            addCriterion("mpmin is null");
            return (Criteria) this;
        }

        public Criteria andMpminIsNotNull() {
            addCriterion("mpmin is not null");
            return (Criteria) this;
        }

        public Criteria andMpminEqualTo(String value) {
            addCriterion("mpmin =", value, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminNotEqualTo(String value) {
            addCriterion("mpmin <>", value, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminGreaterThan(String value) {
            addCriterion("mpmin >", value, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminGreaterThanOrEqualTo(String value) {
            addCriterion("mpmin >=", value, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminLessThan(String value) {
            addCriterion("mpmin <", value, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminLessThanOrEqualTo(String value) {
            addCriterion("mpmin <=", value, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminLike(String value) {
            addCriterion("mpmin like", value, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminNotLike(String value) {
            addCriterion("mpmin not like", value, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminIn(List<String> values) {
            addCriterion("mpmin in", values, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminNotIn(List<String> values) {
            addCriterion("mpmin not in", values, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminBetween(String value1, String value2) {
            addCriterion("mpmin between", value1, value2, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpminNotBetween(String value1, String value2) {
            addCriterion("mpmin not between", value1, value2, "mpmin");
            return (Criteria) this;
        }

        public Criteria andMpmaxIsNull() {
            addCriterion("mpmax is null");
            return (Criteria) this;
        }

        public Criteria andMpmaxIsNotNull() {
            addCriterion("mpmax is not null");
            return (Criteria) this;
        }

        public Criteria andMpmaxEqualTo(String value) {
            addCriterion("mpmax =", value, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxNotEqualTo(String value) {
            addCriterion("mpmax <>", value, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxGreaterThan(String value) {
            addCriterion("mpmax >", value, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxGreaterThanOrEqualTo(String value) {
            addCriterion("mpmax >=", value, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxLessThan(String value) {
            addCriterion("mpmax <", value, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxLessThanOrEqualTo(String value) {
            addCriterion("mpmax <=", value, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxLike(String value) {
            addCriterion("mpmax like", value, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxNotLike(String value) {
            addCriterion("mpmax not like", value, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxIn(List<String> values) {
            addCriterion("mpmax in", values, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxNotIn(List<String> values) {
            addCriterion("mpmax not in", values, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxBetween(String value1, String value2) {
            addCriterion("mpmax between", value1, value2, "mpmax");
            return (Criteria) this;
        }

        public Criteria andMpmaxNotBetween(String value1, String value2) {
            addCriterion("mpmax not between", value1, value2, "mpmax");
            return (Criteria) this;
        }

        public Criteria andBpminIsNull() {
            addCriterion("bpmin is null");
            return (Criteria) this;
        }

        public Criteria andBpminIsNotNull() {
            addCriterion("bpmin is not null");
            return (Criteria) this;
        }

        public Criteria andBpminEqualTo(String value) {
            addCriterion("bpmin =", value, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminNotEqualTo(String value) {
            addCriterion("bpmin <>", value, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminGreaterThan(String value) {
            addCriterion("bpmin >", value, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminGreaterThanOrEqualTo(String value) {
            addCriterion("bpmin >=", value, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminLessThan(String value) {
            addCriterion("bpmin <", value, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminLessThanOrEqualTo(String value) {
            addCriterion("bpmin <=", value, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminLike(String value) {
            addCriterion("bpmin like", value, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminNotLike(String value) {
            addCriterion("bpmin not like", value, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminIn(List<String> values) {
            addCriterion("bpmin in", values, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminNotIn(List<String> values) {
            addCriterion("bpmin not in", values, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminBetween(String value1, String value2) {
            addCriterion("bpmin between", value1, value2, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpminNotBetween(String value1, String value2) {
            addCriterion("bpmin not between", value1, value2, "bpmin");
            return (Criteria) this;
        }

        public Criteria andBpmaxIsNull() {
            addCriterion("bpmax is null");
            return (Criteria) this;
        }

        public Criteria andBpmaxIsNotNull() {
            addCriterion("bpmax is not null");
            return (Criteria) this;
        }

        public Criteria andBpmaxEqualTo(String value) {
            addCriterion("bpmax =", value, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxNotEqualTo(String value) {
            addCriterion("bpmax <>", value, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxGreaterThan(String value) {
            addCriterion("bpmax >", value, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxGreaterThanOrEqualTo(String value) {
            addCriterion("bpmax >=", value, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxLessThan(String value) {
            addCriterion("bpmax <", value, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxLessThanOrEqualTo(String value) {
            addCriterion("bpmax <=", value, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxLike(String value) {
            addCriterion("bpmax like", value, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxNotLike(String value) {
            addCriterion("bpmax not like", value, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxIn(List<String> values) {
            addCriterion("bpmax in", values, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxNotIn(List<String> values) {
            addCriterion("bpmax not in", values, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxBetween(String value1, String value2) {
            addCriterion("bpmax between", value1, value2, "bpmax");
            return (Criteria) this;
        }

        public Criteria andBpmaxNotBetween(String value1, String value2) {
            addCriterion("bpmax not between", value1, value2, "bpmax");
            return (Criteria) this;
        }

        public Criteria andIarcIsNull() {
            addCriterion("iarc is null");
            return (Criteria) this;
        }

        public Criteria andIarcIsNotNull() {
            addCriterion("iarc is not null");
            return (Criteria) this;
        }

        public Criteria andIarcEqualTo(String value) {
            addCriterion("iarc =", value, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcNotEqualTo(String value) {
            addCriterion("iarc <>", value, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcGreaterThan(String value) {
            addCriterion("iarc >", value, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcGreaterThanOrEqualTo(String value) {
            addCriterion("iarc >=", value, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcLessThan(String value) {
            addCriterion("iarc <", value, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcLessThanOrEqualTo(String value) {
            addCriterion("iarc <=", value, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcLike(String value) {
            addCriterion("iarc like", value, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcNotLike(String value) {
            addCriterion("iarc not like", value, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcIn(List<String> values) {
            addCriterion("iarc in", values, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcNotIn(List<String> values) {
            addCriterion("iarc not in", values, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcBetween(String value1, String value2) {
            addCriterion("iarc between", value1, value2, "iarc");
            return (Criteria) this;
        }

        public Criteria andIarcNotBetween(String value1, String value2) {
            addCriterion("iarc not between", value1, value2, "iarc");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNull() {
            addCriterion("introduction is null");
            return (Criteria) this;
        }

        public Criteria andIntroductionIsNotNull() {
            addCriterion("introduction is not null");
            return (Criteria) this;
        }

        public Criteria andIntroductionEqualTo(String value) {
            addCriterion("introduction =", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotEqualTo(String value) {
            addCriterion("introduction <>", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThan(String value) {
            addCriterion("introduction >", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionGreaterThanOrEqualTo(String value) {
            addCriterion("introduction >=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThan(String value) {
            addCriterion("introduction <", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLessThanOrEqualTo(String value) {
            addCriterion("introduction <=", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionLike(String value) {
            addCriterion("introduction like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotLike(String value) {
            addCriterion("introduction not like", value, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionIn(List<String> values) {
            addCriterion("introduction in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotIn(List<String> values) {
            addCriterion("introduction not in", values, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionBetween(String value1, String value2) {
            addCriterion("introduction between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andIntroductionNotBetween(String value1, String value2) {
            addCriterion("introduction not between", value1, value2, "introduction");
            return (Criteria) this;
        }

        public Criteria andAppearanceIsNull() {
            addCriterion("appearance is null");
            return (Criteria) this;
        }

        public Criteria andAppearanceIsNotNull() {
            addCriterion("appearance is not null");
            return (Criteria) this;
        }

        public Criteria andAppearanceEqualTo(String value) {
            addCriterion("appearance =", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotEqualTo(String value) {
            addCriterion("appearance <>", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceGreaterThan(String value) {
            addCriterion("appearance >", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceGreaterThanOrEqualTo(String value) {
            addCriterion("appearance >=", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLessThan(String value) {
            addCriterion("appearance <", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLessThanOrEqualTo(String value) {
            addCriterion("appearance <=", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceLike(String value) {
            addCriterion("appearance like", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotLike(String value) {
            addCriterion("appearance not like", value, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceIn(List<String> values) {
            addCriterion("appearance in", values, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotIn(List<String> values) {
            addCriterion("appearance not in", values, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceBetween(String value1, String value2) {
            addCriterion("appearance between", value1, value2, "appearance");
            return (Criteria) this;
        }

        public Criteria andAppearanceNotBetween(String value1, String value2) {
            addCriterion("appearance not between", value1, value2, "appearance");
            return (Criteria) this;
        }

        public Criteria andSolubilityIsNull() {
            addCriterion("solubility is null");
            return (Criteria) this;
        }

        public Criteria andSolubilityIsNotNull() {
            addCriterion("solubility is not null");
            return (Criteria) this;
        }

        public Criteria andSolubilityEqualTo(String value) {
            addCriterion("solubility =", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityNotEqualTo(String value) {
            addCriterion("solubility <>", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityGreaterThan(String value) {
            addCriterion("solubility >", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityGreaterThanOrEqualTo(String value) {
            addCriterion("solubility >=", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityLessThan(String value) {
            addCriterion("solubility <", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityLessThanOrEqualTo(String value) {
            addCriterion("solubility <=", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityLike(String value) {
            addCriterion("solubility like", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityNotLike(String value) {
            addCriterion("solubility not like", value, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityIn(List<String> values) {
            addCriterion("solubility in", values, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityNotIn(List<String> values) {
            addCriterion("solubility not in", values, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityBetween(String value1, String value2) {
            addCriterion("solubility between", value1, value2, "solubility");
            return (Criteria) this;
        }

        public Criteria andSolubilityNotBetween(String value1, String value2) {
            addCriterion("solubility not between", value1, value2, "solubility");
            return (Criteria) this;
        }

        public Criteria andToxicityIsNull() {
            addCriterion("toxicity is null");
            return (Criteria) this;
        }

        public Criteria andToxicityIsNotNull() {
            addCriterion("toxicity is not null");
            return (Criteria) this;
        }

        public Criteria andToxicityEqualTo(String value) {
            addCriterion("toxicity =", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityNotEqualTo(String value) {
            addCriterion("toxicity <>", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityGreaterThan(String value) {
            addCriterion("toxicity >", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityGreaterThanOrEqualTo(String value) {
            addCriterion("toxicity >=", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityLessThan(String value) {
            addCriterion("toxicity <", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityLessThanOrEqualTo(String value) {
            addCriterion("toxicity <=", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityLike(String value) {
            addCriterion("toxicity like", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityNotLike(String value) {
            addCriterion("toxicity not like", value, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityIn(List<String> values) {
            addCriterion("toxicity in", values, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityNotIn(List<String> values) {
            addCriterion("toxicity not in", values, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityBetween(String value1, String value2) {
            addCriterion("toxicity between", value1, value2, "toxicity");
            return (Criteria) this;
        }

        public Criteria andToxicityNotBetween(String value1, String value2) {
            addCriterion("toxicity not between", value1, value2, "toxicity");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementIsNull() {
            addCriterion("limitRequirement is null");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementIsNotNull() {
            addCriterion("limitRequirement is not null");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementEqualTo(String value) {
            addCriterion("limitRequirement =", value, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementNotEqualTo(String value) {
            addCriterion("limitRequirement <>", value, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementGreaterThan(String value) {
            addCriterion("limitRequirement >", value, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementGreaterThanOrEqualTo(String value) {
            addCriterion("limitRequirement >=", value, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementLessThan(String value) {
            addCriterion("limitRequirement <", value, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementLessThanOrEqualTo(String value) {
            addCriterion("limitRequirement <=", value, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementLike(String value) {
            addCriterion("limitRequirement like", value, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementNotLike(String value) {
            addCriterion("limitRequirement not like", value, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementIn(List<String> values) {
            addCriterion("limitRequirement in", values, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementNotIn(List<String> values) {
            addCriterion("limitRequirement not in", values, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementBetween(String value1, String value2) {
            addCriterion("limitRequirement between", value1, value2, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andLimitRequirementNotBetween(String value1, String value2) {
            addCriterion("limitRequirement not between", value1, value2, "limitRequirement");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterIsNull() {
            addCriterion("clinicalCharacter is null");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterIsNotNull() {
            addCriterion("clinicalCharacter is not null");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterEqualTo(String value) {
            addCriterion("clinicalCharacter =", value, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterNotEqualTo(String value) {
            addCriterion("clinicalCharacter <>", value, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterGreaterThan(String value) {
            addCriterion("clinicalCharacter >", value, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterGreaterThanOrEqualTo(String value) {
            addCriterion("clinicalCharacter >=", value, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterLessThan(String value) {
            addCriterion("clinicalCharacter <", value, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterLessThanOrEqualTo(String value) {
            addCriterion("clinicalCharacter <=", value, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterLike(String value) {
            addCriterion("clinicalCharacter like", value, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterNotLike(String value) {
            addCriterion("clinicalCharacter not like", value, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterIn(List<String> values) {
            addCriterion("clinicalCharacter in", values, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterNotIn(List<String> values) {
            addCriterion("clinicalCharacter not in", values, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterBetween(String value1, String value2) {
            addCriterion("clinicalCharacter between", value1, value2, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andClinicalCharacterNotBetween(String value1, String value2) {
            addCriterion("clinicalCharacter not between", value1, value2, "clinicalCharacter");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayIsNull() {
            addCriterion("metabolicPathway is null");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayIsNotNull() {
            addCriterion("metabolicPathway is not null");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayEqualTo(String value) {
            addCriterion("metabolicPathway =", value, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayNotEqualTo(String value) {
            addCriterion("metabolicPathway <>", value, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayGreaterThan(String value) {
            addCriterion("metabolicPathway >", value, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayGreaterThanOrEqualTo(String value) {
            addCriterion("metabolicPathway >=", value, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayLessThan(String value) {
            addCriterion("metabolicPathway <", value, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayLessThanOrEqualTo(String value) {
            addCriterion("metabolicPathway <=", value, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayLike(String value) {
            addCriterion("metabolicPathway like", value, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayNotLike(String value) {
            addCriterion("metabolicPathway not like", value, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayIn(List<String> values) {
            addCriterion("metabolicPathway in", values, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayNotIn(List<String> values) {
            addCriterion("metabolicPathway not in", values, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayBetween(String value1, String value2) {
            addCriterion("metabolicPathway between", value1, value2, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetabolicPathwayNotBetween(String value1, String value2) {
            addCriterion("metabolicPathway not between", value1, value2, "metabolicPathway");
            return (Criteria) this;
        }

        public Criteria andMetaboliteIsNull() {
            addCriterion("metabolite is null");
            return (Criteria) this;
        }

        public Criteria andMetaboliteIsNotNull() {
            addCriterion("metabolite is not null");
            return (Criteria) this;
        }

        public Criteria andMetaboliteEqualTo(String value) {
            addCriterion("metabolite =", value, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteNotEqualTo(String value) {
            addCriterion("metabolite <>", value, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteGreaterThan(String value) {
            addCriterion("metabolite >", value, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteGreaterThanOrEqualTo(String value) {
            addCriterion("metabolite >=", value, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteLessThan(String value) {
            addCriterion("metabolite <", value, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteLessThanOrEqualTo(String value) {
            addCriterion("metabolite <=", value, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteLike(String value) {
            addCriterion("metabolite like", value, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteNotLike(String value) {
            addCriterion("metabolite not like", value, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteIn(List<String> values) {
            addCriterion("metabolite in", values, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteNotIn(List<String> values) {
            addCriterion("metabolite not in", values, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteBetween(String value1, String value2) {
            addCriterion("metabolite between", value1, value2, "metabolite");
            return (Criteria) this;
        }

        public Criteria andMetaboliteNotBetween(String value1, String value2) {
            addCriterion("metabolite not between", value1, value2, "metabolite");
            return (Criteria) this;
        }

        public Criteria andFoodIsNull() {
            addCriterion("food is null");
            return (Criteria) this;
        }

        public Criteria andFoodIsNotNull() {
            addCriterion("food is not null");
            return (Criteria) this;
        }

        public Criteria andFoodEqualTo(String value) {
            addCriterion("food =", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotEqualTo(String value) {
            addCriterion("food <>", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodGreaterThan(String value) {
            addCriterion("food >", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodGreaterThanOrEqualTo(String value) {
            addCriterion("food >=", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLessThan(String value) {
            addCriterion("food <", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLessThanOrEqualTo(String value) {
            addCriterion("food <=", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodLike(String value) {
            addCriterion("food like", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotLike(String value) {
            addCriterion("food not like", value, "food");
            return (Criteria) this;
        }

        public Criteria andFoodIn(List<String> values) {
            addCriterion("food in", values, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotIn(List<String> values) {
            addCriterion("food not in", values, "food");
            return (Criteria) this;
        }

        public Criteria andFoodBetween(String value1, String value2) {
            addCriterion("food between", value1, value2, "food");
            return (Criteria) this;
        }

        public Criteria andFoodNotBetween(String value1, String value2) {
            addCriterion("food not between", value1, value2, "food");
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