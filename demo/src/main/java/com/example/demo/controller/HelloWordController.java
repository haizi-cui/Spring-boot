package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理请求，直接返回字符串
 */
@RestController
public class HelloWordController {

    @RequestMapping("/helloword")
    public String ShowHelloWord(){
        return "HelloWord";
    }
}
