package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbOrderItem;
import com.zhaobao.common.pojo.ZbOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbOrderItemMapper {
    long countByExample(ZbOrderItemExample example);

    int deleteByExample(ZbOrderItemExample example);

    int insert(ZbOrderItem record);

    int insertSelective(ZbOrderItem record);

    List<ZbOrderItem> selectByExample(ZbOrderItemExample example);

    int updateByExampleSelective(@Param("record") ZbOrderItem record, @Param("example") ZbOrderItemExample example);

    int updateByExample(@Param("record") ZbOrderItem record, @Param("example") ZbOrderItemExample example);
}