package top.lucius.model;

import java.io.Serializable;

public class ImMemberMeal implements Serializable {
    private Integer id;

    private Integer mealId;

    private Integer memberId;

    private Integer addTime;

    private Integer status;

    private Float price;

    private Float totalPrice;

    private Float payPrice;

    private Integer num;

    private Integer useNum;

    private String orderSn;

    private String tradeNo;

    private String payMethod;

    private Integer paidTime;

    private Integer endTime;

    private String explain;

    private String source;

    private Integer groupsId;

    private Integer groupsMemberId;

    private String follow;

    private Integer activityId;

    private Integer mealType;

    private Integer shippingType;

    private String shippingAddress;

    private Integer shippingShopId;

    private String refundReason;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getMealId() {
        return mealId;
    }

    public void setMealId(Integer mealId) {
        this.mealId = mealId;
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Float payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public Integer getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Integer paidTime) {
        this.paidTime = paidTime;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public Integer getGroupsId() {
        return groupsId;
    }

    public void setGroupsId(Integer groupsId) {
        this.groupsId = groupsId;
    }

    public Integer getGroupsMemberId() {
        return groupsMemberId;
    }

    public void setGroupsMemberId(Integer groupsMemberId) {
        this.groupsMemberId = groupsMemberId;
    }

    public String getFollow() {
        return follow;
    }

    public void setFollow(String follow) {
        this.follow = follow == null ? null : follow.trim();
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public Integer getMealType() {
        return mealType;
    }

    public void setMealType(Integer mealType) {
        this.mealType = mealType;
    }

    public Integer getShippingType() {
        return shippingType;
    }

    public void setShippingType(Integer shippingType) {
        this.shippingType = shippingType;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {
        this.shippingAddress = shippingAddress == null ? null : shippingAddress.trim();
    }

    public Integer getShippingShopId() {
        return shippingShopId;
    }

    public void setShippingShopId(Integer shippingShopId) {
        this.shippingShopId = shippingShopId;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason == null ? null : refundReason.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mealId=").append(mealId);
        sb.append(", memberId=").append(memberId);
        sb.append(", addTime=").append(addTime);
        sb.append(", status=").append(status);
        sb.append(", price=").append(price);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", payPrice=").append(payPrice);
        sb.append(", num=").append(num);
        sb.append(", useNum=").append(useNum);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", endTime=").append(endTime);
        sb.append(", explain=").append(explain);
        sb.append(", source=").append(source);
        sb.append(", groupsId=").append(groupsId);
        sb.append(", groupsMemberId=").append(groupsMemberId);
        sb.append(", follow=").append(follow);
        sb.append(", activityId=").append(activityId);
        sb.append(", mealType=").append(mealType);
        sb.append(", shippingType=").append(shippingType);
        sb.append(", shippingAddress=").append(shippingAddress);
        sb.append(", shippingShopId=").append(shippingShopId);
        sb.append(", refundReason=").append(refundReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}