package com.yuanstack.lottery.rpc.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @description: 抽奖请求
 * @author: hansiyuan
 * @date: 2022/4/15 10:43 AM
 */
@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class DrawReq implements Serializable {

    /**
     * 用户ID
     */
    private String uId;
    /**
     * 活动ID
     */
    private Long activityId;
}

