package com.example.hello.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() {
        return "Hello from GET!";
    }

    @PostMapping
    public String sayHelloPost() {
        return "Hello from POST!";
    }

    @PutMapping
    public String sayHelloPut() {
        return "Hello from PUT!";
    }

    @DeleteMapping
    public String sayHelloDelete() {
        return "Hello from DELETE!";
    }
}
