package com.wyb.winter.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyb.winter.entity.Commodity;
import com.wyb.winter.entity.User;
import com.wyb.winter.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderManagerController {

    private final OrderService orderService;

    public OrderManagerController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("userOrder")
    public String userOrder( Model model,@RequestParam(value = "pageNum",defaultValue = "1") Integer pageNum){
        PageHelper.startPage(pageNum,8);
        List<Commodity> orderList = orderService.gUserCommodity();
        PageInfo<Commodity> pageinfo = new PageInfo<>(orderList);
        model.addAttribute("orderList",orderList);
        model.addAttribute("pageinfo",pageinfo);
        System.out.println("Map"+orderList);
        return "orderInfo";
    }
}
