package com.wyf.examples.dao;


import com.wyf.examples.model.MybatisGenTest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MybatisGenTestMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MybatisGenTest record);

    int insertSelective(MybatisGenTest record);

    MybatisGenTest selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MybatisGenTest record);

    int updateByPrimaryKey(MybatisGenTest record);
}