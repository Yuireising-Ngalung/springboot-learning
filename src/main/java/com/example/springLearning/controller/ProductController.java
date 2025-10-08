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

    @PutMapping("products/updateProduct/{id}")
    public String updateProduct(@PathVariable int id, @RequestBody ProductModal productModal){
        System.out.println(productModal);
        return productService.updateProduct(id,productModal);
    }

    @PatchMapping("products/changeProductData/{id}")
    public String changeProductData(@PathVariable int id, @RequestBody ProductModal productModal){
        System.out.println(productModal);
        return productService.changeProductData(id, productModal);
    }

    @DeleteMapping("products/{id}")
    public String deleteProduct(@PathVariable int id){
        return productService.deleteProduct(id);
    }
}
