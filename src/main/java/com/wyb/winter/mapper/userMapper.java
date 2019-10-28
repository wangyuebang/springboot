package com.wyb.winter.mapper;

import com.wyb.winter.entity.user;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface userMapper {

    user userlogin(@Param("username") String username, @Param("password") String password);

}