package com.wyb.winter.controller;

import com.wyb.winter.entity.user;
import com.wyb.winter.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    @RequestMapping("/loginHtml1")
    public String loginHtml(){
        return "userLogin";
    }

    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpServletRequest request){

        user user = userLoginService.userLogin(username,password);
        if (user != null){
            return "index";
        }
        return "loginError";
    }
}
