package com.bjsxt.springbootweb.config;

import com.bjsxt.springbootweb.filter.SecondFilter;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilterConfig {
    @Bean
    public FilterRegistrationBean getFilterRegistrationBean(){
        FilterRegistrationBean bean = new FilterRegistrationBean(new SecondFilter());
//        bean.addUrlPatterns("*.do", "*.jsp"); //拦截后缀是“.do”或者“.jsp”的请求
        bean.addUrlPatterns("/second"); //拦截“/second”路径的请求
        return bean;
    }
}
