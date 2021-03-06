package com.yuanstack.lottery.common.constants.response;

import lombok.Getter;

/**
 * @author hansiyuan
 * @date 2022年04月11日 23:06
 */
@Getter
public enum ResponseCode {
    SUCCESS("0000", "成功"),
    UN_ERROR("0001", "未知失败"),
    ILLEGAL_PARAMETER("0002", "非法参数"),
    INDEX_DUP("0003", "主键冲突"),
    NO_UPDATE("0004", "SQL操作无更新"),
    LOSING_DRAW("D001", "未中奖"),
    RULE_ERR("D002", "量化人群规则执行失败");;

    private String code;
    private String info;

    ResponseCode(String code, String info) {
        this.code = code;
        this.info = info;
    }
}
