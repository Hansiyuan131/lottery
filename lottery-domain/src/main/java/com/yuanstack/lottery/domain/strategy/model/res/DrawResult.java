package com.yuanstack.lottery.domain.strategy.model.res;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hansiyuan
 * @date 2022年04月12日 20:27
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DrawResult {
    /**
     * 用户ID
     */
    private String uId;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 奖品ID
     */
    private String rewardId;

    /**
     * 奖品名称
     */
    private String awardName;

}
