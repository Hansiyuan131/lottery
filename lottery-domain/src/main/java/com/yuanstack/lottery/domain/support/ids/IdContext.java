package com.yuanstack.lottery.domain.support.ids;

import com.yuanstack.lottery.common.constants.ids.IdTypeEnum;
import com.yuanstack.lottery.domain.support.ids.policy.RandomNumeric;
import com.yuanstack.lottery.domain.support.ids.policy.ShortCode;
import com.yuanstack.lottery.domain.support.ids.policy.SnowFlake;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

/**
 * Id 策略模式上下文配置「在正式的完整的系统架构中，ID 的生成会有单独的服务来完成，其他服务来调用 ID 生成接口即可」
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:56
 */
@Configuration
public class IdContext {

    /**
     * 创建 ID 生成策略对象，属于策略设计模式的使用方式
     *
     * @param snowFlake     雪花算法，长码，大量
     * @param shortCode     日期算法，短码，少量，全局唯一需要自己保证
     * @param randomNumeric 随机算法，短码，大量，全局唯一需要自己保证
     * @return IdGenerator 实现类
     */
    @Bean
    public Map<IdTypeEnum, IdGenerator> idGenerator(SnowFlake snowFlake, ShortCode shortCode, RandomNumeric randomNumeric) {
        Map<IdTypeEnum, IdGenerator> idGeneratorMap = new HashMap<>(8);
        idGeneratorMap.put(IdTypeEnum.SnowFlake, snowFlake);
        idGeneratorMap.put(IdTypeEnum.ShortCode, shortCode);
        idGeneratorMap.put(IdTypeEnum.RandomNumeric, randomNumeric);
        return idGeneratorMap;
    }

}
