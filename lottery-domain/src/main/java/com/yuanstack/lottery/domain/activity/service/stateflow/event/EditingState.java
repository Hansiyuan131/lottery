package com.yuanstack.lottery.domain.activity.service.stateflow.event;

import com.yuanstack.lottery.common.constants.activity.ActivityStateEnum;
import com.yuanstack.lottery.common.constants.response.ResponseCode;
import com.yuanstack.lottery.common.model.Result;
import com.yuanstack.lottery.domain.activity.service.stateflow.AbstractState;
import org.springframework.stereotype.Component;

/**
 * 编辑状态
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:34
 */
@Component
public class EditingState extends AbstractState {
    @Override
    public Result arraignment(Long activityId, Enum<ActivityStateEnum> currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityStateEnum.ARRAIGNMENT);
        return isSuccess ? Result.buildResult(ResponseCode.SUCCESS, "活动提审成功") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result checkPass(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "编辑中不可审核通过");
    }

    @Override
    public Result checkRefuse(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "编辑中不可审核拒绝");
    }

    @Override
    public Result checkRevoke(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "编辑中不可撤销审核");
    }

    @Override
    public Result close(Long activityId, Enum<ActivityStateEnum> currentState) {
        boolean isSuccess = activityRepository.alterStatus(activityId, currentState, ActivityStateEnum.CLOSE);
        return isSuccess ? Result.buildResult(ResponseCode.SUCCESS, "活动关闭成功") : Result.buildErrorResult("活动状态变更失败");
    }

    @Override
    public Result open(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "非关闭活动不可开启");
    }

    @Override
    public Result doing(Long activityId, Enum<ActivityStateEnum> currentState) {
        return Result.buildResult(ResponseCode.UN_ERROR, "编辑中活动不可执行活动中变更");
    }

}
