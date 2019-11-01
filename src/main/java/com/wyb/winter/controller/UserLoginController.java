package com.wyb.winter.controller;

import com.wyb.winter.entity.User;
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

    //用户登录
    @RequestMapping("/loginHtml")
    public String loginHtml(){
        return "userLogin";
    }

    @RequestMapping("/userLogin")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpServletRequest request){

        User user = userLoginService.uLogin(username,password);
        if (user != null){
            request.getSession().setAttribute("session_user",user);     //将用户信息放入session
            return "loginSuccess";
        }
        return "loginError";
    }

    //用户注册
    @RequestMapping("/registerHtml")
    public String registerpage(){
        return "register";
    }

    @ResponseBody
    @RequestMapping("/userRegister")
    public User addUser(User user) {
         return userLoginService.aUser(user);
    }

    //用户删除
    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        int result = userLoginService.dUser(id);
        if (result > 1){
            return "删除成功";
        } else {
            return "删除失败";
        }
    }

    //查询
    @RequestMapping("/userQuery")
    public String getuserList( Model model){
        List<User> userList= userLoginService.gUser();
        model.addAttribute("userList",userList);
        return "userList";
    }

















}
