package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbItemCat;
import com.zhaobao.common.pojo.ZbItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbItemCatMapper {
    long countByExample(ZbItemCatExample example);

    int deleteByExample(ZbItemCatExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbItemCat record);

    int insertSelective(ZbItemCat record);

    List<ZbItemCat> selectByExample(ZbItemCatExample example);

    ZbItemCat selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbItemCat record, @Param("example") ZbItemCatExample example);

    int updateByExample(@Param("record") ZbItemCat record, @Param("example") ZbItemCatExample example);

    int updateByPrimaryKeySelective(ZbItemCat record);

    int updateByPrimaryKey(ZbItemCat record);
}