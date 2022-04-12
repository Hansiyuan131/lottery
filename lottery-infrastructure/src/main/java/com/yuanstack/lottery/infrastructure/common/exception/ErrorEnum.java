package com.yuanstack.lottery.infrastructure.common.exception;

import lombok.Getter;

/**
 * @description: 错误枚举类
 * @author: hansiyuan
 * @date: 2022/4/12 5:19 PM
 */
@Getter
public enum ErrorEnum {
    SUCCESS("SUCCESS", "调用成功"),
    FAIL("FAIL", "系统繁忙,请稍后重试"),
    E_SYS_REPEAT("E_SYS_REPEAT", "请勿重复提交"),
    E_SYS_PARAM("E_SYS_PARAM", "参数不合法");
    String code;
    String message;

    ErrorEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    @Override
    public String toString() {
        return this.code + ":" + this.getMessage();
    }

    public static String getMessageByCode(String code) {
        for (ErrorEnum errorEnum : ErrorEnum.values()) {
            if (errorEnum.code.equals(code)) {
                return errorEnum.message;
            }
        }

        return null;
    }
}
