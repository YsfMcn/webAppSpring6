package com.training.conference.controller;

import com.training.conference.model.Registration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {

        return "registration"; // returned string used by ViewResolver to find jsp page named registration in location specified within our ViewResolver (view location set in application.yml)
    }

    @PostMapping("registration")
    public String addRegistration(@ModelAttribute("registration") Registration registration) {
        System.out.println("Registration: " + registration.getName());
        return "redirect:registration"; // redirect: calls the Get "registration" endpoint
    }
}
