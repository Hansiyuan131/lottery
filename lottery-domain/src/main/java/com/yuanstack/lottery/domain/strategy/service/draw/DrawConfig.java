package com.yuanstack.lottery.domain.strategy.service.draw;

import com.yuanstack.lottery.common.constants.lottery.StrategyModeEnum;
import com.yuanstack.lottery.domain.strategy.service.algorithm.DrawAlgorithm;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 抽奖统一配置信息类
 *
 * @author hansiyuan
 * @date 2022年04月12日 20:42
 */
public class DrawConfig {

    @Resource
    private DrawAlgorithm entiretyRateRandomDrawAlgorithm;

    @Resource
    private DrawAlgorithm singleRateRandomDrawAlgorithm;

    /**
     * 抽奖策略组
     */
    protected static Map<Integer, DrawAlgorithm> drawAlgorithmGroup = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        drawAlgorithmGroup.put(StrategyModeEnum.ENTIRETY.getCode(), entiretyRateRandomDrawAlgorithm);
        drawAlgorithmGroup.put(StrategyModeEnum.SINGLE.getCode(), singleRateRandomDrawAlgorithm);
    }
}
