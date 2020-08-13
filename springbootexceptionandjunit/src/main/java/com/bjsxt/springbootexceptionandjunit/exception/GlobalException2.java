package com.bjsxt.springbootexceptionandjunit.exception;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.handler.SimpleMappingExceptionResolver;

import java.util.Properties;

/**
 * 全局异常处理
 * @author 王浩
 */
@Configuration
public class GlobalException2 {

    @Bean
    public SimpleMappingExceptionResolver getSimpleMappingExceptionResolver() {
        SimpleMappingExceptionResolver resolver = new SimpleMappingExceptionResolver();
        Properties properties = new Properties();

        // 参数一：必须是异常类型，并且是全名
        // 参数二：视图名称
        properties.put("java.lang.NullPointerException", "error1");
        properties.put("java.lang.ArithmeticException", "error2");
        resolver.setExceptionMappings(properties);
        return resolver;
    }
}
