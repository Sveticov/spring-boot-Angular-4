package com.sveticov.springangular.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    @GetMapping("/cont")
    @ResponseBody
    public String textGetTest() {
       String text="\'<i>my text 2</i>";
        return text;
    }
}
