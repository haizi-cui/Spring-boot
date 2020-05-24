package com.example.demo.controller;

import com.example.demo.Request.RequestUsers;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {

    /**
     * 处理请求，返回数据
     */

    @GetMapping("/showUsers")
    public String showUsers(Model model){
        System.out.println("jpihspifhpisd");
        List<RequestUsers> xiaomalist = new ArrayList<>();
        xiaomalist.add(new RequestUsers("张三","F","18"));
        xiaomalist.add(new RequestUsers("李四","F","19"));
        xiaomalist.add(new RequestUsers("王五","F","20"));
        xiaomalist.add(new RequestUsers("赵六","F","21"));
        model.addAttribute("xiaomalist",xiaomalist);
        return  "userList";


    }
}
