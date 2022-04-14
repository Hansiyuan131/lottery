package com.yuanstack.lottery.domain.activity.service.partake;

import com.yuanstack.lottery.domain.activity.model.req.PartakeReq;
import com.yuanstack.lottery.domain.activity.model.vo.ActivityBillVO;
import com.yuanstack.lottery.domain.activity.repository.ActivityRepository;

import javax.annotation.Resource;

/**
 * @description: 活动领取模操作，一些通用的数据服务
 * @author: hansiyuan
 * @date: 2022/4/14 2:14 PM
 */
public class ActivityPartakeSupport {
    @Resource
    protected ActivityRepository activityRepository;

    protected ActivityBillVO queryActivityBill(PartakeReq req){
        return activityRepository.queryActivityBill(req);
    }

}
