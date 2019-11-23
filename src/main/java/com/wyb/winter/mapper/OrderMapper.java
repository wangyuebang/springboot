package com.wyb.winter.mapper;


import com.wyb.winter.entity.Trolley;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;


@Mapper
@Component
public interface OrderMapper {

    //查询所有订单
    List<Trolley> getUserOrder();

    //查询单个订单
    List<Trolley> getOrderOne(int id);

    //修改单个订单
    int updateTrolley(Trolley trolley);

}
