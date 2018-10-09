package top.lucius.model;

import java.io.Serializable;

public class ImOrder implements Serializable {
    private Integer id;

    private String orderSn;

    private Integer memberId;

    private Integer beauticianId;

    private Integer shopId;

    private Integer cashCouponId;

    private String name;

    private String mobile;

    private String mealName;

    private Integer mealId;

    private Float totalPrice;

    private Float discountPrice;

    private String couponSn;

    private Integer province;

    private Integer city;

    private Integer district;

    private String address;

    private String roomNumber;

    private String fullAddress;

    private String serviceTime;

    private Integer editServiceTime;

    private Integer status;

    private String tradeNo;

    private Integer addTime;

    private String ip;

    private Integer confirmTime;

    private Integer cancelTime;

    private Boolean notified;

    private String payMethod;

    private Float payPrice;

    private Integer paidTime;

    private Integer startTimeDeleted;

    private Integer endTime;

    private Integer beginTime;

    private Float beginLongitude;

    private Float beginLatitude;

    private Float endLongitude;

    private Float endLatitude;

    private String serviceEndTime;

    private String projectIds;

    private Float cashCouponMoney;

    private Integer memberCashCouponId;

    private String memo;

    private Integer isConfirm;

    private Float usedMoney;

    private Float usedCommission;

    private Boolean smsNotifyCustomerBefore1hour;

    private Boolean smsNotifyBeautyshopBefore1hour;

    private Boolean smsNotifyBeauticianBefore1hour;

    private Boolean isJiesuan;

    private Integer jiesuanTime;

    private Integer withdrawTime;

    private Integer activityId;

    private String activityLinkTag;

    private String activityLinkUrl;

    private String activityDivisiveTag;

    private Boolean orderbackSendSms;

    private Byte orderbackSendSmsShop;

    private Integer groupsId;

    private Integer groupsMemberId;

    private String follow;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getMemberId() {
        return memberId;
    }

    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    public Integer getBeauticianId() {
        return beauticianId;
    }

