package com.yuanstack.lottery.application.process.impl;

import com.yuanstack.lottery.application.process.ActivityProcess;
import com.yuanstack.lottery.application.process.req.DrawProcessReq;
import com.yuanstack.lottery.application.process.res.DrawProcessResult;
import com.yuanstack.lottery.common.constants.activity.GrantStateEnum;
import com.yuanstack.lottery.common.constants.ids.IdTypeEnum;
import com.yuanstack.lottery.common.constants.lottery.DrawStateEnum;
import com.yuanstack.lottery.common.constants.response.ResponseCode;
import com.yuanstack.lottery.domain.activity.model.req.PartakeReq;
import com.yuanstack.lottery.domain.activity.model.res.PartakeResult;
import com.yuanstack.lottery.domain.activity.model.vo.DrawOrderVO;
import com.yuanstack.lottery.domain.activity.service.partake.ActivityPartake;
import com.yuanstack.lottery.domain.strategy.model.req.DrawReq;
import com.yuanstack.lottery.domain.strategy.model.res.DrawResult;
import com.yuanstack.lottery.domain.strategy.model.vo.DrawAwardInfo;
import com.yuanstack.lottery.domain.strategy.service.draw.DrawExec;
import com.yuanstack.lottery.domain.support.ids.IdGenerator;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @description: 活动抽奖流程编排
 * @author: hansiyuan
 * @date: 2022/4/14 3:42 PM
 */
@Service
public class ActivityProcessImpl implements ActivityProcess {
    @Resource
    private ActivityPartake activityPartake;

    @Resource
    private DrawExec drawExec;

    @Resource
    private Map<IdTypeEnum, IdGenerator> idGeneratorMap;

    @Override
    public DrawProcessResult doDrawProcess(DrawProcessReq req) {
        // 1. 领取活动
        PartakeResult partakeResult = activityPartake.doPartake(new PartakeReq(req.getUId(), req.getActivityId()));
        if (!ResponseCode.SUCCESS.getCode().equals(partakeResult.getCode())) {
            return new DrawProcessResult(partakeResult.getCode(), partakeResult.getInfo());
        }
        Long strategyId = partakeResult.getStrategyId();
        Long takeId = partakeResult.getTakeId();

        // 2. 执行抽奖
        DrawResult drawResult = drawExec.doDrawExec(new DrawReq(req.getUId(), strategyId, String.valueOf(takeId)));
        if (DrawStateEnum.FAIL.getCode().equals(drawResult.getDrawState())) {
            return new DrawProcessResult(ResponseCode.LOSING_DRAW.getCode(), ResponseCode.LOSING_DRAW.getInfo());
        }
        DrawAwardInfo drawAwardInfo = drawResult.getDrawAwardInfo();

        // 3. 结果落库
        activityPartake.recordDrawOrder(buildDrawOrderVO(req, strategyId, takeId, drawAwardInfo));

        // 4. 发送MQ，触发发奖流程

        // 5. 返回结果
        return new DrawProcessResult(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getInfo(), drawAwardInfo);
    }

    private DrawOrderVO buildDrawOrderVO(DrawProcessReq req, Long strategyId, Long takeId, DrawAwardInfo drawAwardInfo) {
        long orderId = idGeneratorMap.get(IdTypeEnum.SnowFlake).nextId();
        DrawOrderVO drawOrderVO = new DrawOrderVO();
        drawOrderVO.setUId(req.getUId());
        drawOrderVO.setTakeId(takeId);
        drawOrderVO.setActivityId(req.getActivityId());
        drawOrderVO.setOrderId(orderId);
        drawOrderVO.setStrategyId(strategyId);
        drawOrderVO.setStrategyMode(drawAwardInfo.getStrategyMode());
        drawOrderVO.setGrantType(drawAwardInfo.getGrantType());
        drawOrderVO.setGrantDate(drawAwardInfo.getGrantDate());
        drawOrderVO.setGrantState(GrantStateEnum.INIT.getCode());
        drawOrderVO.setAwardId(drawAwardInfo.getAwardId());
        drawOrderVO.setAwardType(drawAwardInfo.getAwardType());
        drawOrderVO.setAwardName(drawAwardInfo.getAwardName());
        drawOrderVO.setAwardContent(drawAwardInfo.getAwardContent());
        return drawOrderVO;
    }
}
