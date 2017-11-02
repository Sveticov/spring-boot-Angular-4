package com.sveticov.springangular.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    @GetMapping("/ang")
    public String test(){
        return "My test Angular 4";
    }
}
