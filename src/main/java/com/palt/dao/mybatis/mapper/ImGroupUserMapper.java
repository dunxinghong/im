package com.palt.dao.mybatis.mapper;

import com.palt.entity.ImGroupUser;
import com.palt.entity.ImGroupUserExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ImGroupUserMapper {
    long countByExample(ImGroupUserExample example);

    int deleteByExample(ImGroupUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ImGroupUser record);

    int insertSelective(ImGroupUser record);

    List<ImGroupUser> selectByExample(ImGroupUserExample example);

    ImGroupUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ImGroupUser record, @Param("example") ImGroupUserExample example);

    int updateByExample(@Param("record") ImGroupUser record, @Param("example") ImGroupUserExample example);

    int updateByPrimaryKeySelective(ImGroupUser record);

    int updateByPrimaryKey(ImGroupUser record);
}