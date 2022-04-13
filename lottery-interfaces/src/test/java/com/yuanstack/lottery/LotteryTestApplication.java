package com.yuanstack.lottery;

import com.yuanstack.lottery.domain.strategy.service.algorithm.DrawAlgorithm;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author hansiyuan
 * @date 2022年04月12日 20:50
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryTestApplication {

    @Resource(name = "singleRateRandomDrawAlgorithm")
    private DrawAlgorithm randomDrawAlgorithm;

    @Test
    public void test() {
        System.out.println(randomDrawAlgorithm);
    }
}
