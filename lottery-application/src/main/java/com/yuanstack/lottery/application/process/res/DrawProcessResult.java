package com.yuanstack.lottery.application.process.res;

import com.yuanstack.lottery.common.model.Result;
import com.yuanstack.lottery.domain.strategy.model.vo.DrawAwardVO;

/**
 * @description: 活动抽奖结果
 * @author: hansiyuan
 * @date: 2022/4/14 3:47 PM
 */
public class DrawProcessResult extends Result {
    private DrawAwardVO drawAwardVO;

    public DrawProcessResult(String code, String info) {
        super(code, info);
    }

    public DrawProcessResult(String code, String info, DrawAwardVO drawAwardVO) {
        super(code, info);
        this.drawAwardVO = drawAwardVO;
    }

    public DrawAwardVO getDrawAwardVO() {
        return drawAwardVO;
    }

    public void setDrawAwardVO(DrawAwardVO drawAwardVO) {
        this.drawAwardVO = drawAwardVO;
    }

}
