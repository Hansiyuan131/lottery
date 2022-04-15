package com.yuanstack.lottery.assembler;

import com.yuanstack.lottery.domain.strategy.model.vo.DrawAwardVO;
import com.yuanstack.lottery.rpc.dto.AwardDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

/**
 * @description: 对象转换配置
 * @author: hansiyuan
 * @date: 2022/4/15 10:33 AM
 */
@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface AwardMapping extends StructMapping<DrawAwardVO, AwardDTO> {

    @Mapping(target = "userId", source = "UId")
    @Override
    AwardDTO sourceToTarget(DrawAwardVO var1);

    @Override
    DrawAwardVO targetToSource(AwardDTO var1);

}
