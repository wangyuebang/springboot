package com.wyb.winter.entity;


import lombok.Data;

import java.util.Date;

@Data
public class Trolley {

    private Integer tid;
    private Integer amount;
    private Date order_date;
    private Date delivery_time;
    private Integer tuid;


}