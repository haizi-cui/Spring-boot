package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 访问html静态资源
 */
@Controller
public class Pagcontroller {

    @RequestMapping("/page")
    public String showPage(){

        System.out.println(123);
        return "index.html";
    }
}
