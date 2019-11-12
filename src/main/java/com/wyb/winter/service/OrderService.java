package com.wyb.winter.service;

import com.wyb.winter.entity.Commodity;
import com.wyb.winter.mapper.OrderMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderMapper orderMapper;

    public OrderService(OrderMapper orderMapper) {
        this.orderMapper = orderMapper;
    }

    public List<Commodity> gUserCommodity(){
        return orderMapper.getUserOrder();
    }

}
