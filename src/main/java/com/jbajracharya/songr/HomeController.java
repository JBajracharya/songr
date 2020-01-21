package com.jbajracharya.songr;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class HomeController {
    @GetMapping("/hello")
    public String getHome() {
        return "hello";
    }

    @GetMapping("/capitalize/{title}")
    public String getCapitalizedHello(@PathVariable String title, Model m) {
        m.addAttribute("heading", title);
        return "capitalize";
    }
}
