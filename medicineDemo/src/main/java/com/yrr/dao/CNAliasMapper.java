package com.yrr.dao;

import com.yrr.bean.CNAlias;
import com.yrr.bean.CNAliasExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CNAliasMapper {
    long countByExample(CNAliasExample example);

    int deleteByExample(CNAliasExample example);

    int deleteByPrimaryKey(Integer cnAliasId);

    int insert(CNAlias record);

    int insertSelective(CNAlias record);

    List<CNAlias> selectByExample(CNAliasExample example);

    CNAlias selectByPrimaryKey(Integer cnAliasId);

    int updateByExampleSelective(@Param("record") CNAlias record, @Param("example") CNAliasExample example);

    int updateByExample(@Param("record") CNAlias record, @Param("example") CNAliasExample example);

    int updateByPrimaryKeySelective(CNAlias record);

    int updateByPrimaryKey(CNAlias record);
}