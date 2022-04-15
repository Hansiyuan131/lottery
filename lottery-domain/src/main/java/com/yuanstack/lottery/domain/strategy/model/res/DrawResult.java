package com.yuanstack.lottery.domain.strategy.model.res;

import com.yuanstack.lottery.common.constants.lottery.DrawStateEnum;
import com.yuanstack.lottery.domain.strategy.model.vo.DrawAwardVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author hansiyuan
 * @date 2022年04月12日 20:27
 */
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
public class DrawResult {

    /**
     * 用户ID
     */
    private String uId;

    /**
     * 策略ID
     */
    private Long strategyId;

    /**
     * 中奖状态：0未中奖、1已中奖、2兜底奖 DrawStateEnum
     */
    private Integer drawState = DrawStateEnum.FAIL.getCode();

    /**
     * 中奖奖品信息
     */
    private DrawAwardVO drawAwardVO;

    public DrawResult(String uId, Long strategyId, Integer drawState) {
        this.uId = uId;
        this.strategyId = strategyId;
        this.drawState = drawState;
    }
}
