package com.yuanstack.lottery.application.process.res;

import com.yuanstack.lottery.common.model.Result;
import com.yuanstack.lottery.domain.strategy.model.vo.DrawAwardInfo;

/**
 * @description: 活动抽奖结果
 * @author: hansiyuan
 * @date: 2022/4/14 3:47 PM
 */
public class DrawProcessResult extends Result {
    private DrawAwardInfo drawAwardInfo;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardInfo drawAwardInfo) {
        super(code, info);
        this.drawAwardInfo = drawAwardInfo;
    }

    public DrawAwardInfo getDrawAwardInfo() {
        return drawAwardInfo;
    }

    public void setDrawAwardInfo(DrawAwardInfo drawAwardInfo) {
        this.drawAwardInfo = drawAwardInfo;
    }

}
