package com.yuanstack.lottery.domain.activity.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 用户领取活动记录
 * @author: hansiyuan
 * @date: 2022/4/14 3:58 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserTakeActivityVO {
    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动领取ID
     */
    private Long takeId;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 活动单使用状态 0未使用、1已使用
     * Constants.TaskState
     */
    private Integer state;
}
