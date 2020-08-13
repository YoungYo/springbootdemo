package com.bjsxt.springbootexceptionandjunit.exception;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理
 * @author 王浩
 */
@Configuration
public class GlobalException3 implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        ModelAndView mv = new ModelAndView();
        // 判断不同异常类型，做不同的视图跳转
        if (e instanceof NullPointerException) {
            mv.setViewName("error1");
        } else if (e instanceof ArithmeticException) {
            mv.setViewName("error2");
        }
        mv.addObject("errMsg", e.toString());
        return mv;
    }
}
