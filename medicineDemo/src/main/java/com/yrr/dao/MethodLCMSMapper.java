package com.yrr.dao;

import com.yrr.bean.MethodLCMS;
import com.yrr.bean.MethodLCMSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MethodLCMSMapper {
    long countByExample(MethodLCMSExample example);

    int deleteByExample(MethodLCMSExample example);

    int deleteByPrimaryKey(Integer medId);

    int insert(MethodLCMS record);

    int insertSelective(MethodLCMS record);

    List<MethodLCMS> selectByExample(MethodLCMSExample example);

    MethodLCMS selectByPrimaryKey(Integer medId);

    int updateByExampleSelective(@Param("record") MethodLCMS record, @Param("example") MethodLCMSExample example);

    int updateByExample(@Param("record") MethodLCMS record, @Param("example") MethodLCMSExample example);

    int updateByPrimaryKeySelective(MethodLCMS record);

    int updateByPrimaryKey(MethodLCMS record);
}