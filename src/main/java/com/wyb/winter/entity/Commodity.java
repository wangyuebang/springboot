package com.wyb.winter.entity;

public class Commodity {

    private Integer cid;
    private String attribute;
    private String cname;
    private Integer uid;
    private Integer tuid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getTuid() {
        return tuid;
    }

    public void setTuid(Integer tuid) {
        this.tuid = tuid;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "cid=" + cid +
                ", attribute='" + attribute + '\'' +
                ", cname='" + cname + '\'' +
                ", uid=" + uid +
                ", tuid=" + tuid +
                '}';
    }
}
