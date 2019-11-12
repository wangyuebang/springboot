package com.wyb.winter.controller;

import com.wyb.winter.entity.Commodity;
import com.wyb.winter.service.OrderService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
@RequestMapping("/order")
public class OrderManagerController {

    private final OrderService orderService;

    public OrderManagerController(OrderService orderService) {
        this.orderService = orderService;
    }

    @RequestMapping("userOrder")
    public String userOrder(Model model){
        List<Commodity> orderList = orderService.gUserCommodity();
        model.addAttribute("orderList",orderList);
        System.out.println("Map"+orderList);
        return "orderInfo";
    }
}
