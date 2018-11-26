package com.wyf.entity;

import java.util.Date;

public class OrderInfo {
    private String id;

    private String orderId;

    private String orderType;

    private String productType;

    private String applyUserId;

    private String applyUserName;

    private Byte tenancy;

    private Boolean tenancyUnit;

    private Double orderFee;

    private Date applyDate;

    private String businessId;

    private Boolean orderStatus;

    private Date approveTime;

    private Date effectiveTime;

    private Date expireTime;

    private String applyReason;

    private Boolean deployAble;

    private String undeployReason;

    private Date chargebackTime;

    private Date startTime;

    private Date failTime;

    private Date undeployTime;

    private Date createTime;

    private Date successTime;

    private String delVmResourceId;

    private String delVmId;

    private String applyClientId;

    private String applyClientName;

    private String serviceName;

    private String delVmName;

    private Date updateTime;

    private String createInfo;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId == null ? null : orderId.trim();
    }

    public String getOrderType() {
        return orderType;
    }

    public void setOrderType(String orderType) {
        this.orderType = orderType == null ? null : orderType.trim();
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType == null ? null : productType.trim();
    }

    public String getApplyUserId() {
        return applyUserId;
    }

    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId == null ? null : applyUserId.trim();
    }

    public String getApplyUserName() {
        return applyUserName;
    }

    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName == null ? null : applyUserName.trim();
    }

    public Byte getTenancy() {
        return tenancy;
    }

    public void setTenancy(Byte tenancy) {
        this.tenancy = tenancy;
    }

    public Boolean getTenancyUnit() {
        return tenancyUnit;
    }

    public void setTenancyUnit(Boolean tenancyUnit) {
        this.tenancyUnit = tenancyUnit;
    }

    public Double getOrderFee() {
        return orderFee;
    }

    public void setOrderFee(Double orderFee) {
        this.orderFee = orderFee;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId == null ? null : businessId.trim();
    }

    public Boolean getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getApproveTime() {
        return approveTime;
    }

    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    public Date getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public Date getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    public String getApplyReason() {
        return applyReason;
    }

    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason == null ? null : applyReason.trim();
    }

    public Boolean getDeployAble() {
        return deployAble;
    }

    public void setDeployAble(Boolean deployAble) {
        this.deployAble = deployAble;
    }

    public String getUndeployReason() {
        return undeployReason;
    }

    public void setUndeployReason(String undeployReason) {
        this.undeployReason = undeployReason == null ? null : undeployReason.trim();
    }

    public Date getChargebackTime() {
        return chargebackTime;
    }

    public void setChargebackTime(Date chargebackTime) {
        this.chargebackTime = chargebackTime;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getFailTime() {
        return failTime;
    }

    public void setFailTime(Date failTime) {
        this.failTime = failTime;
    }

    public Date getUndeployTime() {
        return undeployTime;
    }

    public void setUndeployTime(Date undeployTime) {
        this.undeployTime = undeployTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getSuccessTime() {
        return successTime;
    }

    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    public String getDelVmResourceId() {
        return delVmResourceId;
    }

    public void setDelVmResourceId(String delVmResourceId) {
        this.delVmResourceId = delVmResourceId == null ? null : delVmResourceId.trim();
    }

    public String getDelVmId() {
        return delVmId;
    }

    public void setDelVmId(String delVmId) {
        this.delVmId = delVmId == null ? null : delVmId.trim();
    }

    public String getApplyClientId() {
        return applyClientId;
    }

    public void setApplyClientId(String applyClientId) {
        this.applyClientId = applyClientId == null ? null : applyClientId.trim();
    }

    public String getApplyClientName() {
        return applyClientName;
    }

    public void setApplyClientName(String applyClientName) {
        this.applyClientName = applyClientName == null ? null : applyClientName.trim();
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName == null ? null : serviceName.trim();
    }

    public String getDelVmName() {
        return delVmName;
    }

    public void setDelVmName(String delVmName) {
        this.delVmName = delVmName == null ? null : delVmName.trim();
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getCreateInfo() {
        return createInfo;
    }

    public void setCreateInfo(String createInfo) {
        this.createInfo = createInfo == null ? null : createInfo.trim();
    }
}