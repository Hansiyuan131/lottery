package com.yuanstack.lottery.domain.award.service.factory;

import com.yuanstack.lottery.common.constants.award.AwardTypeEnum;
import com.yuanstack.lottery.domain.award.service.goods.DistributionGoods;
import com.yuanstack.lottery.domain.award.service.goods.impl.CouponGoods;
import com.yuanstack.lottery.domain.award.service.goods.impl.DescGoods;
import com.yuanstack.lottery.domain.award.service.goods.impl.PhysicalGoods;
import com.yuanstack.lottery.domain.award.service.goods.impl.RedeemCodeGoods;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description: 各类发奖奖品配置类
 * @author: hansiyuan
 * @date: 2022/4/13 3:48 PM
 */
public class GoodsConfig {
    /** 奖品发放策略组 */
    protected static Map<Integer, DistributionGoods> goodsMap = new ConcurrentHashMap<>();

    @Resource
    private DescGoods descGoods;

    @Resource
    private RedeemCodeGoods redeemCodeGoods;

    @Resource
    private CouponGoods couponGoods;

    @Resource
    private PhysicalGoods physicalGoods;

    @PostConstruct
    public void init() {
        goodsMap.put(AwardTypeEnum.DESC.getCode(), descGoods);
        goodsMap.put(AwardTypeEnum.RedeemCodeGoods.getCode(), redeemCodeGoods);
        goodsMap.put(AwardTypeEnum.CouponGoods.getCode(), couponGoods);
        goodsMap.put(AwardTypeEnum.PhysicalGoods.getCode(), physicalGoods);
    }
}
