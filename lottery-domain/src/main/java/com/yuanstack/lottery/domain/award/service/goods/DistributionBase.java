package com.yuanstack.lottery.domain.award.service.goods;

import com.yuanstack.lottery.domain.award.repository.AwardRepository;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @description: 配送货物基础共用类
 * @author: hansiyuan
 * @date: 2022/4/13 3:49 PM
 */
@Slf4j
public class DistributionBase {
    @Resource
    private AwardRepository awardRepository;

    protected void updateUserAwardState(String uId, String orderId, String awardId, Integer awardState, String awardStateInfo) {
        // TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态
        log.info("TODO 后期添加更新分库分表中，用户个人的抽奖记录表中奖品发奖状态 uId：{}", uId);
    }
}
