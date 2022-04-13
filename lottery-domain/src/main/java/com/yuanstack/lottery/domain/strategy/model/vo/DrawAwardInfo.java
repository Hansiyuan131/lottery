package com.yuanstack.lottery.domain.strategy.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 中奖奖品信息
 * @author: hansiyuan
 * @date: 2022/4/13 10:24 AM
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DrawAwardInfo {

    /**
     * 奖品ID
     */
    private String awardId;

    /**
     * 奖品类型（1:文字描述、2:兑换码、3:优惠券、4:实物奖品）
     */
    private Integer awardType;

    /**
     * 奖品名称
     */
    private String awardName;

    /**
     * 奖品内容「描述、奖品码、sku」
     */
    private String awardContent;
}
