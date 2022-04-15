package com.yuanstack.lottery.interfaces;

import com.alibaba.fastjson.JSON;
import com.yuanstack.lottery.rpc.LotteryActivityBooth;
import com.yuanstack.lottery.rpc.req.DrawReq;
import com.yuanstack.lottery.rpc.req.QuantificationDrawReq;
import com.yuanstack.lottery.rpc.res.DrawRes;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.HashMap;

/**
 * @description: 抽奖活动展台测试
 * @author: hansiyuan
 * @date: 2022/4/15 10:59 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class LotteryActivityBoothTest {

    private Logger logger = LoggerFactory.getLogger(LotteryActivityBoothTest.class);

    @Resource
    private LotteryActivityBooth lotteryActivityBooth;

    @Test
    public void test_doDraw() {
        DrawReq drawReq = new DrawReq();
        drawReq.setUId("yuanstack");
        drawReq.setActivityId(100001L);
        DrawRes drawRes = lotteryActivityBooth.doDraw(drawReq);
        logger.info("请求参数：{}", JSON.toJSONString(drawReq));
        logger.info("测试结果：{}", JSON.toJSONString(drawRes));

    }

    @Test
    public void test_doQuantificationDraw() {
        QuantificationDrawReq req = new QuantificationDrawReq();
        req.setUId("yuanstack");
        req.setTreeId(2110081902L);
        req.setValMap(new HashMap<String, Object>() {{
            put("gender", "man");
            put("age", "18");
        }});

        DrawRes drawRes = lotteryActivityBooth.doQuantificationDraw(req);
        logger.info("请求参数：{}", JSON.toJSONString(req));
        logger.info("测试结果：{}", JSON.toJSONString(drawRes));

    }

}

