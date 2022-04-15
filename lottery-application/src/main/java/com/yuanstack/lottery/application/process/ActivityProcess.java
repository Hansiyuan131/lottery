package com.yuanstack.lottery.application.process;

import com.yuanstack.lottery.application.process.req.DrawProcessReq;
import com.yuanstack.lottery.application.process.res.DrawProcessResult;
import com.yuanstack.lottery.application.process.res.RuleQuantificationCrowdResult;
import com.yuanstack.lottery.domain.rule.model.req.DecisionMatterReq;

/**
 * @description: 活动抽奖流程编排接口
 * @author: hansiyuan
 * @date: 2022/4/14 3:41 PM
 */
public interface ActivityProcess {
    /**
     * 执行抽奖流程
     * @param req 抽奖请求
     * @return    抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);

    /**
     * 规则量化人群，返回可参与的活动ID
     * @param req   规则请求
     * @return      量化结果，用户可以参与的活动ID
     */
    RuleQuantificationCrowdResult doRuleQuantificationCrowd(DecisionMatterReq req);
}
