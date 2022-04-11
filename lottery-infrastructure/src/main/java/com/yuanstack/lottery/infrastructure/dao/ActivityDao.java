package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hansiyuan
 * @date 2022年04月11日 23:10
 */
@Mapper
public interface ActivityDao {

    void insert(Activity req);

    Activity queryActivityById(Long activityId);

}