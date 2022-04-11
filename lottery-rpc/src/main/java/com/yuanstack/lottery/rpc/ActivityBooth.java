package com.yuanstack.lottery.rpc;

import com.yuanstack.lottery.rpc.req.ActivityReq;
import com.yuanstack.lottery.rpc.res.ActivityRes;

/**
 * 活动展台
 * 1. 创建活动
 * 2. 更新活动
 * 3. 查询活动
 *
 * @author hansiyuan
 * @date 2022年04月11日 23:23
 */
public interface ActivityBooth {

    /**
     * 根据id查询活动
     *
     * @param req 请求
     * @return 响应
     */
    ActivityRes queryActivityById(ActivityReq req);
}
