package top.lucius.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ImMealExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImMealExample() {
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

        public Criteria andDetailPicIsNull() {
            addCriterion("detail_pic is null");
            return (Criteria) this;
        }

        public Criteria andDetailPicIsNotNull() {
            addCriterion("detail_pic is not null");
            return (Criteria) this;
        }

        public Criteria andDetailPicEqualTo(String value) {
            addCriterion("detail_pic =", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicNotEqualTo(String value) {
            addCriterion("detail_pic <>", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicGreaterThan(String value) {
            addCriterion("detail_pic >", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicGreaterThanOrEqualTo(String value) {
            addCriterion("detail_pic >=", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicLessThan(String value) {
            addCriterion("detail_pic <", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicLessThanOrEqualTo(String value) {
            addCriterion("detail_pic <=", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicLike(String value) {
            addCriterion("detail_pic like", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicNotLike(String value) {
            addCriterion("detail_pic not like", value, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicIn(List<String> values) {
            addCriterion("detail_pic in", values, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicNotIn(List<String> values) {
            addCriterion("detail_pic not in", values, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicBetween(String value1, String value2) {
            addCriterion("detail_pic between", value1, value2, "detailPic");
            return (Criteria) this;
        }

        public Criteria andDetailPicNotBetween(String value1, String value2) {
            addCriterion("detail_pic not between", value1, value2, "detailPic");
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

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
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

        public Criteria andTimeDayIsNull() {
            addCriterion("time_day is null");
            return (Criteria) this;
        }

        public Criteria andTimeDayIsNotNull() {
            addCriterion("time_day is not null");
            return (Criteria) this;
        }

        public Criteria andTimeDayEqualTo(Integer value) {
            addCriterion("time_day =", value, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayNotEqualTo(Integer value) {
            addCriterion("time_day <>", value, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayGreaterThan(Integer value) {
            addCriterion("time_day >", value, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayGreaterThanOrEqualTo(Integer value) {
            addCriterion("time_day >=", value, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayLessThan(Integer value) {
            addCriterion("time_day <", value, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayLessThanOrEqualTo(Integer value) {
            addCriterion("time_day <=", value, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayIn(List<Integer> values) {
            addCriterion("time_day in", values, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayNotIn(List<Integer> values) {
            addCriterion("time_day not in", values, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayBetween(Integer value1, Integer value2) {
            addCriterion("time_day between", value1, value2, "timeDay");
            return (Criteria) this;
        }

        public Criteria andTimeDayNotBetween(Integer value1, Integer value2) {
            addCriterion("time_day not between", value1, value2, "timeDay");
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

        public Criteria andOrderSnIsNull() {
            addCriterion("order_sn is null");
            return (Criteria) this;
        }

        public Criteria andOrderSnIsNotNull() {
            addCriterion("order_sn is not null");
            return (Criteria) this;
        }

        public Criteria andOrderSnEqualTo(String value) {
            addCriterion("order_sn =", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotEqualTo(String value) {
            addCriterion("order_sn <>", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThan(String value) {
            addCriterion("order_sn >", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnGreaterThanOrEqualTo(String value) {
            addCriterion("order_sn >=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThan(String value) {
            addCriterion("order_sn <", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLessThanOrEqualTo(String value) {
            addCriterion("order_sn <=", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnLike(String value) {
            addCriterion("order_sn like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotLike(String value) {
            addCriterion("order_sn not like", value, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnIn(List<String> values) {
            addCriterion("order_sn in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotIn(List<String> values) {
            addCriterion("order_sn not in", values, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnBetween(String value1, String value2) {
            addCriterion("order_sn between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andOrderSnNotBetween(String value1, String value2) {
            addCriterion("order_sn not between", value1, value2, "orderSn");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNull() {
            addCriterion("project_id is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdIsNotNull() {
            addCriterion("project_id is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdEqualTo(Integer value) {
            addCriterion("project_id =", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotEqualTo(Integer value) {
            addCriterion("project_id <>", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThan(Integer value) {
            addCriterion("project_id >", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("project_id >=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThan(Integer value) {
            addCriterion("project_id <", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdLessThanOrEqualTo(Integer value) {
            addCriterion("project_id <=", value, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdIn(List<Integer> values) {
            addCriterion("project_id in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotIn(List<Integer> values) {
            addCriterion("project_id not in", values, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdBetween(Integer value1, Integer value2) {
            addCriterion("project_id between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andProjectIdNotBetween(Integer value1, Integer value2) {
            addCriterion("project_id not between", value1, value2, "projectId");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNull() {
            addCriterion("is_check is null");
            return (Criteria) this;
        }

        public Criteria andIsCheckIsNotNull() {
            addCriterion("is_check is not null");
            return (Criteria) this;
        }

        public Criteria andIsCheckEqualTo(Boolean value) {
            addCriterion("is_check =", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotEqualTo(Boolean value) {
            addCriterion("is_check <>", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThan(Boolean value) {
            addCriterion("is_check >", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_check >=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThan(Boolean value) {
            addCriterion("is_check <", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckLessThanOrEqualTo(Boolean value) {
            addCriterion("is_check <=", value, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckIn(List<Boolean> values) {
            addCriterion("is_check in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotIn(List<Boolean> values) {
            addCriterion("is_check not in", values, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andIsCheckNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_check not between", value1, value2, "isCheck");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNull() {
            addCriterion("check_time is null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIsNotNull() {
            addCriterion("check_time is not null");
            return (Criteria) this;
        }

        public Criteria andCheckTimeEqualTo(Integer value) {
            addCriterion("check_time =", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotEqualTo(Integer value) {
            addCriterion("check_time <>", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThan(Integer value) {
            addCriterion("check_time >", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("check_time >=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThan(Integer value) {
            addCriterion("check_time <", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeLessThanOrEqualTo(Integer value) {
            addCriterion("check_time <=", value, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeIn(List<Integer> values) {
            addCriterion("check_time in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotIn(List<Integer> values) {
            addCriterion("check_time not in", values, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeBetween(Integer value1, Integer value2) {
            addCriterion("check_time between", value1, value2, "checkTime");
            return (Criteria) this;
        }

        public Criteria andCheckTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("check_time not between", value1, value2, "checkTime");
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

        public Criteria andServiceTimeIsNull() {
            addCriterion("service_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIsNotNull() {
            addCriterion("service_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceTimeEqualTo(Short value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(Short value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(Short value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(Short value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(Short value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(Short value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<Short> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<Short> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(Short value1, Short value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(Short value1, Short value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
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

        public Criteria andPropertyEqualTo(Byte value) {
            addCriterion("property =", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotEqualTo(Byte value) {
            addCriterion("property <>", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThan(Byte value) {
            addCriterion("property >", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyGreaterThanOrEqualTo(Byte value) {
            addCriterion("property >=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThan(Byte value) {
            addCriterion("property <", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyLessThanOrEqualTo(Byte value) {
            addCriterion("property <=", value, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyIn(List<Byte> values) {
            addCriterion("property in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotIn(List<Byte> values) {
            addCriterion("property not in", values, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyBetween(Byte value1, Byte value2) {
            addCriterion("property between", value1, value2, "property");
            return (Criteria) this;
        }

        public Criteria andPropertyNotBetween(Byte value1, Byte value2) {
            addCriterion("property not between", value1, value2, "property");
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

        public Criteria andIsHotIsNull() {
            addCriterion("is_hot is null");
            return (Criteria) this;
        }

        public Criteria andIsHotIsNotNull() {
            addCriterion("is_hot is not null");
            return (Criteria) this;
        }

        public Criteria andIsHotEqualTo(Byte value) {
            addCriterion("is_hot =", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotEqualTo(Byte value) {
            addCriterion("is_hot <>", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThan(Byte value) {
            addCriterion("is_hot >", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_hot >=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThan(Byte value) {
            addCriterion("is_hot <", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotLessThanOrEqualTo(Byte value) {
            addCriterion("is_hot <=", value, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotIn(List<Byte> values) {
            addCriterion("is_hot in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotIn(List<Byte> values) {
            addCriterion("is_hot not in", values, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot between", value1, value2, "isHot");
            return (Criteria) this;
        }

        public Criteria andIsHotNotBetween(Byte value1, Byte value2) {
            addCriterion("is_hot not between", value1, value2, "isHot");
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

        public Criteria andActiveBuyNumEqualTo(Integer value) {
            addCriterion("active_buy_num =", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumNotEqualTo(Integer value) {
            addCriterion("active_buy_num <>", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumGreaterThan(Integer value) {
            addCriterion("active_buy_num >", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("active_buy_num >=", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumLessThan(Integer value) {
            addCriterion("active_buy_num <", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumLessThanOrEqualTo(Integer value) {
            addCriterion("active_buy_num <=", value, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumIn(List<Integer> values) {
            addCriterion("active_buy_num in", values, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumNotIn(List<Integer> values) {
            addCriterion("active_buy_num not in", values, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumBetween(Integer value1, Integer value2) {
            addCriterion("active_buy_num between", value1, value2, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andActiveBuyNumNotBetween(Integer value1, Integer value2) {
            addCriterion("active_buy_num not between", value1, value2, "activeBuyNum");
            return (Criteria) this;
        }

        public Criteria andMealTypeIsNull() {
            addCriterion("meal_type is null");
            return (Criteria) this;
        }

        public Criteria andMealTypeIsNotNull() {
            addCriterion("meal_type is not null");
            return (Criteria) this;
        }

        public Criteria andMealTypeEqualTo(Integer value) {
            addCriterion("meal_type =", value, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeNotEqualTo(Integer value) {
            addCriterion("meal_type <>", value, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeGreaterThan(Integer value) {
            addCriterion("meal_type >", value, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("meal_type >=", value, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeLessThan(Integer value) {
            addCriterion("meal_type <", value, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeLessThanOrEqualTo(Integer value) {
            addCriterion("meal_type <=", value, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeIn(List<Integer> values) {
            addCriterion("meal_type in", values, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeNotIn(List<Integer> values) {
            addCriterion("meal_type not in", values, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeBetween(Integer value1, Integer value2) {
            addCriterion("meal_type between", value1, value2, "mealType");
            return (Criteria) this;
        }

        public Criteria andMealTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("meal_type not between", value1, value2, "mealType");
            return (Criteria) this;
        }

        public Criteria andSpecNumIsNull() {
            addCriterion("spec_num is null");
            return (Criteria) this;
        }

        public Criteria andSpecNumIsNotNull() {
            addCriterion("spec_num is not null");
            return (Criteria) this;
        }

        public Criteria andSpecNumEqualTo(String value) {
            addCriterion("spec_num =", value, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumNotEqualTo(String value) {
            addCriterion("spec_num <>", value, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumGreaterThan(String value) {
            addCriterion("spec_num >", value, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumGreaterThanOrEqualTo(String value) {
            addCriterion("spec_num >=", value, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumLessThan(String value) {
            addCriterion("spec_num <", value, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumLessThanOrEqualTo(String value) {
            addCriterion("spec_num <=", value, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumLike(String value) {
            addCriterion("spec_num like", value, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumNotLike(String value) {
            addCriterion("spec_num not like", value, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumIn(List<String> values) {
            addCriterion("spec_num in", values, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumNotIn(List<String> values) {
            addCriterion("spec_num not in", values, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumBetween(String value1, String value2) {
            addCriterion("spec_num between", value1, value2, "specNum");
            return (Criteria) this;
        }

        public Criteria andSpecNumNotBetween(String value1, String value2) {
            addCriterion("spec_num not between", value1, value2, "specNum");
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