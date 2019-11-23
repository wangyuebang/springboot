package com.wyb.winter.service;

import com.wyb.winter.entity.Trolley;
import com.wyb.winter.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    //查询所有订单
    public List<Trolley> gUserOrder(){
        return orderMapper.getUserOrder();
    }

    //查询单个订单
    public List<Trolley> gOneOrder(int id){
        return orderMapper.getOrderOne(id);
    }

    //修改单个订单
     public int uTrolley(Trolley trolley){
         return orderMapper.updateTrolley(trolley);
     }

}
