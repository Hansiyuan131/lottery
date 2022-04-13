package com.yuanstack.lottery.domain.strategy.service.draw;

import com.yuanstack.lottery.domain.strategy.model.req.DrawReq;
import com.yuanstack.lottery.domain.strategy.model.res.DrawResult;

/**
 * 抽奖执行接口
 *
 * @author hansiyuan
 * @date 2022年04月12日 20:42
 */
public interface DrawExec {
    /**
     * 执行抽奖操作
     *
     * @param req 请求
     * @return 响应
     */
    DrawResult doDrawExec(DrawReq req);
}
