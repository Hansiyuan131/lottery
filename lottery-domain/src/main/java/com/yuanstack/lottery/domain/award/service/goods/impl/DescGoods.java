package com.yuanstack.lottery.domain.award.service.goods.impl;

import com.yuanstack.lottery.common.constants.award.AwardStateEnum;
import com.yuanstack.lottery.common.constants.award.AwardTypeEnum;
import com.yuanstack.lottery.domain.award.model.req.GoodsReq;
import com.yuanstack.lottery.domain.award.model.res.DistributionRes;
import com.yuanstack.lottery.domain.award.service.goods.DistributionBase;
import com.yuanstack.lottery.domain.award.service.goods.DistributionGoods;
import org.springframework.stereotype.Component;

/**
 * @description: 描述类商品，以文字形式展示给用户
 * @author: hansiyuan
 * @date: 2022/4/13 3:49 PM
 */
@Component
public class DescGoods extends DistributionBase implements DistributionGoods {

    @Override
    public DistributionRes doDistribution(GoodsReq req) {

        super.updateUserAwardState(req.getUId(), req.getOrderId(), req.getAwardId(), AwardStateEnum.SUCCESS.getCode(), AwardStateEnum.SUCCESS.getInfo());

        return new DistributionRes(req.getUId(), AwardStateEnum.SUCCESS.getCode(), AwardStateEnum.SUCCESS.getInfo());
    }

    @Override
    public Integer getDistributionGoodsName() {
        return AwardTypeEnum.DESC.getCode();
    }

}
