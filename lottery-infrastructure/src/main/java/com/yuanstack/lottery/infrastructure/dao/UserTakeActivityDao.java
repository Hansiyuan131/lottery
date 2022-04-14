package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.framework.db.router.annotation.DataSourceRouter;
import com.yuanstack.lottery.infrastructure.po.UserTakeActivity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 用户领取活动表DAO
 * @author: hansiyuan
 * @date: 2022/4/14 11:04 AM
 */
@Mapper
public interface UserTakeActivityDao {
    /**
     * 插入用户领取活动信息
     *
     * @param userTakeActivity 入参
     */
    @DataSourceRouter(key = "uId")
    void insert(UserTakeActivity userTakeActivity);
}
