package com.example.springLearning.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/testing/")
public class GetController {

    @GetMapping("products")
    public String getProduct(){
        return "Your products is preparing...";
    }

    @GetMapping("products/{id:[0-9]+}")
    public int productSearchById(@PathVariable int id){
        return id;
    }

    @GetMapping("products/{id:[0-9]+}/{productName:[a-zA-Z]+}")
    public String productSearchByTitle(@PathVariable int id, @PathVariable String productName){
        return "Product ID is: "+ id + " Product name is: "+ productName;
    }
}
