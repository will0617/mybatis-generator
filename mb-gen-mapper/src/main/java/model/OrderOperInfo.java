package model;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`order_oper_info`")
public class OrderOperInfo {
    @Column(name = "`id`")
    private String id;

    /**
     * 订单的id
     */
    @Column(name = "`order_id`")
    private String orderId;

    /**
     * 删除虚机订单的客户名称
     */
    @Column(name = "`client_del`")
    private String clientDel;

    /**
     * 部署人
     */
    @Column(name = "`user_deploy`")
    private String userDeploy;

    /**
     * 竣工人
     */
    @Column(name = "`user_completion`")
    private String userCompletion;

    /**
     * 退单人
     */
    @Column(name = "`user_chargeback`")
    private String userChargeback;

    /**
     * 删除人
     */
    @Column(name = "`user_del`")
    private String userDel;

    /**
     * 确认删除人
     */
    @Column(name = "`user_confirm_del`")
    private String userConfirmDel;

    /**
     * 客户删除虚机订单的时间
     */
    @Column(name = "`time_client_del`")
    private Date timeClientDel;

    /**
     * 虚机订单删除时间
     */
    @Column(name = "`time_del`")
    private Date timeDel;

    /**
     * 虚机订单确认删除时间
     */
    @Column(name = "`time_confirm_del`")
    private Date timeConfirmDel;

    /**
     * 退单时间
     */
    @Column(name = "`time_chargeback`")
    private Date timeChargeback;

    /**
     * 竣工时间
     */
    @Column(name = "`time_completion`")
    private Date timeCompletion;

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
     * 获取订单的id
     *
     * @return order_id - 订单的id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单的id
     *
     * @param orderId 订单的id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取删除虚机订单的客户名称
     *
     * @return client_del - 删除虚机订单的客户名称
     */
    public String getClientDel() {
        return clientDel;
    }

    /**
     * 设置删除虚机订单的客户名称
     *
     * @param clientDel 删除虚机订单的客户名称
     */
    public void setClientDel(String clientDel) {
        this.clientDel = clientDel;
    }

    /**
     * 获取部署人
     *
     * @return user_deploy - 部署人
     */
    public String getUserDeploy() {
        return userDeploy;
    }

    /**
     * 设置部署人
     *
     * @param userDeploy 部署人
     */
    public void setUserDeploy(String userDeploy) {
        this.userDeploy = userDeploy;
    }

    /**
     * 获取竣工人
     *
     * @return user_completion - 竣工人
     */
    public String getUserCompletion() {
        return userCompletion;
    }

    /**
     * 设置竣工人
     *
     * @param userCompletion 竣工人
     */
    public void setUserCompletion(String userCompletion) {
        this.userCompletion = userCompletion;
    }

    /**
     * 获取退单人
     *
     * @return user_chargeback - 退单人
     */
    public String getUserChargeback() {
        return userChargeback;
    }

    /**
     * 设置退单人
     *
     * @param userChargeback 退单人
     */
    public void setUserChargeback(String userChargeback) {
        this.userChargeback = userChargeback;
    }

    /**
     * 获取删除人
     *
     * @return user_del - 删除人
     */
    public String getUserDel() {
        return userDel;
    }

    /**
     * 设置删除人
     *
     * @param userDel 删除人
     */
    public void setUserDel(String userDel) {
        this.userDel = userDel;
    }

    /**
     * 获取确认删除人
     *
     * @return user_confirm_del - 确认删除人
     */
    public String getUserConfirmDel() {
        return userConfirmDel;
    }

    /**
     * 设置确认删除人
     *
     * @param userConfirmDel 确认删除人
     */
    public void setUserConfirmDel(String userConfirmDel) {
        this.userConfirmDel = userConfirmDel;
    }

    /**
     * 获取客户删除虚机订单的时间
     *
     * @return time_client_del - 客户删除虚机订单的时间
     */
    public Date getTimeClientDel() {
        return timeClientDel;
    }

    /**
     * 设置客户删除虚机订单的时间
     *
     * @param timeClientDel 客户删除虚机订单的时间
     */
    public void setTimeClientDel(Date timeClientDel) {
        this.timeClientDel = timeClientDel;
    }

    /**
     * 获取虚机订单删除时间
     *
     * @return time_del - 虚机订单删除时间
     */
    public Date getTimeDel() {
        return timeDel;
    }

    /**
     * 设置虚机订单删除时间
     *
     * @param timeDel 虚机订单删除时间
     */
    public void setTimeDel(Date timeDel) {
        this.timeDel = timeDel;
    }

    /**
     * 获取虚机订单确认删除时间
     *
     * @return time_confirm_del - 虚机订单确认删除时间
     */
    public Date getTimeConfirmDel() {
        return timeConfirmDel;
    }

    /**
     * 设置虚机订单确认删除时间
     *
     * @param timeConfirmDel 虚机订单确认删除时间
     */
    public void setTimeConfirmDel(Date timeConfirmDel) {
        this.timeConfirmDel = timeConfirmDel;
    }

    /**
     * 获取退单时间
     *
     * @return time_chargeback - 退单时间
     */
    public Date getTimeChargeback() {
        return timeChargeback;
    }

    /**
     * 设置退单时间
     *
     * @param timeChargeback 退单时间
     */
    public void setTimeChargeback(Date timeChargeback) {
        this.timeChargeback = timeChargeback;
    }

    /**
     * 获取竣工时间
     *
     * @return time_completion - 竣工时间
     */
    public Date getTimeCompletion() {
        return timeCompletion;
    }

    /**
     * 设置竣工时间
     *
     * @param timeCompletion 竣工时间
     */
    public void setTimeCompletion(Date timeCompletion) {
        this.timeCompletion = timeCompletion;
    }
}