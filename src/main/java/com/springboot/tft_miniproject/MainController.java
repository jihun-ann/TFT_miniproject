package com.springboot.tft_miniproject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String root(){
        return "index";
    }
    @GetMapping("/2")
    public String root2(){
        return "index2";
    }
}
