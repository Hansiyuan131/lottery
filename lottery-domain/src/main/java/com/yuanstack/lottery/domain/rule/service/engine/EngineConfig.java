package com.yuanstack.lottery.domain.rule.service.engine;

import com.yuanstack.lottery.domain.rule.service.logic.LogicFilter;
import com.yuanstack.lottery.domain.rule.service.logic.impl.UserAgeFilter;
import com.yuanstack.lottery.domain.rule.service.logic.impl.UserGenderFilter;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 规则配置
 * @author: hansiyuan
 * @date: 2022/4/14 4:16 PM
 */
public class EngineConfig {

    protected static Map<String, LogicFilter> logicFilterMap = new ConcurrentHashMap<>();

    @Resource
    private UserAgeFilter userAgeFilter;
    @Resource
    private UserGenderFilter userGenderFilter;

    @PostConstruct
    public void init() {
        logicFilterMap.put("userAge", userAgeFilter);
        logicFilterMap.put("userGender", userGenderFilter);
    }

}
