package com.wyb.winter.mapper;

import com.wyb.winter.entity.Commodity;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component
public interface OrderMapper {

    List<Commodity> getUserOrder();

}
