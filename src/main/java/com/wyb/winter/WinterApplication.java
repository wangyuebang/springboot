package com.wyb.winter;


import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan({"com.wyb.winter.mapper"})
public class WinterApplication {

    public static void main(String[] args) {
        SpringApplication.run(WinterApplication.class, args);
    }


}

