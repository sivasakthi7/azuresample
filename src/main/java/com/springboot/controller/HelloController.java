package com.springboot.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/hello")
    Map<String, String> hello() {
        return java.util.Collections.singletonMap("greeting", "Hello from Azure Spring Cloud");
    }
}