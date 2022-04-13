package com.yuanstack.lottery.domain.activity.service.deploy;

import com.yuanstack.lottery.domain.activity.model.req.ActivityConfigReq;

/**
 * 部署活动配置接口
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:17
 */
public interface ActivityDeploy {
    /**
     * 创建活动信息
     *
     * @param req 活动配置信息
     */
    void createActivity(ActivityConfigReq req);

    /**
     * 修改活动信息
     *
     * @param req 活动配置信息
     */
    void updateActivity(ActivityConfigReq req);
}
