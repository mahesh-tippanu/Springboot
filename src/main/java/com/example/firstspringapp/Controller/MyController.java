package com.example.firstspringapp.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/hello")
    public ResponseEntity<String> firstMethod(@RequestParam(required = false) String name){
        return new ResponseEntity<>("Hello from BridgeLabz", HttpStatus.ACCEPTED);
    }
}
