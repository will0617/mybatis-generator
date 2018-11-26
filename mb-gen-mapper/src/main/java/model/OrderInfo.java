package model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`order_info`")
public class OrderInfo {
    @Id
    @Column(name = "`id`")
    private String id;

    /**
     * 订单id
     */
    @Column(name = "`order_id`")
    private String orderId;

    /**
     * 订单类型
     */
    @Column(name = "`order_type`")
    private String orderType;

    /**
     * 产品类型
     */
    @Column(name = "`product_type`")
    private String productType;

    /**
     * 申请人id
     */
    @Column(name = "`apply_user_id`")
    private String applyUserId;

    /**
     * 申请人名称
     */
    @Column(name = "`apply_user_name`")
    private String applyUserName;

    /**
     * 租期
     */
    @Column(name = "`tenancy`")
    private Byte tenancy;

    /**
     * 租期单位：1月，2年
     */
    @Column(name = "`tenancy_unit`")
    private Boolean tenancyUnit;

    /**
     * 费用
     */
    @Column(name = "`order_fee`")
    private Double orderFee;

    /**
     * 申请时间
     */
    @Column(name = "`apply_date`")
    private Date applyDate;

    /**
     * 关联的业务id
     */
    @Column(name = "`business_id`")
    private String businessId;

    /**
     * 订单的创建状态：1.待部署，2.部署中，3.部署成功, 4. 部署失败, 5. 已竣工, 6. 无法部署, 7. 已退单
     */
    @Column(name = "`order_status`")
    private Boolean orderStatus;

    /**
     * 订单的审批时间
     */
    @Column(name = "`approve_time`")
    private Date approveTime;

    /**
     * 订单下的虚拟机的生效时间
     */
    @Column(name = "`effective_time`")
    private Date effectiveTime;

    /**
     * 订单下的虚拟机的过期时间
     */
    @Column(name = "`expire_time`")
    private Date expireTime;

    @Column(name = "`apply_reason`")
    private String applyReason;

    @Column(name = "`deploy_able`")
    private Boolean deployAble;

    @Column(name = "`undeploy_reason`")
    private String undeployReason;

    /**
     * 退单的时间
     */
    @Column(name = "`chargeback_time`")
    private Date chargebackTime;

    /**
     * 订单部署的时间
     */
    @Column(name = "`start_time`")
    private Date startTime;

    /**
     * 订单部署失败的时间
     */
    @Column(name = "`fail_time`")
    private Date failTime;

    /**
     * 订单不可部署的时间
     */
    @Column(name = "`undeploy_time`")
    private Date undeployTime;

    /**
     * 订单生成时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 部署成功的时间
     */
    @Column(name = "`success_time`")
    private Date successTime;

    /**
     * 被删除的虚机所属基础架构id
     */
    @Column(name = "`del_vm_resource_id`")
    private String delVmResourceId;

    /**
     * 被删除的虚机id
     */
    @Column(name = "`del_vm_id`")
    private String delVmId;

    /**
     * 申请客户的id
     */
    @Column(name = "`apply_client_id`")
    private String applyClientId;

    /**
     * 申请客户的名称
     */
    @Column(name = "`apply_client_name`")
    private String applyClientName;

    /**
     * 服务名称
     */
    @Column(name = "`service_name`")
    private String serviceName;

    /**
     * 删除的虚机名称
     */
    @Column(name = "`del_vm_name`")
    private String delVmName;

    /**
     * 订单的更新时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 创建虚拟机的信息，以json格式存储
     */
    @Column(name = "`create_info`")
    private String createInfo;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单类型
     *
     * @return order_type - 订单类型
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * 设置订单类型
     *
     * @param orderType 订单类型
     */
    public void setOrderType(String orderType) {
        this.orderType = orderType;
    }

    /**
     * 获取产品类型
     *
     * @return product_type - 产品类型
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置产品类型
     *
     * @param productType 产品类型
     */
    public void setProductType(String productType) {
        this.productType = productType;
    }

    /**
     * 获取申请人id
     *
     * @return apply_user_id - 申请人id
     */
    public String getApplyUserId() {
        return applyUserId;
    }

    /**
     * 设置申请人id
     *
     * @param applyUserId 申请人id
     */
    public void setApplyUserId(String applyUserId) {
        this.applyUserId = applyUserId;
    }

    /**
     * 获取申请人名称
     *
     * @return apply_user_name - 申请人名称
     */
    public String getApplyUserName() {
        return applyUserName;
    }

