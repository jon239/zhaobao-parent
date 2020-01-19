package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbItemBak;
import com.zhaobao.common.pojo.ZbItemBakExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbItemBakMapper {
    long countByExample(ZbItemBakExample example);

    int deleteByExample(ZbItemBakExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbItemBak record);

    int insertSelective(ZbItemBak record);

    List<ZbItemBak> selectByExample(ZbItemBakExample example);

    ZbItemBak selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbItemBak record, @Param("example") ZbItemBakExample example);

    int updateByExample(@Param("record") ZbItemBak record, @Param("example") ZbItemBakExample example);

    int updateByPrimaryKeySelective(ZbItemBak record);

    int updateByPrimaryKey(ZbItemBak record);
}