package com.springsecurity.springsecurity;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class GreetingsController {

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello";
    }
}
