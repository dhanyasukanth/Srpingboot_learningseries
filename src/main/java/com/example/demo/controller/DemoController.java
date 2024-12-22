package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoController {
    @GetMapping("/hi")
    public static String Hello() {
        return "hello";
    }
     @GetMapping("/hi/{name}/{age}")
    public String hi(@PathVariable String name, @PathVariable  int age) {
        return name + " " + age  + " hello!!";
     }

}
