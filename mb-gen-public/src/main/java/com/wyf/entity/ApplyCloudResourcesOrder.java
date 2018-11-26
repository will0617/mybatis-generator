package com.wyf.entity;

import java.math.BigDecimal;
import java.util.Date;

public class ApplyCloudResourcesOrder {
    private String orderId;

    private String userId;

    private String clientId;

    private String resourceName;

    private String productType;

    private String orderType;

    private Date applyTime;

    private String orderOften;

    private BigDecimal configurationCost;

    private String applyCause;

    private String operateSystem;

    private Integer resourceCount;

    private Integer resourceCpu;

    private Integer resourceMemory;

    private String dataSet;

    private Integer networkCount;

    private Integer networkRateType;

    private Integer bandwidth;

    private String bussinessId;

    private Date expireTime;

    private String orderApproveStatus;

    private String approveAdmin;

    private Date approveTime;

    private Date deployTime;

    private String approveOpinion;

    private String delFlag;

    private Date updateTime;

    private String sendStatus;

    private String adminFlag;

    private String virtualType;

    private String serviceId;

    private String servicePublishId;

    private String delOrderVmUserName;

    private String delOrderVmApplytime;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId == null ? null : clientId.trim();
    }

    public String getResourceName() {
        return resourceName;
    }

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName == null ? null : resourceName.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getOrderOften() {
        return orderOften;
    }

    public void setOrderOften(String orderOften) {
        this.orderOften = orderOften == null ? null : orderOften.trim();
    }

    public BigDecimal getConfigurationCost() {
        return configurationCost;
    }

    public void setConfigurationCost(BigDecimal configurationCost) {
        this.configurationCost = configurationCost;
    }

    public String getApplyCause() {
        return applyCause;
    }

    public void setApplyCause(String applyCause) {
        this.applyCause = applyCause == null ? null : applyCause.trim();
    }

    public String getOperateSystem() {
        return operateSystem;
    }

    public void setOperateSystem(String operateSystem) {
        this.operateSystem = operateSystem == null ? null : operateSystem.trim();
    }

    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    public Integer getResourceCpu() {
        return resourceCpu;
    }

    public void setResourceCpu(Integer resourceCpu) {
        this.resourceCpu = resourceCpu;
    }

    public Integer getResourceMemory() {
        return resourceMemory;
    }

    public void setResourceMemory(Integer resourceMemory) {
        this.resourceMemory = resourceMemory;
    }

    public String getDataSet() {
        return dataSet;
    }

    public void setDataSet(String dataSet) {
        this.dataSet = dataSet == null ? null : dataSet.trim();
    }

    public Integer getNetworkCount() {
        return networkCount;
    }

    public void setNetworkCount(Integer networkCount) {
        this.networkCount = networkCount;
    }

    public Integer getNetworkRateType() {
        return networkRateType;
    }

    public void setNetworkRateType(Integer networkRateType) {
        this.networkRateType = networkRateType;
    }

    public Integer getBandwidth() {
        return bandwidth;
    }

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    public String getBussinessId() {
        return bussinessId;
    }

    public void setBussinessId(String bussinessId) {
        this.bussinessId = bussinessId == null ? null : bussinessId.trim();
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getOrderApproveStatus() {
        return orderApproveStatus;
    }

    public void setOrderApproveStatus(String orderApproveStatus) {
        this.orderApproveStatus = orderApproveStatus == null ? null : orderApproveStatus.trim();
    }

    public String getApproveAdmin() {
        return approveAdmin;
    }

    public void setApproveAdmin(String approveAdmin) {
        this.approveAdmin = approveAdmin == null ? null : approveAdmin.trim();
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public Date getDeployTime() {
        return deployTime;
    }

    public void setDeployTime(Date deployTime) {
        this.deployTime = deployTime;
    }

    public String getApproveOpinion() {
        return approveOpinion;
    }

    public void setApproveOpinion(String approveOpinion) {
        this.approveOpinion = approveOpinion == null ? null : approveOpinion.trim();
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag == null ? null : delFlag.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getSendStatus() {
        return sendStatus;
    }

    public void setSendStatus(String sendStatus) {
        this.sendStatus = sendStatus == null ? null : sendStatus.trim();
    }

    public String getAdminFlag() {
        return adminFlag;
    }

    public void setAdminFlag(String adminFlag) {
        this.adminFlag = adminFlag == null ? null : adminFlag.trim();
    }

    public String getVirtualType() {
        return virtualType;
    }

    public void setVirtualType(String virtualType) {
        this.virtualType = virtualType == null ? null : virtualType.trim();
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId == null ? null : serviceId.trim();
    }

    public String getServicePublishId() {
        return servicePublishId;
    }

    public void setServicePublishId(String servicePublishId) {
        this.servicePublishId = servicePublishId == null ? null : servicePublishId.trim();
    }

    public String getDelOrderVmUserName() {
        return delOrderVmUserName;
    }

    public void setDelOrderVmUserName(String delOrderVmUserName) {
        this.delOrderVmUserName = delOrderVmUserName == null ? null : delOrderVmUserName.trim();
    }

    public String getDelOrderVmApplytime() {
        return delOrderVmApplytime;
    }

    public void setDelOrderVmApplytime(String delOrderVmApplytime) {
        this.delOrderVmApplytime = delOrderVmApplytime == null ? null : delOrderVmApplytime.trim();
    }
}