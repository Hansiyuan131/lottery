package com.yuanstack.lottery.common.constants.lottery;

import lombok.Getter;

/**
 * @description: 中奖状态枚举
 * @author: hansiyuan
 * @date: 2022/4/13 10:18 AM
 */
@Getter
public enum DrawStateEnum {
    /**
     * 未中奖
     */
    FAIL(0,"未中奖"),

    /**
     * 已中奖
     */
    SUCCESS(1, "已中奖"),

    /**
     * 兜底奖
     */
    Cover(2,"兜底奖");

    private Integer code;
    private String desc;

    DrawStateEnum(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
    }
}
