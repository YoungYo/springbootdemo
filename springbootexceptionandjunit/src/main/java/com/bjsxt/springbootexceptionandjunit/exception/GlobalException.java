package com.bjsxt.springbootexceptionandjunit.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

/**
 * 全局异常处理类
 * @author 王浩
 */
@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointExceptionHandler(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("errMsg", e.toString());
        mv.setViewName("error1");
        return mv;
    }
}
