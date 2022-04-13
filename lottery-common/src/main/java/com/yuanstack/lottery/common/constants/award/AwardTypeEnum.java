package com.yuanstack.lottery.common.constants.award;

import lombok.Data;
import lombok.Getter;

/**
 * @description: 奖品类型
 * @author: hansiyuan
 * @date: 2022/4/13 4:13 PM
 */
@Getter
public enum AwardTypeEnum {
    /**
     * 文字描述
     */
    DESC(1, "文字描述"),
    /**
     * 兑换码
     */
    RedeemCodeGoods(2, "兑换码"),
    /**
     * 优惠券
     */
    CouponGoods(3, "优惠券"),
    /**
     * 实物奖品
     */
    PhysicalGoods(4, "实物奖品");

    private Integer code;
    private String info;

    AwardTypeEnum(Integer code, String info) {
        this.code = code;
        this.info = info;
    }
}
