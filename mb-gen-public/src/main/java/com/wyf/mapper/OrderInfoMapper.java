package com.wyf.mapper;

import com.wyf.entity.OrderInfo;

public interface OrderInfoMapper {
    int deleteByPrimaryKey(String id);

    int insert(OrderInfo record);

    int insertSelective(OrderInfo record);

    OrderInfo selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(OrderInfo record);

    int updateByPrimaryKeyWithBLOBs(OrderInfo record);

    int updateByPrimaryKey(OrderInfo record);
}