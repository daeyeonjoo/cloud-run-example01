package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(path = "/hello")
@RestController
public class HelloController {
    @GetMapping
    public String getHello() { return "Hello"; }
}
