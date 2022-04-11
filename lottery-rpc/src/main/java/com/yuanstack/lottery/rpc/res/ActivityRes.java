package com.yuanstack.lottery.rpc.res;

import com.yuanstack.lottery.common.model.Result;
import com.yuanstack.lottery.rpc.dto.ActivityDto;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @author hansiyuan
 * @date 2022年04月11日 23:24
 */
@Data
@AllArgsConstructor
public class ActivityRes implements Serializable {
    private Result result;
    private ActivityDto activity;
}
