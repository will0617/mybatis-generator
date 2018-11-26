package com.wyf.mapper;

import com.wyf.entity.MybatisGenTest;

public interface MybatisGenTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MybatisGenTest record);

    int insertSelective(MybatisGenTest record);

    MybatisGenTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MybatisGenTest record);

    int updateByPrimaryKey(MybatisGenTest record);
}