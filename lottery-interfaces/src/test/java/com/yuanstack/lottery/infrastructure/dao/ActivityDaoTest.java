package com.yuanstack.lottery.infrastructure.dao;

import com.alibaba.fastjson.JSON;
import com.yuanstack.lottery.infrastructure.po.Activity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @description: ActivityMapperTest
 * @author: hansiyuan
 * @date: 2022/4/13 11:28 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class ActivityDaoTest {

    @Resource
    private ActivityDao activityDao;

    @Test
    public void test_insert() {
        Activity activity = new Activity();
        activity.setActivityId(100001L);
        activity.setActivityName("测试活动");
        activity.setActivityDesc("仅用于插入数据测试");
        activity.setBeginDateTime(new Date());
        activity.setEndDateTime(new Date());
        activity.setStockCount(100);
        activity.setTakeCount(10);
        activity.setState((byte) 0);
        activity.setCreator("hhhh");
        activityDao.insert(activity);
    }

    @Test
    public void test_select() {
        Activity activity = activityDao.queryActivityById(100001L);
        log.info("测试结果：{}", JSON.toJSONString(activity));
    }
}
