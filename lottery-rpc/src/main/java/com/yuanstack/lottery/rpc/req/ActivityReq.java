package com.yuanstack.lottery.rpc.req;

import lombok.Data;

import java.io.Serializable;

/**
 * @author hansiyuan
 * @date 2022年04月11日 23:25
 */
@Data
public class ActivityReq implements Serializable {
    private Long activityId;
}
