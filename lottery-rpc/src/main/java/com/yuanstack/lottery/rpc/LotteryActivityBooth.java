package com.yuanstack.lottery.rpc;

import com.yuanstack.lottery.rpc.req.DrawReq;
import com.yuanstack.lottery.rpc.req.QuantificationDrawReq;
import com.yuanstack.lottery.rpc.res.DrawRes;

/**
 * @description: 抽奖活动展台接口
 * @author: hansiyuan
 * @date: 2022/4/15 10:48 AM
 */
public interface LotteryActivityBooth {
    /**
     * 指定活动抽奖
     *
     * @param drawReq 请求参数
     * @return 抽奖结果
     */
    DrawRes doDraw(DrawReq drawReq);

    /**
     * 量化人群抽奖
     *
     * @param quantificationDrawReq 请求参数
     * @return 抽奖结果
     */
    DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq);

}
