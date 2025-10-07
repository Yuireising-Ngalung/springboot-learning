package com.example.springLearning.controller;

import com.example.springLearning.modal.ProductModal;
import com.example.springLearning.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping("products")
    public List<ProductModal> getAllProducts(){
        return productService.getAllProducts();
    }

    @PostMapping("products/addProduct")
    public List<ProductModal> addProduct(@RequestBody ProductModal productModal){
        return productService.addProduct(productModal);
    }
}
