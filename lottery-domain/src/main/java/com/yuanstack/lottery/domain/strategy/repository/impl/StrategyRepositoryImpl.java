package com.yuanstack.lottery.domain.strategy.repository.impl;

import com.yuanstack.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.yuanstack.lottery.domain.strategy.repository.StrategyRepository;
import com.yuanstack.lottery.infrastructure.dao.AwardDao;
import com.yuanstack.lottery.infrastructure.dao.StrategyDao;
import com.yuanstack.lottery.infrastructure.dao.StrategyDetailDao;
import com.yuanstack.lottery.infrastructure.po.Award;
import com.yuanstack.lottery.infrastructure.po.Strategy;
import com.yuanstack.lottery.infrastructure.po.StrategyDetail;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hansiyu
 * @date 2022年04月12日 20:28
 */
@Component
public class StrategyRepositoryImpl implements StrategyRepository {
    @Resource
    private StrategyDao strategyDao;

    @Resource
    private StrategyDetailDao strategyDetailDao;

    @Resource
    private AwardDao awardDao;

    @Override
    public StrategyRich queryStrategyRich(Long strategyId) {
        Strategy strategy = strategyDao.queryStrategy(strategyId);
        List<StrategyDetail> strategyDetailList = strategyDetailDao.queryStrategyDetailList(strategyId);
        return new StrategyRich(strategyId, strategy, strategyDetailList);
    }

    @Override
    public Award queryAwardInfo(String awardId) {
        return awardDao.queryAwardInfo(awardId);
    }

    @Override
    public List<String> queryNoStockStrategyAwardList(Long strategyId) {
        return strategyDetailDao.queryNoStockStrategyAwardList(strategyId);
    }

    @Override
    public boolean deductStock(Long strategyId, String awardId) {
        StrategyDetail req = new StrategyDetail();
        req.setStrategyId(strategyId);
        req.setAwardId(awardId);
        int count = strategyDetailDao.deductStock(req);
        return count == 1;
    }
}
