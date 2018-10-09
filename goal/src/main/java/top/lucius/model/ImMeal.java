package top.lucius.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ImMeal implements Serializable {
    private Integer id;

    private String name;

    private Integer typeId;

    private Boolean bookingMethod;

    private String listPic;

    private String detailPic;

    private String description;

    private String keyFunction;

    private BigDecimal price;

    private Integer num;

    private BigDecimal marketPrice;

    private Integer sort;

    private Integer status;

    private Integer timeDay;

    private Integer shopId;

    private Integer addTime;

    private Integer orders;

    private String orderSn;

    private Integer projectId;

    private Boolean isCheck;

    private Integer checkTime;

    private Boolean isDelete;

    private Short serviceTime;

    private Byte property;

    private Integer clicks;

    private Byte isHot;

    private Boolean activePriceStatus;

    private Boolean activeBuyStatus;

    private Integer activeStartAt;

    private Integer activeEndIn;

    private Float activePrice;

    private Integer activeBuyNum;

    private Integer mealType;

    private String specNum;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Boolean getBookingMethod() {
        return bookingMethod;
    }

    public void setBookingMethod(Boolean bookingMethod) {
        this.bookingMethod = bookingMethod;
    }

    public String getListPic() {
        return listPic;
    }

    public void setListPic(String listPic) {
        this.listPic = listPic == null ? null : listPic.trim();
    }

    public String getDetailPic() {
        return detailPic;
    }

    public void setDetailPic(String detailPic) {
        this.detailPic = detailPic == null ? null : detailPic.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getKeyFunction() {
        return keyFunction;
    }

    public void setKeyFunction(String keyFunction) {
        this.keyFunction = keyFunction == null ? null : keyFunction.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getTimeDay() {
        return timeDay;
    }

    public void setTimeDay(Integer timeDay) {
        this.timeDay = timeDay;
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getOrderSn() {
        return orderSn;
    }

    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Boolean getIsCheck() {
        return isCheck;
    }

    public void setIsCheck(Boolean isCheck) {
        this.isCheck = isCheck;
    }

    public Integer getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Integer checkTime) {
        this.checkTime = checkTime;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Short getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Short serviceTime) {
        this.serviceTime = serviceTime;
    }

    public Byte getProperty() {
        return property;
    }

    public void setProperty(Byte property) {
        this.property = property;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Byte getIsHot() {
        return isHot;
    }

    public void setIsHot(Byte isHot) {
        this.isHot = isHot;
    }

    public Boolean getActivePriceStatus() {
        return activePriceStatus;
    }

    public void setActivePriceStatus(Boolean activePriceStatus) {
        this.activePriceStatus = activePriceStatus;
    }

    public Boolean getActiveBuyStatus() {
        return activeBuyStatus;
    }

    public void setActiveBuyStatus(Boolean activeBuyStatus) {
        this.activeBuyStatus = activeBuyStatus;
    }

    public Integer getActiveStartAt() {
        return activeStartAt;
    }

    public void setActiveStartAt(Integer activeStartAt) {
        this.activeStartAt = activeStartAt;
    }

    public Integer getActiveEndIn() {
        return activeEndIn;
    }

    public void setActiveEndIn(Integer activeEndIn) {
        this.activeEndIn = activeEndIn;
    }

    public Float getActivePrice() {
        return activePrice;
    }

    public void setActivePrice(Float activePrice) {
        this.activePrice = activePrice;
    }

    public Integer getActiveBuyNum() {
        return activeBuyNum;
    }

    public void setActiveBuyNum(Integer activeBuyNum) {
        this.activeBuyNum = activeBuyNum;
    }

    public Integer getMealType() {
        return mealType;
    }

    public void setMealType(Integer mealType) {
        this.mealType = mealType;
    }

    public String getSpecNum() {
        return specNum;
    }

    public void setSpecNum(String specNum) {
        this.specNum = specNum == null ? null : specNum.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", typeId=").append(typeId);
        sb.append(", bookingMethod=").append(bookingMethod);
        sb.append(", listPic=").append(listPic);
        sb.append(", detailPic=").append(detailPic);
        sb.append(", description=").append(description);
        sb.append(", keyFunction=").append(keyFunction);
        sb.append(", price=").append(price);
        sb.append(", num=").append(num);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", sort=").append(sort);
        sb.append(", status=").append(status);
        sb.append(", timeDay=").append(timeDay);
        sb.append(", shopId=").append(shopId);
        sb.append(", addTime=").append(addTime);
        sb.append(", orders=").append(orders);
        sb.append(", orderSn=").append(orderSn);
        sb.append(", projectId=").append(projectId);
        sb.append(", isCheck=").append(isCheck);
        sb.append(", checkTime=").append(checkTime);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", serviceTime=").append(serviceTime);
        sb.append(", property=").append(property);
        sb.append(", clicks=").append(clicks);
        sb.append(", isHot=").append(isHot);
        sb.append(", activePriceStatus=").append(activePriceStatus);
        sb.append(", activeBuyStatus=").append(activeBuyStatus);
        sb.append(", activeStartAt=").append(activeStartAt);
        sb.append(", activeEndIn=").append(activeEndIn);
        sb.append(", activePrice=").append(activePrice);
        sb.append(", activeBuyNum=").append(activeBuyNum);
        sb.append(", mealType=").append(mealType);
        sb.append(", specNum=").append(specNum);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}