package top.lucius.model;

import java.io.Serializable;

public class ImMemberMealProject implements Serializable {
    private Integer id;

    private Integer mealId;

    private Integer projectId;

    private Integer projectNum;

    private Integer useNum;

    private Float projectPrice;

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

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getProjectNum() {
        return projectNum;
    }

    public void setProjectNum(Integer projectNum) {
        this.projectNum = projectNum;
    }

    public Integer getUseNum() {
        return useNum;
    }

    public void setUseNum(Integer useNum) {
        this.useNum = useNum;
    }

    public Float getProjectPrice() {
        return projectPrice;
    }

    public void setProjectPrice(Float projectPrice) {
        this.projectPrice = projectPrice;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", mealId=").append(mealId);
        sb.append(", projectId=").append(projectId);
        sb.append(", projectNum=").append(projectNum);
        sb.append(", useNum=").append(useNum);
        sb.append(", projectPrice=").append(projectPrice);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}