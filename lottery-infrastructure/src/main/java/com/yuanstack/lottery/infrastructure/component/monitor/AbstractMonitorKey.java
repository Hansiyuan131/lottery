package com.yuanstack.lottery.infrastructure.component.monitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @description: 监控Key 抽象类
 * @author: hansiyuan
 * @date: 2022/4/12 4:52 PM
 */
public abstract class AbstractMonitorKey {
    protected List<MonitorKeys> monitorKey = new ArrayList<>();

    protected abstract MonitorTypeEnum getKeyType();

    public String[] getMonitorKeys() {
        if (monitorKey != null) {
            MonitorKeys monitorKeys = monitorKey.get(0);
            if (monitorKeys != null) {
                return new String[] {monitorKeys.getKey1(), monitorKeys.getKey2(), monitorKeys.getKey3()};
            }
        }
        return null;
    }

    AbstractMonitorKey(String key1, String[] key2, String key3) {
        for (String k2 : key2) {
            MonitorKeys k = new MonitorKeys(getKeyType().getType(), key1, k2, key3);
            monitorKey.add(k);
        }
    }

    AbstractMonitorKey(String key1, String key2, String key3) {
        MonitorKeys k = new MonitorKeys(getKeyType().getType(), key1, key2, key3);
        monitorKey.add(k);
    }

    protected void setValue1(long v) {
        int size = monitorKey.size();
        for (MonitorKeys monitorKeys : monitorKey) {
            MonitorLog.addStat(monitorKeys, v, 0);
        }
    }

    protected void setValue1AndValue2(long v1, long v2) {
        int size = monitorKey.size();
        for (MonitorKeys monitorKeys : monitorKey) {
            MonitorLog.addStat(monitorKeys, v1, v2);
        }
    }

    protected void setValue2(long v) {
        int size = monitorKey.size();
        for (MonitorKeys monitorKeys : monitorKey) {
            MonitorLog.addStat(monitorKeys, 0, v);
        }
    }
}
