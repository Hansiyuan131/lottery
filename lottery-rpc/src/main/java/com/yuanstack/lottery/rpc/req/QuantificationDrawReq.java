package com.yuanstack.lottery.rpc.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

/**
 * @description: 量化人群抽奖请求参数
 * @author: hansiyuan
 * @date: 2022/4/15 10:44 AM
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class QuantificationDrawReq {

    /**
     * 用户ID
     */
    private String uId;
    /**
     * 规则树ID
     */
    private Long treeId;
    /**
     * 决策值
     */
    private Map<String, Object> valMap;
}
