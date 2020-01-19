package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbItemParam;
import com.zhaobao.common.pojo.ZbItemParamExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbItemParamMapper {
    long countByExample(ZbItemParamExample example);

    int deleteByExample(ZbItemParamExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbItemParam record);

    int insertSelective(ZbItemParam record);

    List<ZbItemParam> selectByExampleWithBLOBs(ZbItemParamExample example);

    List<ZbItemParam> selectByExample(ZbItemParamExample example);

    ZbItemParam selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbItemParam record, @Param("example") ZbItemParamExample example);

    int updateByExampleWithBLOBs(@Param("record") ZbItemParam record, @Param("example") ZbItemParamExample example);

    int updateByExample(@Param("record") ZbItemParam record, @Param("example") ZbItemParamExample example);

    int updateByPrimaryKeySelective(ZbItemParam record);

    int updateByPrimaryKeyWithBLOBs(ZbItemParam record);

    int updateByPrimaryKey(ZbItemParam record);
}