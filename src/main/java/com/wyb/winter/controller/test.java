package com.wyb.winter.controller;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class test {

    @RequestMapping(value = "/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public String test() {
        return "loginError";
    }

}
