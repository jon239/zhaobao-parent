package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbCart;
import com.zhaobao.common.pojo.ZbCartExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbCartMapper {
    long countByExample(ZbCartExample example);

    int deleteByExample(ZbCartExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbCart record);

    int insertSelective(ZbCart record);

    List<ZbCart> selectByExample(ZbCartExample example);

    ZbCart selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbCart record, @Param("example") ZbCartExample example);

    int updateByExample(@Param("record") ZbCart record, @Param("example") ZbCartExample example);

    int updateByPrimaryKeySelective(ZbCart record);

    int updateByPrimaryKey(ZbCart record);
}