package top.lucius.model;

import java.util.ArrayList;
import java.util.List;

public class ImOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImOrderExample() {
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

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
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

        public Criteria andCashCouponIdIsNull() {
            addCriterion("cash_coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdIsNotNull() {
            addCriterion("cash_coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdEqualTo(Integer value) {
            addCriterion("cash_coupon_id =", value, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdNotEqualTo(Integer value) {
            addCriterion("cash_coupon_id <>", value, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdGreaterThan(Integer value) {
            addCriterion("cash_coupon_id >", value, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cash_coupon_id >=", value, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdLessThan(Integer value) {
            addCriterion("cash_coupon_id <", value, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("cash_coupon_id <=", value, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdIn(List<Integer> values) {
            addCriterion("cash_coupon_id in", values, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdNotIn(List<Integer> values) {
            addCriterion("cash_coupon_id not in", values, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("cash_coupon_id between", value1, value2, "cashCouponId");
            return (Criteria) this;
        }

        public Criteria andCashCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cash_coupon_id not between", value1, value2, "cashCouponId");
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

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMealNameIsNull() {
            addCriterion("meal_name is null");
            return (Criteria) this;
        }

        public Criteria andMealNameIsNotNull() {
            addCriterion("meal_name is not null");
            return (Criteria) this;
        }

        public Criteria andMealNameEqualTo(String value) {
            addCriterion("meal_name =", value, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameNotEqualTo(String value) {
            addCriterion("meal_name <>", value, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameGreaterThan(String value) {
            addCriterion("meal_name >", value, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameGreaterThanOrEqualTo(String value) {
            addCriterion("meal_name >=", value, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameLessThan(String value) {
            addCriterion("meal_name <", value, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameLessThanOrEqualTo(String value) {
            addCriterion("meal_name <=", value, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameLike(String value) {
            addCriterion("meal_name like", value, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameNotLike(String value) {
            addCriterion("meal_name not like", value, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameIn(List<String> values) {
            addCriterion("meal_name in", values, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameNotIn(List<String> values) {
            addCriterion("meal_name not in", values, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameBetween(String value1, String value2) {
            addCriterion("meal_name between", value1, value2, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealNameNotBetween(String value1, String value2) {
            addCriterion("meal_name not between", value1, value2, "mealName");
            return (Criteria) this;
        }

        public Criteria andMealIdIsNull() {
            addCriterion("meal_id is null");
            return (Criteria) this;
        }

        public Criteria andMealIdIsNotNull() {
            addCriterion("meal_id is not null");
            return (Criteria) this;
        }

        public Criteria andMealIdEqualTo(Integer value) {
            addCriterion("meal_id =", value, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdNotEqualTo(Integer value) {
            addCriterion("meal_id <>", value, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdGreaterThan(Integer value) {
            addCriterion("meal_id >", value, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("meal_id >=", value, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdLessThan(Integer value) {
            addCriterion("meal_id <", value, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdLessThanOrEqualTo(Integer value) {
            addCriterion("meal_id <=", value, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdIn(List<Integer> values) {
            addCriterion("meal_id in", values, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdNotIn(List<Integer> values) {
            addCriterion("meal_id not in", values, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdBetween(Integer value1, Integer value2) {
            addCriterion("meal_id between", value1, value2, "mealId");
            return (Criteria) this;
        }

        public Criteria andMealIdNotBetween(Integer value1, Integer value2) {
            addCriterion("meal_id not between", value1, value2, "mealId");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNull() {
            addCriterion("total_price is null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIsNotNull() {
            addCriterion("total_price is not null");
            return (Criteria) this;
        }

        public Criteria andTotalPriceEqualTo(Float value) {
            addCriterion("total_price =", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotEqualTo(Float value) {
            addCriterion("total_price <>", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThan(Float value) {
            addCriterion("total_price >", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("total_price >=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThan(Float value) {
            addCriterion("total_price <", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceLessThanOrEqualTo(Float value) {
            addCriterion("total_price <=", value, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceIn(List<Float> values) {
            addCriterion("total_price in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotIn(List<Float> values) {
            addCriterion("total_price not in", values, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceBetween(Float value1, Float value2) {
            addCriterion("total_price between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andTotalPriceNotBetween(Float value1, Float value2) {
            addCriterion("total_price not between", value1, value2, "totalPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNull() {
            addCriterion("discount_price is null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIsNotNull() {
            addCriterion("discount_price is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceEqualTo(Float value) {
            addCriterion("discount_price =", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotEqualTo(Float value) {
            addCriterion("discount_price <>", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThan(Float value) {
            addCriterion("discount_price >", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("discount_price >=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThan(Float value) {
            addCriterion("discount_price <", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceLessThanOrEqualTo(Float value) {
            addCriterion("discount_price <=", value, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceIn(List<Float> values) {
            addCriterion("discount_price in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotIn(List<Float> values) {
            addCriterion("discount_price not in", values, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceBetween(Float value1, Float value2) {
            addCriterion("discount_price between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andDiscountPriceNotBetween(Float value1, Float value2) {
            addCriterion("discount_price not between", value1, value2, "discountPrice");
            return (Criteria) this;
        }

        public Criteria andCouponSnIsNull() {
            addCriterion("coupon_sn is null");
            return (Criteria) this;
        }

        public Criteria andCouponSnIsNotNull() {
            addCriterion("coupon_sn is not null");
            return (Criteria) this;
        }

        public Criteria andCouponSnEqualTo(String value) {
            addCriterion("coupon_sn =", value, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnNotEqualTo(String value) {
            addCriterion("coupon_sn <>", value, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnGreaterThan(String value) {
            addCriterion("coupon_sn >", value, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnGreaterThanOrEqualTo(String value) {
            addCriterion("coupon_sn >=", value, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnLessThan(String value) {
            addCriterion("coupon_sn <", value, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnLessThanOrEqualTo(String value) {
            addCriterion("coupon_sn <=", value, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnLike(String value) {
            addCriterion("coupon_sn like", value, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnNotLike(String value) {
            addCriterion("coupon_sn not like", value, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnIn(List<String> values) {
            addCriterion("coupon_sn in", values, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnNotIn(List<String> values) {
            addCriterion("coupon_sn not in", values, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnBetween(String value1, String value2) {
            addCriterion("coupon_sn between", value1, value2, "couponSn");
            return (Criteria) this;
        }

        public Criteria andCouponSnNotBetween(String value1, String value2) {
            addCriterion("coupon_sn not between", value1, value2, "couponSn");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNull() {
            addCriterion("province is null");
            return (Criteria) this;
        }

        public Criteria andProvinceIsNotNull() {
            addCriterion("province is not null");
            return (Criteria) this;
        }

        public Criteria andProvinceEqualTo(Integer value) {
            addCriterion("province =", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotEqualTo(Integer value) {
            addCriterion("province <>", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThan(Integer value) {
            addCriterion("province >", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceGreaterThanOrEqualTo(Integer value) {
            addCriterion("province >=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThan(Integer value) {
            addCriterion("province <", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceLessThanOrEqualTo(Integer value) {
            addCriterion("province <=", value, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceIn(List<Integer> values) {
            addCriterion("province in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotIn(List<Integer> values) {
            addCriterion("province not in", values, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceBetween(Integer value1, Integer value2) {
            addCriterion("province between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andProvinceNotBetween(Integer value1, Integer value2) {
            addCriterion("province not between", value1, value2, "province");
            return (Criteria) this;
        }

        public Criteria andCityIsNull() {
            addCriterion("city is null");
            return (Criteria) this;
        }

        public Criteria andCityIsNotNull() {
            addCriterion("city is not null");
            return (Criteria) this;
        }

        public Criteria andCityEqualTo(Integer value) {
            addCriterion("city =", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotEqualTo(Integer value) {
            addCriterion("city <>", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThan(Integer value) {
            addCriterion("city >", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityGreaterThanOrEqualTo(Integer value) {
            addCriterion("city >=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThan(Integer value) {
            addCriterion("city <", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityLessThanOrEqualTo(Integer value) {
            addCriterion("city <=", value, "city");
            return (Criteria) this;
        }

        public Criteria andCityIn(List<Integer> values) {
            addCriterion("city in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotIn(List<Integer> values) {
            addCriterion("city not in", values, "city");
            return (Criteria) this;
        }

        public Criteria andCityBetween(Integer value1, Integer value2) {
            addCriterion("city between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andCityNotBetween(Integer value1, Integer value2) {
            addCriterion("city not between", value1, value2, "city");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNull() {
            addCriterion("district is null");
            return (Criteria) this;
        }

        public Criteria andDistrictIsNotNull() {
            addCriterion("district is not null");
            return (Criteria) this;
        }

        public Criteria andDistrictEqualTo(Integer value) {
            addCriterion("district =", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotEqualTo(Integer value) {
            addCriterion("district <>", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThan(Integer value) {
            addCriterion("district >", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictGreaterThanOrEqualTo(Integer value) {
            addCriterion("district >=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThan(Integer value) {
            addCriterion("district <", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictLessThanOrEqualTo(Integer value) {
            addCriterion("district <=", value, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictIn(List<Integer> values) {
            addCriterion("district in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotIn(List<Integer> values) {
            addCriterion("district not in", values, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictBetween(Integer value1, Integer value2) {
            addCriterion("district between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andDistrictNotBetween(Integer value1, Integer value2) {
            addCriterion("district not between", value1, value2, "district");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNull() {
            addCriterion("room_number is null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIsNotNull() {
            addCriterion("room_number is not null");
            return (Criteria) this;
        }

        public Criteria andRoomNumberEqualTo(String value) {
            addCriterion("room_number =", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotEqualTo(String value) {
            addCriterion("room_number <>", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThan(String value) {
            addCriterion("room_number >", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberGreaterThanOrEqualTo(String value) {
            addCriterion("room_number >=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThan(String value) {
            addCriterion("room_number <", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLessThanOrEqualTo(String value) {
            addCriterion("room_number <=", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberLike(String value) {
            addCriterion("room_number like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotLike(String value) {
            addCriterion("room_number not like", value, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberIn(List<String> values) {
            addCriterion("room_number in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotIn(List<String> values) {
            addCriterion("room_number not in", values, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberBetween(String value1, String value2) {
            addCriterion("room_number between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andRoomNumberNotBetween(String value1, String value2) {
            addCriterion("room_number not between", value1, value2, "roomNumber");
            return (Criteria) this;
        }

        public Criteria andFullAddressIsNull() {
            addCriterion("full_address is null");
            return (Criteria) this;
        }

        public Criteria andFullAddressIsNotNull() {
            addCriterion("full_address is not null");
            return (Criteria) this;
        }

        public Criteria andFullAddressEqualTo(String value) {
            addCriterion("full_address =", value, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressNotEqualTo(String value) {
            addCriterion("full_address <>", value, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressGreaterThan(String value) {
            addCriterion("full_address >", value, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressGreaterThanOrEqualTo(String value) {
            addCriterion("full_address >=", value, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressLessThan(String value) {
            addCriterion("full_address <", value, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressLessThanOrEqualTo(String value) {
            addCriterion("full_address <=", value, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressLike(String value) {
            addCriterion("full_address like", value, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressNotLike(String value) {
            addCriterion("full_address not like", value, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressIn(List<String> values) {
            addCriterion("full_address in", values, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressNotIn(List<String> values) {
            addCriterion("full_address not in", values, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressBetween(String value1, String value2) {
            addCriterion("full_address between", value1, value2, "fullAddress");
            return (Criteria) this;
        }

        public Criteria andFullAddressNotBetween(String value1, String value2) {
            addCriterion("full_address not between", value1, value2, "fullAddress");
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

        public Criteria andServiceTimeEqualTo(String value) {
            addCriterion("service_time =", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotEqualTo(String value) {
            addCriterion("service_time <>", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThan(String value) {
            addCriterion("service_time >", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeGreaterThanOrEqualTo(String value) {
            addCriterion("service_time >=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThan(String value) {
            addCriterion("service_time <", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLessThanOrEqualTo(String value) {
            addCriterion("service_time <=", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeLike(String value) {
            addCriterion("service_time like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotLike(String value) {
            addCriterion("service_time not like", value, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeIn(List<String> values) {
            addCriterion("service_time in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotIn(List<String> values) {
            addCriterion("service_time not in", values, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeBetween(String value1, String value2) {
            addCriterion("service_time between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andServiceTimeNotBetween(String value1, String value2) {
            addCriterion("service_time not between", value1, value2, "serviceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeIsNull() {
            addCriterion("edit_service_time is null");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeIsNotNull() {
            addCriterion("edit_service_time is not null");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeEqualTo(Integer value) {
            addCriterion("edit_service_time =", value, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeNotEqualTo(Integer value) {
            addCriterion("edit_service_time <>", value, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeGreaterThan(Integer value) {
            addCriterion("edit_service_time >", value, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("edit_service_time >=", value, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeLessThan(Integer value) {
            addCriterion("edit_service_time <", value, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeLessThanOrEqualTo(Integer value) {
            addCriterion("edit_service_time <=", value, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeIn(List<Integer> values) {
            addCriterion("edit_service_time in", values, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeNotIn(List<Integer> values) {
            addCriterion("edit_service_time not in", values, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeBetween(Integer value1, Integer value2) {
            addCriterion("edit_service_time between", value1, value2, "editServiceTime");
            return (Criteria) this;
        }

        public Criteria andEditServiceTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("edit_service_time not between", value1, value2, "editServiceTime");
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

        public Criteria andTradeNoIsNull() {
            addCriterion("trade_no is null");
            return (Criteria) this;
        }

        public Criteria andTradeNoIsNotNull() {
            addCriterion("trade_no is not null");
            return (Criteria) this;
        }

        public Criteria andTradeNoEqualTo(String value) {
            addCriterion("trade_no =", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotEqualTo(String value) {
            addCriterion("trade_no <>", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThan(String value) {
            addCriterion("trade_no >", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoGreaterThanOrEqualTo(String value) {
            addCriterion("trade_no >=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThan(String value) {
            addCriterion("trade_no <", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLessThanOrEqualTo(String value) {
            addCriterion("trade_no <=", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoLike(String value) {
            addCriterion("trade_no like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotLike(String value) {
            addCriterion("trade_no not like", value, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoIn(List<String> values) {
            addCriterion("trade_no in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotIn(List<String> values) {
            addCriterion("trade_no not in", values, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoBetween(String value1, String value2) {
            addCriterion("trade_no between", value1, value2, "tradeNo");
            return (Criteria) this;
        }

        public Criteria andTradeNoNotBetween(String value1, String value2) {
            addCriterion("trade_no not between", value1, value2, "tradeNo");
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

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNull() {
            addCriterion("confirm_time is null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIsNotNull() {
            addCriterion("confirm_time is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeEqualTo(Integer value) {
            addCriterion("confirm_time =", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotEqualTo(Integer value) {
            addCriterion("confirm_time <>", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThan(Integer value) {
            addCriterion("confirm_time >", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("confirm_time >=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThan(Integer value) {
            addCriterion("confirm_time <", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeLessThanOrEqualTo(Integer value) {
            addCriterion("confirm_time <=", value, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeIn(List<Integer> values) {
            addCriterion("confirm_time in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotIn(List<Integer> values) {
            addCriterion("confirm_time not in", values, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andConfirmTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("confirm_time not between", value1, value2, "confirmTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNull() {
            addCriterion("cancel_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIsNotNull() {
            addCriterion("cancel_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelTimeEqualTo(Integer value) {
            addCriterion("cancel_time =", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotEqualTo(Integer value) {
            addCriterion("cancel_time <>", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThan(Integer value) {
            addCriterion("cancel_time >", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_time >=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThan(Integer value) {
            addCriterion("cancel_time <", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_time <=", value, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeIn(List<Integer> values) {
            addCriterion("cancel_time in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotIn(List<Integer> values) {
            addCriterion("cancel_time not in", values, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeBetween(Integer value1, Integer value2) {
            addCriterion("cancel_time between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andCancelTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_time not between", value1, value2, "cancelTime");
            return (Criteria) this;
        }

        public Criteria andNotifiedIsNull() {
            addCriterion("notified is null");
            return (Criteria) this;
        }

        public Criteria andNotifiedIsNotNull() {
            addCriterion("notified is not null");
            return (Criteria) this;
        }

        public Criteria andNotifiedEqualTo(Boolean value) {
            addCriterion("notified =", value, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedNotEqualTo(Boolean value) {
            addCriterion("notified <>", value, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedGreaterThan(Boolean value) {
            addCriterion("notified >", value, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("notified >=", value, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedLessThan(Boolean value) {
            addCriterion("notified <", value, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedLessThanOrEqualTo(Boolean value) {
            addCriterion("notified <=", value, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedIn(List<Boolean> values) {
            addCriterion("notified in", values, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedNotIn(List<Boolean> values) {
            addCriterion("notified not in", values, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedBetween(Boolean value1, Boolean value2) {
            addCriterion("notified between", value1, value2, "notified");
            return (Criteria) this;
        }

        public Criteria andNotifiedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("notified not between", value1, value2, "notified");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNull() {
            addCriterion("pay_method is null");
            return (Criteria) this;
        }

        public Criteria andPayMethodIsNotNull() {
            addCriterion("pay_method is not null");
            return (Criteria) this;
        }

        public Criteria andPayMethodEqualTo(String value) {
            addCriterion("pay_method =", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotEqualTo(String value) {
            addCriterion("pay_method <>", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThan(String value) {
            addCriterion("pay_method >", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodGreaterThanOrEqualTo(String value) {
            addCriterion("pay_method >=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThan(String value) {
            addCriterion("pay_method <", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLessThanOrEqualTo(String value) {
            addCriterion("pay_method <=", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodLike(String value) {
            addCriterion("pay_method like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotLike(String value) {
            addCriterion("pay_method not like", value, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodIn(List<String> values) {
            addCriterion("pay_method in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotIn(List<String> values) {
            addCriterion("pay_method not in", values, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodBetween(String value1, String value2) {
            addCriterion("pay_method between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayMethodNotBetween(String value1, String value2) {
            addCriterion("pay_method not between", value1, value2, "payMethod");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNull() {
            addCriterion("pay_price is null");
            return (Criteria) this;
        }

        public Criteria andPayPriceIsNotNull() {
            addCriterion("pay_price is not null");
            return (Criteria) this;
        }

        public Criteria andPayPriceEqualTo(Float value) {
            addCriterion("pay_price =", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotEqualTo(Float value) {
            addCriterion("pay_price <>", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThan(Float value) {
            addCriterion("pay_price >", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("pay_price >=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThan(Float value) {
            addCriterion("pay_price <", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceLessThanOrEqualTo(Float value) {
            addCriterion("pay_price <=", value, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceIn(List<Float> values) {
            addCriterion("pay_price in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotIn(List<Float> values) {
            addCriterion("pay_price not in", values, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceBetween(Float value1, Float value2) {
            addCriterion("pay_price between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPayPriceNotBetween(Float value1, Float value2) {
            addCriterion("pay_price not between", value1, value2, "payPrice");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNull() {
            addCriterion("paid_time is null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIsNotNull() {
            addCriterion("paid_time is not null");
            return (Criteria) this;
        }

        public Criteria andPaidTimeEqualTo(Integer value) {
            addCriterion("paid_time =", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotEqualTo(Integer value) {
            addCriterion("paid_time <>", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThan(Integer value) {
            addCriterion("paid_time >", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paid_time >=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThan(Integer value) {
            addCriterion("paid_time <", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeLessThanOrEqualTo(Integer value) {
            addCriterion("paid_time <=", value, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeIn(List<Integer> values) {
            addCriterion("paid_time in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotIn(List<Integer> values) {
            addCriterion("paid_time not in", values, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeBetween(Integer value1, Integer value2) {
            addCriterion("paid_time between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andPaidTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("paid_time not between", value1, value2, "paidTime");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedIsNull() {
            addCriterion("start_time_deleted is null");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedIsNotNull() {
            addCriterion("start_time_deleted is not null");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedEqualTo(Integer value) {
            addCriterion("start_time_deleted =", value, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedNotEqualTo(Integer value) {
            addCriterion("start_time_deleted <>", value, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedGreaterThan(Integer value) {
            addCriterion("start_time_deleted >", value, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedGreaterThanOrEqualTo(Integer value) {
            addCriterion("start_time_deleted >=", value, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedLessThan(Integer value) {
            addCriterion("start_time_deleted <", value, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedLessThanOrEqualTo(Integer value) {
            addCriterion("start_time_deleted <=", value, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedIn(List<Integer> values) {
            addCriterion("start_time_deleted in", values, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedNotIn(List<Integer> values) {
            addCriterion("start_time_deleted not in", values, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedBetween(Integer value1, Integer value2) {
            addCriterion("start_time_deleted between", value1, value2, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andStartTimeDeletedNotBetween(Integer value1, Integer value2) {
            addCriterion("start_time_deleted not between", value1, value2, "startTimeDeleted");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNull() {
            addCriterion("end_time is null");
            return (Criteria) this;
        }

        public Criteria andEndTimeIsNotNull() {
            addCriterion("end_time is not null");
            return (Criteria) this;
        }

        public Criteria andEndTimeEqualTo(Integer value) {
            addCriterion("end_time =", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotEqualTo(Integer value) {
            addCriterion("end_time <>", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThan(Integer value) {
            addCriterion("end_time >", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("end_time >=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThan(Integer value) {
            addCriterion("end_time <", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeLessThanOrEqualTo(Integer value) {
            addCriterion("end_time <=", value, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeIn(List<Integer> values) {
            addCriterion("end_time in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotIn(List<Integer> values) {
            addCriterion("end_time not in", values, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeBetween(Integer value1, Integer value2) {
            addCriterion("end_time between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andEndTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("end_time not between", value1, value2, "endTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNull() {
            addCriterion("begin_time is null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIsNotNull() {
            addCriterion("begin_time is not null");
            return (Criteria) this;
        }

        public Criteria andBeginTimeEqualTo(Integer value) {
            addCriterion("begin_time =", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotEqualTo(Integer value) {
            addCriterion("begin_time <>", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThan(Integer value) {
            addCriterion("begin_time >", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("begin_time >=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThan(Integer value) {
            addCriterion("begin_time <", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeLessThanOrEqualTo(Integer value) {
            addCriterion("begin_time <=", value, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeIn(List<Integer> values) {
            addCriterion("begin_time in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotIn(List<Integer> values) {
            addCriterion("begin_time not in", values, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeBetween(Integer value1, Integer value2) {
            addCriterion("begin_time between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("begin_time not between", value1, value2, "beginTime");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeIsNull() {
            addCriterion("begin_longitude is null");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeIsNotNull() {
            addCriterion("begin_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeEqualTo(Float value) {
            addCriterion("begin_longitude =", value, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeNotEqualTo(Float value) {
            addCriterion("begin_longitude <>", value, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeGreaterThan(Float value) {
            addCriterion("begin_longitude >", value, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("begin_longitude >=", value, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeLessThan(Float value) {
            addCriterion("begin_longitude <", value, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("begin_longitude <=", value, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeIn(List<Float> values) {
            addCriterion("begin_longitude in", values, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeNotIn(List<Float> values) {
            addCriterion("begin_longitude not in", values, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeBetween(Float value1, Float value2) {
            addCriterion("begin_longitude between", value1, value2, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("begin_longitude not between", value1, value2, "beginLongitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeIsNull() {
            addCriterion("begin_latitude is null");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeIsNotNull() {
            addCriterion("begin_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeEqualTo(Float value) {
            addCriterion("begin_latitude =", value, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeNotEqualTo(Float value) {
            addCriterion("begin_latitude <>", value, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeGreaterThan(Float value) {
            addCriterion("begin_latitude >", value, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("begin_latitude >=", value, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeLessThan(Float value) {
            addCriterion("begin_latitude <", value, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("begin_latitude <=", value, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeIn(List<Float> values) {
            addCriterion("begin_latitude in", values, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeNotIn(List<Float> values) {
            addCriterion("begin_latitude not in", values, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeBetween(Float value1, Float value2) {
            addCriterion("begin_latitude between", value1, value2, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andBeginLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("begin_latitude not between", value1, value2, "beginLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIsNull() {
            addCriterion("end_longitude is null");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIsNotNull() {
            addCriterion("end_longitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeEqualTo(Float value) {
            addCriterion("end_longitude =", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotEqualTo(Float value) {
            addCriterion("end_longitude <>", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeGreaterThan(Float value) {
            addCriterion("end_longitude >", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("end_longitude >=", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeLessThan(Float value) {
            addCriterion("end_longitude <", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeLessThanOrEqualTo(Float value) {
            addCriterion("end_longitude <=", value, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeIn(List<Float> values) {
            addCriterion("end_longitude in", values, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotIn(List<Float> values) {
            addCriterion("end_longitude not in", values, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeBetween(Float value1, Float value2) {
            addCriterion("end_longitude between", value1, value2, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLongitudeNotBetween(Float value1, Float value2) {
            addCriterion("end_longitude not between", value1, value2, "endLongitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIsNull() {
            addCriterion("end_latitude is null");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIsNotNull() {
            addCriterion("end_latitude is not null");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeEqualTo(Float value) {
            addCriterion("end_latitude =", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotEqualTo(Float value) {
            addCriterion("end_latitude <>", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeGreaterThan(Float value) {
            addCriterion("end_latitude >", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeGreaterThanOrEqualTo(Float value) {
            addCriterion("end_latitude >=", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeLessThan(Float value) {
            addCriterion("end_latitude <", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeLessThanOrEqualTo(Float value) {
            addCriterion("end_latitude <=", value, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeIn(List<Float> values) {
            addCriterion("end_latitude in", values, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotIn(List<Float> values) {
            addCriterion("end_latitude not in", values, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeBetween(Float value1, Float value2) {
            addCriterion("end_latitude between", value1, value2, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andEndLatitudeNotBetween(Float value1, Float value2) {
            addCriterion("end_latitude not between", value1, value2, "endLatitude");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIsNull() {
            addCriterion("service_end_time is null");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIsNotNull() {
            addCriterion("service_end_time is not null");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeEqualTo(String value) {
            addCriterion("service_end_time =", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotEqualTo(String value) {
            addCriterion("service_end_time <>", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeGreaterThan(String value) {
            addCriterion("service_end_time >", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeGreaterThanOrEqualTo(String value) {
            addCriterion("service_end_time >=", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLessThan(String value) {
            addCriterion("service_end_time <", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLessThanOrEqualTo(String value) {
            addCriterion("service_end_time <=", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeLike(String value) {
            addCriterion("service_end_time like", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotLike(String value) {
            addCriterion("service_end_time not like", value, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeIn(List<String> values) {
            addCriterion("service_end_time in", values, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotIn(List<String> values) {
            addCriterion("service_end_time not in", values, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeBetween(String value1, String value2) {
            addCriterion("service_end_time between", value1, value2, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andServiceEndTimeNotBetween(String value1, String value2) {
            addCriterion("service_end_time not between", value1, value2, "serviceEndTime");
            return (Criteria) this;
        }

        public Criteria andProjectIdsIsNull() {
            addCriterion("project_ids is null");
            return (Criteria) this;
        }

        public Criteria andProjectIdsIsNotNull() {
            addCriterion("project_ids is not null");
            return (Criteria) this;
        }

        public Criteria andProjectIdsEqualTo(String value) {
            addCriterion("project_ids =", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsNotEqualTo(String value) {
            addCriterion("project_ids <>", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsGreaterThan(String value) {
            addCriterion("project_ids >", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsGreaterThanOrEqualTo(String value) {
            addCriterion("project_ids >=", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsLessThan(String value) {
            addCriterion("project_ids <", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsLessThanOrEqualTo(String value) {
            addCriterion("project_ids <=", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsLike(String value) {
            addCriterion("project_ids like", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsNotLike(String value) {
            addCriterion("project_ids not like", value, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsIn(List<String> values) {
            addCriterion("project_ids in", values, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsNotIn(List<String> values) {
            addCriterion("project_ids not in", values, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsBetween(String value1, String value2) {
            addCriterion("project_ids between", value1, value2, "projectIds");
            return (Criteria) this;
        }

        public Criteria andProjectIdsNotBetween(String value1, String value2) {
            addCriterion("project_ids not between", value1, value2, "projectIds");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyIsNull() {
            addCriterion("cash_coupon_money is null");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyIsNotNull() {
            addCriterion("cash_coupon_money is not null");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyEqualTo(Float value) {
            addCriterion("cash_coupon_money =", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyNotEqualTo(Float value) {
            addCriterion("cash_coupon_money <>", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyGreaterThan(Float value) {
            addCriterion("cash_coupon_money >", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("cash_coupon_money >=", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyLessThan(Float value) {
            addCriterion("cash_coupon_money <", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyLessThanOrEqualTo(Float value) {
            addCriterion("cash_coupon_money <=", value, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyIn(List<Float> values) {
            addCriterion("cash_coupon_money in", values, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyNotIn(List<Float> values) {
            addCriterion("cash_coupon_money not in", values, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyBetween(Float value1, Float value2) {
            addCriterion("cash_coupon_money between", value1, value2, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andCashCouponMoneyNotBetween(Float value1, Float value2) {
            addCriterion("cash_coupon_money not between", value1, value2, "cashCouponMoney");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdIsNull() {
            addCriterion("member_cash_coupon_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdIsNotNull() {
            addCriterion("member_cash_coupon_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdEqualTo(Integer value) {
            addCriterion("member_cash_coupon_id =", value, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdNotEqualTo(Integer value) {
            addCriterion("member_cash_coupon_id <>", value, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdGreaterThan(Integer value) {
            addCriterion("member_cash_coupon_id >", value, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_cash_coupon_id >=", value, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdLessThan(Integer value) {
            addCriterion("member_cash_coupon_id <", value, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_cash_coupon_id <=", value, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdIn(List<Integer> values) {
            addCriterion("member_cash_coupon_id in", values, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdNotIn(List<Integer> values) {
            addCriterion("member_cash_coupon_id not in", values, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdBetween(Integer value1, Integer value2) {
            addCriterion("member_cash_coupon_id between", value1, value2, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemberCashCouponIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_cash_coupon_id not between", value1, value2, "memberCashCouponId");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNull() {
            addCriterion("is_confirm is null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIsNotNull() {
            addCriterion("is_confirm is not null");
            return (Criteria) this;
        }

        public Criteria andIsConfirmEqualTo(Integer value) {
            addCriterion("is_confirm =", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotEqualTo(Integer value) {
            addCriterion("is_confirm <>", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThan(Integer value) {
            addCriterion("is_confirm >", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmGreaterThanOrEqualTo(Integer value) {
            addCriterion("is_confirm >=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThan(Integer value) {
            addCriterion("is_confirm <", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmLessThanOrEqualTo(Integer value) {
            addCriterion("is_confirm <=", value, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmIn(List<Integer> values) {
            addCriterion("is_confirm in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotIn(List<Integer> values) {
            addCriterion("is_confirm not in", values, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmBetween(Integer value1, Integer value2) {
            addCriterion("is_confirm between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andIsConfirmNotBetween(Integer value1, Integer value2) {
            addCriterion("is_confirm not between", value1, value2, "isConfirm");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyIsNull() {
            addCriterion("used_money is null");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyIsNotNull() {
            addCriterion("used_money is not null");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyEqualTo(Float value) {
            addCriterion("used_money =", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyNotEqualTo(Float value) {
            addCriterion("used_money <>", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyGreaterThan(Float value) {
            addCriterion("used_money >", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("used_money >=", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyLessThan(Float value) {
            addCriterion("used_money <", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyLessThanOrEqualTo(Float value) {
            addCriterion("used_money <=", value, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyIn(List<Float> values) {
            addCriterion("used_money in", values, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyNotIn(List<Float> values) {
            addCriterion("used_money not in", values, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyBetween(Float value1, Float value2) {
            addCriterion("used_money between", value1, value2, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedMoneyNotBetween(Float value1, Float value2) {
            addCriterion("used_money not between", value1, value2, "usedMoney");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionIsNull() {
            addCriterion("used_commission is null");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionIsNotNull() {
            addCriterion("used_commission is not null");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionEqualTo(Float value) {
            addCriterion("used_commission =", value, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionNotEqualTo(Float value) {
            addCriterion("used_commission <>", value, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionGreaterThan(Float value) {
            addCriterion("used_commission >", value, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionGreaterThanOrEqualTo(Float value) {
            addCriterion("used_commission >=", value, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionLessThan(Float value) {
            addCriterion("used_commission <", value, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionLessThanOrEqualTo(Float value) {
            addCriterion("used_commission <=", value, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionIn(List<Float> values) {
            addCriterion("used_commission in", values, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionNotIn(List<Float> values) {
            addCriterion("used_commission not in", values, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionBetween(Float value1, Float value2) {
            addCriterion("used_commission between", value1, value2, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andUsedCommissionNotBetween(Float value1, Float value2) {
            addCriterion("used_commission not between", value1, value2, "usedCommission");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourIsNull() {
            addCriterion("sms_notify_customer_before_1hour is null");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourIsNotNull() {
            addCriterion("sms_notify_customer_before_1hour is not null");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourEqualTo(Boolean value) {
            addCriterion("sms_notify_customer_before_1hour =", value, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourNotEqualTo(Boolean value) {
            addCriterion("sms_notify_customer_before_1hour <>", value, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourGreaterThan(Boolean value) {
            addCriterion("sms_notify_customer_before_1hour >", value, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sms_notify_customer_before_1hour >=", value, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourLessThan(Boolean value) {
            addCriterion("sms_notify_customer_before_1hour <", value, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourLessThanOrEqualTo(Boolean value) {
            addCriterion("sms_notify_customer_before_1hour <=", value, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourIn(List<Boolean> values) {
            addCriterion("sms_notify_customer_before_1hour in", values, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourNotIn(List<Boolean> values) {
            addCriterion("sms_notify_customer_before_1hour not in", values, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourBetween(Boolean value1, Boolean value2) {
            addCriterion("sms_notify_customer_before_1hour between", value1, value2, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyCustomerBefore1hourNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sms_notify_customer_before_1hour not between", value1, value2, "smsNotifyCustomerBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourIsNull() {
            addCriterion("sms_notify_beautyshop_before_1hour is null");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourIsNotNull() {
            addCriterion("sms_notify_beautyshop_before_1hour is not null");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourEqualTo(Boolean value) {
            addCriterion("sms_notify_beautyshop_before_1hour =", value, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourNotEqualTo(Boolean value) {
            addCriterion("sms_notify_beautyshop_before_1hour <>", value, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourGreaterThan(Boolean value) {
            addCriterion("sms_notify_beautyshop_before_1hour >", value, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sms_notify_beautyshop_before_1hour >=", value, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourLessThan(Boolean value) {
            addCriterion("sms_notify_beautyshop_before_1hour <", value, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourLessThanOrEqualTo(Boolean value) {
            addCriterion("sms_notify_beautyshop_before_1hour <=", value, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourIn(List<Boolean> values) {
            addCriterion("sms_notify_beautyshop_before_1hour in", values, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourNotIn(List<Boolean> values) {
            addCriterion("sms_notify_beautyshop_before_1hour not in", values, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourBetween(Boolean value1, Boolean value2) {
            addCriterion("sms_notify_beautyshop_before_1hour between", value1, value2, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeautyshopBefore1hourNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sms_notify_beautyshop_before_1hour not between", value1, value2, "smsNotifyBeautyshopBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourIsNull() {
            addCriterion("sms_notify_beautician_before_1hour is null");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourIsNotNull() {
            addCriterion("sms_notify_beautician_before_1hour is not null");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourEqualTo(Boolean value) {
            addCriterion("sms_notify_beautician_before_1hour =", value, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourNotEqualTo(Boolean value) {
            addCriterion("sms_notify_beautician_before_1hour <>", value, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourGreaterThan(Boolean value) {
            addCriterion("sms_notify_beautician_before_1hour >", value, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sms_notify_beautician_before_1hour >=", value, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourLessThan(Boolean value) {
            addCriterion("sms_notify_beautician_before_1hour <", value, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourLessThanOrEqualTo(Boolean value) {
            addCriterion("sms_notify_beautician_before_1hour <=", value, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourIn(List<Boolean> values) {
            addCriterion("sms_notify_beautician_before_1hour in", values, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourNotIn(List<Boolean> values) {
            addCriterion("sms_notify_beautician_before_1hour not in", values, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourBetween(Boolean value1, Boolean value2) {
            addCriterion("sms_notify_beautician_before_1hour between", value1, value2, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andSmsNotifyBeauticianBefore1hourNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sms_notify_beautician_before_1hour not between", value1, value2, "smsNotifyBeauticianBefore1hour");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanIsNull() {
            addCriterion("is_jiesuan is null");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanIsNotNull() {
            addCriterion("is_jiesuan is not null");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanEqualTo(Boolean value) {
            addCriterion("is_jiesuan =", value, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanNotEqualTo(Boolean value) {
            addCriterion("is_jiesuan <>", value, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanGreaterThan(Boolean value) {
            addCriterion("is_jiesuan >", value, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_jiesuan >=", value, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanLessThan(Boolean value) {
            addCriterion("is_jiesuan <", value, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanLessThanOrEqualTo(Boolean value) {
            addCriterion("is_jiesuan <=", value, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanIn(List<Boolean> values) {
            addCriterion("is_jiesuan in", values, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanNotIn(List<Boolean> values) {
            addCriterion("is_jiesuan not in", values, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanBetween(Boolean value1, Boolean value2) {
            addCriterion("is_jiesuan between", value1, value2, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andIsJiesuanNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_jiesuan not between", value1, value2, "isJiesuan");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeIsNull() {
            addCriterion("jiesuan_time is null");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeIsNotNull() {
            addCriterion("jiesuan_time is not null");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeEqualTo(Integer value) {
            addCriterion("jiesuan_time =", value, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeNotEqualTo(Integer value) {
            addCriterion("jiesuan_time <>", value, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeGreaterThan(Integer value) {
            addCriterion("jiesuan_time >", value, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("jiesuan_time >=", value, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeLessThan(Integer value) {
            addCriterion("jiesuan_time <", value, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeLessThanOrEqualTo(Integer value) {
            addCriterion("jiesuan_time <=", value, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeIn(List<Integer> values) {
            addCriterion("jiesuan_time in", values, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeNotIn(List<Integer> values) {
            addCriterion("jiesuan_time not in", values, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeBetween(Integer value1, Integer value2) {
            addCriterion("jiesuan_time between", value1, value2, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andJiesuanTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("jiesuan_time not between", value1, value2, "jiesuanTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIsNull() {
            addCriterion("withdraw_time is null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIsNotNull() {
            addCriterion("withdraw_time is not null");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeEqualTo(Integer value) {
            addCriterion("withdraw_time =", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotEqualTo(Integer value) {
            addCriterion("withdraw_time <>", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeGreaterThan(Integer value) {
            addCriterion("withdraw_time >", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("withdraw_time >=", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeLessThan(Integer value) {
            addCriterion("withdraw_time <", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeLessThanOrEqualTo(Integer value) {
            addCriterion("withdraw_time <=", value, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeIn(List<Integer> values) {
            addCriterion("withdraw_time in", values, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotIn(List<Integer> values) {
            addCriterion("withdraw_time not in", values, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_time between", value1, value2, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andWithdrawTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("withdraw_time not between", value1, value2, "withdrawTime");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNull() {
            addCriterion("activity_id is null");
            return (Criteria) this;
        }

        public Criteria andActivityIdIsNotNull() {
            addCriterion("activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andActivityIdEqualTo(Integer value) {
            addCriterion("activity_id =", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotEqualTo(Integer value) {
            addCriterion("activity_id <>", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThan(Integer value) {
            addCriterion("activity_id >", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("activity_id >=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThan(Integer value) {
            addCriterion("activity_id <", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("activity_id <=", value, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdIn(List<Integer> values) {
            addCriterion("activity_id in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotIn(List<Integer> values) {
            addCriterion("activity_id not in", values, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("activity_id between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("activity_id not between", value1, value2, "activityId");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagIsNull() {
            addCriterion("activity_link_tag is null");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagIsNotNull() {
            addCriterion("activity_link_tag is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagEqualTo(String value) {
            addCriterion("activity_link_tag =", value, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagNotEqualTo(String value) {
            addCriterion("activity_link_tag <>", value, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagGreaterThan(String value) {
            addCriterion("activity_link_tag >", value, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagGreaterThanOrEqualTo(String value) {
            addCriterion("activity_link_tag >=", value, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagLessThan(String value) {
            addCriterion("activity_link_tag <", value, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagLessThanOrEqualTo(String value) {
            addCriterion("activity_link_tag <=", value, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagLike(String value) {
            addCriterion("activity_link_tag like", value, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagNotLike(String value) {
            addCriterion("activity_link_tag not like", value, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagIn(List<String> values) {
            addCriterion("activity_link_tag in", values, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagNotIn(List<String> values) {
            addCriterion("activity_link_tag not in", values, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagBetween(String value1, String value2) {
            addCriterion("activity_link_tag between", value1, value2, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkTagNotBetween(String value1, String value2) {
            addCriterion("activity_link_tag not between", value1, value2, "activityLinkTag");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlIsNull() {
            addCriterion("activity_link_url is null");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlIsNotNull() {
            addCriterion("activity_link_url is not null");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlEqualTo(String value) {
            addCriterion("activity_link_url =", value, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlNotEqualTo(String value) {
            addCriterion("activity_link_url <>", value, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlGreaterThan(String value) {
            addCriterion("activity_link_url >", value, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlGreaterThanOrEqualTo(String value) {
            addCriterion("activity_link_url >=", value, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlLessThan(String value) {
            addCriterion("activity_link_url <", value, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlLessThanOrEqualTo(String value) {
            addCriterion("activity_link_url <=", value, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlLike(String value) {
            addCriterion("activity_link_url like", value, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlNotLike(String value) {
            addCriterion("activity_link_url not like", value, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlIn(List<String> values) {
            addCriterion("activity_link_url in", values, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlNotIn(List<String> values) {
            addCriterion("activity_link_url not in", values, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlBetween(String value1, String value2) {
            addCriterion("activity_link_url between", value1, value2, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityLinkUrlNotBetween(String value1, String value2) {
            addCriterion("activity_link_url not between", value1, value2, "activityLinkUrl");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagIsNull() {
            addCriterion("activity_divisive_tag is null");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagIsNotNull() {
            addCriterion("activity_divisive_tag is not null");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagEqualTo(String value) {
            addCriterion("activity_divisive_tag =", value, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagNotEqualTo(String value) {
            addCriterion("activity_divisive_tag <>", value, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagGreaterThan(String value) {
            addCriterion("activity_divisive_tag >", value, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagGreaterThanOrEqualTo(String value) {
            addCriterion("activity_divisive_tag >=", value, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagLessThan(String value) {
            addCriterion("activity_divisive_tag <", value, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagLessThanOrEqualTo(String value) {
            addCriterion("activity_divisive_tag <=", value, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagLike(String value) {
            addCriterion("activity_divisive_tag like", value, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagNotLike(String value) {
            addCriterion("activity_divisive_tag not like", value, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagIn(List<String> values) {
            addCriterion("activity_divisive_tag in", values, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagNotIn(List<String> values) {
            addCriterion("activity_divisive_tag not in", values, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagBetween(String value1, String value2) {
            addCriterion("activity_divisive_tag between", value1, value2, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andActivityDivisiveTagNotBetween(String value1, String value2) {
            addCriterion("activity_divisive_tag not between", value1, value2, "activityDivisiveTag");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsIsNull() {
            addCriterion("orderback_send_sms is null");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsIsNotNull() {
            addCriterion("orderback_send_sms is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsEqualTo(Boolean value) {
            addCriterion("orderback_send_sms =", value, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsNotEqualTo(Boolean value) {
            addCriterion("orderback_send_sms <>", value, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsGreaterThan(Boolean value) {
            addCriterion("orderback_send_sms >", value, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsGreaterThanOrEqualTo(Boolean value) {
            addCriterion("orderback_send_sms >=", value, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsLessThan(Boolean value) {
            addCriterion("orderback_send_sms <", value, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsLessThanOrEqualTo(Boolean value) {
            addCriterion("orderback_send_sms <=", value, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsIn(List<Boolean> values) {
            addCriterion("orderback_send_sms in", values, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsNotIn(List<Boolean> values) {
            addCriterion("orderback_send_sms not in", values, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsBetween(Boolean value1, Boolean value2) {
            addCriterion("orderback_send_sms between", value1, value2, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsNotBetween(Boolean value1, Boolean value2) {
            addCriterion("orderback_send_sms not between", value1, value2, "orderbackSendSms");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopIsNull() {
            addCriterion("orderback_send_sms_shop is null");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopIsNotNull() {
            addCriterion("orderback_send_sms_shop is not null");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopEqualTo(Byte value) {
            addCriterion("orderback_send_sms_shop =", value, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopNotEqualTo(Byte value) {
            addCriterion("orderback_send_sms_shop <>", value, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopGreaterThan(Byte value) {
            addCriterion("orderback_send_sms_shop >", value, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopGreaterThanOrEqualTo(Byte value) {
            addCriterion("orderback_send_sms_shop >=", value, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopLessThan(Byte value) {
            addCriterion("orderback_send_sms_shop <", value, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopLessThanOrEqualTo(Byte value) {
            addCriterion("orderback_send_sms_shop <=", value, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopIn(List<Byte> values) {
            addCriterion("orderback_send_sms_shop in", values, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopNotIn(List<Byte> values) {
            addCriterion("orderback_send_sms_shop not in", values, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopBetween(Byte value1, Byte value2) {
            addCriterion("orderback_send_sms_shop between", value1, value2, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andOrderbackSendSmsShopNotBetween(Byte value1, Byte value2) {
            addCriterion("orderback_send_sms_shop not between", value1, value2, "orderbackSendSmsShop");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIsNull() {
            addCriterion("groups_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIsNotNull() {
            addCriterion("groups_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsIdEqualTo(Integer value) {
            addCriterion("groups_id =", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotEqualTo(Integer value) {
            addCriterion("groups_id <>", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdGreaterThan(Integer value) {
            addCriterion("groups_id >", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("groups_id >=", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdLessThan(Integer value) {
            addCriterion("groups_id <", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdLessThanOrEqualTo(Integer value) {
            addCriterion("groups_id <=", value, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdIn(List<Integer> values) {
            addCriterion("groups_id in", values, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotIn(List<Integer> values) {
            addCriterion("groups_id not in", values, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdBetween(Integer value1, Integer value2) {
            addCriterion("groups_id between", value1, value2, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("groups_id not between", value1, value2, "groupsId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdIsNull() {
            addCriterion("groups_member_id is null");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdIsNotNull() {
            addCriterion("groups_member_id is not null");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdEqualTo(Integer value) {
            addCriterion("groups_member_id =", value, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdNotEqualTo(Integer value) {
            addCriterion("groups_member_id <>", value, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdGreaterThan(Integer value) {
            addCriterion("groups_member_id >", value, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("groups_member_id >=", value, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdLessThan(Integer value) {
            addCriterion("groups_member_id <", value, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("groups_member_id <=", value, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdIn(List<Integer> values) {
            addCriterion("groups_member_id in", values, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdNotIn(List<Integer> values) {
            addCriterion("groups_member_id not in", values, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("groups_member_id between", value1, value2, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andGroupsMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("groups_member_id not between", value1, value2, "groupsMemberId");
            return (Criteria) this;
        }

        public Criteria andFollowIsNull() {
            addCriterion("follow is null");
            return (Criteria) this;
        }

        public Criteria andFollowIsNotNull() {
            addCriterion("follow is not null");
            return (Criteria) this;
        }

        public Criteria andFollowEqualTo(String value) {
            addCriterion("follow =", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotEqualTo(String value) {
            addCriterion("follow <>", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowGreaterThan(String value) {
            addCriterion("follow >", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowGreaterThanOrEqualTo(String value) {
            addCriterion("follow >=", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowLessThan(String value) {
            addCriterion("follow <", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowLessThanOrEqualTo(String value) {
            addCriterion("follow <=", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowLike(String value) {
            addCriterion("follow like", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotLike(String value) {
            addCriterion("follow not like", value, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowIn(List<String> values) {
            addCriterion("follow in", values, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotIn(List<String> values) {
            addCriterion("follow not in", values, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowBetween(String value1, String value2) {
            addCriterion("follow between", value1, value2, "follow");
            return (Criteria) this;
        }

        public Criteria andFollowNotBetween(String value1, String value2) {
            addCriterion("follow not between", value1, value2, "follow");
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