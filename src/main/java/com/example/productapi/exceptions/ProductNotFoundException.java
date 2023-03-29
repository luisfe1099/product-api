package com.example.productapi.exceptions;

public class ProductNotFoundException extends RuntimeException {
    public ProductNotFoundException() {
        super("No records in DB");
    }
}
