package top.lucius.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ImProject implements Serializable {
    private Integer id;

    private String name;

    private Boolean bookingMethod;

    private Integer beauticianId;

    private Integer serviceTime;

    private String keyFunction;

    private String description;

    private BigDecimal price;

    private BigDecimal marketPrice;

    private Integer clicks;

    private Integer orders;

    private Integer typeId;

    private Integer status;

    private Integer sort;

    private Integer addTime;

    private String defaultPic;

    private Integer shopId;

    private Byte isIvyspa;

    private Boolean isDelete;

    private Boolean property;

    private Boolean isHot;

    private String sourcePic;

    private String listPic;

    private String detailsPic;

    private String hotPic;

    private Boolean activePriceStatus;

    private Boolean activeBuyStatus;

    private Integer activeStartAt;

    private Integer activeEndIn;

    private Float activePrice;

    private Boolean activeBuyNum;

    private Integer projectType;

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

    public Boolean getBookingMethod() {
        return bookingMethod;
    }

    public void setBookingMethod(Boolean bookingMethod) {
        this.bookingMethod = bookingMethod;
    }

    public Integer getBeauticianId() {
        return beauticianId;
    }

    public void setBeauticianId(Integer beauticianId) {
        this.beauticianId = beauticianId;
    }

    public Integer getServiceTime() {
        return serviceTime;
    }

    public void setServiceTime(Integer serviceTime) {
        this.serviceTime = serviceTime;
    }

    public String getKeyFunction() {
        return keyFunction;
    }

    public void setKeyFunction(String keyFunction) {
        this.keyFunction = keyFunction == null ? null : keyFunction.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getClicks() {
        return clicks;
    }

    public void setClicks(Integer clicks) {
        this.clicks = clicks;
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getAddTime() {
        return addTime;
    }

    public void setAddTime(Integer addTime) {
        this.addTime = addTime;
    }

    public String getDefaultPic() {
        return defaultPic;
    }

    public void setDefaultPic(String defaultPic) {
        this.defaultPic = defaultPic == null ? null : defaultPic.trim();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public Byte getIsIvyspa() {
        return isIvyspa;
    }

    public void setIsIvyspa(Byte isIvyspa) {
        this.isIvyspa = isIvyspa;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Boolean getProperty() {
        return property;
    }

    public void setProperty(Boolean property) {
        this.property = property;
    }

    public Boolean getIsHot() {
        return isHot;
    }

    public void setIsHot(Boolean isHot) {
        this.isHot = isHot;
    }

    public String getSourcePic() {
        return sourcePic;
    }

    public void setSourcePic(String sourcePic) {
        this.sourcePic = sourcePic == null ? null : sourcePic.trim();
    }

    public String getListPic() {
        return listPic;
    }

    public void setListPic(String listPic) {
        this.listPic = listPic == null ? null : listPic.trim();
    }

    public String getDetailsPic() {
        return detailsPic;
    }

    public void setDetailsPic(String detailsPic) {
        this.detailsPic = detailsPic == null ? null : detailsPic.trim();
    }

    public String getHotPic() {
        return hotPic;
    }

    public void setHotPic(String hotPic) {
        this.hotPic = hotPic == null ? null : hotPic.trim();
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

    public Boolean getActiveBuyNum() {
        return activeBuyNum;
    }

    public void setActiveBuyNum(Boolean activeBuyNum) {
        this.activeBuyNum = activeBuyNum;
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", bookingMethod=").append(bookingMethod);
        sb.append(", beauticianId=").append(beauticianId);
        sb.append(", serviceTime=").append(serviceTime);
        sb.append(", keyFunction=").append(keyFunction);
        sb.append(", description=").append(description);
        sb.append(", price=").append(price);
        sb.append(", marketPrice=").append(marketPrice);
        sb.append(", clicks=").append(clicks);
        sb.append(", orders=").append(orders);
        sb.append(", typeId=").append(typeId);
        sb.append(", status=").append(status);
        sb.append(", sort=").append(sort);
        sb.append(", addTime=").append(addTime);
        sb.append(", defaultPic=").append(defaultPic);
        sb.append(", shopId=").append(shopId);
        sb.append(", isIvyspa=").append(isIvyspa);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", property=").append(property);
        sb.append(", isHot=").append(isHot);
        sb.append(", sourcePic=").append(sourcePic);
        sb.append(", listPic=").append(listPic);
        sb.append(", detailsPic=").append(detailsPic);
        sb.append(", hotPic=").append(hotPic);
        sb.append(", activePriceStatus=").append(activePriceStatus);
        sb.append(", activeBuyStatus=").append(activeBuyStatus);
        sb.append(", activeStartAt=").append(activeStartAt);
        sb.append(", activeEndIn=").append(activeEndIn);
        sb.append(", activePrice=").append(activePrice);
        sb.append(", activeBuyNum=").append(activeBuyNum);
        sb.append(", projectType=").append(projectType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}