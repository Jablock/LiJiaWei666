package main.java.com.cskaoyan.mall.bean;

import java.util.Date;

public class cskaoyan_mall_feedback {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.user_id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Integer userId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.username
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String username;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.mobile
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String mobile;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.feed_type
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String feedType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.content
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String content;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.status
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Integer status;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.has_picture
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Boolean hasPicture;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.pic_urls
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private String picUrls;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.add_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.update_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_feedback.deleted
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.id
     *
     * @return the value of cskaoyan_mall_feedback.id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.id
     *
     * @param id the value for cskaoyan_mall_feedback.id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.user_id
     *
     * @return the value of cskaoyan_mall_feedback.user_id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.user_id
     *
     * @param userId the value for cskaoyan_mall_feedback.user_id
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.username
     *
     * @return the value of cskaoyan_mall_feedback.username
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.username
     *
     * @param username the value for cskaoyan_mall_feedback.username
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.mobile
     *
     * @return the value of cskaoyan_mall_feedback.mobile
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.mobile
     *
     * @param mobile the value for cskaoyan_mall_feedback.mobile
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.feed_type
     *
     * @return the value of cskaoyan_mall_feedback.feed_type
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getFeedType() {
        return feedType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.feed_type
     *
     * @param feedType the value for cskaoyan_mall_feedback.feed_type
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setFeedType(String feedType) {
        this.feedType = feedType == null ? null : feedType.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.content
     *
     * @return the value of cskaoyan_mall_feedback.content
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getContent() {
        return content;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.content
     *
     * @param content the value for cskaoyan_mall_feedback.content
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.status
     *
     * @return the value of cskaoyan_mall_feedback.status
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.status
     *
     * @param status the value for cskaoyan_mall_feedback.status
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.has_picture
     *
     * @return the value of cskaoyan_mall_feedback.has_picture
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Boolean getHasPicture() {
        return hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.has_picture
     *
     * @param hasPicture the value for cskaoyan_mall_feedback.has_picture
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setHasPicture(Boolean hasPicture) {
        this.hasPicture = hasPicture;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.pic_urls
     *
     * @return the value of cskaoyan_mall_feedback.pic_urls
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public String getPicUrls() {
        return picUrls;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.pic_urls
     *
     * @param picUrls the value for cskaoyan_mall_feedback.pic_urls
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setPicUrls(String picUrls) {
        this.picUrls = picUrls == null ? null : picUrls.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.add_time
     *
     * @return the value of cskaoyan_mall_feedback.add_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.add_time
     *
     * @param addTime the value for cskaoyan_mall_feedback.add_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.update_time
     *
     * @return the value of cskaoyan_mall_feedback.update_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.update_time
     *
     * @param updateTime the value for cskaoyan_mall_feedback.update_time
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_feedback.deleted
     *
     * @return the value of cskaoyan_mall_feedback.deleted
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_feedback.deleted
     *
     * @param deleted the value for cskaoyan_mall_feedback.deleted
     *
     * @mbg.generated Mon Sep 30 14:11:59 CST 2019
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
