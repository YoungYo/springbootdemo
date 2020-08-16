package com.bjsxt.springbootvalidate.controller;

import com.bjsxt.springbootvalidate.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.constraints.NotBlank;
import java.util.List;

@Controller
@RequestMapping("/user")
@Validated
public class UserController {

    @RequestMapping("addUserPage")
    public String addUserPage() {
        return "addUser";
    }

    @RequestMapping("addUser")
    public String addUser(@Validated User user, BindingResult result) {
        if (result.hasErrors()) {
            List<ObjectError> errors = result.getAllErrors();
            for (ObjectError error: errors) {
                FieldError fieldError = (FieldError)error;
                String fieldName = fieldError.getField();
                String message = fieldError.getDefaultMessage();
                System.out.println(fieldName + "\t" + message);
            }
            return "addUser";
        }
        System.out.println(user);
        return "ok";
    }

    @PostMapping("findUser")
    public String findUser(@NotBlank String username) {
        System.out.println(username);
        return "ok";
    }
}
