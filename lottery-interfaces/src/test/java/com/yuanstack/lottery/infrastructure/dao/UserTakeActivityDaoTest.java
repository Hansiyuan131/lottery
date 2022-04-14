package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.lottery.infrastructure.po.UserTakeActivity;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Date;

/**
 * @description: 测试用户领取活动表
 * @author: hansiyuan
 * @date: 2022/4/14 11:19 AM
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class UserTakeActivityDaoTest {
    @Resource
    private UserTakeActivityDao userTakeActivityDao;

    @Test
    public void test_insert() {
        UserTakeActivity userTakeActivity = new UserTakeActivity();
        userTakeActivity.setuId("Ukdli109op811d1"); // 1库：Ukdli109op89oi 2库：Ukdli109op811d
        userTakeActivity.setTakeId(121019889410L);
        userTakeActivity.setActivityId(100001L);
        userTakeActivity.setActivityName("测试活动");
        userTakeActivity.setTakeDate(new Date());
        userTakeActivity.setTakeCount(10);
        userTakeActivity.setUuid("Uhdgkw766120d");
        userTakeActivityDao.insert(userTakeActivity);
    }
}
