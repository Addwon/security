package com.assignments.security;

import com.assignments.security.security.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;

@Controller
public class HomeController {
    @RequestMapping("/")
    public String showIndex(Model model,Principal p,User user){
        System.out.println(p.getName());
        System.out.println(user.getRoles());
        return "index";
    }
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
