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

//    public List<ProductModal> addProduct(ProductModal productModal) {
//        products.add(productModal);
//        return products;
//    }

    public String addProduct(ProductModal productModal) {
        products.add(productModal);
        return "Product detail added successfully";
    }

    public String updateProduct(int id, ProductModal productModal) {
        for (ProductModal product : products){
            if(product.getProductId() == id){
                product.setProductId(productModal.getProductId());
                product.setProductId(productModal.getProductId());
                product.setProductName(productModal.getProductName());
                product.setProductPrice(productModal.getProductPrice());

                return "Product Update successfully";
            }
        }

        return "No Product found with ID: " + id;

    }

    public String changeProductData(int id, ProductModal productModal) {
        for(ProductModal product : products){
            if(product.getProductId() == id){
                product.setProductName(productModal.getProductName());
                return "Updated Successfully";
            }
        }
        return "No Product found with ID: "+ id;
    }

    public String deleteProduct(int id) {
        for(int i=0; i<products.size(); i++){
            if(products.get(i).getProductId() == id) {
                products.remove(i);
                return "Product Deleted";
            }
        }
        return "No Product found with ID: " + id;
    }
}
