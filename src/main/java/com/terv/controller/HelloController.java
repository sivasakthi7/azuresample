package com.terv.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Collection;
import java.util.Map;

@RestController
@RequestMapping("api/")
public class HelloController {

	@GetMapping(value = "/hello")
   public Map<String, String> hello() {
        return java.util.Collections.singletonMap("greeting", "Hello from Azure Spring Cloud");
    }
}