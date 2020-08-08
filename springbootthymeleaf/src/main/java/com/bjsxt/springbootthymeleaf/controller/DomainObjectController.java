package com.bjsxt.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class DomainObjectController {
    @GetMapping("domainObjectDemo")
    public String domainObjectDemo(HttpServletRequest request) {
        request.setAttribute("req", "HttpServletRequest");
        request.getSession().setAttribute("ses", "HttpSession");
        request.getSession().getServletContext().setAttribute("app", "Application");
        return "domainObjectDemo";
    }
}
