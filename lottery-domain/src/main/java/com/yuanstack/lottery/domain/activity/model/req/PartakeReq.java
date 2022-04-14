package com.yuanstack.lottery.domain.activity.model.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @description: 参与活动请求
 * @author: hansiyuan
 * @date: 2022/4/14 2:15 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class PartakeReq {
    /**
     * 用户ID
     */
    private String uId;
    /**
     * 活动ID
     */
    private Long activityId;
    /**
     * 活动领取时间
     */
    private Date partakeDate;

    public PartakeReq(String uId, Long activityId) {
        this.uId = uId;
        this.activityId = activityId;
        this.partakeDate = new Date();
    }
}
