package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;


/**
 * 策略表DAO
 *
 * @author hansiyuan
 */
@Mapper
public interface StrategyDao {

    /**
     * 查询策略配置
     *
     * @param strategyId 策略ID
     * @return 策略配置信息
     */
    Strategy queryStrategy(Long strategyId);

    /**
     * 插入策略配置
     *
     * @param req 策略配置
     */
    void insert(Strategy req);

}
