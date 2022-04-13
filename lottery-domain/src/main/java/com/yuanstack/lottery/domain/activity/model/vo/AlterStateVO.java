package com.yuanstack.lottery.domain.activity.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 变更活动状态对象
 *
 * @author hansiyuan
 * @date 2022年04月13日 20:48
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AlterStateVO {
    /**
     * 活动ID
     */
    private Long activityId;

    /**
     * 更新前状态
     */
    private Integer beforeState;

    /**
     * 更新后状态
     */
    private Integer afterState;
}
