package com.example.springLearning.modal;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProductModal {
    private int productId;

    @NotBlank(message = "Null value not accepted")
    @Size(min=3, max=5, message = "minimum 3 character and maximum 5 character")
    private String productName;
    private int productPrice;

    public ProductModal(int productId, String productName, int productPrice) {
        this.productId = productId;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "ProductModal{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
