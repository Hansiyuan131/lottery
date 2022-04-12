package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.lottery.infrastructure.po.StrategyDetail;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * @author hansiyuan
 */
@Mapper
public interface StrategyDetailDao {

    List<StrategyDetail> queryStrategyDetailList(Long strategyId);

}
