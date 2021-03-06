package com.yuanstack.lottery.infrastructure.repository;

import com.yuanstack.lottery.domain.strategy.model.aggregates.StrategyRich;
import com.yuanstack.lottery.domain.strategy.model.vo.AwardBriefVO;
import com.yuanstack.lottery.domain.strategy.model.vo.StrategyBriefVO;
import com.yuanstack.lottery.domain.strategy.model.vo.StrategyDetailBriefVO;
import com.yuanstack.lottery.domain.strategy.repository.StrategyRepository;
import com.yuanstack.lottery.infrastructure.dao.AwardDao;
import com.yuanstack.lottery.infrastructure.dao.StrategyDao;
import com.yuanstack.lottery.infrastructure.dao.StrategyDetailDao;
import com.yuanstack.lottery.infrastructure.po.Award;
import com.yuanstack.lottery.infrastructure.po.Strategy;
import com.yuanstack.lottery.infrastructure.po.StrategyDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 策略表仓储服务
 *
 * @author hansiyuan
 * @date 2022年04月13日 20:58
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

        StrategyBriefVO strategyBriefVO = new StrategyBriefVO();
        BeanUtils.copyProperties(strategy, strategyBriefVO);

        List<StrategyDetailBriefVO> strategyDetailBriefVOList = new ArrayList<>();
        for (StrategyDetail strategyDetail : strategyDetailList) {
            StrategyDetailBriefVO strategyDetailBriefVO = new StrategyDetailBriefVO();
            BeanUtils.copyProperties(strategyDetail, strategyDetailBriefVO);
            strategyDetailBriefVOList.add(strategyDetailBriefVO);
        }

        return new StrategyRich(strategyId, strategyBriefVO, strategyDetailBriefVOList);
    }

    @Override
    public AwardBriefVO queryAwardInfo(String awardId) {

        Award award = awardDao.queryAwardInfo(awardId);

        // 可以使用 BeanUtils.copyProperties(award, awardBriefVO)、或者基于ASM实现的Bean-Mapping，但在效率上最好的依旧是硬编码
        AwardBriefVO awardBriefVO = new AwardBriefVO();
        awardBriefVO.setAwardId(award.getAwardId());
        awardBriefVO.setAwardType(award.getAwardType());
        awardBriefVO.setAwardName(award.getAwardName());
        awardBriefVO.setAwardContent(award.getAwardContent());

        return awardBriefVO;
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

