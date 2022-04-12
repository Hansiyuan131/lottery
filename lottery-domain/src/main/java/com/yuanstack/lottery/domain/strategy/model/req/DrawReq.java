package com.yuanstack.lottery.domain.strategy.model.req;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hansiyuan
 * @date 2022年04月12日 20:26
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DrawReq {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 策略ID
     */
    private Long strategyId;
}
