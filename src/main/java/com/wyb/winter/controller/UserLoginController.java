package com.wyb.winter.controller;

import com.wyb.winter.entity.User;
import com.wyb.winter.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/user")
public class UserLoginController {

    private final UserService userService;

    public UserLoginController(UserService userService) {
        this.userService = userService;
    }

    //用户登录
    @RequestMapping("/loginHtml")
    public String loginHtml() {
        return "userLogin";
    }

    @RequestMapping(value = "/userLogin")
    public String userLogin(@RequestParam("username") String username,
                            @RequestParam("password") String password,
                            HttpServletRequest request) {

        User user = userService.uLogin(username, password);
        if (user != null) {
            request.getSession().setAttribute("session_user", user);     //将用户信息放入session
            return "loginSuccess";
        }
        return "loginError";
    }


//    用户注册
    @RequestMapping("registerHtml")
    public String UserRegister(){
        System.out.println("进入注册页面");
        return "register";
    }

    @ResponseBody
    @RequestMapping(value = "/uRegister",method = RequestMethod.POST)
    public String addUser(User user) {
        userService.aUser(user);
        return "registerSuccess";
    }

    //用户删除
    @RequestMapping("/deleteUser")
    public ModelAndView deleteUser(Integer id){
        ModelAndView mv = new ModelAndView("forward:/user/userQuery");
        userService.dUser(id);
       return mv;
    }

    //用户查询
    @RequestMapping("/userQuery")
    public String getuserList( Model model){
        List<User> userList= userService.gUser();
        model.addAttribute("userList",userList);
        return "userList";
    }

    //用户修改
    @RequestMapping("/findOneUser")
    public String findUserByName(User user,Model model){
        model.addAttribute("user",user);
        System.out.println("*********************user:"+user);
        return "upgradeUser";
    }

    @ResponseBody
    @RequestMapping("/updateUser")
    public ModelAndView updateUserList(User user,HttpServletRequest request){
        ModelAndView mv = new ModelAndView("forward:/user/userQuery");
        userService.uUser(user);
        System.out.println("=============================" + user );
        return mv;
    }


}
