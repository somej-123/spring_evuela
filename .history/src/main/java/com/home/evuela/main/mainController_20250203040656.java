package com.home.evuela.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class mainController {

    @GetMapping("/")
    public String main() {
        return "Hello World";
    }
}
