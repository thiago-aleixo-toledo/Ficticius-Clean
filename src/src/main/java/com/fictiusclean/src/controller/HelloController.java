package com.fictiusclean.src.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class HelloController {

    @GetMapping(value="/hello")
    public ResponseEntity<String> getMethodName() {
        return ResponseEntity.ok("Hello World VS Code");
    }
    
    
}