package com.kkb.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HosregisterExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HosregisterExample() {
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

        public Criteria andHos_idIsNull() {
            addCriterion("hos_id is null");
            return (Criteria) this;
        }

        public Criteria andHos_idIsNotNull() {
            addCriterion("hos_id is not null");
            return (Criteria) this;
        }

        public Criteria andHos_idEqualTo(Integer value) {
            addCriterion("hos_id =", value, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idNotEqualTo(Integer value) {
            addCriterion("hos_id <>", value, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idGreaterThan(Integer value) {
            addCriterion("hos_id >", value, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_id >=", value, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idLessThan(Integer value) {
            addCriterion("hos_id <", value, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idLessThanOrEqualTo(Integer value) {
            addCriterion("hos_id <=", value, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idIn(List<Integer> values) {
            addCriterion("hos_id in", values, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idNotIn(List<Integer> values) {
            addCriterion("hos_id not in", values, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idBetween(Integer value1, Integer value2) {
            addCriterion("hos_id between", value1, value2, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_idNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_id not between", value1, value2, "hos_id");
            return (Criteria) this;
        }

        public Criteria andHos_nameIsNull() {
            addCriterion("hos_name is null");
            return (Criteria) this;
        }

        public Criteria andHos_nameIsNotNull() {
            addCriterion("hos_name is not null");
            return (Criteria) this;
        }

        public Criteria andHos_nameEqualTo(String value) {
            addCriterion("hos_name =", value, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameNotEqualTo(String value) {
            addCriterion("hos_name <>", value, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameGreaterThan(String value) {
            addCriterion("hos_name >", value, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameGreaterThanOrEqualTo(String value) {
            addCriterion("hos_name >=", value, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameLessThan(String value) {
            addCriterion("hos_name <", value, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameLessThanOrEqualTo(String value) {
            addCriterion("hos_name <=", value, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameLike(String value) {
            addCriterion("hos_name like", value, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameNotLike(String value) {
            addCriterion("hos_name not like", value, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameIn(List<String> values) {
            addCriterion("hos_name in", values, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameNotIn(List<String> values) {
            addCriterion("hos_name not in", values, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameBetween(String value1, String value2) {
            addCriterion("hos_name between", value1, value2, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_nameNotBetween(String value1, String value2) {
            addCriterion("hos_name not between", value1, value2, "hos_name");
            return (Criteria) this;
        }

        public Criteria andHos_idCardIsNull() {
            addCriterion("hos_idCard is null");
            return (Criteria) this;
        }

        public Criteria andHos_idCardIsNotNull() {
            addCriterion("hos_idCard is not null");
            return (Criteria) this;
        }

        public Criteria andHos_idCardEqualTo(String value) {
            addCriterion("hos_idCard =", value, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardNotEqualTo(String value) {
            addCriterion("hos_idCard <>", value, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardGreaterThan(String value) {
            addCriterion("hos_idCard >", value, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardGreaterThanOrEqualTo(String value) {
            addCriterion("hos_idCard >=", value, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardLessThan(String value) {
            addCriterion("hos_idCard <", value, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardLessThanOrEqualTo(String value) {
            addCriterion("hos_idCard <=", value, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardLike(String value) {
            addCriterion("hos_idCard like", value, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardNotLike(String value) {
            addCriterion("hos_idCard not like", value, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardIn(List<String> values) {
            addCriterion("hos_idCard in", values, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardNotIn(List<String> values) {
            addCriterion("hos_idCard not in", values, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardBetween(String value1, String value2) {
            addCriterion("hos_idCard between", value1, value2, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_idCardNotBetween(String value1, String value2) {
            addCriterion("hos_idCard not between", value1, value2, "hos_idCard");
            return (Criteria) this;
        }

        public Criteria andHos_medicalIsNull() {
            addCriterion("hos_medical is null");
            return (Criteria) this;
        }

        public Criteria andHos_medicalIsNotNull() {
            addCriterion("hos_medical is not null");
            return (Criteria) this;
        }

        public Criteria andHos_medicalEqualTo(String value) {
            addCriterion("hos_medical =", value, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalNotEqualTo(String value) {
            addCriterion("hos_medical <>", value, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalGreaterThan(String value) {
            addCriterion("hos_medical >", value, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalGreaterThanOrEqualTo(String value) {
            addCriterion("hos_medical >=", value, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalLessThan(String value) {
            addCriterion("hos_medical <", value, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalLessThanOrEqualTo(String value) {
            addCriterion("hos_medical <=", value, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalLike(String value) {
            addCriterion("hos_medical like", value, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalNotLike(String value) {
            addCriterion("hos_medical not like", value, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalIn(List<String> values) {
            addCriterion("hos_medical in", values, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalNotIn(List<String> values) {
            addCriterion("hos_medical not in", values, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalBetween(String value1, String value2) {
            addCriterion("hos_medical between", value1, value2, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_medicalNotBetween(String value1, String value2) {
            addCriterion("hos_medical not between", value1, value2, "hos_medical");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceIsNull() {
            addCriterion("hos_regPrice is null");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceIsNotNull() {
            addCriterion("hos_regPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceEqualTo(Double value) {
            addCriterion("hos_regPrice =", value, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceNotEqualTo(Double value) {
            addCriterion("hos_regPrice <>", value, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceGreaterThan(Double value) {
            addCriterion("hos_regPrice >", value, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceGreaterThanOrEqualTo(Double value) {
            addCriterion("hos_regPrice >=", value, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceLessThan(Double value) {
            addCriterion("hos_regPrice <", value, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceLessThanOrEqualTo(Double value) {
            addCriterion("hos_regPrice <=", value, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceIn(List<Double> values) {
            addCriterion("hos_regPrice in", values, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceNotIn(List<Double> values) {
            addCriterion("hos_regPrice not in", values, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceBetween(Double value1, Double value2) {
            addCriterion("hos_regPrice between", value1, value2, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_regPriceNotBetween(Double value1, Double value2) {
            addCriterion("hos_regPrice not between", value1, value2, "hos_regPrice");
            return (Criteria) this;
        }

        public Criteria andHos_phoneIsNull() {
            addCriterion("hos_phone is null");
            return (Criteria) this;
        }

        public Criteria andHos_phoneIsNotNull() {
            addCriterion("hos_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHos_phoneEqualTo(String value) {
            addCriterion("hos_phone =", value, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneNotEqualTo(String value) {
            addCriterion("hos_phone <>", value, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneGreaterThan(String value) {
            addCriterion("hos_phone >", value, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneGreaterThanOrEqualTo(String value) {
            addCriterion("hos_phone >=", value, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneLessThan(String value) {
            addCriterion("hos_phone <", value, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneLessThanOrEqualTo(String value) {
            addCriterion("hos_phone <=", value, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneLike(String value) {
            addCriterion("hos_phone like", value, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneNotLike(String value) {
            addCriterion("hos_phone not like", value, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneIn(List<String> values) {
            addCriterion("hos_phone in", values, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneNotIn(List<String> values) {
            addCriterion("hos_phone not in", values, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneBetween(String value1, String value2) {
            addCriterion("hos_phone between", value1, value2, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_phoneNotBetween(String value1, String value2) {
            addCriterion("hos_phone not between", value1, value2, "hos_phone");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceIsNull() {
            addCriterion("hos_selfPrice is null");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceIsNotNull() {
            addCriterion("hos_selfPrice is not null");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceEqualTo(Integer value) {
            addCriterion("hos_selfPrice =", value, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceNotEqualTo(Integer value) {
            addCriterion("hos_selfPrice <>", value, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceGreaterThan(Integer value) {
            addCriterion("hos_selfPrice >", value, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_selfPrice >=", value, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceLessThan(Integer value) {
            addCriterion("hos_selfPrice <", value, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceLessThanOrEqualTo(Integer value) {
            addCriterion("hos_selfPrice <=", value, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceIn(List<Integer> values) {
            addCriterion("hos_selfPrice in", values, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceNotIn(List<Integer> values) {
            addCriterion("hos_selfPrice not in", values, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceBetween(Integer value1, Integer value2) {
            addCriterion("hos_selfPrice between", value1, value2, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_selfPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_selfPrice not between", value1, value2, "hos_selfPrice");
            return (Criteria) this;
        }

        public Criteria andHos_sexIsNull() {
            addCriterion("hos_sex is null");
            return (Criteria) this;
        }

        public Criteria andHos_sexIsNotNull() {
            addCriterion("hos_sex is not null");
            return (Criteria) this;
        }

        public Criteria andHos_sexEqualTo(Integer value) {
            addCriterion("hos_sex =", value, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexNotEqualTo(Integer value) {
            addCriterion("hos_sex <>", value, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexGreaterThan(Integer value) {
            addCriterion("hos_sex >", value, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_sex >=", value, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexLessThan(Integer value) {
            addCriterion("hos_sex <", value, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexLessThanOrEqualTo(Integer value) {
            addCriterion("hos_sex <=", value, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexIn(List<Integer> values) {
            addCriterion("hos_sex in", values, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexNotIn(List<Integer> values) {
            addCriterion("hos_sex not in", values, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexBetween(Integer value1, Integer value2) {
            addCriterion("hos_sex between", value1, value2, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_sexNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_sex not between", value1, value2, "hos_sex");
            return (Criteria) this;
        }

        public Criteria andHos_ageIsNull() {
            addCriterion("hos_age is null");
            return (Criteria) this;
        }

        public Criteria andHos_ageIsNotNull() {
            addCriterion("hos_age is not null");
            return (Criteria) this;
        }

        public Criteria andHos_ageEqualTo(Integer value) {
            addCriterion("hos_age =", value, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageNotEqualTo(Integer value) {
            addCriterion("hos_age <>", value, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageGreaterThan(Integer value) {
            addCriterion("hos_age >", value, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_age >=", value, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageLessThan(Integer value) {
            addCriterion("hos_age <", value, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageLessThanOrEqualTo(Integer value) {
            addCriterion("hos_age <=", value, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageIn(List<Integer> values) {
            addCriterion("hos_age in", values, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageNotIn(List<Integer> values) {
            addCriterion("hos_age not in", values, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageBetween(Integer value1, Integer value2) {
            addCriterion("hos_age between", value1, value2, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_ageNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_age not between", value1, value2, "hos_age");
            return (Criteria) this;
        }

        public Criteria andHos_workIsNull() {
            addCriterion("hos_work is null");
            return (Criteria) this;
        }

        public Criteria andHos_workIsNotNull() {
            addCriterion("hos_work is not null");
            return (Criteria) this;
        }

        public Criteria andHos_workEqualTo(String value) {
            addCriterion("hos_work =", value, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workNotEqualTo(String value) {
            addCriterion("hos_work <>", value, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workGreaterThan(String value) {
            addCriterion("hos_work >", value, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workGreaterThanOrEqualTo(String value) {
            addCriterion("hos_work >=", value, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workLessThan(String value) {
            addCriterion("hos_work <", value, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workLessThanOrEqualTo(String value) {
            addCriterion("hos_work <=", value, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workLike(String value) {
            addCriterion("hos_work like", value, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workNotLike(String value) {
            addCriterion("hos_work not like", value, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workIn(List<String> values) {
            addCriterion("hos_work in", values, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workNotIn(List<String> values) {
            addCriterion("hos_work not in", values, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workBetween(String value1, String value2) {
            addCriterion("hos_work between", value1, value2, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_workNotBetween(String value1, String value2) {
            addCriterion("hos_work not between", value1, value2, "hos_work");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorIsNull() {
            addCriterion("hos_lookDoctor is null");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorIsNotNull() {
            addCriterion("hos_lookDoctor is not null");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorEqualTo(Integer value) {
            addCriterion("hos_lookDoctor =", value, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorNotEqualTo(Integer value) {
            addCriterion("hos_lookDoctor <>", value, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorGreaterThan(Integer value) {
            addCriterion("hos_lookDoctor >", value, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_lookDoctor >=", value, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorLessThan(Integer value) {
            addCriterion("hos_lookDoctor <", value, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorLessThanOrEqualTo(Integer value) {
            addCriterion("hos_lookDoctor <=", value, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorIn(List<Integer> values) {
            addCriterion("hos_lookDoctor in", values, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorNotIn(List<Integer> values) {
            addCriterion("hos_lookDoctor not in", values, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorBetween(Integer value1, Integer value2) {
            addCriterion("hos_lookDoctor between", value1, value2, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andHos_lookDoctorNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_lookDoctor not between", value1, value2, "hos_lookDoctor");
            return (Criteria) this;
        }

        public Criteria andD_idIsNull() {
            addCriterion("d_id is null");
            return (Criteria) this;
        }

        public Criteria andD_idIsNotNull() {
            addCriterion("d_id is not null");
            return (Criteria) this;
        }

        public Criteria andD_idEqualTo(Integer value) {
            addCriterion("d_id =", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotEqualTo(Integer value) {
            addCriterion("d_id <>", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThan(Integer value) {
            addCriterion("d_id >", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idGreaterThanOrEqualTo(Integer value) {
            addCriterion("d_id >=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThan(Integer value) {
            addCriterion("d_id <", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idLessThanOrEqualTo(Integer value) {
            addCriterion("d_id <=", value, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idIn(List<Integer> values) {
            addCriterion("d_id in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotIn(List<Integer> values) {
            addCriterion("d_id not in", values, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idBetween(Integer value1, Integer value2) {
            addCriterion("d_id between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andD_idNotBetween(Integer value1, Integer value2) {
            addCriterion("d_id not between", value1, value2, "d_id");
            return (Criteria) this;
        }

        public Criteria andHos_remarkIsNull() {
            addCriterion("hos_remark is null");
            return (Criteria) this;
        }

        public Criteria andHos_remarkIsNotNull() {
            addCriterion("hos_remark is not null");
            return (Criteria) this;
        }

        public Criteria andHos_remarkEqualTo(String value) {
            addCriterion("hos_remark =", value, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkNotEqualTo(String value) {
            addCriterion("hos_remark <>", value, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkGreaterThan(String value) {
            addCriterion("hos_remark >", value, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkGreaterThanOrEqualTo(String value) {
            addCriterion("hos_remark >=", value, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkLessThan(String value) {
            addCriterion("hos_remark <", value, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkLessThanOrEqualTo(String value) {
            addCriterion("hos_remark <=", value, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkLike(String value) {
            addCriterion("hos_remark like", value, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkNotLike(String value) {
            addCriterion("hos_remark not like", value, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkIn(List<String> values) {
            addCriterion("hos_remark in", values, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkNotIn(List<String> values) {
            addCriterion("hos_remark not in", values, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkBetween(String value1, String value2) {
            addCriterion("hos_remark between", value1, value2, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_remarkNotBetween(String value1, String value2) {
            addCriterion("hos_remark not between", value1, value2, "hos_remark");
            return (Criteria) this;
        }

        public Criteria andHos_stateIsNull() {
            addCriterion("hos_state is null");
            return (Criteria) this;
        }

        public Criteria andHos_stateIsNotNull() {
            addCriterion("hos_state is not null");
            return (Criteria) this;
        }

        public Criteria andHos_stateEqualTo(Integer value) {
            addCriterion("hos_state =", value, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateNotEqualTo(Integer value) {
            addCriterion("hos_state <>", value, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateGreaterThan(Integer value) {
            addCriterion("hos_state >", value, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateGreaterThanOrEqualTo(Integer value) {
            addCriterion("hos_state >=", value, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateLessThan(Integer value) {
            addCriterion("hos_state <", value, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateLessThanOrEqualTo(Integer value) {
            addCriterion("hos_state <=", value, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateIn(List<Integer> values) {
            addCriterion("hos_state in", values, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateNotIn(List<Integer> values) {
            addCriterion("hos_state not in", values, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateBetween(Integer value1, Integer value2) {
            addCriterion("hos_state between", value1, value2, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_stateNotBetween(Integer value1, Integer value2) {
            addCriterion("hos_state not between", value1, value2, "hos_state");
            return (Criteria) this;
        }

        public Criteria andHos_dateIsNull() {
            addCriterion("hos_date is null");
            return (Criteria) this;
        }

        public Criteria andHos_dateIsNotNull() {
            addCriterion("hos_date is not null");
            return (Criteria) this;
        }

        public Criteria andHos_dateEqualTo(Date value) {
            addCriterion("hos_date =", value, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateNotEqualTo(Date value) {
            addCriterion("hos_date <>", value, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateGreaterThan(Date value) {
            addCriterion("hos_date >", value, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateGreaterThanOrEqualTo(Date value) {
            addCriterion("hos_date >=", value, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateLessThan(Date value) {
            addCriterion("hos_date <", value, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateLessThanOrEqualTo(Date value) {
            addCriterion("hos_date <=", value, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateIn(List<Date> values) {
            addCriterion("hos_date in", values, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateNotIn(List<Date> values) {
            addCriterion("hos_date not in", values, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateBetween(Date value1, Date value2) {
            addCriterion("hos_date between", value1, value2, "hos_date");
            return (Criteria) this;
        }

        public Criteria andHos_dateNotBetween(Date value1, Date value2) {
            addCriterion("hos_date not between", value1, value2, "hos_date");
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