package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ControllerUserAdd {

    //页面请求的地址
    @RequestMapping("/{page}")
    public String one(@PathVariable String page){
        return page;
    }
}
