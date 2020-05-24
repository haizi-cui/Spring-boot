package com.example.demo.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;
@WebFilter(filterName = "Firstfilter",urlPatterns = {"*.do","/first"})
public class Firstfilter implements Filter {


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入First Filter");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("离开First Filter");
    }

    @Override
    public void destroy() {

    }
}
