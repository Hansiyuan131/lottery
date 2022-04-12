package com.yuanstack.lottery.infrastructure.component.monitor;

import lombok.Getter;

/**
 * 监控类型枚举类
 *
 * @author hansiyuan
 */
@Getter
public enum MonitorTypeEnum {
    RT("RT", "响应时间"),
    QPS("QPS", "每秒查询");

    /**
     * 监控类型
     */
    private String type;
    /**
     * 监控类型描述信息
     */
    private String desc;

    MonitorTypeEnum(String type, String desc) {
        this.type = type;
        this.desc = desc;
    }
}
