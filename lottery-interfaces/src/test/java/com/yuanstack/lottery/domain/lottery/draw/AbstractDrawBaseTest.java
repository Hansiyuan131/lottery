package com.yuanstack.lottery.domain.lottery.draw;

import com.yuanstack.lottery.domain.strategy.model.req.DrawReq;
import com.yuanstack.lottery.domain.strategy.model.vo.AwardRateInfo;
import com.yuanstack.lottery.domain.strategy.service.algorithm.DrawAlgorithm;
import com.yuanstack.lottery.domain.strategy.service.draw.DrawExec;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * @description: 抽奖流程测试
 * @author: hansiyuan
 * @date: 2022/4/13 10:40 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AbstractDrawBaseTest {

    @Resource
    private DrawExec drawExec;

    @Autowired
    @Qualifier("entiretyRateRandomDrawAlgorithm")
    private DrawAlgorithm randomDrawAlgorithm;

    @Before
    public void init() {
        // 奖品信息
        List<AwardRateInfo> strategyList = new ArrayList<>();
        strategyList.add(new AwardRateInfo("一等奖：IMac", new BigDecimal("0.05")));
        strategyList.add(new AwardRateInfo("二等奖：iphone", new BigDecimal("0.15")));
        strategyList.add(new AwardRateInfo("三等奖：ipad", new BigDecimal("0.20")));
        strategyList.add(new AwardRateInfo("四等奖：AirPods", new BigDecimal("0.25")));
        strategyList.add(new AwardRateInfo("五等奖：充电宝", new BigDecimal("0.35")));

        // 初始数据
        randomDrawAlgorithm.initRateTuple(10001L, strategyList);
    }

    @Test
    public void test_drawExec() {
        drawExec.doDrawExec(new DrawReq("小A", 10001L));
        drawExec.doDrawExec(new DrawReq("小B", 10001L));
        drawExec.doDrawExec(new DrawReq("小C", 10001L));
        drawExec.doDrawExec(new DrawReq("小D", 10001L));
    }
}

