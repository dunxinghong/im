package com.palt.dao.mybatis.mapper;

import com.palt.entity.ImUser;
import com.palt.entity.ImUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImUserMapper {
    long countByExample(ImUserExample example);

    int deleteByExample(ImUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImUser record);

    int insertSelective(ImUser record);

    List<ImUser> selectByExample(ImUserExample example);

    ImUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImUser record, @Param("example") ImUserExample example);

    int updateByExample(@Param("record") ImUser record, @Param("example") ImUserExample example);

    int updateByPrimaryKeySelective(ImUser record);

    int updateByPrimaryKey(ImUser record);
}