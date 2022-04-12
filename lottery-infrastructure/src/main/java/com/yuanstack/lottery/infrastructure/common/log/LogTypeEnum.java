package com.yuanstack.lottery.infrastructure.common.log;

import lombok.Getter;

/**
 * @author hansiyuan
 */
@Getter
public enum LogTypeEnum {

    DEBUG("debug"),
    INFO("info"),
    WARN("warn"),
    ERROR("error"),
    EXCEPTION("exception");

    private String value;

    LogTypeEnum(String value) {
        this.value = value;
    }
}
