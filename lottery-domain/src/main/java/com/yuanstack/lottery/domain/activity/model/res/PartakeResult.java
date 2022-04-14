package com.yuanstack.lottery.domain.activity.model.res;

import com.yuanstack.lottery.common.model.Result;

/**
 * @description: 活动参与结果
 * @author: hansiyuan
 * @date: 2022/4/14 2:17 PM
 */
public class PartakeResult extends Result {

    /**
     * 策略ID
     */
    private Long strategyId;

    public PartakeResult(String code, String info) {
        super(code, info);
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}

