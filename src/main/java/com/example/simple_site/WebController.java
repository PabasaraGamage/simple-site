package com.example.simple_site;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/hello")
    public String home(Model model) {
        model.addAttribute("message", "Welcome to Simple Site!");
        return "index";
    }
}
