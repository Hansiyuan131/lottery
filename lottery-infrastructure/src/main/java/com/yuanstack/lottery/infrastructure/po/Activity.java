package com.yuanstack.lottery.infrastructure.po;

import java.io.Serializable;
import java.util.Date;

public class Activity implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Long activityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_name
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private String activityName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.activity_desc
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private String activityDesc;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.begin_date_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Date beginDateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.end_date_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Date endDateTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.stock_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Integer stockCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.stock_surplus_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Integer stockSurplusCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.take_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Integer takeCount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.strategy_id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Long strategyId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.state
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Byte state;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.creator
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private String creator;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.create_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column activity.update_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private Date updateTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table activity
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.id
     *
     * @return the value of activity.id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.id
     *
     * @param id the value for activity.id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_id
     *
     * @return the value of activity.activity_id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Long getActivityId() {
        return activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_id
     *
     * @param activityId the value for activity.activity_id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_name
     *
     * @return the value of activity.activity_name
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public String getActivityName() {
        return activityName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_name
     *
     * @param activityName the value for activity.activity_name
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setActivityName(String activityName) {
        this.activityName = activityName == null ? null : activityName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.activity_desc
     *
     * @return the value of activity.activity_desc
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public String getActivityDesc() {
        return activityDesc;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.activity_desc
     *
     * @param activityDesc the value for activity.activity_desc
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setActivityDesc(String activityDesc) {
        this.activityDesc = activityDesc == null ? null : activityDesc.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.begin_date_time
     *
     * @return the value of activity.begin_date_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Date getBeginDateTime() {
        return beginDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.begin_date_time
     *
     * @param beginDateTime the value for activity.begin_date_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setBeginDateTime(Date beginDateTime) {
        this.beginDateTime = beginDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.end_date_time
     *
     * @return the value of activity.end_date_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Date getEndDateTime() {
        return endDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.end_date_time
     *
     * @param endDateTime the value for activity.end_date_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.stock_count
     *
     * @return the value of activity.stock_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Integer getStockCount() {
        return stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.stock_count
     *
     * @param stockCount the value for activity.stock_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setStockCount(Integer stockCount) {
        this.stockCount = stockCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.stock_surplus_count
     *
     * @return the value of activity.stock_surplus_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Integer getStockSurplusCount() {
        return stockSurplusCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.stock_surplus_count
     *
     * @param stockSurplusCount the value for activity.stock_surplus_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setStockSurplusCount(Integer stockSurplusCount) {
        this.stockSurplusCount = stockSurplusCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.take_count
     *
     * @return the value of activity.take_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Integer getTakeCount() {
        return takeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.take_count
     *
     * @param takeCount the value for activity.take_count
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setTakeCount(Integer takeCount) {
        this.takeCount = takeCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.strategy_id
     *
     * @return the value of activity.strategy_id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Long getStrategyId() {
        return strategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.strategy_id
     *
     * @param strategyId the value for activity.strategy_id
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.state
     *
     * @return the value of activity.state
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Byte getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.state
     *
     * @param state the value for activity.state
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setState(Byte state) {
        this.state = state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.creator
     *
     * @return the value of activity.creator
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public String getCreator() {
        return creator;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.creator
     *
     * @param creator the value for activity.creator
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setCreator(String creator) {
        this.creator = creator == null ? null : creator.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.create_time
     *
     * @return the value of activity.create_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.create_time
     *
     * @param createTime the value for activity.create_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column activity.update_time
     *
     * @return the value of activity.update_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column activity.update_time
     *
     * @param updateTime the value for activity.update_time
     *
     * @mbg.generated Tue Apr 12 23:04:40 CST 2022
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}