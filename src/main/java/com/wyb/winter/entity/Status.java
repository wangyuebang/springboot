package com.wyb.winter.entity;

public class Status {

    private Integer sid;
    private Integer statusInfo;
    private Integer uid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getStatusInfo() {
        return statusInfo;
    }

    public void setStatusInfo(Integer statusInfo) {
        this.statusInfo = statusInfo;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Status{" +
                "sid=" + sid +
                ", statusInfo=" + statusInfo +
                ", uid=" + uid +
                '}';
    }
}
