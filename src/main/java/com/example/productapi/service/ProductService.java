package com.example.productapi.service;

import com.example.productapi.model.Product;

import java.util.List;


public interface ProductService {

    Product save(Product product);

    Product getProductById(Long id);

    List<Product> getProducts();

    Product updateProduct(Product product);

    Product deleteProductById(Long id);

}
