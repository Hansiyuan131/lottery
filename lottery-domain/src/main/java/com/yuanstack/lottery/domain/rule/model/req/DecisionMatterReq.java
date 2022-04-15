package com.yuanstack.lottery.domain.rule.model.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @description: 决策物料
 * @author: hansiyuan
 * @date: 2022/4/14 4:18 PM
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DecisionMatterReq {
    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 用户ID
     */
    private String userId;
    /**
     * 决策值
     */
    private Map<String, Object> valMap;
}
