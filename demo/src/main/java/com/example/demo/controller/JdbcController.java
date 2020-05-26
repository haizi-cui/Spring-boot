package com.example.demo.controller;

import com.example.demo.Request.RequestUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * 页面跳转
 */
@Controller
@RequestMapping("user")
public class JdbcController {



    //注入
    @Autowired
    private UserService userService;
    /**
     * 添加用户
     */
    @PostMapping("/addUser")
   public String ShowInfo(RequestUser requestUser){
        try {
            this.userService.addUser(requestUser);
        }catch (Exception e){
            e.printStackTrace();
            return "error";
        }
        //防止重复提交。重定向redirect
        return "redirect:/ok";
    }
}
