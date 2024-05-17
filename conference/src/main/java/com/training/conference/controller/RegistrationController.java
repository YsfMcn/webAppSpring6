package com.training.conference.controller;

import com.training.conference.model.Registration;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Map;

@Controller // methods are returning String which indicates View name that will be returned
public class RegistrationController {

    @GetMapping("registration")
    public String getRegistration(@ModelAttribute("registration") Registration registration) {

        return "registration"; // returned string used by ViewResolver to find jsp page named registration in location specified within our ViewResolver (view location set in application.yml)
    }

    /*
    * BindingResult gives us the errors in an object of anything that we asked to be valid upon posting to this,
    *  when we post or registration object here it will try and validate it and if there are any errors it doesn't halt or
    *  throw an exception for binding errors, it records any of those errors and passes them to method
     * */
    @PostMapping("registration")
    public String addRegistration(@Valid @ModelAttribute("registration") Registration registration,
                                  BindingResult result) {

        if(result.hasErrors()) {
            System.out.println("There were errors");
            return "registration"; // return to registration page
        }


        System.out.println("Registration: " + registration.getName());
        return "redirect:registration"; // redirect: calls the Get "registration" endpoint
    }
}
