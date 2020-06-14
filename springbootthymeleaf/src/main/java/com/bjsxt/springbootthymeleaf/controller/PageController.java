package com.bjsxt.springbootthymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Date;

@Controller
public class PageController {

    @GetMapping("showPage")
    public String showPage(Model model){
        model.addAttribute("msg", "床前明月光，疑似地上霜。");
        model.addAttribute("date", new Date());
        return "index";
    }
}
