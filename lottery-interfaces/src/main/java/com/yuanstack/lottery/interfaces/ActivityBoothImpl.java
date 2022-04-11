package com.yuanstack.lottery.interfaces;

import com.yuanstack.lottery.common.constants.response.ResponseCode;
import com.yuanstack.lottery.common.model.Result;
import com.yuanstack.lottery.infrastructure.dao.ActivityDao;
import com.yuanstack.lottery.infrastructure.po.Activity;
import com.yuanstack.lottery.rpc.ActivityBooth;
import com.yuanstack.lottery.rpc.dto.ActivityDto;
import com.yuanstack.lottery.rpc.req.ActivityReq;
import com.yuanstack.lottery.rpc.res.ActivityRes;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author hansiyuan
 * @date 2022年04月11日 23:13
 */
@Service
public class ActivityBoothImpl implements ActivityBooth {
    @Resource
    private ActivityDao activityDao;

    @Override
    public ActivityRes queryActivityById(ActivityReq req) {

        Activity activity = activityDao.queryActivityById(req.getActivityId());

        ActivityDto activityDto = ActivityDto.builder()
                .activityId(activity.getActivityId())
                .activityName(activity.getActivityName())
                .activityDesc(activity.getActivityDesc())
                .beginDateTime(activity.getBeginDateTime())
                .endDateTime(activity.getEndDateTime())
                .stockCount(activity.getStockCount())
                .takeCount(activity.getTakeCount())
                .build();
        return new ActivityRes(new Result(ResponseCode.SUCCESS.getCode(), ResponseCode.SUCCESS.getInfo()), activityDto);
    }
}
