package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.lottery.infrastructure.po.Strategy;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author hansiyuan
 */
@Mapper
public interface StrategyDao {

    Strategy queryStrategy(Long strategyId);

}
