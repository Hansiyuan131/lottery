package com.yuanstack.lottery.application.process;

import com.yuanstack.lottery.application.process.req.DrawProcessReq;
import com.yuanstack.lottery.application.process.res.DrawProcessResult;

/**
 * @description: 活动抽奖流程编排接口
 * @author: hansiyuan
 * @date: 2022/4/14 3:41 PM
 */
public interface ActivityProcess {
    /**
     * 执行抽奖流程
     *
     * @param req 抽奖请求
     * @return 抽奖结果
     */
    DrawProcessResult doDrawProcess(DrawProcessReq req);
}
