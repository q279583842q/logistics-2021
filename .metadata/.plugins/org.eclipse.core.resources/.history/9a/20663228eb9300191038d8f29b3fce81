package com.bb.pojo;

import java.util.ArrayList;
import java.util.List;

public class MenuExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MenuExample() {
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

        public Criteria andMenuIdIsNull() {
            addCriterion("menu_id is null");
            return (Criteria) this;
        }

        public Criteria andMenuIdIsNotNull() {
            addCriterion("menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andMenuIdEqualTo(Integer value) {
            addCriterion("menu_id =", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotEqualTo(Integer value) {
            addCriterion("menu_id <>", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThan(Integer value) {
            addCriterion("menu_id >", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("menu_id >=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThan(Integer value) {
            addCriterion("menu_id <", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("menu_id <=", value, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdIn(List<Integer> values) {
            addCriterion("menu_id in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotIn(List<Integer> values) {
            addCriterion("menu_id not in", values, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("menu_id between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("menu_id not between", value1, value2, "menuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNull() {
            addCriterion("parent_menu_id is null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIsNotNull() {
            addCriterion("parent_menu_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdEqualTo(Integer value) {
            addCriterion("parent_menu_id =", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotEqualTo(Integer value) {
            addCriterion("parent_menu_id <>", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThan(Integer value) {
            addCriterion("parent_menu_id >", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_menu_id >=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThan(Integer value) {
            addCriterion("parent_menu_id <", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdLessThanOrEqualTo(Integer value) {
            addCriterion("parent_menu_id <=", value, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdIn(List<Integer> values) {
            addCriterion("parent_menu_id in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotIn(List<Integer> values) {
            addCriterion("parent_menu_id not in", values, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdBetween(Integer value1, Integer value2) {
            addCriterion("parent_menu_id between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andParentMenuIdNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_menu_id not between", value1, value2, "parentMenuId");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNull() {
            addCriterion("menu_name is null");
            return (Criteria) this;
        }

        public Criteria andMenuNameIsNotNull() {
            addCriterion("menu_name is not null");
            return (Criteria) this;
        }

        public Criteria andMenuNameEqualTo(String value) {
            addCriterion("menu_name =", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotEqualTo(String value) {
            addCriterion("menu_name <>", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThan(String value) {
            addCriterion("menu_name >", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameGreaterThanOrEqualTo(String value) {
            addCriterion("menu_name >=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThan(String value) {
            addCriterion("menu_name <", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLessThanOrEqualTo(String value) {
            addCriterion("menu_name <=", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameLike(String value) {
            addCriterion("menu_name like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotLike(String value) {
            addCriterion("menu_name not like", value, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameIn(List<String> values) {
            addCriterion("menu_name in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotIn(List<String> values) {
            addCriterion("menu_name not in", values, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameBetween(String value1, String value2) {
            addCriterion("menu_name between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuNameNotBetween(String value1, String value2) {
            addCriterion("menu_name not between", value1, value2, "menuName");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNull() {
            addCriterion("menu_desc is null");
            return (Criteria) this;
        }

        public Criteria andMenuDescIsNotNull() {
            addCriterion("menu_desc is not null");
            return (Criteria) this;
        }

        public Criteria andMenuDescEqualTo(String value) {
            addCriterion("menu_desc =", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotEqualTo(String value) {
            addCriterion("menu_desc <>", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThan(String value) {
            addCriterion("menu_desc >", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescGreaterThanOrEqualTo(String value) {
            addCriterion("menu_desc >=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThan(String value) {
            addCriterion("menu_desc <", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLessThanOrEqualTo(String value) {
            addCriterion("menu_desc <=", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescLike(String value) {
            addCriterion("menu_desc like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotLike(String value) {
            addCriterion("menu_desc not like", value, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescIn(List<String> values) {
            addCriterion("menu_desc in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotIn(List<String> values) {
            addCriterion("menu_desc not in", values, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescBetween(String value1, String value2) {
            addCriterion("menu_desc between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuDescNotBetween(String value1, String value2) {
            addCriterion("menu_desc not between", value1, value2, "menuDesc");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNull() {
            addCriterion("menu_link is null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIsNotNull() {
            addCriterion("menu_link is not null");
            return (Criteria) this;
        }

        public Criteria andMenuLinkEqualTo(String value) {
            addCriterion("menu_link =", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotEqualTo(String value) {
            addCriterion("menu_link <>", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThan(String value) {
            addCriterion("menu_link >", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkGreaterThanOrEqualTo(String value) {
            addCriterion("menu_link >=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThan(String value) {
            addCriterion("menu_link <", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLessThanOrEqualTo(String value) {
            addCriterion("menu_link <=", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkLike(String value) {
            addCriterion("menu_link like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotLike(String value) {
            addCriterion("menu_link not like", value, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkIn(List<String> values) {
            addCriterion("menu_link in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotIn(List<String> values) {
            addCriterion("menu_link not in", values, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkBetween(String value1, String value2) {
            addCriterion("menu_link between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andMenuLinkNotBetween(String value1, String value2) {
            addCriterion("menu_link not between", value1, value2, "menuLink");
            return (Criteria) this;
        }

        public Criteria andSecurityNameIsNull() {
            addCriterion("security_name is null");
            return (Criteria) this;
        }

        public Criteria andSecurityNameIsNotNull() {
            addCriterion("security_name is not null");
            return (Criteria) this;
        }

        public Criteria andSecurityNameEqualTo(String value) {
            addCriterion("security_name =", value, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameNotEqualTo(String value) {
            addCriterion("security_name <>", value, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameGreaterThan(String value) {
            addCriterion("security_name >", value, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameGreaterThanOrEqualTo(String value) {
            addCriterion("security_name >=", value, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameLessThan(String value) {
            addCriterion("security_name <", value, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameLessThanOrEqualTo(String value) {
            addCriterion("security_name <=", value, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameLike(String value) {
            addCriterion("security_name like", value, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameNotLike(String value) {
            addCriterion("security_name not like", value, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameIn(List<String> values) {
            addCriterion("security_name in", values, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameNotIn(List<String> values) {
            addCriterion("security_name not in", values, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameBetween(String value1, String value2) {
            addCriterion("security_name between", value1, value2, "securityName");
            return (Criteria) this;
        }

        public Criteria andSecurityNameNotBetween(String value1, String value2) {
            addCriterion("security_name not between", value1, value2, "securityName");
            return (Criteria) this;
        }

        public Criteria andM1IsNull() {
            addCriterion("m1 is null");
            return (Criteria) this;
        }

        public Criteria andM1IsNotNull() {
            addCriterion("m1 is not null");
            return (Criteria) this;
        }

        public Criteria andM1EqualTo(String value) {
            addCriterion("m1 =", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotEqualTo(String value) {
            addCriterion("m1 <>", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1GreaterThan(String value) {
            addCriterion("m1 >", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1GreaterThanOrEqualTo(String value) {
            addCriterion("m1 >=", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1LessThan(String value) {
            addCriterion("m1 <", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1LessThanOrEqualTo(String value) {
            addCriterion("m1 <=", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1Like(String value) {
            addCriterion("m1 like", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotLike(String value) {
            addCriterion("m1 not like", value, "m1");
            return (Criteria) this;
        }

        public Criteria andM1In(List<String> values) {
            addCriterion("m1 in", values, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotIn(List<String> values) {
            addCriterion("m1 not in", values, "m1");
            return (Criteria) this;
        }

        public Criteria andM1Between(String value1, String value2) {
            addCriterion("m1 between", value1, value2, "m1");
            return (Criteria) this;
        }

        public Criteria andM1NotBetween(String value1, String value2) {
            addCriterion("m1 not between", value1, value2, "m1");
            return (Criteria) this;
        }

        public Criteria andM2IsNull() {
            addCriterion("m2 is null");
            return (Criteria) this;
        }

        public Criteria andM2IsNotNull() {
            addCriterion("m2 is not null");
            return (Criteria) this;
        }

        public Criteria andM2EqualTo(String value) {
            addCriterion("m2 =", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotEqualTo(String value) {
            addCriterion("m2 <>", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThan(String value) {
            addCriterion("m2 >", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2GreaterThanOrEqualTo(String value) {
            addCriterion("m2 >=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThan(String value) {
            addCriterion("m2 <", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2LessThanOrEqualTo(String value) {
            addCriterion("m2 <=", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2Like(String value) {
            addCriterion("m2 like", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotLike(String value) {
            addCriterion("m2 not like", value, "m2");
            return (Criteria) this;
        }

        public Criteria andM2In(List<String> values) {
            addCriterion("m2 in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotIn(List<String> values) {
            addCriterion("m2 not in", values, "m2");
            return (Criteria) this;
        }

        public Criteria andM2Between(String value1, String value2) {
            addCriterion("m2 between", value1, value2, "m2");
            return (Criteria) this;
        }

        public Criteria andM2NotBetween(String value1, String value2) {
            addCriterion("m2 not between", value1, value2, "m2");
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