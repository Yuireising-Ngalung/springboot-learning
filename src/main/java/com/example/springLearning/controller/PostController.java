package com.example.springLearning.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/testing/")
public class PostController {

    @PostMapping("test")
    public String postTesting(){
        return "Post Mapping is working";
    }
}
