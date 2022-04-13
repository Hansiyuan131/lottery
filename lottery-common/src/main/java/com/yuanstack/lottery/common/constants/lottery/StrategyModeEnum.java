package com.yuanstack.lottery.common.constants.lottery;

import lombok.Getter;
import lombok.Setter;

/**
 * @description: 策略模型枚举
 * 抽奖策略模式：总体概率、单项概率
 * 场景：两种抽奖算法描述，场景A20%、B30%、C50%
 * 单项概率：如果A奖品抽空后，B和C保持目前中奖概率，用户抽奖扔有20%中为A，因A库存抽空则结果展示为未中奖。
 * 为了运营成本，通常这种情况的使用的比较多
 * 总体概率：如果A奖品抽空后，B和C奖品的概率按照 3:5 均分，相当于B奖品中奖概率由 0.3 升为 0.375
 * @author: hansiyuan
 * @date: 2022/4/13 10:14 AM
 */
@Getter
public enum StrategyModeEnum {

    /**
     * 单项概率：如果A奖品抽空后，B和C保持目前中奖概率，用户抽奖扔有20%中为A，因A库存抽空则结果展示为未中奖。
     * 为了运营成本，通常这种情况的使用的比较多
     */
    SINGLE(1, "单项概率"),

    /**
     * 总体概率：如果A奖品抽空后，B和C奖品的概率按照 3:5 均分，相当于B奖品中奖概率由 0.3 升为 0.375
     */
    ENTIRETY(2, "总体概率");

    private Integer code;
    private String desc;

    StrategyModeEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
