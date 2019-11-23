package com.wyb.winter.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyb.winter.entity.Trolley;
import com.wyb.winter.entity.User;
import com.wyb.winter.service.OrderService;
import com.wyb.winter.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderManagerController {

    private final OrderService orderService;
    private final UserService userService;

    public OrderManagerController(OrderService orderService, UserService userService) {
        this.orderService = orderService;
        this.userService = userService;
    }

    @RequestMapping("/userOrder")
    public String userOrder( Model model,@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,8);
        List<Trolley> orderList = orderService.gUserOrder();
        PageInfo<Trolley> pageinfo = new PageInfo<>(orderList);
        model.addAttribute("orderList",orderList);
        model.addAttribute("pageinfo",pageinfo);
        System.out.println("Map"+orderList);
        return "orderInfo";
    }

    @RequestMapping("/findOneOrder")
    public String findOneOrder(int id,Model model){
        List<Trolley> OneOrder = orderService.gOneOrder(id);
        model.addAttribute("OneOrder",OneOrder);
        System.out.println("单个订单信息"+OneOrder);
        return "updateOrder";
    }

    @RequestMapping("/updateOrder")
    public ModelAndView updateOrder(Trolley trolley,User user){
        ModelAndView mv = new ModelAndView("forward:/order/userOrder");
        orderService.uTrolley(trolley);
        userService.uUser(user);
        System.out.println("user是："+ user);
        return mv;
    }
}
