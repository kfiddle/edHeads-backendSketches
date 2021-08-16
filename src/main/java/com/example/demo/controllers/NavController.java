package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class NavController {


    @RequestMapping("/user-entry-form")
    public String displayUserEntryFormPage() {

        return "userEntry";
    }

    @RequestMapping("/welcome")
    public String displayWelcomePage() {

        return "welcome";
    }

    @RequestMapping("/about-us")
    public String displayAboutUsPage() {

        return "aboutUs";
    }

    @RequestMapping("/faq")
    public String displayFaqPage() {

        return "faq";
    }

}
