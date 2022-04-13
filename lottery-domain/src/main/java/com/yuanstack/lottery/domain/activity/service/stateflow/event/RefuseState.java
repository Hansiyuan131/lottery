package com.yuanstack.lottery.domain.activity.service.stateflow.event;

import com.yuanstack.lottery.common.constants.activity.ActivityStateEnum;
import com.yuanstack.lottery.common.constants.response.ResponseCode;
import com.yuanstack.lottery.common.model.Result;
import com.yuanstack.lottery.domain.activity.service.stateflow.AbstractState;
import org.springframework.stereotype.Component;

/**
 * 审核拒绝状态
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:36
 */
@Component
public class RefuseState extends AbstractState {

    @Override
    public Result arraignment(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "已审核状态不可重复提审");
    }

    @Override
    public Result checkPass(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "已审核状态不可重复审核");
    }

    @Override
    public Result checkRefuse(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "活动审核拒绝不可重复审核");
    }

    @Override
    public Result checkRevoke(Long activityId, Enum<ActivityStateEnum> currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityStateEnum.EDIT);
        return isSuccess ? Result.buildResult(ResponseCode.SUCCESS, "撤销审核完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result close(Long activityId, Enum<ActivityStateEnum> currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityStateEnum.CLOSE);
        return isSuccess ? Result.buildResult(ResponseCode.SUCCESS, "活动审核关闭完成") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result open(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "非关闭活动不可开启");
    }

    @Override
    public Result doing(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "审核拒绝不可执行活动为进行中");
    }

}
