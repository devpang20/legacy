package com.example.app_230822;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class homeController {
    @GetMapping("/")
    @ResponseBody
    public String index() {
        return "홈";
    }
}
