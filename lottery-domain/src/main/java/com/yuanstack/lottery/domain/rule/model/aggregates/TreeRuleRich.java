package com.yuanstack.lottery.domain.rule.model.aggregates;

import com.yuanstack.lottery.domain.rule.model.vo.TreeNodeVO;
import com.yuanstack.lottery.domain.rule.model.vo.TreeRootVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @description: 规则树聚合
 * @author: hansiyuan
 * @date: 2022/4/14 4:18 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class TreeRuleRich {
    /**
     * 树根信息
     */
    private TreeRootVO treeRoot;
    /**
     * 树节点ID -> 子节点
     */
    private Map<Long, TreeNodeVO> treeNodeMap;
}
