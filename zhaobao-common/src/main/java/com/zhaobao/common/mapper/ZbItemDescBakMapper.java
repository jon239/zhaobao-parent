package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbItemDescBak;
import com.zhaobao.common.pojo.ZbItemDescBakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbItemDescBakMapper {
    long countByExample(ZbItemDescBakExample example);

    int deleteByExample(ZbItemDescBakExample example);

    int insert(ZbItemDescBak record);

    int insertSelective(ZbItemDescBak record);

    List<ZbItemDescBak> selectByExampleWithBLOBs(ZbItemDescBakExample example);

    List<ZbItemDescBak> selectByExample(ZbItemDescBakExample example);

    int updateByExampleSelective(@Param("record") ZbItemDescBak record, @Param("example") ZbItemDescBakExample example);

    int updateByExampleWithBLOBs(@Param("record") ZbItemDescBak record, @Param("example") ZbItemDescBakExample example);

    int updateByExample(@Param("record") ZbItemDescBak record, @Param("example") ZbItemDescBakExample example);
}