package com.wyb.winter.mapper;

import com.wyb.winter.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface userMapper {

    //用户登录
    user userlogin(@Param("username") String username, @Param("password") String password);

//    用户注册
    int adduser( @Param("username") String username, @Param("password") String password, @Param("phone") String phone,@Param("email")String email);

//    用户查询
    List<user> getList();
}