package com.wyb.winter.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
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

    @RequestMapping("/loginError")
    public String loginError() {
        return "loginError";
    }

    @RequestMapping(value = "/userLogin")
    public ModelAndView userLogin(String username, String password,
                            HttpServletRequest request) {
        ModelAndView mvok = new ModelAndView("forward:/user/userQuery");
        ModelAndView mvno = new ModelAndView("forward:/user/loginError");
        User user = userService.uLogin(username, password);
        if (user != null) {
            request.getSession().setAttribute("session_user", user);     //将用户信息放入session
            return mvok;
        }
        return mvno;
    }


//    用户注册
    @RequestMapping("registerHtml")
    public String UserRegister(){
        System.out.println("进入注册页面");
        return "register";
    }

    @ResponseBody
    @RequestMapping("/userRegister")
    public ModelAndView addUser(User user) {
        ModelAndView mv = new ModelAndView("forward:/user/loginHtml");
        userService.aUser(user);
        return mv;
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
    public String getuserList( Model model,@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        //查询之前调用startPage，就是每页显示多少条数据
        PageHelper.startPage(pageNum,8);
        //拿到所有用户数据
        List<User> userList= userService.gUser();
        //将查询到的数据放入pagehepler中
        PageInfo<User> pageinfo = new PageInfo<>(userList);
        // 将查询到的数据存到返回
        model.addAttribute("pageinfo",pageinfo);
        model.addAttribute("userList",userList);
        return "userList";
    }

    //用户修改
    @RequestMapping("/findOneUser")
    public String findUserByName(int id,Model model){
        User user = userService.gUserById(id);
        model.addAttribute("user",user);
        System.out.println("*********************user:"+user);
        return "upgradeUser";
    }

    @ResponseBody
    @RequestMapping("/updateUser")
    public ModelAndView updateUserList(User user){
        ModelAndView mv = new ModelAndView("forward:/user/userQuery");
        userService.uUser(user);
        System.out.println("=============================" + user );
        return mv;
    }

}
