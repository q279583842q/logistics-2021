package com.bb.pojo;

import java.util.ArrayList;
import java.util.List;

public class OrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNull() {
            addCriterion("customer_id is null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIsNotNull() {
            addCriterion("customer_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustomerIdEqualTo(Integer value) {
            addCriterion("customer_id =", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotEqualTo(Integer value) {
            addCriterion("customer_id <>", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThan(Integer value) {
            addCriterion("customer_id >", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("customer_id >=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThan(Integer value) {
            addCriterion("customer_id <", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdLessThanOrEqualTo(Integer value) {
            addCriterion("customer_id <=", value, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdIn(List<Integer> values) {
            addCriterion("customer_id in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotIn(List<Integer> values) {
            addCriterion("customer_id not in", values, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdBetween(Integer value1, Integer value2) {
            addCriterion("customer_id between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andCustomerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("customer_id not between", value1, value2, "customerId");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNull() {
            addCriterion("shipping_address is null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIsNotNull() {
            addCriterion("shipping_address is not null");
            return (Criteria) this;
        }

        public Criteria andShippingAddressEqualTo(String value) {
            addCriterion("shipping_address =", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotEqualTo(String value) {
            addCriterion("shipping_address <>", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThan(String value) {
            addCriterion("shipping_address >", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_address >=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThan(String value) {
            addCriterion("shipping_address <", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLessThanOrEqualTo(String value) {
            addCriterion("shipping_address <=", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressLike(String value) {
            addCriterion("shipping_address like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotLike(String value) {
            addCriterion("shipping_address not like", value, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressIn(List<String> values) {
            addCriterion("shipping_address in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotIn(List<String> values) {
            addCriterion("shipping_address not in", values, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressBetween(String value1, String value2) {
            addCriterion("shipping_address between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingAddressNotBetween(String value1, String value2) {
            addCriterion("shipping_address not between", value1, value2, "shippingAddress");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNull() {
            addCriterion("shipping_name is null");
            return (Criteria) this;
        }

        public Criteria andShippingNameIsNotNull() {
            addCriterion("shipping_name is not null");
            return (Criteria) this;
        }

        public Criteria andShippingNameEqualTo(String value) {
            addCriterion("shipping_name =", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotEqualTo(String value) {
            addCriterion("shipping_name <>", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThan(String value) {
            addCriterion("shipping_name >", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_name >=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThan(String value) {
            addCriterion("shipping_name <", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLessThanOrEqualTo(String value) {
            addCriterion("shipping_name <=", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameLike(String value) {
            addCriterion("shipping_name like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotLike(String value) {
            addCriterion("shipping_name not like", value, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameIn(List<String> values) {
            addCriterion("shipping_name in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotIn(List<String> values) {
            addCriterion("shipping_name not in", values, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameBetween(String value1, String value2) {
            addCriterion("shipping_name between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingNameNotBetween(String value1, String value2) {
            addCriterion("shipping_name not between", value1, value2, "shippingName");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneIsNull() {
            addCriterion("shipping_phone is null");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneIsNotNull() {
            addCriterion("shipping_phone is not null");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneEqualTo(String value) {
            addCriterion("shipping_phone =", value, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneNotEqualTo(String value) {
            addCriterion("shipping_phone <>", value, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneGreaterThan(String value) {
            addCriterion("shipping_phone >", value, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("shipping_phone >=", value, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneLessThan(String value) {
            addCriterion("shipping_phone <", value, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneLessThanOrEqualTo(String value) {
            addCriterion("shipping_phone <=", value, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneLike(String value) {
            addCriterion("shipping_phone like", value, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneNotLike(String value) {
            addCriterion("shipping_phone not like", value, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneIn(List<String> values) {
            addCriterion("shipping_phone in", values, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneNotIn(List<String> values) {
            addCriterion("shipping_phone not in", values, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneBetween(String value1, String value2) {
            addCriterion("shipping_phone between", value1, value2, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andShippingPhoneNotBetween(String value1, String value2) {
            addCriterion("shipping_phone not between", value1, value2, "shippingPhone");
            return (Criteria) this;
        }

        public Criteria andTakeNameIsNull() {
            addCriterion("take_name is null");
            return (Criteria) this;
        }

        public Criteria andTakeNameIsNotNull() {
            addCriterion("take_name is not null");
            return (Criteria) this;
        }

        public Criteria andTakeNameEqualTo(String value) {
            addCriterion("take_name =", value, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameNotEqualTo(String value) {
            addCriterion("take_name <>", value, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameGreaterThan(String value) {
            addCriterion("take_name >", value, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameGreaterThanOrEqualTo(String value) {
            addCriterion("take_name >=", value, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameLessThan(String value) {
            addCriterion("take_name <", value, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameLessThanOrEqualTo(String value) {
            addCriterion("take_name <=", value, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameLike(String value) {
            addCriterion("take_name like", value, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameNotLike(String value) {
            addCriterion("take_name not like", value, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameIn(List<String> values) {
            addCriterion("take_name in", values, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameNotIn(List<String> values) {
            addCriterion("take_name not in", values, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameBetween(String value1, String value2) {
            addCriterion("take_name between", value1, value2, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeNameNotBetween(String value1, String value2) {
            addCriterion("take_name not between", value1, value2, "takeName");
            return (Criteria) this;
        }

        public Criteria andTakeAddressIsNull() {
            addCriterion("take_address is null");
            return (Criteria) this;
        }

        public Criteria andTakeAddressIsNotNull() {
            addCriterion("take_address is not null");
            return (Criteria) this;
        }

        public Criteria andTakeAddressEqualTo(String value) {
            addCriterion("take_address =", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressNotEqualTo(String value) {
            addCriterion("take_address <>", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressGreaterThan(String value) {
            addCriterion("take_address >", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressGreaterThanOrEqualTo(String value) {
            addCriterion("take_address >=", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressLessThan(String value) {
            addCriterion("take_address <", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressLessThanOrEqualTo(String value) {
            addCriterion("take_address <=", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressLike(String value) {
            addCriterion("take_address like", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressNotLike(String value) {
            addCriterion("take_address not like", value, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressIn(List<String> values) {
            addCriterion("take_address in", values, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressNotIn(List<String> values) {
            addCriterion("take_address not in", values, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressBetween(String value1, String value2) {
            addCriterion("take_address between", value1, value2, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakeAddressNotBetween(String value1, String value2) {
            addCriterion("take_address not between", value1, value2, "takeAddress");
            return (Criteria) this;
        }

        public Criteria andTakePhoneIsNull() {
            addCriterion("take_phone is null");
            return (Criteria) this;
        }

        public Criteria andTakePhoneIsNotNull() {
            addCriterion("take_phone is not null");
            return (Criteria) this;
        }

        public Criteria andTakePhoneEqualTo(String value) {
            addCriterion("take_phone =", value, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneNotEqualTo(String value) {
            addCriterion("take_phone <>", value, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneGreaterThan(String value) {
            addCriterion("take_phone >", value, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneGreaterThanOrEqualTo(String value) {
            addCriterion("take_phone >=", value, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneLessThan(String value) {
            addCriterion("take_phone <", value, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneLessThanOrEqualTo(String value) {
            addCriterion("take_phone <=", value, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneLike(String value) {
            addCriterion("take_phone like", value, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneNotLike(String value) {
            addCriterion("take_phone not like", value, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneIn(List<String> values) {
            addCriterion("take_phone in", values, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneNotIn(List<String> values) {
            addCriterion("take_phone not in", values, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneBetween(String value1, String value2) {
            addCriterion("take_phone between", value1, value2, "takePhone");
            return (Criteria) this;
        }

        public Criteria andTakePhoneNotBetween(String value1, String value2) {
            addCriterion("take_phone not between", value1, value2, "takePhone");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNull() {
            addCriterion("order_desc is null");
            return (Criteria) this;
        }

        public Criteria andOrderDescIsNotNull() {
            addCriterion("order_desc is not null");
            return (Criteria) this;
        }

        public Criteria andOrderDescEqualTo(String value) {
            addCriterion("order_desc =", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotEqualTo(String value) {
            addCriterion("order_desc <>", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThan(String value) {
            addCriterion("order_desc >", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescGreaterThanOrEqualTo(String value) {
            addCriterion("order_desc >=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThan(String value) {
            addCriterion("order_desc <", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLessThanOrEqualTo(String value) {
            addCriterion("order_desc <=", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescLike(String value) {
            addCriterion("order_desc like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotLike(String value) {
            addCriterion("order_desc not like", value, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescIn(List<String> values) {
            addCriterion("order_desc in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotIn(List<String> values) {
            addCriterion("order_desc not in", values, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescBetween(String value1, String value2) {
            addCriterion("order_desc between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderDescNotBetween(String value1, String value2) {
            addCriterion("order_desc not between", value1, value2, "orderDesc");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Byte value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Byte value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Byte value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Byte value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Byte value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Byte> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Byte> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Byte value1, Byte value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIsNull() {
            addCriterion("payment_method_id is null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIsNotNull() {
            addCriterion("payment_method_id is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdEqualTo(Integer value) {
            addCriterion("payment_method_id =", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotEqualTo(Integer value) {
            addCriterion("payment_method_id <>", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdGreaterThan(Integer value) {
            addCriterion("payment_method_id >", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("payment_method_id >=", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdLessThan(Integer value) {
            addCriterion("payment_method_id <", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("payment_method_id <=", value, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdIn(List<Integer> values) {
            addCriterion("payment_method_id in", values, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotIn(List<Integer> values) {
            addCriterion("payment_method_id not in", values, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("payment_method_id between", value1, value2, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andPaymentMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("payment_method_id not between", value1, value2, "paymentMethodId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdIsNull() {
            addCriterion("dest_area_id is null");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdIsNotNull() {
            addCriterion("dest_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdEqualTo(Integer value) {
            addCriterion("dest_area_id =", value, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdNotEqualTo(Integer value) {
            addCriterion("dest_area_id <>", value, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdGreaterThan(Integer value) {
            addCriterion("dest_area_id >", value, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dest_area_id >=", value, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdLessThan(Integer value) {
            addCriterion("dest_area_id <", value, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("dest_area_id <=", value, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdIn(List<Integer> values) {
            addCriterion("dest_area_id in", values, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdNotIn(List<Integer> values) {
            addCriterion("dest_area_id not in", values, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("dest_area_id between", value1, value2, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andDestAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dest_area_id not between", value1, value2, "destAreaId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdIsNull() {
            addCriterion("trans_method_id is null");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdIsNotNull() {
            addCriterion("trans_method_id is not null");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdEqualTo(Integer value) {
            addCriterion("trans_method_id =", value, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdNotEqualTo(Integer value) {
            addCriterion("trans_method_id <>", value, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdGreaterThan(Integer value) {
            addCriterion("trans_method_id >", value, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trans_method_id >=", value, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdLessThan(Integer value) {
            addCriterion("trans_method_id <", value, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("trans_method_id <=", value, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdIn(List<Integer> values) {
            addCriterion("trans_method_id in", values, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdNotIn(List<Integer> values) {
            addCriterion("trans_method_id not in", values, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("trans_method_id between", value1, value2, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTransMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trans_method_id not between", value1, value2, "transMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdIsNull() {
            addCriterion("take_method_id is null");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdIsNotNull() {
            addCriterion("take_method_id is not null");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdEqualTo(Integer value) {
            addCriterion("take_method_id =", value, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdNotEqualTo(Integer value) {
            addCriterion("take_method_id <>", value, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdGreaterThan(Integer value) {
            addCriterion("take_method_id >", value, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("take_method_id >=", value, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdLessThan(Integer value) {
            addCriterion("take_method_id <", value, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdLessThanOrEqualTo(Integer value) {
            addCriterion("take_method_id <=", value, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdIn(List<Integer> values) {
            addCriterion("take_method_id in", values, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdNotIn(List<Integer> values) {
            addCriterion("take_method_id not in", values, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdBetween(Integer value1, Integer value2) {
            addCriterion("take_method_id between", value1, value2, "takeMethodId");
            return (Criteria) this;
        }

        public Criteria andTakeMethodIdNotBetween(Integer value1, Integer value2) {
            addCriterion("take_method_id not between", value1, value2, "takeMethodId");
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