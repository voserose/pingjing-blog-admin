package com.tiandisifang.blog.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/base")
public class Base {
    @RequestMapping("/getBase")
    public String BaseMe() {
        return "777";
    }
}
