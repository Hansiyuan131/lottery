package com.yuanstack.lottery.domain.rule.repository;

import com.yuanstack.lottery.domain.rule.model.aggregates.TreeRuleRich;

/**
 * @description: 规则信息仓储服务接口
 * @author: hansiyuan
 * @date: 2022/4/14 4:26 PM
 */
public interface RuleRepository {

    /**
     * 查询规则决策树配置
     *
     * @param treeId    决策树ID
     * @return          决策树配置
     */
    TreeRuleRich queryTreeRuleRich(Long treeId);

}
