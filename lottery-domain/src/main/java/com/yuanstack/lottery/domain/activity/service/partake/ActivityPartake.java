package com.yuanstack.lottery.domain.activity.service.partake;

import com.yuanstack.lottery.common.model.Result;
import com.yuanstack.lottery.domain.activity.model.req.PartakeReq;
import com.yuanstack.lottery.domain.activity.model.res.PartakeResult;
import com.yuanstack.lottery.domain.activity.model.vo.DrawOrderVO;

/**
 * 抽奖活动参与接口
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:24
 */
public interface ActivityPartake {

    /**
     * 参与活动
     * @param req 入参
     * @return    领取结果
     */
    PartakeResult doPartake(PartakeReq req);

    /**
     * 保存奖品单
     * @param drawOrder 奖品单
     * @return          保存结果
     */
    Result recordDrawOrder(DrawOrderVO drawOrder);
}
