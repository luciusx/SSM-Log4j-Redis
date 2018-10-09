package top.lucius.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class ImMember implements Serializable {
    private Integer id;

    private String name;

    private String password;

    private String salt;

    private String mobile;

    private Integer regTime;

    private String regIp;

    private Integer lastTime;

    private String lastIp;

    private Integer logins;

    private Boolean memberType;

    private Integer rankId;

    private String avatar;

    private String birthday;

    private String udid;

    private String sign;

    private Boolean status;

    private String nickName;

    private String openid;

    private String sex;

    private Integer orders;

    private String originPoassword;

    private String inviteCode;

    private String originPassword;

    private String qq;

    private Integer integral;

    private BigDecimal money;

    private BigDecimal commission;

    private String fenyuan;

    private String kahao;

    private String province;

    private String city;

    private String district;

    private Integer defShopId;

    private String source;

    private String follow;

    private Byte grade;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt == null ? null : salt.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public Integer getRegTime() {
        return regTime;
    }

    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    public String getRegIp() {
        return regIp;
    }

    public void setRegIp(String regIp) {
        this.regIp = regIp == null ? null : regIp.trim();
    }

    public Integer getLastTime() {
        return lastTime;
    }

    public void setLastTime(Integer lastTime) {
        this.lastTime = lastTime;
    }

    public String getLastIp() {
        return lastIp;
    }

    public void setLastIp(String lastIp) {
        this.lastIp = lastIp == null ? null : lastIp.trim();
    }

    public Integer getLogins() {
        return logins;
    }

    public void setLogins(Integer logins) {
        this.logins = logins;
    }

    public Boolean getMemberType() {
        return memberType;
    }

    public void setMemberType(Boolean memberType) {
        this.memberType = memberType;
    }

    public Integer getRankId() {
        return rankId;
    }

    public void setRankId(Integer rankId) {
        this.rankId = rankId;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getUdid() {
        return udid;
    }

    public void setUdid(String udid) {
        this.udid = udid == null ? null : udid.trim();
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign == null ? null : sign.trim();
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid == null ? null : openid.trim();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    public Integer getOrders() {
        return orders;
    }

    public void setOrders(Integer orders) {
        this.orders = orders;
    }

    public String getOriginPoassword() {
        return originPoassword;
    }

    public void setOriginPoassword(String originPoassword) {
        this.originPoassword = originPoassword == null ? null : originPoassword.trim();
    }

    public String getInviteCode() {
        return inviteCode;
    }

    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode == null ? null : inviteCode.trim();
    }

    public String getOriginPassword() {
        return originPassword;
    }

    public void setOriginPassword(String originPassword) {
        this.originPassword = originPassword == null ? null : originPassword.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public BigDecimal getCommission() {
        return commission;
    }

    public void setCommission(BigDecimal commission) {
        this.commission = commission;
    }

    public String getFenyuan() {
        return fenyuan;
    }

    public void setFenyuan(String fenyuan) {
        this.fenyuan = fenyuan == null ? null : fenyuan.trim();
    }

    public String getKahao() {
        return kahao;
    }

    public void setKahao(String kahao) {
        this.kahao = kahao == null ? null : kahao.trim();
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province == null ? null : province.trim();
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }

    public Integer getDefShopId() {
        return defShopId;
    }

    public void setDefShopId(Integer defShopId) {
        this.defShopId = defShopId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getFollow() {
        return follow;
    }

    public void setFollow(String follow) {
        this.follow = follow == null ? null : follow.trim();
    }

    public Byte getGrade() {
        return grade;
    }

    public void setGrade(Byte grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", salt=").append(salt);
        sb.append(", mobile=").append(mobile);
        sb.append(", regTime=").append(regTime);
        sb.append(", regIp=").append(regIp);
        sb.append(", lastTime=").append(lastTime);
        sb.append(", lastIp=").append(lastIp);
        sb.append(", logins=").append(logins);
        sb.append(", memberType=").append(memberType);
        sb.append(", rankId=").append(rankId);
        sb.append(", avatar=").append(avatar);
        sb.append(", birthday=").append(birthday);
        sb.append(", udid=").append(udid);
        sb.append(", sign=").append(sign);
        sb.append(", status=").append(status);
        sb.append(", nickName=").append(nickName);
        sb.append(", openid=").append(openid);
        sb.append(", sex=").append(sex);
        sb.append(", orders=").append(orders);
        sb.append(", originPoassword=").append(originPoassword);
        sb.append(", inviteCode=").append(inviteCode);
        sb.append(", originPassword=").append(originPassword);
        sb.append(", qq=").append(qq);
        sb.append(", integral=").append(integral);
        sb.append(", money=").append(money);
        sb.append(", commission=").append(commission);
        sb.append(", fenyuan=").append(fenyuan);
        sb.append(", kahao=").append(kahao);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", defShopId=").append(defShopId);
        sb.append(", source=").append(source);
        sb.append(", follow=").append(follow);
        sb.append(", grade=").append(grade);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}