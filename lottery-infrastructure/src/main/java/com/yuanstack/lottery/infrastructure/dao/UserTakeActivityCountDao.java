package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.framework.db.router.annotation.DataSourceRouter;
import com.yuanstack.lottery.infrastructure.po.UserTakeActivityCount;
import org.apache.ibatis.annotations.Mapper;

/**
 * @description: 用户活动参与次数表Dao
 * @author: hansiyuan
 * @date: 2022/4/14 2:28 PM
 */
@Mapper
public interface UserTakeActivityCountDao {

    /**
     * 查询用户领取次数信息
     *
     * @param userTakeActivityCountReq 请求入参【活动号、用户ID】
     * @return 领取结果
     */
    @DataSourceRouter
    UserTakeActivityCount queryUserTakeActivityCount(UserTakeActivityCount userTakeActivityCountReq);

    /**
     * 插入领取次数信息
     *
     * @param userTakeActivityCount 请求入参
     */
    void insert(UserTakeActivityCount userTakeActivityCount);

    /**
     * 更新领取次数信息
     *
     * @param userTakeActivityCount 请求入参
     * @return 更新数量
     */
    int updateLeftCount(UserTakeActivityCount userTakeActivityCount);


}
