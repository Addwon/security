package com.assignments.security;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showIndex(Model model){
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
