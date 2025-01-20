package com.example.parser.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ParsingController {

    @Value("${pass-nish}")
    private String sec;

    @GetMapping("/test")
    public String test() {
        return sec;
    }

}
