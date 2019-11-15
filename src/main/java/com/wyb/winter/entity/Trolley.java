package com.wyb.winter.entity;


import java.util.Date;

public class Trolley {

    private Integer tid;
    private Integer express;
    private Integer amount;
    private Integer status;
    private Date orderDate;
    private Date deliveryTime;
    private Integer tuid;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getExpress() {
        return express;
    }

    public void setExpress(Integer express) {
        this.express = express;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Integer getTuid() {
        return tuid;
    }

    public void setTuid(Integer tuid) {
        this.tuid = tuid;
    }

    @Override
    public String toString() {
        return "Trolley{" +
                "tid=" + tid +
                ", express=" + express +
                ", amount=" + amount +
                ", status=" + status +
                ", orderDate=" + orderDate +
                ", deliveryTime=" + deliveryTime +
                ", tuid=" + tuid +
                '}';
    }
}