    /**
     * 设置申请人名称
     *
     * @param applyUserName 申请人名称
     */
    public void setApplyUserName(String applyUserName) {
        this.applyUserName = applyUserName;
    }

    /**
     * 获取租期
     *
     * @return tenancy - 租期
     */
    public Byte getTenancy() {
        return tenancy;
    }

    /**
     * 设置租期
     *
     * @param tenancy 租期
     */
    public void setTenancy(Byte tenancy) {
        this.tenancy = tenancy;
    }

    /**
     * 获取租期单位：1月，2年
     *
     * @return tenancy_unit - 租期单位：1月，2年
     */
    public Boolean getTenancyUnit() {
        return tenancyUnit;
    }

    /**
     * 设置租期单位：1月，2年
     *
     * @param tenancyUnit 租期单位：1月，2年
     */
    public void setTenancyUnit(Boolean tenancyUnit) {
        this.tenancyUnit = tenancyUnit;
    }

    /**
     * 获取费用
     *
     * @return order_fee - 费用
     */
    public Double getOrderFee() {
        return orderFee;
    }

    /**
     * 设置费用
     *
     * @param orderFee 费用
     */
    public void setOrderFee(Double orderFee) {
        this.orderFee = orderFee;
    }

    /**
     * 获取申请时间
     *
     * @return apply_date - 申请时间
     */
    public Date getApplyDate() {
        return applyDate;
    }

    /**
     * 设置申请时间
     *
     * @param applyDate 申请时间
     */
    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    /**
     * 获取关联的业务id
     *
     * @return business_id - 关联的业务id
     */
    public String getBusinessId() {
        return businessId;
    }

