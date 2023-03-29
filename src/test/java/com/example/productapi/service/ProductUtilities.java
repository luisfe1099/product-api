package com.example.productapi.service;

import com.example.productapi.model.Product;

import java.math.BigDecimal;

public class ProductUtilities {

    protected Product buildNewProduct() {
        return Product.builder()
                .name("Test")
                .description("Test")
                .category("Test")
                .price(BigDecimal.valueOf(1234512))
                .build();
    }
}
