package com.example.demo.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * 整合listtener
 */
@WebListener
public class FirstListener implements ServletContextListener {

    //销毁时会被调用
    public void contextDestroyed(ServletContextEvent servletContextEvent){
        System.out.println("销毁了");
    }

    //初始化时会被调用
    public void contextInitialized(ServletContextEvent servletContextEvent){
        System.out.println("初始化了");
    }

}