    /**
     * 设置关联的业务id
     *
     * @param businessId 关联的业务id
     */
    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    /**
     * 获取订单的创建状态：1.待部署，2.部署中，3.部署成功, 4. 部署失败, 5. 已竣工, 6. 无法部署, 7. 已退单
     *
     * @return order_status - 订单的创建状态：1.待部署，2.部署中，3.部署成功, 4. 部署失败, 5. 已竣工, 6. 无法部署, 7. 已退单
     */
    public Boolean getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单的创建状态：1.待部署，2.部署中，3.部署成功, 4. 部署失败, 5. 已竣工, 6. 无法部署, 7. 已退单
     *
     * @param orderStatus 订单的创建状态：1.待部署，2.部署中，3.部署成功, 4. 部署失败, 5. 已竣工, 6. 无法部署, 7. 已退单
     */
    public void setOrderStatus(Boolean orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单的审批时间
     *
     * @return approve_time - 订单的审批时间
     */
    public Date getApproveTime() {
        return approveTime;
    }

    /**
     * 设置订单的审批时间
     *
     * @param approveTime 订单的审批时间
     */
    public void setApproveTime(Date approveTime) {
        this.approveTime = approveTime;
    }

    /**
     * 获取订单下的虚拟机的生效时间
     *
     * @return effective_time - 订单下的虚拟机的生效时间
     */
    public Date getEffectiveTime() {
        return effectiveTime;
    }

    /**
     * 设置订单下的虚拟机的生效时间
     *
     * @param effectiveTime 订单下的虚拟机的生效时间
     */
    public void setEffectiveTime(Date effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    /**
     * 获取订单下的虚拟机的过期时间
     *
     * @return expire_time - 订单下的虚拟机的过期时间
     */
    public Date getExpireTime() {
        return expireTime;
    }

    /**
     * 设置订单下的虚拟机的过期时间
     *
     * @param expireTime 订单下的虚拟机的过期时间
     */
    public void setExpireTime(Date expireTime) {
        this.expireTime = expireTime;
    }

    /**
     * @return apply_reason
     */
    public String getApplyReason() {
        return applyReason;
    }

    /**
     * @param applyReason
     */
    public void setApplyReason(String applyReason) {
        this.applyReason = applyReason;
    }

    /**
     * @return deploy_able
     */
    public Boolean getDeployAble() {
        return deployAble;
    }

    /**
     * @param deployAble
     */
    public void setDeployAble(Boolean deployAble) {
        this.deployAble = deployAble;
    }

    /**
     * @return undeploy_reason
     */
    public String getUndeployReason() {
        return undeployReason;
    }

    /**
     * @param undeployReason
     */
    public void setUndeployReason(String undeployReason) {
        this.undeployReason = undeployReason;
    }

    /**
     * 获取退单的时间
     *
     * @return chargeback_time - 退单的时间
     */
    public Date getChargebackTime() {
        return chargebackTime;
    }

    /**
     * 设置退单的时间
     *
     * @param chargebackTime 退单的时间
     */
    public void setChargebackTime(Date chargebackTime) {
        this.chargebackTime = chargebackTime;
    }

    /**
     * 获取订单部署的时间
     *
     * @return start_time - 订单部署的时间
     */
    public Date getStartTime() {
        return startTime;
    }

    /**
     * 设置订单部署的时间
     *
     * @param startTime 订单部署的时间
     */
    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    /**
     * 获取订单部署失败的时间
     *
     * @return fail_time - 订单部署失败的时间
     */
    public Date getFailTime() {
        return failTime;
    }

    /**
     * 设置订单部署失败的时间
     *
     * @param failTime 订单部署失败的时间
     */
    public void setFailTime(Date failTime) {
        this.failTime = failTime;
    }

    /**
     * 获取订单不可部署的时间
     *
     * @return undeploy_time - 订单不可部署的时间
     */
    public Date getUndeployTime() {
        return undeployTime;
    }

    /**
     * 设置订单不可部署的时间
     *
     * @param undeployTime 订单不可部署的时间
     */
    public void setUndeployTime(Date undeployTime) {
        this.undeployTime = undeployTime;
    }

    /**
     * 获取订单生成时间
     *
     * @return create_time - 订单生成时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单生成时间
     *
     * @param createTime 订单生成时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取部署成功的时间
     *
     * @return success_time - 部署成功的时间
     */
    public Date getSuccessTime() {
        return successTime;
    }

    /**
     * 设置部署成功的时间
     *
     * @param successTime 部署成功的时间
     */
    public void setSuccessTime(Date successTime) {
        this.successTime = successTime;
    }

    /**
     * 获取被删除的虚机所属基础架构id
     *
     * @return del_vm_resource_id - 被删除的虚机所属基础架构id
     */
    public String getDelVmResourceId() {
        return delVmResourceId;
    }

    /**
     * 设置被删除的虚机所属基础架构id
     *
     * @param delVmResourceId 被删除的虚机所属基础架构id
     */
    public void setDelVmResourceId(String delVmResourceId) {
        this.delVmResourceId = delVmResourceId;
    }

    /**
     * 获取被删除的虚机id
     *
     * @return del_vm_id - 被删除的虚机id
     */
    public String getDelVmId() {
        return delVmId;
    }

    /**
     * 设置被删除的虚机id
     *
     * @param delVmId 被删除的虚机id
     */
    public void setDelVmId(String delVmId) {
        this.delVmId = delVmId;
    }

    /**
     * 获取申请客户的id
     *
     * @return apply_client_id - 申请客户的id
     */
    public String getApplyClientId() {
        return applyClientId;
    }

    /**
     * 设置申请客户的id
     *
     * @param applyClientId 申请客户的id
     */
    public void setApplyClientId(String applyClientId) {
        this.applyClientId = applyClientId;
    }

    /**
     * 获取申请客户的名称
     *
     * @return apply_client_name - 申请客户的名称
     */
    public String getApplyClientName() {
        return applyClientName;
    }

    /**
     * 设置申请客户的名称
     *
     * @param applyClientName 申请客户的名称
     */
    public void setApplyClientName(String applyClientName) {
        this.applyClientName = applyClientName;
    }

    /**
     * 获取服务名称
     *
     * @return service_name - 服务名称
     */
    public String getServiceName() {
        return serviceName;
    }

    /**
     * 设置服务名称
     *
     * @param serviceName 服务名称
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * 获取删除的虚机名称
     *
     * @return del_vm_name - 删除的虚机名称
     */
    public String getDelVmName() {
        return delVmName;
    }

    /**
     * 设置删除的虚机名称
     *
     * @param delVmName 删除的虚机名称
     */
    public void setDelVmName(String delVmName) {
        this.delVmName = delVmName;
    }

    /**
     * 获取订单的更新时间
     *
     * @return update_time - 订单的更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置订单的更新时间
     *
     * @param updateTime 订单的更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取创建虚拟机的信息，以json格式存储
     *
     * @return create_info - 创建虚拟机的信息，以json格式存储
     */
    public String getCreateInfo() {
        return createInfo;
    }

    /**
     * 设置创建虚拟机的信息，以json格式存储
     *
     * @param createInfo 创建虚拟机的信息，以json格式存储
     */
    public void setCreateInfo(String createInfo) {
        this.createInfo = createInfo;
    }
}