package com.yuanstack.lottery.domain.award;

import com.alibaba.fastjson.JSON;
import com.yuanstack.lottery.common.constants.lottery.DrawStateEnum;
import com.yuanstack.lottery.domain.award.model.req.GoodsReq;
import com.yuanstack.lottery.domain.award.model.res.DistributionRes;
import com.yuanstack.lottery.domain.award.service.factory.DistributionGoodsFactory;
import com.yuanstack.lottery.domain.award.service.goods.DistributionGoods;
import com.yuanstack.lottery.domain.strategy.model.req.DrawReq;
import com.yuanstack.lottery.domain.strategy.model.res.DrawResult;
import com.yuanstack.lottery.domain.strategy.model.vo.AwardRateInfo;
import com.yuanstack.lottery.domain.strategy.model.vo.DrawAwardInfo;
import com.yuanstack.lottery.domain.strategy.service.algorithm.DrawAlgorithm;
import com.yuanstack.lottery.domain.strategy.service.draw.DrawExec;
import lombok.extern.slf4j.Slf4j;
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
 * @description: 抽奖
 * @author: hansiyuan
 * @date: 2022/4/13 4:26 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AwardTest {

    @Resource
    private DrawExec drawExec;

    @Resource
    private DistributionGoodsFactory distributionGoodsFactory;

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
    public void test_award() {
        // 执行抽奖
        DrawResult drawResult = drawExec.doDrawExec(new DrawReq("AAA", 10001L));

        // 判断抽奖结果
        Integer drawState = drawResult.getDrawState();
        if (DrawStateEnum.FAIL.getCode().equals(drawState)) {
            log.info("未中奖 DrawAwardInfo is null");
            return;
        }

        // 封装发奖参数，orderId：2109313442431 为模拟ID，需要在用户参与领奖活动时生成
        DrawAwardInfo drawAwardInfo = drawResult.getDrawAwardInfo();
        GoodsReq goodsReq = new GoodsReq(drawResult.getUId(), "2109313442431", drawAwardInfo.getAwardId(), drawAwardInfo.getAwardName(), drawAwardInfo.getAwardContent());

        // 根据 awardType 从抽奖工厂中获取对应的发奖服务
        DistributionGoods distributionGoodsService = distributionGoodsFactory.getDistributionGoodsService(drawAwardInfo.getAwardType());
        DistributionRes distributionRes = distributionGoodsService.doDistribution(goodsReq);

        log.info("测试结果：{}", JSON.toJSONString(distributionRes));
    }
}
