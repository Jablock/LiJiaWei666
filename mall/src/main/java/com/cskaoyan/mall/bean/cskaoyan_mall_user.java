package main.java.com.cskaoyan.mall.bean;

import java.util.Date;

public class cskaoyan_mall_user {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.username
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.password
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.gender
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Byte gender;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.birthday
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Date birthday;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.last_login_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Date lastLoginTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.last_login_ip
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String lastLoginIp;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.user_level
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Byte userLevel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.nickname
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String nickname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.mobile
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.avatar
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String avatar;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.weixin_openid
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String weixinOpenid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.status
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Byte status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.add_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.update_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_user.deleted
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.id
     *
     * @return the value of cskaoyan_mall_user.id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.id
     *
     * @param id the value for cskaoyan_mall_user.id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.username
     *
     * @return the value of cskaoyan_mall_user.username
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.username
     *
     * @param username the value for cskaoyan_mall_user.username
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.password
     *
     * @return the value of cskaoyan_mall_user.password
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.password
     *
     * @param password the value for cskaoyan_mall_user.password
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.gender
     *
     * @return the value of cskaoyan_mall_user.gender
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Byte getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.gender
     *
     * @param gender the value for cskaoyan_mall_user.gender
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setGender(Byte gender) {
        this.gender = gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.birthday
     *
     * @return the value of cskaoyan_mall_user.birthday
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.birthday
     *
     * @param birthday the value for cskaoyan_mall_user.birthday
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.last_login_time
     *
     * @return the value of cskaoyan_mall_user.last_login_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.last_login_time
     *
     * @param lastLoginTime the value for cskaoyan_mall_user.last_login_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.last_login_ip
     *
     * @return the value of cskaoyan_mall_user.last_login_ip
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.last_login_ip
     *
     * @param lastLoginIp the value for cskaoyan_mall_user.last_login_ip
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp == null ? null : lastLoginIp.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.user_level
     *
     * @return the value of cskaoyan_mall_user.user_level
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Byte getUserLevel() {
        return userLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.user_level
     *
     * @param userLevel the value for cskaoyan_mall_user.user_level
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setUserLevel(Byte userLevel) {
        this.userLevel = userLevel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.nickname
     *
     * @return the value of cskaoyan_mall_user.nickname
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getNickname() {
        return nickname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.nickname
     *
     * @param nickname the value for cskaoyan_mall_user.nickname
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setNickname(String nickname) {
        this.nickname = nickname == null ? null : nickname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.mobile
     *
     * @return the value of cskaoyan_mall_user.mobile
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.mobile
     *
     * @param mobile the value for cskaoyan_mall_user.mobile
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.avatar
     *
     * @return the value of cskaoyan_mall_user.avatar
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.avatar
     *
     * @param avatar the value for cskaoyan_mall_user.avatar
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar == null ? null : avatar.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.weixin_openid
     *
     * @return the value of cskaoyan_mall_user.weixin_openid
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getWeixinOpenid() {
        return weixinOpenid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.weixin_openid
     *
     * @param weixinOpenid the value for cskaoyan_mall_user.weixin_openid
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setWeixinOpenid(String weixinOpenid) {
        this.weixinOpenid = weixinOpenid == null ? null : weixinOpenid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.status
     *
     * @return the value of cskaoyan_mall_user.status
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.status
     *
     * @param status the value for cskaoyan_mall_user.status
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.add_time
     *
     * @return the value of cskaoyan_mall_user.add_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.add_time
     *
     * @param addTime the value for cskaoyan_mall_user.add_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.update_time
     *
     * @return the value of cskaoyan_mall_user.update_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.update_time
     *
     * @param updateTime the value for cskaoyan_mall_user.update_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_user.deleted
     *
     * @return the value of cskaoyan_mall_user.deleted
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_user.deleted
     *
     * @param deleted the value for cskaoyan_mall_user.deleted
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
