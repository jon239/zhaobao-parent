package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbOrderShipping;
import com.zhaobao.common.pojo.ZbOrderShippingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbOrderShippingMapper {
    long countByExample(ZbOrderShippingExample example);

    int deleteByExample(ZbOrderShippingExample example);

    int deleteByPrimaryKey(String orderId);

    int insert(ZbOrderShipping record);

    int insertSelective(ZbOrderShipping record);

    List<ZbOrderShipping> selectByExample(ZbOrderShippingExample example);

    ZbOrderShipping selectByPrimaryKey(String orderId);

    int updateByExampleSelective(@Param("record") ZbOrderShipping record, @Param("example") ZbOrderShippingExample example);

    int updateByExample(@Param("record") ZbOrderShipping record, @Param("example") ZbOrderShippingExample example);

    int updateByPrimaryKeySelective(ZbOrderShipping record);

    int updateByPrimaryKey(ZbOrderShipping record);
}