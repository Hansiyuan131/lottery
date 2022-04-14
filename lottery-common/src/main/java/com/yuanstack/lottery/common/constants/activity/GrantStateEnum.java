package com.yuanstack.lottery.common.constants.activity;

import lombok.Getter;

/**
 * @description: 发奖状态
 * @author: hansiyuan
 * @date: 2022/4/14 3:55 PM
 */
@Getter
public enum GrantStateEnum {
    INIT(0, "初始"),
    COMPLETE(1, "完成"),
    FAIL(2, "失败");

    private Integer code;
    private String info;

    GrantStateEnum(Integer code, String info) {
        this.code = code;
        this.info = info;
    }
}
