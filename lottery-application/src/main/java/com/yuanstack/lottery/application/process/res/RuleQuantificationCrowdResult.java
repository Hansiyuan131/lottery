package com.yuanstack.lottery.application.process.res;

import com.yuanstack.lottery.common.model.Result;

/**
 * @description: 规则量化群组结果
 * @author: hansiyuan
 * @date: 2022/4/15 10:53 AM
 */
public class RuleQuantificationCrowdResult extends Result {

    /** 活动ID */
    private Long activityId;

    public RuleQuantificationCrowdResult(String code, String info) {
        super(code, info);
    }

    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

}
