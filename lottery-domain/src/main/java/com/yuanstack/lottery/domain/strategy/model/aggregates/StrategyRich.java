package com.yuanstack.lottery.domain.strategy.model.aggregates;

import com.yuanstack.lottery.domain.strategy.model.vo.StrategyBriefVO;
import com.yuanstack.lottery.domain.strategy.model.vo.StrategyDetailBriefVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @author hansiyuan
 * @date 2022年04月12日 20:21
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StrategyRich {
    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 策略配置
     */
    private StrategyBriefVO strategy;

    /**
     * 策略明细
     */
    private List<StrategyDetailBriefVO> strategyDetailList;
}
