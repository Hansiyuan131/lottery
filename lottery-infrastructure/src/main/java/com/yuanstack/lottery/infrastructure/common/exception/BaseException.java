package com.yuanstack.lottery.infrastructure.common.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * @description: 自定义异常
 * @author: hansiyuan
 * @date: 2022/4/12 5:17 PM
 */
@Getter
@Setter
public class BaseException extends RuntimeException {
    private static final long serialVersionUID = -7578533414491996720L;

    protected String code;
    protected String message;

    public BaseException(String code, String message) {
        super(message);
        this.code = code;
        this.message = message;
    }

    public BaseException(ErrorEnum errorEnum) {
        super(errorEnum.getMessage());
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
    }

    public BaseException(ErrorEnum errorEnum, String message) {
        super(message);
        this.code = errorEnum.getCode();
        this.message = errorEnum.getMessage();
    }
}
