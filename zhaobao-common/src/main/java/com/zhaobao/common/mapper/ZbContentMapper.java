package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbContent;
import com.zhaobao.common.pojo.ZbContentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbContentMapper {
    long countByExample(ZbContentExample example);

    int deleteByExample(ZbContentExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbContent record);

    int insertSelective(ZbContent record);

    List<ZbContent> selectByExampleWithBLOBs(ZbContentExample example);

    List<ZbContent> selectByExample(ZbContentExample example);

    ZbContent selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbContent record, @Param("example") ZbContentExample example);

    int updateByExampleWithBLOBs(@Param("record") ZbContent record, @Param("example") ZbContentExample example);

    int updateByExample(@Param("record") ZbContent record, @Param("example") ZbContentExample example);

    int updateByPrimaryKeySelective(ZbContent record);

    int updateByPrimaryKeyWithBLOBs(ZbContent record);

    int updateByPrimaryKey(ZbContent record);
}