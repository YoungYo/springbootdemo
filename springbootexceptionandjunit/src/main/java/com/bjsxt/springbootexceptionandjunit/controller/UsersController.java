package com.bjsxt.springbootexceptionandjunit.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UsersController {
    @RequestMapping("showInfo")
    public String showInfo() {
        String str = null;
        str.length();
        return "ok";
    }

    @ExceptionHandler(value = {java.lang.NullPointerException.class})
    public ModelAndView nullPointExceptionHandler(Exception e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("errMsg", e.toString());
        mv.setViewName("error1");
        return mv;
    }
}