    public void setBeauticianId(Integer beauticianId) {
        this.beauticianId = beauticianId;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getCashCouponId() {
        return cashCouponId;
    }

    public void setCashCouponId(Integer cashCouponId) {
        this.cashCouponId = cashCouponId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getMealName() {
        return mealName;
    }

    public void setMealName(String mealName) {
        this.mealName = mealName == null ? null : mealName.trim();
    }

    public Integer getMealId() {
        return mealId;
    }

    public void setMealId(Integer mealId) {
        this.mealId = mealId;
    }

    public Float getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Float totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Float getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(Float discountPrice) {
        this.discountPrice = discountPrice;
    }

    public String getCouponSn() {
        return couponSn;
    }

    public void setCouponSn(String couponSn) {
        this.couponSn = couponSn == null ? null : couponSn.trim();
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getDistrict() {
        return district;
    }

    public void setDistrict(Integer district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber == null ? null : roomNumber.trim();
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress == null ? null : fullAddress.trim();
    }

    public String getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(String serviceTime) {
        this.serviceTime = serviceTime == null ? null : serviceTime.trim();
    }

    public Integer getEditServiceTime() {
        return editServiceTime;
    }

    public void setEditServiceTime(Integer editServiceTime) {
        this.editServiceTime = editServiceTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo == null ? null : tradeNo.trim();
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public Integer getConfirmTime() {
        return confirmTime;
    }

    public void setConfirmTime(Integer confirmTime) {
        this.confirmTime = confirmTime;
    }

    public Integer getCancelTime() {
        return cancelTime;
    }

    public void setCancelTime(Integer cancelTime) {
        this.cancelTime = cancelTime;
    }

    public Boolean getNotified() {
        return notified;
    }

    public void setNotified(Boolean notified) {
        this.notified = notified;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod == null ? null : payMethod.trim();
    }

    public Float getPayPrice() {
        return payPrice;
    }

    public void setPayPrice(Float payPrice) {
        this.payPrice = payPrice;
    }

    public Integer getPaidTime() {
        return paidTime;
    }

    public void setPaidTime(Integer paidTime) {
        this.paidTime = paidTime;
    }

    public Integer getStartTimeDeleted() {
        return startTimeDeleted;
    }

    public void setStartTimeDeleted(Integer startTimeDeleted) {
        this.startTimeDeleted = startTimeDeleted;
    }

    public Integer getEndTime() {
        return endTime;
    }

    public void setEndTime(Integer endTime) {
        this.endTime = endTime;
    }

    public Integer getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
    }

    public Float getBeginLongitude() {
        return beginLongitude;
    }

    public void setBeginLongitude(Float beginLongitude) {
        this.beginLongitude = beginLongitude;
    }

    public Float getBeginLatitude() {
        return beginLatitude;
    }

    public void setBeginLatitude(Float beginLatitude) {
        this.beginLatitude = beginLatitude;
    }

    public Float getEndLongitude() {
        return endLongitude;
    }

    public void setEndLongitude(Float endLongitude) {
        this.endLongitude = endLongitude;
    }

    public Float getEndLatitude() {
        return endLatitude;
    }

    public void setEndLatitude(Float endLatitude) {
        this.endLatitude = endLatitude;
    }

    public String getServiceEndTime() {
        return serviceEndTime;
    }

    public void setServiceEndTime(String serviceEndTime) {
        this.serviceEndTime = serviceEndTime == null ? null : serviceEndTime.trim();
    }

    public String getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(String projectIds) {
        this.projectIds = projectIds == null ? null : projectIds.trim();
    }

    public Float getCashCouponMoney() {
        return cashCouponMoney;
    }

    public void setCashCouponMoney(Float cashCouponMoney) {
        this.cashCouponMoney = cashCouponMoney;
    }

    public Integer getMemberCashCouponId() {
        return memberCashCouponId;
    }

    public void setMemberCashCouponId(Integer memberCashCouponId) {
        this.memberCashCouponId = memberCashCouponId;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo == null ? null : memo.trim();
    }

    public Integer getIsConfirm() {
        return isConfirm;
    }

    public void setIsConfirm(Integer isConfirm) {
        this.isConfirm = isConfirm;
    }

    public Float getUsedMoney() {
        return usedMoney;
    }

    public void setUsedMoney(Float usedMoney) {
        this.usedMoney = usedMoney;
    }

    public Float getUsedCommission() {
        return usedCommission;
    }

    public void setUsedCommission(Float usedCommission) {
        this.usedCommission = usedCommission;
    }

    public Boolean getSmsNotifyCustomerBefore1hour() {
        return smsNotifyCustomerBefore1hour;
    }

    public void setSmsNotifyCustomerBefore1hour(Boolean smsNotifyCustomerBefore1hour) {
        this.smsNotifyCustomerBefore1hour = smsNotifyCustomerBefore1hour;
    }

    public Boolean getSmsNotifyBeautyshopBefore1hour() {
        return smsNotifyBeautyshopBefore1hour;
    }

    public void setSmsNotifyBeautyshopBefore1hour(Boolean smsNotifyBeautyshopBefore1hour) {
        this.smsNotifyBeautyshopBefore1hour = smsNotifyBeautyshopBefore1hour;
    }

    public Boolean getSmsNotifyBeauticianBefore1hour() {
        return smsNotifyBeauticianBefore1hour;
    }

    public void setSmsNotifyBeauticianBefore1hour(Boolean smsNotifyBeauticianBefore1hour) {
        this.smsNotifyBeauticianBefore1hour = smsNotifyBeauticianBefore1hour;
    }

    public Boolean getIsJiesuan() {
        return isJiesuan;
    }

    public void setIsJiesuan(Boolean isJiesuan) {
        this.isJiesuan = isJiesuan;
    }

    public Integer getJiesuanTime() {
        return jiesuanTime;
    }

    public void setJiesuanTime(Integer jiesuanTime) {
        this.jiesuanTime = jiesuanTime;
    }

    public Integer getWithdrawTime() {
        return withdrawTime;
    }

    public void setWithdrawTime(Integer withdrawTime) {
        this.withdrawTime = withdrawTime;
    }

    public Integer getActivityId() {
        return activityId;
    }

    public void setActivityId(Integer activityId) {
        this.activityId = activityId;
    }

    public String getActivityLinkTag() {
        return activityLinkTag;
    }

    public void setActivityLinkTag(String activityLinkTag) {
        this.activityLinkTag = activityLinkTag == null ? null : activityLinkTag.trim();
    }

    public String getActivityLinkUrl() {
        return activityLinkUrl;
    }

    public void setActivityLinkUrl(String activityLinkUrl) {
        this.activityLinkUrl = activityLinkUrl == null ? null : activityLinkUrl.trim();
    }

    public String getActivityDivisiveTag() {
        return activityDivisiveTag;
    }

    public void setActivityDivisiveTag(String activityDivisiveTag) {
        this.activityDivisiveTag = activityDivisiveTag == null ? null : activityDivisiveTag.trim();
    }

    public Boolean getOrderbackSendSms() {
        return orderbackSendSms;
    }

    public void setOrderbackSendSms(Boolean orderbackSendSms) {
        this.orderbackSendSms = orderbackSendSms;
    }

    public Byte getOrderbackSendSmsShop() {
        return orderbackSendSmsShop;
    }

    public void setOrderbackSendSmsShop(Byte orderbackSendSmsShop) {
        this.orderbackSendSmsShop = orderbackSendSmsShop;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", memberId=").append(memberId);
        sb.append(", beauticianId=").append(beauticianId);
        sb.append(", shopId=").append(shopId);
        sb.append(", cashCouponId=").append(cashCouponId);
        sb.append(", name=").append(name);
        sb.append(", mobile=").append(mobile);
        sb.append(", mealName=").append(mealName);
        sb.append(", mealId=").append(mealId);
        sb.append(", totalPrice=").append(totalPrice);
        sb.append(", discountPrice=").append(discountPrice);
        sb.append(", couponSn=").append(couponSn);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", roomNumber=").append(roomNumber);
        sb.append(", fullAddress=").append(fullAddress);
        sb.append(", serviceTime=").append(serviceTime);
        sb.append(", editServiceTime=").append(editServiceTime);
        sb.append(", status=").append(status);
        sb.append(", tradeNo=").append(tradeNo);
        sb.append(", addTime=").append(addTime);
        sb.append(", ip=").append(ip);
        sb.append(", confirmTime=").append(confirmTime);
        sb.append(", cancelTime=").append(cancelTime);
        sb.append(", notified=").append(notified);
        sb.append(", payMethod=").append(payMethod);
        sb.append(", payPrice=").append(payPrice);
        sb.append(", paidTime=").append(paidTime);
        sb.append(", startTimeDeleted=").append(startTimeDeleted);
        sb.append(", endTime=").append(endTime);
        sb.append(", beginTime=").append(beginTime);
        sb.append(", beginLongitude=").append(beginLongitude);
        sb.append(", beginLatitude=").append(beginLatitude);
        sb.append(", endLongitude=").append(endLongitude);
        sb.append(", endLatitude=").append(endLatitude);
        sb.append(", serviceEndTime=").append(serviceEndTime);
        sb.append(", projectIds=").append(projectIds);
        sb.append(", cashCouponMoney=").append(cashCouponMoney);
        sb.append(", memberCashCouponId=").append(memberCashCouponId);
        sb.append(", memo=").append(memo);
        sb.append(", isConfirm=").append(isConfirm);
        sb.append(", usedMoney=").append(usedMoney);
        sb.append(", usedCommission=").append(usedCommission);
        sb.append(", smsNotifyCustomerBefore1hour=").append(smsNotifyCustomerBefore1hour);
        sb.append(", smsNotifyBeautyshopBefore1hour=").append(smsNotifyBeautyshopBefore1hour);
        sb.append(", smsNotifyBeauticianBefore1hour=").append(smsNotifyBeauticianBefore1hour);
        sb.append(", isJiesuan=").append(isJiesuan);
        sb.append(", jiesuanTime=").append(jiesuanTime);
        sb.append(", withdrawTime=").append(withdrawTime);
        sb.append(", activityId=").append(activityId);
        sb.append(", activityLinkTag=").append(activityLinkTag);
        sb.append(", activityLinkUrl=").append(activityLinkUrl);
        sb.append(", activityDivisiveTag=").append(activityDivisiveTag);
        sb.append(", orderbackSendSms=").append(orderbackSendSms);
        sb.append(", orderbackSendSmsShop=").append(orderbackSendSmsShop);
        sb.append(", groupsId=").append(groupsId);
        sb.append(", groupsMemberId=").append(groupsMemberId);
        sb.append(", follow=").append(follow);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}