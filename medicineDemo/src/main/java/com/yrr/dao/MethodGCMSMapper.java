package com.yrr.dao;

import com.yrr.bean.MethodGCMS;
import com.yrr.bean.MethodGCMSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MethodGCMSMapper {
    long countByExample(MethodGCMSExample example);

    int deleteByExample(MethodGCMSExample example);

    int deleteByPrimaryKey(Integer medId);

    int insert(MethodGCMS record);

    int insertSelective(MethodGCMS record);

    List<MethodGCMS> selectByExample(MethodGCMSExample example);

    MethodGCMS selectByPrimaryKey(Integer medId);

    int updateByExampleSelective(@Param("record") MethodGCMS record, @Param("example") MethodGCMSExample example);

    int updateByExample(@Param("record") MethodGCMS record, @Param("example") MethodGCMSExample example);

    int updateByPrimaryKeySelective(MethodGCMS record);

    int updateByPrimaryKey(MethodGCMS record);
}