package com.yuanstack.lottery.infrastructure.component.monitor;

/**
 * @description: TODO(这里用一句话描述这个类的作用)
 * @author: hansiyuan
 * @date: 2022/4/12 4:56 PM
 */
public class MonitorQps extends AbstractMonitorKey {

    MonitorQps(String key1, String[] key2, String key3) {
        super(key1, key2, key3);
    }

    MonitorQps(String key1, String key2, String key3) {
        super(key1, key2, key3);
    }

    public void record() {
        super.setValue1AndValue2(1, 0);
    }

    @Override
    protected MonitorTypeEnum getKeyType() {
        return MonitorTypeEnum.QPS;
    }
}
