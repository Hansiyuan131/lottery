package com.yuanstack.lottery.domain.strategy.service.draw;

import com.yuanstack.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.yuanstack.lottery.domain.strategy.model.vo.AwardBriefVO;
import com.yuanstack.lottery.domain.strategy.repository.StrategyRepository;

import javax.annotation.Resource;

/**
 * @description: 抽奖策略数据支撑，一些通用的数据服务
 * @author: hansiyuan
 * @date: 2022/4/13 10:05 AM
 */
public class DrawStrategySupport extends DrawConfig {

    @Resource
    protected StrategyRepository strategyRepository;

    /**
     * 查询策略配置信息
     *
     * @param strategyId 策略ID
     * @return 策略配置信息
     */
    protected StrategyRich queryStrategyRich(Long strategyId) {
        return strategyRepository.queryStrategyRich(strategyId);
    }

    /**
     * 查询奖品详情信息
     *
     * @param awardId 奖品ID
     * @return 中奖详情
     */
    protected AwardBriefVO queryAwardInfoByAwardId(String awardId) {
        return strategyRepository.queryAwardInfo(awardId);
    }

}
