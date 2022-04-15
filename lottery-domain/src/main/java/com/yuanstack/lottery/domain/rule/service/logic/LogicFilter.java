package com.yuanstack.lottery.domain.rule.service.logic;

import com.yuanstack.lottery.domain.rule.model.req.DecisionMatterReq;
import com.yuanstack.lottery.domain.rule.model.vo.TreeNodeLineVO;

import java.util.List;

/**
 * @description: 规则过滤器接口
 * @author: hansiyuan
 * @date: 2022/4/14 4:15 PM
 */
public interface LogicFilter {

    /**
     * 逻辑决策器
     * @param matterValue          决策值
     * @param treeNodeLineInfoList 决策节点
     * @return                     下一个节点Id
     */
    Long filter(String matterValue, List<TreeNodeLineVO> treeNodeLineInfoList);

    /**
     * 获取决策值
     *
     * @param decisionMatter 决策物料
     * @return               决策值
     */
    String matterValue(DecisionMatterReq decisionMatter);

}
