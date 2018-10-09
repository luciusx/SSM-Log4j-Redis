package top.lucius.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ImProjectExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImProjectExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andBookingMethodIsNull() {
            addCriterion("booking_method is null");
            return (Criteria) this;
        }

        public Criteria andBookingMethodIsNotNull() {
            addCriterion("booking_method is not null");
            return (Criteria) this;
        }

        public Criteria andBookingMethodEqualTo(Boolean value) {
            addCriterion("booking_method =", value, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodNotEqualTo(Boolean value) {
            addCriterion("booking_method <>", value, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodGreaterThan(Boolean value) {
            addCriterion("booking_method >", value, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodGreaterThanOrEqualTo(Boolean value) {
            addCriterion("booking_method >=", value, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodLessThan(Boolean value) {
            addCriterion("booking_method <", value, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodLessThanOrEqualTo(Boolean value) {
            addCriterion("booking_method <=", value, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodIn(List<Boolean> values) {
            addCriterion("booking_method in", values, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodNotIn(List<Boolean> values) {
            addCriterion("booking_method not in", values, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodBetween(Boolean value1, Boolean value2) {
            addCriterion("booking_method between", value1, value2, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBookingMethodNotBetween(Boolean value1, Boolean value2) {
            addCriterion("booking_method not between", value1, value2, "bookingMethod");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdIsNull() {
            addCriterion("beautician_id is null");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdIsNotNull() {
            addCriterion("beautician_id is not null");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdEqualTo(Integer value) {
            addCriterion("beautician_id =", value, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdNotEqualTo(Integer value) {
            addCriterion("beautician_id <>", value, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdGreaterThan(Integer value) {
            addCriterion("beautician_id >", value, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("beautician_id >=", value, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdLessThan(Integer value) {
            addCriterion("beautician_id <", value, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdLessThanOrEqualTo(Integer value) {
            addCriterion("beautician_id <=", value, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdIn(List<Integer> values) {
            addCriterion("beautician_id in", values, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdNotIn(List<Integer> values) {
            addCriterion("beautician_id not in", values, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdBetween(Integer value1, Integer value2) {
            addCriterion("beautician_id between", value1, value2, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andBeauticianIdNotBetween(Integer value1, Integer value2) {
            addCriterion("beautician_id not between", value1, value2, "beauticianId");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNull() {
            addCriterion("service_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNotNull() {
            addCriterion("service_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEqualTo(Integer value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(Integer value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(Integer value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(Integer value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(Integer value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<Integer> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<Integer> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(Integer value1, Integer value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionIsNull() {
            addCriterion("key_function is null");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionIsNotNull() {
            addCriterion("key_function is not null");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionEqualTo(String value) {
            addCriterion("key_function =", value, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionNotEqualTo(String value) {
            addCriterion("key_function <>", value, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionGreaterThan(String value) {
            addCriterion("key_function >", value, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionGreaterThanOrEqualTo(String value) {
            addCriterion("key_function >=", value, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionLessThan(String value) {
            addCriterion("key_function <", value, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionLessThanOrEqualTo(String value) {
            addCriterion("key_function <=", value, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionLike(String value) {
            addCriterion("key_function like", value, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionNotLike(String value) {
            addCriterion("key_function not like", value, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionIn(List<String> values) {
            addCriterion("key_function in", values, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionNotIn(List<String> values) {
            addCriterion("key_function not in", values, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionBetween(String value1, String value2) {
            addCriterion("key_function between", value1, value2, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andKeyFunctionNotBetween(String value1, String value2) {
            addCriterion("key_function not between", value1, value2, "keyFunction");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andPriceIsNull() {
            addCriterion("price is null");
            return (Criteria) this;
        }

        public Criteria andPriceIsNotNull() {
            addCriterion("price is not null");
            return (Criteria) this;
        }

        public Criteria andPriceEqualTo(BigDecimal value) {
            addCriterion("price =", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotEqualTo(BigDecimal value) {
            addCriterion("price <>", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThan(BigDecimal value) {
            addCriterion("price >", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("price >=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThan(BigDecimal value) {
            addCriterion("price <", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("price <=", value, "price");
            return (Criteria) this;
        }

        public Criteria andPriceIn(List<BigDecimal> values) {
            addCriterion("price in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotIn(List<BigDecimal> values) {
            addCriterion("price not in", values, "price");
            return (Criteria) this;
        }

        public Criteria andPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("price not between", value1, value2, "price");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNull() {
            addCriterion("market_price is null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIsNotNull() {
            addCriterion("market_price is not null");
            return (Criteria) this;
        }

        public Criteria andMarketPriceEqualTo(BigDecimal value) {
            addCriterion("market_price =", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotEqualTo(BigDecimal value) {
            addCriterion("market_price <>", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThan(BigDecimal value) {
            addCriterion("market_price >", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price >=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThan(BigDecimal value) {
            addCriterion("market_price <", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceLessThanOrEqualTo(BigDecimal value) {
            addCriterion("market_price <=", value, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceIn(List<BigDecimal> values) {
            addCriterion("market_price in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotIn(List<BigDecimal> values) {
            addCriterion("market_price not in", values, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andMarketPriceNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("market_price not between", value1, value2, "marketPrice");
            return (Criteria) this;
        }

        public Criteria andClicksIsNull() {
            addCriterion("clicks is null");
            return (Criteria) this;
        }

        public Criteria andClicksIsNotNull() {
            addCriterion("clicks is not null");
            return (Criteria) this;
        }

        public Criteria andClicksEqualTo(Integer value) {
            addCriterion("clicks =", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotEqualTo(Integer value) {
            addCriterion("clicks <>", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThan(Integer value) {
            addCriterion("clicks >", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksGreaterThanOrEqualTo(Integer value) {
            addCriterion("clicks >=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThan(Integer value) {
            addCriterion("clicks <", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksLessThanOrEqualTo(Integer value) {
            addCriterion("clicks <=", value, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksIn(List<Integer> values) {
            addCriterion("clicks in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotIn(List<Integer> values) {
            addCriterion("clicks not in", values, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksBetween(Integer value1, Integer value2) {
            addCriterion("clicks between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andClicksNotBetween(Integer value1, Integer value2) {
            addCriterion("clicks not between", value1, value2, "clicks");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNull() {
            addCriterion("orders is null");
            return (Criteria) this;
        }

        public Criteria andOrdersIsNotNull() {
            addCriterion("orders is not null");
            return (Criteria) this;
        }

        public Criteria andOrdersEqualTo(Integer value) {
            addCriterion("orders =", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotEqualTo(Integer value) {
            addCriterion("orders <>", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThan(Integer value) {
            addCriterion("orders >", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersGreaterThanOrEqualTo(Integer value) {
            addCriterion("orders >=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThan(Integer value) {
            addCriterion("orders <", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersLessThanOrEqualTo(Integer value) {
            addCriterion("orders <=", value, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersIn(List<Integer> values) {
            addCriterion("orders in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotIn(List<Integer> values) {
            addCriterion("orders not in", values, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersBetween(Integer value1, Integer value2) {
            addCriterion("orders between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andOrdersNotBetween(Integer value1, Integer value2) {
            addCriterion("orders not between", value1, value2, "orders");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNull() {
            addCriterion("type_id is null");
            return (Criteria) this;
        }

        public Criteria andTypeIdIsNotNull() {
            addCriterion("type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTypeIdEqualTo(Integer value) {
            addCriterion("type_id =", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotEqualTo(Integer value) {
            addCriterion("type_id <>", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThan(Integer value) {
            addCriterion("type_id >", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("type_id >=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThan(Integer value) {
            addCriterion("type_id <", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("type_id <=", value, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdIn(List<Integer> values) {
            addCriterion("type_id in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotIn(List<Integer> values) {
            addCriterion("type_id not in", values, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("type_id between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("type_id not between", value1, value2, "typeId");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Integer value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Integer value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Integer value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Integer value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Integer value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Integer> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Integer> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Integer value1, Integer value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNull() {
            addCriterion("add_time is null");
            return (Criteria) this;
        }

        public Criteria andAddTimeIsNotNull() {
            addCriterion("add_time is not null");
            return (Criteria) this;
        }

        public Criteria andAddTimeEqualTo(Integer value) {
            addCriterion("add_time =", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotEqualTo(Integer value) {
            addCriterion("add_time <>", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThan(Integer value) {
            addCriterion("add_time >", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("add_time >=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThan(Integer value) {
            addCriterion("add_time <", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeLessThanOrEqualTo(Integer value) {
            addCriterion("add_time <=", value, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeIn(List<Integer> values) {
            addCriterion("add_time in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotIn(List<Integer> values) {
            addCriterion("add_time not in", values, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeBetween(Integer value1, Integer value2) {
            addCriterion("add_time between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andAddTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("add_time not between", value1, value2, "addTime");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIsNull() {
            addCriterion("default_pic is null");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIsNotNull() {
            addCriterion("default_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDefaultPicEqualTo(String value) {
            addCriterion("default_pic =", value, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicNotEqualTo(String value) {
            addCriterion("default_pic <>", value, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicGreaterThan(String value) {
            addCriterion("default_pic >", value, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicGreaterThanOrEqualTo(String value) {
            addCriterion("default_pic >=", value, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicLessThan(String value) {
            addCriterion("default_pic <", value, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicLessThanOrEqualTo(String value) {
            addCriterion("default_pic <=", value, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicLike(String value) {
            addCriterion("default_pic like", value, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicNotLike(String value) {
            addCriterion("default_pic not like", value, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicIn(List<String> values) {
            addCriterion("default_pic in", values, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicNotIn(List<String> values) {
            addCriterion("default_pic not in", values, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicBetween(String value1, String value2) {
            addCriterion("default_pic between", value1, value2, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andDefaultPicNotBetween(String value1, String value2) {
            addCriterion("default_pic not between", value1, value2, "defaultPic");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNull() {
            addCriterion("shop_id is null");
            return (Criteria) this;
        }

        public Criteria andShopIdIsNotNull() {
            addCriterion("shop_id is not null");
            return (Criteria) this;
        }

        public Criteria andShopIdEqualTo(Integer value) {
            addCriterion("shop_id =", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotEqualTo(Integer value) {
            addCriterion("shop_id <>", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThan(Integer value) {
            addCriterion("shop_id >", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shop_id >=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThan(Integer value) {
            addCriterion("shop_id <", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdLessThanOrEqualTo(Integer value) {
            addCriterion("shop_id <=", value, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdIn(List<Integer> values) {
            addCriterion("shop_id in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotIn(List<Integer> values) {
            addCriterion("shop_id not in", values, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdBetween(Integer value1, Integer value2) {
            addCriterion("shop_id between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andShopIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shop_id not between", value1, value2, "shopId");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaIsNull() {
            addCriterion("is_ivyspa is null");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaIsNotNull() {
            addCriterion("is_ivyspa is not null");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaEqualTo(Byte value) {
            addCriterion("is_ivyspa =", value, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaNotEqualTo(Byte value) {
            addCriterion("is_ivyspa <>", value, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaGreaterThan(Byte value) {
            addCriterion("is_ivyspa >", value, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_ivyspa >=", value, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaLessThan(Byte value) {
            addCriterion("is_ivyspa <", value, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaLessThanOrEqualTo(Byte value) {
            addCriterion("is_ivyspa <=", value, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaIn(List<Byte> values) {
            addCriterion("is_ivyspa in", values, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaNotIn(List<Byte> values) {
            addCriterion("is_ivyspa not in", values, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaBetween(Byte value1, Byte value2) {
            addCriterion("is_ivyspa between", value1, value2, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsIvyspaNotBetween(Byte value1, Byte value2) {
            addCriterion("is_ivyspa not between", value1, value2, "isIvyspa");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNull() {
            addCriterion("is_delete is null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIsNotNull() {
            addCriterion("is_delete is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeleteEqualTo(Boolean value) {
            addCriterion("is_delete =", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotEqualTo(Boolean value) {
            addCriterion("is_delete <>", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThan(Boolean value) {
            addCriterion("is_delete >", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_delete >=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThan(Boolean value) {
            addCriterion("is_delete <", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteLessThanOrEqualTo(Boolean value) {
            addCriterion("is_delete <=", value, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteIn(List<Boolean> values) {
            addCriterion("is_delete in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotIn(List<Boolean> values) {
            addCriterion("is_delete not in", values, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andIsDeleteNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_delete not between", value1, value2, "isDelete");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNull() {
            addCriterion("property is null");
            return (Criteria) this;
        }

        public Criteria andPropertyIsNotNull() {
            addCriterion("property is not null");
            return (Criteria) this;
        }

        public Criteria andPropertyEqualTo(Boolean value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(Boolean value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(Boolean value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(Boolean value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(Boolean value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(Boolean value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<Boolean> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<Boolean> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(Boolean value1, Boolean value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(Boolean value1, Boolean value2) {
            addCriterion("property not between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Boolean value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Boolean value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Boolean value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Boolean value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Boolean value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Boolean> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Boolean> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andSourcePicIsNull() {
            addCriterion("source_pic is null");
            return (Criteria) this;
        }

        public Criteria andSourcePicIsNotNull() {
            addCriterion("source_pic is not null");
            return (Criteria) this;
        }

        public Criteria andSourcePicEqualTo(String value) {
            addCriterion("source_pic =", value, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicNotEqualTo(String value) {
            addCriterion("source_pic <>", value, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicGreaterThan(String value) {
            addCriterion("source_pic >", value, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicGreaterThanOrEqualTo(String value) {
            addCriterion("source_pic >=", value, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicLessThan(String value) {
            addCriterion("source_pic <", value, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicLessThanOrEqualTo(String value) {
            addCriterion("source_pic <=", value, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicLike(String value) {
            addCriterion("source_pic like", value, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicNotLike(String value) {
            addCriterion("source_pic not like", value, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicIn(List<String> values) {
            addCriterion("source_pic in", values, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicNotIn(List<String> values) {
            addCriterion("source_pic not in", values, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicBetween(String value1, String value2) {
            addCriterion("source_pic between", value1, value2, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andSourcePicNotBetween(String value1, String value2) {
            addCriterion("source_pic not between", value1, value2, "sourcePic");
            return (Criteria) this;
        }

        public Criteria andListPicIsNull() {
            addCriterion("list_pic is null");
            return (Criteria) this;
        }

        public Criteria andListPicIsNotNull() {
            addCriterion("list_pic is not null");
            return (Criteria) this;
        }

        public Criteria andListPicEqualTo(String value) {
            addCriterion("list_pic =", value, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicNotEqualTo(String value) {
            addCriterion("list_pic <>", value, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicGreaterThan(String value) {
            addCriterion("list_pic >", value, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicGreaterThanOrEqualTo(String value) {
            addCriterion("list_pic >=", value, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicLessThan(String value) {
            addCriterion("list_pic <", value, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicLessThanOrEqualTo(String value) {
            addCriterion("list_pic <=", value, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicLike(String value) {
            addCriterion("list_pic like", value, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicNotLike(String value) {
            addCriterion("list_pic not like", value, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicIn(List<String> values) {
            addCriterion("list_pic in", values, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicNotIn(List<String> values) {
            addCriterion("list_pic not in", values, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicBetween(String value1, String value2) {
            addCriterion("list_pic between", value1, value2, "listPic");
            return (Criteria) this;
        }

        public Criteria andListPicNotBetween(String value1, String value2) {
            addCriterion("list_pic not between", value1, value2, "listPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicIsNull() {
            addCriterion("details_pic is null");
            return (Criteria) this;
        }

        public Criteria andDetailsPicIsNotNull() {
            addCriterion("details_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDetailsPicEqualTo(String value) {
            addCriterion("details_pic =", value, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicNotEqualTo(String value) {
            addCriterion("details_pic <>", value, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicGreaterThan(String value) {
            addCriterion("details_pic >", value, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicGreaterThanOrEqualTo(String value) {
            addCriterion("details_pic >=", value, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicLessThan(String value) {
            addCriterion("details_pic <", value, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicLessThanOrEqualTo(String value) {
            addCriterion("details_pic <=", value, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicLike(String value) {
            addCriterion("details_pic like", value, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicNotLike(String value) {
            addCriterion("details_pic not like", value, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicIn(List<String> values) {
            addCriterion("details_pic in", values, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicNotIn(List<String> values) {
            addCriterion("details_pic not in", values, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicBetween(String value1, String value2) {
            addCriterion("details_pic between", value1, value2, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andDetailsPicNotBetween(String value1, String value2) {
            addCriterion("details_pic not between", value1, value2, "detailsPic");
            return (Criteria) this;
        }

        public Criteria andHotPicIsNull() {
            addCriterion("hot_pic is null");
            return (Criteria) this;
        }

        public Criteria andHotPicIsNotNull() {
            addCriterion("hot_pic is not null");
            return (Criteria) this;
        }

        public Criteria andHotPicEqualTo(String value) {
            addCriterion("hot_pic =", value, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicNotEqualTo(String value) {
            addCriterion("hot_pic <>", value, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicGreaterThan(String value) {
            addCriterion("hot_pic >", value, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicGreaterThanOrEqualTo(String value) {
            addCriterion("hot_pic >=", value, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicLessThan(String value) {
            addCriterion("hot_pic <", value, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicLessThanOrEqualTo(String value) {
            addCriterion("hot_pic <=", value, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicLike(String value) {
            addCriterion("hot_pic like", value, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicNotLike(String value) {
            addCriterion("hot_pic not like", value, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicIn(List<String> values) {
            addCriterion("hot_pic in", values, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicNotIn(List<String> values) {
            addCriterion("hot_pic not in", values, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicBetween(String value1, String value2) {
            addCriterion("hot_pic between", value1, value2, "hotPic");
            return (Criteria) this;
        }

        public Criteria andHotPicNotBetween(String value1, String value2) {
            addCriterion("hot_pic not between", value1, value2, "hotPic");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusIsNull() {
            addCriterion("active_price_status is null");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusIsNotNull() {
            addCriterion("active_price_status is not null");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusEqualTo(Boolean value) {
            addCriterion("active_price_status =", value, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusNotEqualTo(Boolean value) {
            addCriterion("active_price_status <>", value, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusGreaterThan(Boolean value) {
            addCriterion("active_price_status >", value, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active_price_status >=", value, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusLessThan(Boolean value) {
            addCriterion("active_price_status <", value, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("active_price_status <=", value, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusIn(List<Boolean> values) {
            addCriterion("active_price_status in", values, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusNotIn(List<Boolean> values) {
            addCriterion("active_price_status not in", values, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("active_price_status between", value1, value2, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActivePriceStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active_price_status not between", value1, value2, "activePriceStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusIsNull() {
            addCriterion("active_buy_status is null");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusIsNotNull() {
            addCriterion("active_buy_status is not null");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusEqualTo(Boolean value) {
            addCriterion("active_buy_status =", value, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusNotEqualTo(Boolean value) {
            addCriterion("active_buy_status <>", value, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusGreaterThan(Boolean value) {
            addCriterion("active_buy_status >", value, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active_buy_status >=", value, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusLessThan(Boolean value) {
            addCriterion("active_buy_status <", value, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("active_buy_status <=", value, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusIn(List<Boolean> values) {
            addCriterion("active_buy_status in", values, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusNotIn(List<Boolean> values) {
            addCriterion("active_buy_status not in", values, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("active_buy_status between", value1, value2, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveBuyStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active_buy_status not between", value1, value2, "activeBuyStatus");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtIsNull() {
            addCriterion("active_start_at is null");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtIsNotNull() {
            addCriterion("active_start_at is not null");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtEqualTo(Integer value) {
            addCriterion("active_start_at =", value, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtNotEqualTo(Integer value) {
            addCriterion("active_start_at <>", value, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtGreaterThan(Integer value) {
            addCriterion("active_start_at >", value, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_start_at >=", value, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtLessThan(Integer value) {
            addCriterion("active_start_at <", value, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtLessThanOrEqualTo(Integer value) {
            addCriterion("active_start_at <=", value, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtIn(List<Integer> values) {
            addCriterion("active_start_at in", values, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtNotIn(List<Integer> values) {
            addCriterion("active_start_at not in", values, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtBetween(Integer value1, Integer value2) {
            addCriterion("active_start_at between", value1, value2, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveStartAtNotBetween(Integer value1, Integer value2) {
            addCriterion("active_start_at not between", value1, value2, "activeStartAt");
            return (Criteria) this;
        }

        public Criteria andActiveEndInIsNull() {
            addCriterion("active_end_in is null");
            return (Criteria) this;
        }

        public Criteria andActiveEndInIsNotNull() {
            addCriterion("active_end_in is not null");
            return (Criteria) this;
        }

        public Criteria andActiveEndInEqualTo(Integer value) {
            addCriterion("active_end_in =", value, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInNotEqualTo(Integer value) {
            addCriterion("active_end_in <>", value, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInGreaterThan(Integer value) {
            addCriterion("active_end_in >", value, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_end_in >=", value, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInLessThan(Integer value) {
            addCriterion("active_end_in <", value, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInLessThanOrEqualTo(Integer value) {
            addCriterion("active_end_in <=", value, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInIn(List<Integer> values) {
            addCriterion("active_end_in in", values, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInNotIn(List<Integer> values) {
            addCriterion("active_end_in not in", values, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInBetween(Integer value1, Integer value2) {
            addCriterion("active_end_in between", value1, value2, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActiveEndInNotBetween(Integer value1, Integer value2) {
            addCriterion("active_end_in not between", value1, value2, "activeEndIn");
            return (Criteria) this;
        }

        public Criteria andActivePriceIsNull() {
            addCriterion("active_price is null");
            return (Criteria) this;
        }

        public Criteria andActivePriceIsNotNull() {
            addCriterion("active_price is not null");
            return (Criteria) this;
        }

        public Criteria andActivePriceEqualTo(Float value) {
            addCriterion("active_price =", value, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceNotEqualTo(Float value) {
            addCriterion("active_price <>", value, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceGreaterThan(Float value) {
            addCriterion("active_price >", value, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceGreaterThanOrEqualTo(Float value) {
            addCriterion("active_price >=", value, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceLessThan(Float value) {
            addCriterion("active_price <", value, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceLessThanOrEqualTo(Float value) {
            addCriterion("active_price <=", value, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceIn(List<Float> values) {
            addCriterion("active_price in", values, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceNotIn(List<Float> values) {
            addCriterion("active_price not in", values, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceBetween(Float value1, Float value2) {
            addCriterion("active_price between", value1, value2, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActivePriceNotBetween(Float value1, Float value2) {
            addCriterion("active_price not between", value1, value2, "activePrice");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumIsNull() {
            addCriterion("active_buy_num is null");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumIsNotNull() {
            addCriterion("active_buy_num is not null");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumEqualTo(Boolean value) {
            addCriterion("active_buy_num =", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumNotEqualTo(Boolean value) {
            addCriterion("active_buy_num <>", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumGreaterThan(Boolean value) {
            addCriterion("active_buy_num >", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumGreaterThanOrEqualTo(Boolean value) {
            addCriterion("active_buy_num >=", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumLessThan(Boolean value) {
            addCriterion("active_buy_num <", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumLessThanOrEqualTo(Boolean value) {
            addCriterion("active_buy_num <=", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumIn(List<Boolean> values) {
            addCriterion("active_buy_num in", values, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumNotIn(List<Boolean> values) {
            addCriterion("active_buy_num not in", values, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumBetween(Boolean value1, Boolean value2) {
            addCriterion("active_buy_num between", value1, value2, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumNotBetween(Boolean value1, Boolean value2) {
            addCriterion("active_buy_num not between", value1, value2, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNull() {
            addCriterion("project_type is null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIsNotNull() {
            addCriterion("project_type is not null");
            return (Criteria) this;
        }

        public Criteria andProjectTypeEqualTo(Integer value) {
            addCriterion("project_type =", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotEqualTo(Integer value) {
            addCriterion("project_type <>", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThan(Integer value) {
            addCriterion("project_type >", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_type >=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThan(Integer value) {
            addCriterion("project_type <", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeLessThanOrEqualTo(Integer value) {
            addCriterion("project_type <=", value, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeIn(List<Integer> values) {
            addCriterion("project_type in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotIn(List<Integer> values) {
            addCriterion("project_type not in", values, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeBetween(Integer value1, Integer value2) {
            addCriterion("project_type between", value1, value2, "projectType");
            return (Criteria) this;
        }

        public Criteria andProjectTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("project_type not between", value1, value2, "projectType");
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