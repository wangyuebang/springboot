package com.wyb.winter.service;


import com.wyb.winter.entity.User;
import com.wyb.winter.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    //用户登录
    public User uLogin(String username, String password){
        return userMapper.userLogin(username, password);
    }

    //注册新用户
    public User aUser(User user){
        userMapper.addUser(user);
        return user;
    }

    //查询用户
    public List<User> gUser(){
        return userMapper.getUser();
    }

    //通过id查询用户
    public User gUserById(int id){
        return userMapper.getUserById(id);
    }

    //用户删除
    public int dUser(int id){
        return userMapper.deleteUser(id);
    }

    //用户修改
    public int uUser (User user){
        return userMapper.updateUser(user);
    }


}
