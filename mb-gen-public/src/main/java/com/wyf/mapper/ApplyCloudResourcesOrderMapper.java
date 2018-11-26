package com.wyf.mapper;

import com.wyf.entity.ApplyCloudResourcesOrder;

public interface ApplyCloudResourcesOrderMapper {
    int deleteByPrimaryKey(String orderId);

    int insert(ApplyCloudResourcesOrder record);

    int insertSelective(ApplyCloudResourcesOrder record);

    ApplyCloudResourcesOrder selectByPrimaryKey(String orderId);

    int updateByPrimaryKeySelective(ApplyCloudResourcesOrder record);

    int updateByPrimaryKey(ApplyCloudResourcesOrder record);
}