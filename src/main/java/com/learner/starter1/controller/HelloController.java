package com.learner.starter1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @GetMapping(value = "/")
    public  String helloWorld(){
        return "Hey..!! This is a homepage.";
    }
}
