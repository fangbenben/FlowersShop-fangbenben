package com.flower.pojo.po;

import java.util.Date;

public class TbOrder {
    private String id;

    private String payment;

    private Integer paymenttype;

    private String postfee;

    private Integer orderstatus;

    private String buyermessage;

    private Date createtime;

    private Date updatetime;

    private Date paymenttime;

    private Date consigntime;

    private Date endtime;

    private Date closetime;

    private String buyernick;

    private String userId;

    private Integer status;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment == null ? null : payment.trim();
    }

    public Integer getPaymenttype() {
        return paymenttype;
    }

    public void setPaymenttype(Integer paymenttype) {
        this.paymenttype = paymenttype;
    }

    public String getPostfee() {
        return postfee;
    }

    public void setPostfee(String postfee) {
        this.postfee = postfee == null ? null : postfee.trim();
    }

    public Integer getOrderstatus() {
        return orderstatus;
    }

    public void setOrderstatus(Integer orderstatus) {
        this.orderstatus = orderstatus;
    }

    public String getBuyermessage() {
        return buyermessage;
    }

    public void setBuyermessage(String buyermessage) {
        this.buyermessage = buyermessage == null ? null : buyermessage.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public Date getPaymenttime() {
        return paymenttime;
    }

    public void setPaymenttime(Date paymenttime) {
        this.paymenttime = paymenttime;
    }

    public Date getConsigntime() {
        return consigntime;
    }

    public void setConsigntime(Date consigntime) {
        this.consigntime = consigntime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public Date getClosetime() {
        return closetime;
    }

    public void setClosetime(Date closetime) {
        this.closetime = closetime;
    }

    public String getBuyernick() {
        return buyernick;
    }

    public void setBuyernick(String buyernick) {
        this.buyernick = buyernick == null ? null : buyernick.trim();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId == null ? null : userId.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}