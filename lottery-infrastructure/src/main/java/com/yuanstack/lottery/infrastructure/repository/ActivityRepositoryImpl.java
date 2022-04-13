package com.yuanstack.lottery.infrastructure.repository;

import com.yuanstack.lottery.common.constants.activity.ActivityStateEnum;
import com.yuanstack.lottery.domain.activity.model.vo.*;
import com.yuanstack.lottery.domain.activity.repository.ActivityRepository;
import com.yuanstack.lottery.infrastructure.dao.ActivityDao;
import com.yuanstack.lottery.infrastructure.dao.AwardDao;
import com.yuanstack.lottery.infrastructure.dao.StrategyDao;
import com.yuanstack.lottery.infrastructure.dao.StrategyDetailDao;
import com.yuanstack.lottery.infrastructure.po.Activity;
import com.yuanstack.lottery.infrastructure.po.Award;
import com.yuanstack.lottery.infrastructure.po.Strategy;
import com.yuanstack.lottery.infrastructure.po.StrategyDetail;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author hansiyuan
 * @date 2022年04月13日 20:56
 */
@Component
public class ActivityRepositoryImpl implements ActivityRepository {

    @Resource
    private ActivityDao activityDao;
    @Resource
    private AwardDao awardDao;
    @Resource
    private StrategyDao strategyDao;
    @Resource
    private StrategyDetailDao strategyDetailDao;

    @Override
    public void addActivity(ActivityVO activity) {
        Activity req = new Activity();
        BeanUtils.copyProperties(activity, req);
        activityDao.insert(req);
    }

    @Override
    public void addAward(List<AwardVO> awardList) {
        List<Award> req = new ArrayList<>();
        for (AwardVO awardVO : awardList) {
            Award award = new Award();
            BeanUtils.copyProperties(awardVO, award);
            req.add(award);
        }
        awardDao.insertList(req);
    }

    @Override
    public void addStrategy(StrategyVO strategy) {
        Strategy req = new Strategy();
        BeanUtils.copyProperties(strategy, req);
        strategyDao.insert(req);
    }

    @Override
    public void addStrategyDetailList(List<StrategyDetailVO> strategyDetailList) {
        List<StrategyDetail> req = new ArrayList<>();
        for (StrategyDetailVO strategyDetailVO : strategyDetailList) {
            StrategyDetail strategyDetail = new StrategyDetail();
            BeanUtils.copyProperties(strategyDetailVO, strategyDetail);
            req.add(strategyDetail);
        }
        strategyDetailDao.insertList(req);
    }

    @Override
    public boolean alterStatus(Long activityId, Enum<ActivityStateEnum> beforeState, Enum<ActivityStateEnum> afterState) {
        AlterStateVO alterStateVO = new AlterStateVO(activityId,((ActivityStateEnum) beforeState).getCode(),((ActivityStateEnum) afterState).getCode());
        int count = activityDao.alterState(alterStateVO);
        return 1 == count;
    }

}
