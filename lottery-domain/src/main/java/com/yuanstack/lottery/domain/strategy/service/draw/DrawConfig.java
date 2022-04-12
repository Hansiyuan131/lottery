package com.yuanstack.lottery.domain.strategy.service.draw;

import com.yuanstack.lottery.domain.strategy.service.algorithm.DrawAlgorithm;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author hansiyuan
 * @date 2022年04月12日 20:42
 */
public class DrawConfig {

    @Resource
    private DrawAlgorithm defaultRateRandomDrawAlgorithm;

    @Resource
    private DrawAlgorithm singleRateRandomDrawAlgorithm;

    protected static Map<Integer, DrawAlgorithm> drawAlgorithmMap = new ConcurrentHashMap<>();

    @PostConstruct
    public void init() {
        drawAlgorithmMap.put(1, defaultRateRandomDrawAlgorithm);
        drawAlgorithmMap.put(2, singleRateRandomDrawAlgorithm);
    }
}
