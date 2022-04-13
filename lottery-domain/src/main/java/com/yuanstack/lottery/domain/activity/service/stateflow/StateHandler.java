package com.yuanstack.lottery.domain.activity.service.stateflow;

import com.yuanstack.lottery.common.constants.activity.ActivityStateEnum;
import com.yuanstack.lottery.common.model.Result;

/**
 * 状态处理接口
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:24
 */
public interface StateHandler {

    /**
     * 提审
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 审核结果
     */
    Result arraignment(Long activityId, Enum<ActivityStateEnum> currentStatus);

    /**
     * 审核通过
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 审核结果
     */
    Result checkPass(Long activityId, Enum<ActivityStateEnum> currentStatus);

    /**
     * 审核拒绝
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 审核结果
     */
    Result checkRefuse(Long activityId, Enum<ActivityStateEnum> currentStatus);

    /**
     * 撤销审核
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 审核结果
     */
    Result checkRevoke(Long activityId, Enum<ActivityStateEnum> currentStatus);

    /**
     * 关闭
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 审核结果
     */
    Result close(Long activityId, Enum<ActivityStateEnum> currentStatus);

    /**
     * 开启
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 审核结果
     */
    Result open(Long activityId, Enum<ActivityStateEnum> currentStatus);

    /**
     * 运行活动中
     *
     * @param activityId    活动ID
     * @param currentStatus 当前状态
     * @return 审核结果
     */
    Result doing(Long activityId, Enum<ActivityStateEnum> currentStatus);
}
