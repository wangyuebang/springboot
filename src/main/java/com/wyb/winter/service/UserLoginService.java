package com.wyb.winter.service;

import com.wyb.winter.entity.user;
import com.wyb.winter.mapper.userMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@Service
public class UserLoginService {

    @Autowired
    private userMapper userMapper;

    //用户登录
    public user userLogin(String username,String password){
        user user = userMapper.userlogin(username,password);
        return user;
    }

    //注册新用户
    public int adduser(String username, String password, String phone,String email){
        return userMapper.adduser(username,password,phone,email);
    }

    //查询用户
    public List<user> getlist(){
        return userMapper.getList();
    }

}
