package com.example.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

/**
 * 处理请求，直接返回字符串
 */
@RestController
public class ControFileuplode {

    @PostMapping("/fileuplode")
    public String uplonds(MultipartFile file) throws IOException {
        try {
            /**
             * 文件名
             */
            System.out.println(file.getOriginalFilename());

            file.transferTo(new File("f:/" + file.getOriginalFilename()));

            System.out.println("文件上传成功");
            return "文件上传成功";
        } catch (Exception e) {
            return "上传失败";
        }
    }
}
