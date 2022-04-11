package com.yuanstack.lottery.common.model;

import com.yuanstack.lottery.common.constants.response.ResponseCode;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author hansiyuan
 * @date 2022年04月11日 23:07
 */
@Data
@AllArgsConstructor
public class Result implements Serializable {

    private static final long serialVersionUID = -3826891916021780628L;
    private String code;
    private String info;

    public static Result buildResult(String code, String info) {
        return new Result(code, info);
    }

    public static Result buildSuccessResult() {
        return new Result(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getInfo());
    }

    public static Result buildErrorResult() {
        return new Result(ResponseCode.UN_ERROR.getCode(), ResponseCode.UN_ERROR.getInfo());
    }
}
