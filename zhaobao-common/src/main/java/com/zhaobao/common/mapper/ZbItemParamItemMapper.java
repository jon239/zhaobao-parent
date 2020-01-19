package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbItemParamItem;
import com.zhaobao.common.pojo.ZbItemParamItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbItemParamItemMapper {
    long countByExample(ZbItemParamItemExample example);

    int deleteByExample(ZbItemParamItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbItemParamItem record);

    int insertSelective(ZbItemParamItem record);

    List<ZbItemParamItem> selectByExampleWithBLOBs(ZbItemParamItemExample example);

    List<ZbItemParamItem> selectByExample(ZbItemParamItemExample example);

    ZbItemParamItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbItemParamItem record, @Param("example") ZbItemParamItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ZbItemParamItem record, @Param("example") ZbItemParamItemExample example);

    int updateByExample(@Param("record") ZbItemParamItem record, @Param("example") ZbItemParamItemExample example);

    int updateByPrimaryKeySelective(ZbItemParamItem record);

    int updateByPrimaryKeyWithBLOBs(ZbItemParamItem record);

    int updateByPrimaryKey(ZbItemParamItem record);
}