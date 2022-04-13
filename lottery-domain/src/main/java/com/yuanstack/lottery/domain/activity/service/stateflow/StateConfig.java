package com.yuanstack.lottery.domain.activity.service.stateflow;

import com.yuanstack.lottery.common.constants.activity.ActivityStateEnum;
import com.yuanstack.lottery.domain.activity.service.stateflow.event.*;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 状态流转配置
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:25
 */
public class StateConfig {
    @Resource
    private ArraignmentState arraignmentState;
    @Resource
    private CloseState closeState;
    @Resource
    private DoingState doingState;
    @Resource
    private EditingState editingState;
    @Resource
    private OpenState openState;
    @Resource
    private PassState passState;
    @Resource
    private RefuseState refuseState;

    protected Map<Enum<ActivityStateEnum>, AbstractState> stateGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        stateGroup.put(ActivityStateEnum.ARRAIGNMENT, arraignmentState);
        stateGroup.put(ActivityStateEnum.CLOSE, closeState);
        stateGroup.put(ActivityStateEnum.DOING, doingState);
        stateGroup.put(ActivityStateEnum.EDIT, editingState);
        stateGroup.put(ActivityStateEnum.OPEN, openState);
        stateGroup.put(ActivityStateEnum.PASS, passState);
        stateGroup.put(ActivityStateEnum.REFUSE, refuseState);
    }
}
