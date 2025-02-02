package com.home.evuela.main;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import java.util.HashMap;
import java.util.Map;

@RestController
public class MainController {

    @GetMapping("/")
    public String main() {
        System.out.println("Hello World");
        return "Hello World";
    }

    @GetMapping("/test")
    public ResponseEntity<Map<String, String>> test() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "testtestest");
        return ResponseEntity.ok(response);
    }
}
