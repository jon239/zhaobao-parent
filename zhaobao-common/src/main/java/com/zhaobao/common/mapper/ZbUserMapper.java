package com.zhaobao.common.mapper;

import com.zhaobao.common.pojo.ZbUser;
import com.zhaobao.common.pojo.ZbUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ZbUserMapper {
    long countByExample(ZbUserExample example);

    int deleteByExample(ZbUserExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ZbUser record);

    int insertSelective(ZbUser record);

    List<ZbUser> selectByExample(ZbUserExample example);

    ZbUser selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ZbUser record, @Param("example") ZbUserExample example);

    int updateByExample(@Param("record") ZbUser record, @Param("example") ZbUserExample example);

    int updateByPrimaryKeySelective(ZbUser record);

    int updateByPrimaryKey(ZbUser record);
}