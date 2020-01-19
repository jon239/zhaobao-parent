package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbItemDesc;
import com.zhaobao.common.pojo.ZbItemDescExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbItemDescMapper {
    long countByExample(ZbItemDescExample example);

    int deleteByExample(ZbItemDescExample example);

    int insert(ZbItemDesc record);

    int insertSelective(ZbItemDesc record);

    List<ZbItemDesc> selectByExampleWithBLOBs(ZbItemDescExample example);

    List<ZbItemDesc> selectByExample(ZbItemDescExample example);

    int updateByExampleSelective(@Param("record") ZbItemDesc record, @Param("example") ZbItemDescExample example);

    int updateByExampleWithBLOBs(@Param("record") ZbItemDesc record, @Param("example") ZbItemDescExample example);

    int updateByExample(@Param("record") ZbItemDesc record, @Param("example") ZbItemDescExample example);
}