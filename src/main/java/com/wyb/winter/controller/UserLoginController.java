package com.wyb.winter.controller;

import com.wyb.winter.entity.user;
import com.wyb.winter.service.UserLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    @Autowired
    private UserLoginService userLoginService;

    //用户登录界面
    @RequestMapping("/loginHtml")
    public String loginHtml(){
        return "userLogin";
    }

    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpServletRequest request){

        user user = userLoginService.userLogin(username,password);
        if (user != null){
            request.getSession().setAttribute("session_user",user);     //将用户信息放入session
            return "loginSuccess";
        }
        return "loginError";
    }

    //用户注册页面
    @RequestMapping("/registerHtml")
    public String registerpage(){
        return "register";
    }

    @ResponseBody
    @RequestMapping("/uregister")
    public String addUser(@RequestParam("username") String username,
                          @RequestParam("password") String password,
                          @RequestParam("phone") String phone,
                          @RequestParam("email") String email) {
        int res = userLoginService.adduser(username, password, phone,email);
        if(res == 0){
            System.out.println("11111111111111111111111111111111111");
            System.out.println("22222222222222222222222222222222222");
            return "注册成功！";
        }else{
            return "注册失败！";
        }
    }

    //查询页面
    @RequestMapping("/userQuery")
    public String getuserList(HttpServletRequest request, Model model){
        List<user> userList= userLoginService.getlist();
        model.addAttribute("userList",userList);
        return "userList";
    }

















}
