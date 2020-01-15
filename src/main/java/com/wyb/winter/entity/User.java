package com.wyb.winter.entity;

import lombok.Data;

@Data
public class User {

    private  Integer  id;
    private  String username;
    private  String password;
    private  String phone;
    private  String email;
    private Integer uid;
    private Commodity commodity;
    private Trolley trolley;
    private String deleted;


}