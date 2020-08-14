package com.yrr.dao;

import com.yrr.bean.Formula;
import com.yrr.bean.FormulaExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FormulaMapper {
    long countByExample(FormulaExample example);

    int deleteByExample(FormulaExample example);

    int deleteByPrimaryKey(Integer formulaId);

    int insert(Formula record);

    int insertSelective(Formula record);

    List<Formula> selectByExample(FormulaExample example);

    Formula selectByPrimaryKey(Integer formulaId);

    int updateByExampleSelective(@Param("record") Formula record, @Param("example") FormulaExample example);

    int updateByExample(@Param("record") Formula record, @Param("example") FormulaExample example);

    int updateByPrimaryKeySelective(Formula record);

    int updateByPrimaryKey(Formula record);
}