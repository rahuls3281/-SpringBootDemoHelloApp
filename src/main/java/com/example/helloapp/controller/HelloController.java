package com.example.helloapp.controller;

import com.example.helloapp.model.User;
import com.example.helloapp.service.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {


    private final HelloService helloService;

    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping("/hello")
    public User sayHello() {
        return helloService.getMessage();
    }
}
