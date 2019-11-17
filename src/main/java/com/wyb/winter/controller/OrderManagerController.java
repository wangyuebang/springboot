package com.wyb.winter.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wyb.winter.entity.Trolley;
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
        List<Trolley> orderList = orderService.gUserOrder();
        PageInfo<Trolley> pageinfo = new PageInfo<>(orderList);
        model.addAttribute("orderList",orderList);
        model.addAttribute("pageinfo",pageinfo);
        System.out.println("Map"+orderList);
        return "orderInfo";
    }

    @RequestMapping("findOneOrder")
    public String findOneOrder(int id,Model model){
        List<Trolley> OneOrder = orderService.gOneOrder(id);
        model.addAttribute("OneOrder",OneOrder);
        System.out.println("单个订单√√√√√√√√√√√√√√√√√√√√√√√√"+OneOrder);
        return "updateOrder";
    }

    @RequestMapping("updateOrder")
    public String updateOrder(){
        return null;
    }
}
