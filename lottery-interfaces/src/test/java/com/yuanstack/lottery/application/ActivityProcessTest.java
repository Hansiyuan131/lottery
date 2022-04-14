package com.yuanstack.lottery.application;

import com.alibaba.fastjson.JSON;
import com.yuanstack.lottery.application.process.ActivityProcess;
import com.yuanstack.lottery.application.process.req.DrawProcessReq;
import com.yuanstack.lottery.application.process.res.DrawProcessResult;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @description: 抽奖流程测试
 * @author: hansiyuan
 * @date: 2022/4/14 4:03 PM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ActivityProcessTest {

    @Resource
    private ActivityProcess activityProcess;

    @Test
    public void test_doDrawProcess() {
        DrawProcessReq req = new DrawProcessReq();
        req.setUId("yuanstack");
        req.setActivityId(100001L);
        DrawProcessResult drawProcessResult = activityProcess.doDrawProcess(req);

        log.info("请求入参：{}", JSON.toJSONString(req));
        log.info("测试结果：{}", JSON.toJSONString(drawProcessResult));
    }

}

