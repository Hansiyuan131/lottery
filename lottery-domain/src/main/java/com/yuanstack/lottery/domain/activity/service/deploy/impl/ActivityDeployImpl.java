package com.yuanstack.lottery.domain.activity.service.deploy.impl;

import com.alibaba.fastjson.JSON;
import com.yuanstack.lottery.domain.activity.model.aggregates.ActivityConfigRich;
import com.yuanstack.lottery.domain.activity.model.req.ActivityConfigReq;
import com.yuanstack.lottery.domain.activity.model.vo.ActivityVO;
import com.yuanstack.lottery.domain.activity.model.vo.AwardVO;
import com.yuanstack.lottery.domain.activity.model.vo.StrategyDetailVO;
import com.yuanstack.lottery.domain.activity.model.vo.StrategyVO;
import com.yuanstack.lottery.domain.activity.repository.ActivityRepository;
import com.yuanstack.lottery.domain.activity.service.deploy.ActivityDeploy;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import org.yaml.snakeyaml.constructor.DuplicateKeyException;

import javax.annotation.Resource;
import java.util.List;

/**
 * 部署活动配置服务
 *
 * @author hansiyuan
 * @date 2022年04月13日 21:18
 */
@Service
@Slf4j
public class ActivityDeployImpl implements ActivityDeploy {

    @Resource
    private ActivityRepository activityRepository;

    @Transactional(rollbackFor = Exception.class)
    @Override
    public void createActivity(ActivityConfigReq req) {
        log.info("创建活动配置开始，activityId：{}", req.getActivityId());
        ActivityConfigRich activityConfigRich = req.getActivityConfigRich();
        try {
            // 添加活动配置
            ActivityVO activity = activityConfigRich.getActivity();
            activityRepository.addActivity(activity);

            // 添加奖品配置
            List<AwardVO> awardList = activityConfigRich.getAwardList();
            activityRepository.addAward(awardList);

            // 添加策略配置
            StrategyVO strategy = activityConfigRich.getStrategy();
            activityRepository.addStrategy(strategy);

            // 添加策略明细配置
            List<StrategyDetailVO> strategyDetailList = activityConfigRich.getStrategy().getStrategyDetailList();
            activityRepository.addStrategyDetailList(strategyDetailList);

            log.info("创建活动配置完成，activityId：{}", req.getActivityId());
        } catch (DuplicateKeyException e) {
            log.error("创建活动配置失败，唯一索引冲突 activityId：{} reqJson：{}", req.getActivityId(), JSON.toJSONString(req), e);
            throw e;
        }
    }

    @Override
    public void updateActivity(ActivityConfigReq req) {
        // TODO: 非核心功能后续补充
    }

}

