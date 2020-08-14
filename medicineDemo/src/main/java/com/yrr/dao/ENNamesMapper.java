package com.yrr.dao;

import com.yrr.bean.ENNames;
import com.yrr.bean.ENNamesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ENNamesMapper {
    long countByExample(ENNamesExample example);

    int deleteByExample(ENNamesExample example);

    int deleteByPrimaryKey(Integer enNamesId);

    int insert(ENNames record);

    int insertSelective(ENNames record);

    List<ENNames> selectByExample(ENNamesExample example);

    ENNames selectByPrimaryKey(Integer enNamesId);

    int updateByExampleSelective(@Param("record") ENNames record, @Param("example") ENNamesExample example);

    int updateByExample(@Param("record") ENNames record, @Param("example") ENNamesExample example);

    int updateByPrimaryKeySelective(ENNames record);

    int updateByPrimaryKey(ENNames record);
}