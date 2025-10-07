package com.example.springLearning.service;

import com.example.springLearning.modal.ProductModal;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<ProductModal> products = new ArrayList<>(
            Arrays.asList(new ProductModal(1,"Apple", 150),
                    new ProductModal(2, "Mango", 100),
                    new ProductModal(3, "Grapes", 80))
    );

    public List<ProductModal> getAllProducts(){
        return products;
    }

    public List<ProductModal> addProduct(ProductModal productModal) {
        products.add(productModal);
        return products;
    }
}
