package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbItem;
import com.zhaobao.common.pojo.ZbItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbItemMapper {
    long countByExample(ZbItemExample example);

    int deleteByExample(ZbItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbItem record);

    int insertSelective(ZbItem record);

    List<ZbItem> selectByExample(ZbItemExample example);

    ZbItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbItem record, @Param("example") ZbItemExample example);

    int updateByExample(@Param("record") ZbItem record, @Param("example") ZbItemExample example);

    int updateByPrimaryKeySelective(ZbItem record);

    int updateByPrimaryKey(ZbItem record);
}