package com.bjsxt.springbootweb.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * 整合Filter方式一
 */
//@WebFilter(filterName = "FirstName", urlPatterns = ["*.do", "*.jsp"]) //拦截后缀是“.do”或者“.jsp”的请求
@WebFilter(filterName = "FirstName", urlPatterns = "/first") //拦截“/first”路径的请求
public class FirstFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("进入First Filter。");
        filterChain.doFilter(servletRequest, servletResponse);
        System.out.println("离开First Filter。");
    }

    @Override
    public void destroy() {

    }
}
