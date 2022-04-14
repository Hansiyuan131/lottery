package com.yuanstack.lottery.domain;

import com.yuanstack.lottery.common.constants.ids.IdTypeEnum;
import com.yuanstack.lottery.domain.support.ids.IdGenerator;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author hansiyuan
 * @date 2022年04月13日 22:02
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class SupportTest {


    @Resource
    private Map<IdTypeEnum, IdGenerator> idGeneratorMap;

    @Test
    public void test_ids() {
        log.info("雪花算法策略，生成ID：{}", idGeneratorMap.get(IdTypeEnum.SnowFlake).nextId());
        log.info("日期算法策略，生成ID：{}", idGeneratorMap.get(IdTypeEnum.ShortCode).nextId());
        log.info("随机算法策略，生成ID：{}", idGeneratorMap.get(IdTypeEnum.RandomNumeric).nextId());
    }

}

