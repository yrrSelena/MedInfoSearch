package com.yrr.dao;

import com.yrr.bean.MethodLC;
import com.yrr.bean.MethodLCExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MethodLCMapper {
    long countByExample(MethodLCExample example);

    int deleteByExample(MethodLCExample example);

    int deleteByPrimaryKey(Integer medId);

    int insert(MethodLC record);

    int insertSelective(MethodLC record);

    List<MethodLC> selectByExample(MethodLCExample example);

    MethodLC selectByPrimaryKey(Integer medId);

    int updateByExampleSelective(@Param("record") MethodLC record, @Param("example") MethodLCExample example);

    int updateByExample(@Param("record") MethodLC record, @Param("example") MethodLCExample example);

    int updateByPrimaryKeySelective(MethodLC record);

    int updateByPrimaryKey(MethodLC record);
}