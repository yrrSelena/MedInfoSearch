package com.yrr.dao;

import com.yrr.bean.MethodSERS;
import com.yrr.bean.MethodSERSExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MethodSERSMapper {
    long countByExample(MethodSERSExample example);

    int deleteByExample(MethodSERSExample example);

    int deleteByPrimaryKey(Integer medId);

    int insert(MethodSERS record);

    int insertSelective(MethodSERS record);

    List<MethodSERS> selectByExample(MethodSERSExample example);

    MethodSERS selectByPrimaryKey(Integer medId);

    int updateByExampleSelective(@Param("record") MethodSERS record, @Param("example") MethodSERSExample example);

    int updateByExample(@Param("record") MethodSERS record, @Param("example") MethodSERSExample example);

    int updateByPrimaryKeySelective(MethodSERS record);

    int updateByPrimaryKey(MethodSERS record);
}