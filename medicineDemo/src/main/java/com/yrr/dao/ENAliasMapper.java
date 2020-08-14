package com.yrr.dao;

import com.yrr.bean.ENAlias;
import com.yrr.bean.ENAliasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ENAliasMapper {
    long countByExample(ENAliasExample example);

    int deleteByExample(ENAliasExample example);

    int deleteByPrimaryKey(Integer enAliasId);

    int insert(ENAlias record);

    int insertSelective(ENAlias record);

    List<ENAlias> selectByExample(ENAliasExample example);

    ENAlias selectByPrimaryKey(Integer enAliasId);

    int updateByExampleSelective(@Param("record") ENAlias record, @Param("example") ENAliasExample example);

    int updateByExample(@Param("record") ENAlias record, @Param("example") ENAliasExample example);

    int updateByPrimaryKeySelective(ENAlias record);

    int updateByPrimaryKey(ENAlias record);
}