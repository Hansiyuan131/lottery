package com.yuanstack.lottery.domain.activity.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 奖品信息配置
 *
 * @author hansiyuan
 * @date 2022年04月13日 20:48
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class AwardVO {
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
