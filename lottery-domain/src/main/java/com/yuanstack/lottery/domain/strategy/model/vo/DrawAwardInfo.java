package com.yuanstack.lottery.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 中奖奖品信息
 * @author: hansiyuan
 * @date: 2022/4/13 10:24 AM
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DrawAwardInfo {
    /**
     * 奖品ID
     */
    private String rewardId;

    /**
     * 奖品名称
     */
    private String awardName;
}
