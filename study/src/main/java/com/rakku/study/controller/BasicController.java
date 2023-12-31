package com.rakku.study.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController implements ErrorController {

    @GetMapping("/")
    public String root(){
        return "index";
    }

    @RequestMapping("/error")
    public String errorPage(){
        return "error";
    }
}
