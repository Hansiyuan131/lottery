package com.yuanstack.lottery.domain.award.service.goods.impl;

import com.yuanstack.lottery.common.constants.award.AwardStateEnum;
import com.yuanstack.lottery.common.constants.award.AwardTypeEnum;
import com.yuanstack.lottery.domain.award.model.req.GoodsReq;
import com.yuanstack.lottery.domain.award.model.res.DistributionRes;
import com.yuanstack.lottery.domain.award.service.goods.DistributionBase;
import com.yuanstack.lottery.domain.award.service.goods.DistributionGoods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * @description: 实物发货类商品
 * @author: hansiyuan
 * @date: 2022/4/13 3:49 PM
 */
@Component
@Slf4j
public class PhysicalGoods extends DistributionBase implements DistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        // 模拟调用实物发奖
        log.info("模拟调用实物发奖 uId：{} awardContent：{}", req.getUId(), req.getAwardContent());

        // 更新用户领奖结果
        super.updateUserAwardState(req.getUId(), req.getOrderId(), req.getAwardId(), AwardStateEnum.SUCCESS.getCode(), AwardStateEnum.SUCCESS.getInfo());

        return new DistributionRes(req.getUId(), AwardStateEnum.SUCCESS.getCode(), AwardStateEnum.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return AwardTypeEnum.PhysicalGoods.getCode();
    }

}
