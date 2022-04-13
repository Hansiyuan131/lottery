package com.yuanstack.lottery.common.constants.ids;

/**
 * Ids 生成策略枚举
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:57
 */
public enum IdTypeEnum {
    /**
     * 雪花算法
     */
    SnowFlake,
    /**
     * 日期算法
     */
    ShortCode,
    /**
     * 随机算法
     */
    RandomNumeric;
}
