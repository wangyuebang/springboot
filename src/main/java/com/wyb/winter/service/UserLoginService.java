package com.wyb.winter.service;

import com.wyb.winter.entity.user;
import com.wyb.winter.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserLoginService {

    @Autowired
    private userMapper userMapper;

    public user userLogin(String username,String password){
        user user = userMapper.userlogin(username,password);
        return user;
    }
}
