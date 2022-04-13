package com.yuanstack.lottery.domain.activity.service.stateflow.impl;

import com.yuanstack.lottery.common.constants.activity.ActivityStateEnum;
import com.yuanstack.lottery.common.model.Result;
import com.yuanstack.lottery.domain.activity.service.stateflow.StateConfig;
import com.yuanstack.lottery.domain.activity.service.stateflow.StateHandler;
import org.springframework.stereotype.Service;

/**
 * 状态处理服务
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:27
 */
@Service
public class StateHandlerImpl extends StateConfig implements StateHandler {
    @Override
    public Result arraignment(Long activityId, Enum<ActivityStateEnum> currentStatus) {
        return stateGroup.get(currentStatus).arraignment(activityId, currentStatus);
    }

    @Override
    public Result checkPass(Long activityId, Enum<ActivityStateEnum> currentStatus) {
        return stateGroup.get(currentStatus).checkPass(activityId, currentStatus);
    }

    @Override
    public Result checkRefuse(Long activityId, Enum<ActivityStateEnum> currentStatus) {
        return stateGroup.get(currentStatus).checkRefuse(activityId, currentStatus);
    }

    @Override
    public Result checkRevoke(Long activityId, Enum<ActivityStateEnum> currentStatus) {
        return stateGroup.get(currentStatus).checkRevoke(activityId, currentStatus);
    }

    @Override
    public Result close(Long activityId, Enum<ActivityStateEnum> currentStatus) {
        return stateGroup.get(currentStatus).close(activityId, currentStatus);
    }

    @Override
    public Result open(Long activityId, Enum<ActivityStateEnum> currentStatus) {
        return stateGroup.get(currentStatus).open(activityId, currentStatus);
    }

    @Override
    public Result doing(Long activityId, Enum<ActivityStateEnum> currentStatus) {
        return stateGroup.get(currentStatus).doing(activityId, currentStatus);
    }
}
