package com.yuanstack.lottery.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * 奖品概率信息，奖品编号、库存、概率
 *
 * @author hansiyuan
 * @date 2022年04月12日 20:27
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class AwardRateInfo {
    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 中奖概率
     */
    private BigDecimal awardRate;
}
