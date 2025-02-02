package com.home.evuela.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @GetMapping("/")
    public String main() {
        System.out.println("Hello World");
        return "Hello World";
    }

    @GetMapping("/test")
    public String test() {
        return "test";
    }
}
