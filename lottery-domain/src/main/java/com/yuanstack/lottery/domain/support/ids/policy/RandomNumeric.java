package com.yuanstack.lottery.domain.support.ids.policy;

import com.yuanstack.lottery.domain.support.ids.IdGenerator;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

/**
 * 工具类生成 org.apache.commons.lang3.RandomStringUtils
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:59
 */
@Component
public class RandomNumeric implements IdGenerator {

    @Override
    public long nextId() {
        return Long.parseLong(RandomStringUtils.randomNumeric(11));
    }

}
