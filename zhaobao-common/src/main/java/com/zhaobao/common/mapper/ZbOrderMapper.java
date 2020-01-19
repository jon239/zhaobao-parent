package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbOrder;
import com.zhaobao.common.pojo.ZbOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbOrderMapper {
    long countByExample(ZbOrderExample example);

    int deleteByExample(ZbOrderExample example);

    int insert(ZbOrder record);

    int insertSelective(ZbOrder record);

    List<ZbOrder> selectByExample(ZbOrderExample example);

    int updateByExampleSelective(@Param("record") ZbOrder record, @Param("example") ZbOrderExample example);

    int updateByExample(@Param("record") ZbOrder record, @Param("example") ZbOrderExample example);
}