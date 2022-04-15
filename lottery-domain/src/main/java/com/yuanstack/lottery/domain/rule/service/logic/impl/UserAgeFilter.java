package com.yuanstack.lottery.domain.rule.service.logic.impl;

import com.yuanstack.lottery.domain.rule.model.req.DecisionMatterReq;
import com.yuanstack.lottery.domain.rule.service.logic.BaseLogic;
import org.springframework.stereotype.Component;

/**
 * @description: 年龄规则
 * @author: hansiyuan
 * @date: 2022/4/14 4:16 PM
 */
@Component
public class UserAgeFilter extends BaseLogic {

    @Override
    public String matterValue(DecisionMatterReq decisionMatter) {
        return decisionMatter.getValMap().get("age").toString();
    }

}
