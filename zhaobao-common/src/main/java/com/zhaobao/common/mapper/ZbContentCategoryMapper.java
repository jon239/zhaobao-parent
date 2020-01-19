package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbContentCategory;
import com.zhaobao.common.pojo.ZbContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbContentCategoryMapper {
    long countByExample(ZbContentCategoryExample example);

    int deleteByExample(ZbContentCategoryExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbContentCategory record);

    int insertSelective(ZbContentCategory record);

    List<ZbContentCategory> selectByExample(ZbContentCategoryExample example);

    ZbContentCategory selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbContentCategory record, @Param("example") ZbContentCategoryExample example);

    int updateByExample(@Param("record") ZbContentCategory record, @Param("example") ZbContentCategoryExample example);

    int updateByPrimaryKeySelective(ZbContentCategory record);

    int updateByPrimaryKey(ZbContentCategory record);
}