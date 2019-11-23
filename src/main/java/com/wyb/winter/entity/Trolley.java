package com.wyb.winter.entity;


import java.util.Date;

public class Trolley {

    private Integer tid;
    private Integer amount;
    private Date order_date;
    private Date delivery_time;
    private Integer tuid;

    public Integer getTid() {
        return tid;
    }

    public void setTid(Integer tid) {
        this.tid = tid;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Date getOrder_date() {
        return order_date;
    }

    public void setOrder_date(Date order_date) {
        this.order_date = order_date;
    }

    public Date getDelivery_time() {
        return delivery_time;
    }

    public void setDelivery_time(Date delivery_time) {
        this.delivery_time = delivery_time;
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
                ", amount=" + amount +
                ", order_date=" + order_date +
                ", delivery_time=" + delivery_time +
                ", tuid=" + tuid +
                '}';
    }
}