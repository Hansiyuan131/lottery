package com.yuanstack.lottery.infrastructure.common.exception;

/**
 * @description: 限流异常
 * @author: hansiyuan
 * @date: 2022/4/12 5:21 PM
 */
public class CurrentLimitingException extends BaseException {

    public CurrentLimitingException(ErrorEnum errorEnum) {
        super(errorEnum);
    }

}
