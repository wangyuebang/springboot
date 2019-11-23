package com.wyb.winter.mapper;

import com.wyb.winter.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface UserMapper {

    //用户登录
    User userLogin( String username,  String password);

    //用户注册
    int addUser(User user);

    //用户查询
    List<User> getUser();

    //单个用户查询
    User getUserById(int id);

    //用户删除
    int  deleteUser(Integer id);

    //用户修改
    int updateUser(User user);

}