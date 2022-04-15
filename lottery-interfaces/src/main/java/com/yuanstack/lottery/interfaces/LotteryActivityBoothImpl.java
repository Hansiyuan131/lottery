package com.yuanstack.lottery.interfaces;

import com.alibaba.fastjson.JSON;
import com.yuanstack.lottery.application.process.ActivityProcess;
import com.yuanstack.lottery.application.process.req.DrawProcessReq;
import com.yuanstack.lottery.application.process.res.DrawProcessResult;
import com.yuanstack.lottery.application.process.res.RuleQuantificationCrowdResult;
import com.yuanstack.lottery.assembler.StructMapping;
import com.yuanstack.lottery.common.constants.response.ResponseCode;
import com.yuanstack.lottery.domain.rule.model.req.DecisionMatterReq;
import com.yuanstack.lottery.domain.strategy.model.vo.DrawAwardVO;
import com.yuanstack.lottery.rpc.LotteryActivityBooth;
import com.yuanstack.lottery.rpc.dto.AwardDTO;
import com.yuanstack.lottery.rpc.req.DrawReq;
import com.yuanstack.lottery.rpc.req.QuantificationDrawReq;
import com.yuanstack.lottery.rpc.res.DrawRes;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

/**
 * @description: 抽奖活动展台
 * @author: hansiyuan
 * @date: 2022/4/15 10:49 AM
 */
@Controller
public class LotteryActivityBoothImpl implements LotteryActivityBooth {

    private Logger logger = LoggerFactory.getLogger(LotteryActivityBooth.class);

    @Resource
    private ActivityProcess activityProcess;

    @Resource
    private StructMapping<DrawAwardVO, AwardDTO> awardMapping;

    @Override
    public DrawRes doDraw(DrawReq drawReq) {
        try {
            logger.info("抽奖，开始 uId：{} activityId：{}", drawReq.getUId(), drawReq.getActivityId());

            // 1. 执行抽奖
            DrawProcessResult drawProcessResult = activityProcess.doDrawProcess(new DrawProcessReq(drawReq.getUId(), drawReq.getActivityId()));
            if (!ResponseCode.SUCCESS.getCode().equals(drawProcessResult.getCode())) {
                logger.error("抽奖，失败(抽奖过程异常) uId：{} activityId：{}", drawReq.getUId(), drawReq.getActivityId());
                return new DrawRes(drawProcessResult.getCode(), drawProcessResult.getInfo());
            }

            // 2. 数据转换
            DrawAwardVO drawAwardVO = drawProcessResult.getDrawAwardVO();
            AwardDTO awardDTO = awardMapping.sourceToTarget(drawAwardVO);
            awardDTO.setActivityId(drawReq.getActivityId());

            // 3. 封装数据
            DrawRes drawRes = new DrawRes(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getInfo());
            drawRes.setAwardDTO(awardDTO);

            logger.info("抽奖，完成 uId：{} activityId：{} drawRes：{}", drawReq.getUId(), drawReq.getActivityId(), JSON.toJSONString(drawRes));

            return drawRes;
        } catch (Exception e) {
            logger.error("抽奖，失败 uId：{} activityId：{} reqJson：{}", drawReq.getUId(), drawReq.getActivityId(), JSON.toJSONString(drawReq), e);
            return new DrawRes(ResponseCode.UN_ERROR.getCode(), ResponseCode.UN_ERROR.getInfo());
        }
    }

    @Override
    public DrawRes doQuantificationDraw(QuantificationDrawReq quantificationDrawReq) {
        try {
            logger.info("量化人群抽奖，开始 uId：{} treeId：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId());

            // 1. 执行规则引擎，获取用户可以参与的活动号
            RuleQuantificationCrowdResult ruleQuantificationCrowdResult = activityProcess.doRuleQuantificationCrowd(new DecisionMatterReq(quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId(), quantificationDrawReq.getValMap()));
            if (!ResponseCode.SUCCESS.getCode().equals(ruleQuantificationCrowdResult.getCode())) {
                logger.error("量化人群抽奖，失败(规则引擎执行异常) uId：{} treeId：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId());
                return new DrawRes(ruleQuantificationCrowdResult.getCode(), ruleQuantificationCrowdResult.getInfo());
            }

            // 2. 执行抽奖
            Long activityId = ruleQuantificationCrowdResult.getActivityId();
            DrawProcessResult drawProcessResult = activityProcess.doDrawProcess(new DrawProcessReq(quantificationDrawReq.getUId(), activityId));
            if (!ResponseCode.SUCCESS.getCode().equals(drawProcessResult.getCode())) {
                logger.error("量化人群抽奖，失败(抽奖过程异常) uId：{} treeId：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId());
                return new DrawRes(drawProcessResult.getCode(), drawProcessResult.getInfo());
            }

            // 3. 数据转换
            DrawAwardVO drawAwardVO = drawProcessResult.getDrawAwardVO();
            AwardDTO awardDTO = awardMapping.sourceToTarget(drawAwardVO);
            awardDTO.setActivityId(activityId);

            // 4. 封装数据
            DrawRes drawRes = new DrawRes(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getInfo());
            drawRes.setAwardDTO(awardDTO);

            logger.info("量化人群抽奖，完成 uId：{} treeId：{} drawRes：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId(), JSON.toJSONString(drawRes));

            return drawRes;
        } catch (Exception e) {
            logger.error("量化人群抽奖，失败 uId：{} treeId：{} reqJson：{}", quantificationDrawReq.getUId(), quantificationDrawReq.getTreeId(), JSON.toJSONString(quantificationDrawReq), e);
            return new DrawRes(ResponseCode.UN_ERROR.getCode(), ResponseCode.UN_ERROR.getInfo());
        }
    }

}

