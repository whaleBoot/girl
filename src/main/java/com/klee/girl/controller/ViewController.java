package com.klee.girl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ViewController {

    @GetMapping(value = "/index")
    public String hello() {
        return "index";
    }
}
