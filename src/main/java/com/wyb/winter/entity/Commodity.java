package com.wyb.winter.entity;

public class Commodity {

    private Integer cid;
    private String attribute;
    private String CommodityName;
    private Integer uid;
    private Integer sid;

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

    public String getCommodityName() {
        return CommodityName;
    }

    public void setCommodityName(String commodityName) {
        CommodityName = commodityName;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    @Override
    public String toString() {
        return "Commodity{" +
                "cid=" + cid +
                ", attribute='" + attribute + '\'' +
                ", CommodityName='" + CommodityName + '\'' +
                ", uid=" + uid +
                ", sid=" + sid +
                '}';
    }
}
