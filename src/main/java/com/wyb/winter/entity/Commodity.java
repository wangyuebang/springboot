package com.wyb.winter.entity;

public class Commodity {

    private Integer cid;
    private Integer number;
    private String CommodityName;
    private Integer uid;

    public Integer getCid() {
        return cid;
    }

    public void setCid(Integer cid) {
        this.cid = cid;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
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

    @Override
    public String toString() {
        return "Commodity{" +
                "cid=" + cid +
                ", number=" + number +
                ", CommodityName='" + CommodityName + '\'' +
                ", uid=" + uid +
                '}';
    }
}
