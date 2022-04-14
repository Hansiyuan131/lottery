package com.yuanstack.lottery.application.process.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 抽奖请求
 * @author: hansiyuan
 * @date: 2022/4/14 3:46 PM
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DrawProcessReq {
    /**
     * 用户ID
     */
    private String uId;
    /**
     * 活动ID
     */
    private Long activityId;
}
