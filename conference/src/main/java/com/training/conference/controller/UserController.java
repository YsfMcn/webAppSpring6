package com.training.conference.controller;

import com.training.conference.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // it makes everything returned from this controller by default a JSON body
@RequestMapping("api/v1/user")
public class UserController {

    @GetMapping("hello")
    public User getUser() {
        User user = new User();
        user.setId(1);
        user.setName("Moto");
        return user;
    }
}
