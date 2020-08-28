package com.fictiusclean.src.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController()
public class HelloController {

    @GetMapping(value="/")
    public String getMethodName() {
        return "Hello World VS Code";
    }
    
    
}