package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.lottery.infrastructure.po.Award;
import org.apache.ibatis.annotations.Mapper;


/**
 * @author hansiyuan
 */
@Mapper
public interface AwardDao {
    Award queryAwardInfo(String awardId);
}
