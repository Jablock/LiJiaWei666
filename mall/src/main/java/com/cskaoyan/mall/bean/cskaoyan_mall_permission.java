package main.java.com.cskaoyan.mall.bean;

import java.util.Date;

public class cskaoyan_mall_permission {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_permission.id
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_permission.role_id
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_permission.permission
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    private String permission;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_permission.add_time
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    private Date addTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_permission.update_time
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    private Date updateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cskaoyan_mall_permission.deleted
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    private Boolean deleted;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_permission.id
     *
     * @return the value of cskaoyan_mall_permission.id
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_permission.id
     *
     * @param id the value for cskaoyan_mall_permission.id
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_permission.role_id
     *
     * @return the value of cskaoyan_mall_permission.role_id
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_permission.role_id
     *
     * @param roleId the value for cskaoyan_mall_permission.role_id
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_permission.permission
     *
     * @return the value of cskaoyan_mall_permission.permission
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public String getPermission() {
        return permission;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_permission.permission
     *
     * @param permission the value for cskaoyan_mall_permission.permission
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public void setPermission(String permission) {
        this.permission = permission == null ? null : permission.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_permission.add_time
     *
     * @return the value of cskaoyan_mall_permission.add_time
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public Date getAddTime() {
        return addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_permission.add_time
     *
     * @param addTime the value for cskaoyan_mall_permission.add_time
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_permission.update_time
     *
     * @return the value of cskaoyan_mall_permission.update_time
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_permission.update_time
     *
     * @param updateTime the value for cskaoyan_mall_permission.update_time
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cskaoyan_mall_permission.deleted
     *
     * @return the value of cskaoyan_mall_permission.deleted
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cskaoyan_mall_permission.deleted
     *
     * @param deleted the value for cskaoyan_mall_permission.deleted
     *
     * @mbg.generated Mon Sep 30 12:00:17 CST 2019
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }
}
