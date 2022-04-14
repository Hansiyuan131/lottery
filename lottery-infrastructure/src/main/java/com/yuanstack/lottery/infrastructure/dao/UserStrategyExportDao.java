package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.framework.db.router.annotation.DataSourceRouter;
import com.yuanstack.framework.db.router.annotation.DataSourceRouterStrategy;
import com.yuanstack.lottery.infrastructure.po.UserStrategyExport;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 用户策略计算结果表DAO
 * @author: hansiyuan
 * @date: 2022/4/14 11:01 AM
 */
@Mapper
@DataSourceRouterStrategy(splitTable = true)
public interface UserStrategyExportDao {
    /**
     * 新增数据
     * @param userStrategyExport 用户策略
     */
    @DataSourceRouter(key = "uId")
    void insert(UserStrategyExport userStrategyExport);

    /**
     * 查询数据
     * @param uId 用户ID
     * @return 用户策略
     */
    @DataSourceRouter
    UserStrategyExport queryUserStrategyExportByUId(String uId);
}
