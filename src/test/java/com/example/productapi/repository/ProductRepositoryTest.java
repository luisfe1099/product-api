package com.example.productapi.repository;

import com.example.productapi.model.Product;
import com.example.productapi.service.ProductUtilities;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.Optional;

@DataJpaTest
public class ProductRepositoryTest extends ProductUtilities {

    @Autowired
    private ProductRepository productRepository;

    @Test
    void save() {
        Product newProduct = productRepository.save(buildNewProduct());
        Assertions.assertNotNull(newProduct);
        Assertions.assertEquals(1L, newProduct.getId());
    }

}
