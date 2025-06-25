package com.sy18346.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {
    @GetMapping("/")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hidden-page")
    public String hiddenPage() {
        return "hidden-page";
    }
}
