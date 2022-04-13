package com.yuanstack.lottery.domain.award.service.factory;

import com.yuanstack.lottery.domain.award.service.goods.DistributionGoods;
import org.springframework.stereotype.Service;

/**
 * @description: 配送商品简单工厂，提供获取配送服务
 * @author: hansiyuan
 * @date: 2022/4/13 3:48 PM
 */
@Service
public class DistributionGoodsFactory extends GoodsConfig {

    public DistributionGoods getDistributionGoodsService(Integer awardType) {
        return goodsMap.get(awardType);
    }
}
