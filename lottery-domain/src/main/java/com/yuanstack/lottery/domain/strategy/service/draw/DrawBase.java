package com.yuanstack.lottery.domain.strategy.service.draw;

import com.yuanstack.lottery.domain.strategy.model.vo.AwardRateInfo;
import com.yuanstack.lottery.domain.strategy.service.algorithm.DrawAlgorithm;
import com.yuanstack.lottery.infrastructure.po.StrategyDetail;

import java.util.ArrayList;
import java.util.List;

/**
 * @author hansiyuan
 * @date 2022年04月12日 20:43
 */
public class DrawBase extends DrawConfig {

    public void checkAndInitRateData(Long strategyId, Integer strategyMode, List<StrategyDetail> strategyDetailList) {
        if (1 != strategyMode) {
            return;
        }
        DrawAlgorithm drawAlgorithm = drawAlgorithmMap.get(strategyMode);

        boolean existRateTuple = drawAlgorithm.isExistRateTuple(strategyId);
        if (existRateTuple) {
            return;
        }

        List<AwardRateInfo> awardRateInfoList = new ArrayList<>(strategyDetailList.size());
        for (StrategyDetail strategyDetail : strategyDetailList) {
            awardRateInfoList.add(new AwardRateInfo(strategyDetail.getAwardId(), strategyDetail.getAwardRate()));
        }
        drawAlgorithm.initRateTuple(strategyId, awardRateInfoList);
    }

}