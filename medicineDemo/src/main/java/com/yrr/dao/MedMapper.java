package com.yrr.dao;

import com.yrr.bean.Med;
import com.yrr.bean.MedExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MedMapper {
    long countByExample(MedExample example);

    int deleteByExample(MedExample example);

    int deleteByPrimaryKey(Integer medId);

    int insert(Med record);

    int insertSelective(Med record);

    List<Med> selectByExample(MedExample example);

    Med selectByPrimaryKey(Integer medId);

    int updateByExampleSelective(@Param("record") Med record, @Param("example") MedExample example);

    int updateByExample(@Param("record") Med record, @Param("example") MedExample example);

    int updateByPrimaryKeySelective(Med record);

    int updateByPrimaryKey(Med record);
}