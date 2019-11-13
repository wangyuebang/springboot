package com.wyb.winter.entity;

public class Status {

    private Integer sid;
    private Integer status;
    private Integer cid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    @Override
    public String toString() {
        return "Status{" +
                "sid=" + sid +
                ", status=" + status +
                ", cid=" + cid +
                '}';
    }
}
