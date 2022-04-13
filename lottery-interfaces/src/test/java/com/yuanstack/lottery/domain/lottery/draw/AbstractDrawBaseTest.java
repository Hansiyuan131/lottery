package com.yuanstack.lottery.domain.lottery.draw;

import com.yuanstack.lottery.domain.strategy.model.req.DrawReq;
import com.yuanstack.lottery.domain.strategy.service.draw.DrawExec;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

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

    @Test
    public void test_drawExec() {
        drawExec.doDrawExec(new DrawReq("小傅哥", 10001L));
        drawExec.doDrawExec(new DrawReq("小佳佳", 10001L));
        drawExec.doDrawExec(new DrawReq("小蜗牛", 10001L));
        drawExec.doDrawExec(new DrawReq("八杯水", 10001L));
    }
}

