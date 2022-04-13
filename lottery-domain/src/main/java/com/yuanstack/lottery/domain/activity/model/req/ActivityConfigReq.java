package com.yuanstack.lottery.domain.activity.model.req;

import com.yuanstack.lottery.domain.activity.model.aggregates.ActivityConfigRich;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 活动配置请求对象
 *
 * @author hansiyuan
 * @date 2022年04月13日 20:46
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class ActivityConfigReq {
    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 活动配置信息
     */
    private ActivityConfigRich activityConfigRich;
}
