package com.yuanstack.lottery.common.constants.award;

import lombok.Getter;

/**
 * @description: 发奖状态
 * @author: hansiyuan
 * @date: 2022/4/13 4:19 PM
 */
@Getter
public enum AwardStateEnum {
    /**
     * 等待发奖
     */
    WAIT(0, "等待发奖"),

    /**
     * 发奖成功
     */
    SUCCESS(1, "发奖成功"),

    /**
     * 发奖失败
     */
    FAILURE(2, "发奖失败");

    private Integer code;
    private String info;

    AwardStateEnum(Integer code, String info) {
        this.code = code;
        this.info = info;
    }
}
