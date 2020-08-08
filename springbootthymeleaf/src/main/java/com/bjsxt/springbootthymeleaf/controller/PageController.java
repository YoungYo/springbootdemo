package com.bjsxt.springbootthymeleaf.controller;

import com.bjsxt.springbootthymeleaf.pojo.Users;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class PageController {

    @GetMapping("showPage")
    public String showPage(Model model){
        model.addAttribute("msg", "床前明月光，疑似地上霜。");
        model.addAttribute("date", new Date());
        model.addAttribute("gender", "女");
        model.addAttribute("id", 5);
        List<Users> list = new ArrayList<>();
        list.add(new Users("1", "admin", 23));
        list.add(new Users("2", "kevin", 24));
        list.add(new Users("3", "lily", 25));
        list.add(new Users("4", "lucy", 26));
        model.addAttribute("list", list);

        Map<String, Users> map = new HashMap<>();
        map.put("user1", new Users("1", "admin", 23));
        map.put("user2", new Users("2", "kevin", 24));
        map.put("user3", new Users("3", "lily", 25));
        map.put("user4", new Users("4", "lucy", 26));
        model.addAttribute("map", map);
        return "index";
    }


}
