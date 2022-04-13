package com.yuanstack.lottery.domain.strategy.repository;

import com.yuanstack.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.yuanstack.lottery.domain.strategy.model.vo.AwardBriefVO;

import java.util.List;

/**
 * 抽奖策略 StrategyRepository
 *
 * @author hansiyuan
 * @date 2022年04月12日 20:16
 */
public interface StrategyRepository {

    /**
     * 获取抽奖策略配置数据
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
    AwardBriefVO queryAwardInfo(String awardId);

    /**
     * 无库存排除奖品列表ID集合
     *
     * @param strategyId 策略ID
     * @return 奖品列表
     */
    List<String> queryNoStockStrategyAwardList(Long strategyId);

    /**
     * 扣减库存
     *
     * @param strategyId 策略ID
     * @param awardId    奖品ID
     * @return 扣减结果
     */
    boolean deductStock(Long strategyId, String awardId);
}
