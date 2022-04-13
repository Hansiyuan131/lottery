package com.yuanstack.lottery.infrastructure.dao;

import com.yuanstack.lottery.domain.activity.model.vo.AlterStateVO;
import com.yuanstack.lottery.infrastructure.po.Activity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 活动基础信息表DAO
 *
 * @author hansiyuan
 * @date 2022年04月11日 23:10
 */
@Mapper
public interface ActivityDao {

    /**
     * 插入数据
     *
     * @param req 入参
     */
    void insert(Activity req);

    /**
     * 根据活动号查询活动信息
     *
     * @param activityId 活动号
     * @return 活动信息
     */
    Activity queryActivityById(Long activityId);

    /**
     * 变更活动状态
     *
     * @param alterStateVO  [activityId、beforeState、afterState]
     * @return 更新数量
     */
    int alterState(AlterStateVO alterStateVO);

}