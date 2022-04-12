package com.yuanstack.lottery.domain.strategy.service.draw;

import com.yuanstack.lottery.domain.strategy.model.req.DrawReq;
import com.yuanstack.lottery.domain.strategy.model.res.DrawResult;

/**
 * @author hansiyuan
 * @date 2022年04月12日 20:42
 */
public interface DrawExec {
    DrawResult doDrawExec(DrawReq req);
}
