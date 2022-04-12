package com.yuanstack.lottery.domain.strategy.repository;

import com.yuanstack.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.yuanstack.lottery.infrastructure.po.Award;

/**
 * 抽奖策略 StrategyRepository
 *
 * @author hansiyuan
 * @date 2022年04月12日 20:16
 */
public interface StrategyRepository {

    /**
     * 查询策略
     *
     * @param strategyId 策略id
     * @return 策略信息
     */
    StrategyRich queryStrategyRich(Long strategyId);

    /**
     * 查询奖品信息
     *
     * @param awardId 奖品ID
     * @return 奖品信息
     */
    Award queryAwardInfo(String awardId);
}
