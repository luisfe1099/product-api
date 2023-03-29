package com.example.productapi.service;

import com.example.productapi.model.Product;
import com.example.productapi.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.assertj.core.api.Assertions.assertThat;

@ExtendWith(MockitoExtension.class)
public class ProductServiceImplTest extends ProductUtilities {

    private Product productToCreate;
    private Product productCreated;

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    @BeforeEach
    void setUp() {
        productToCreate = buildNewProduct();
    }

    @Test
    void GivenAProductItShouldSaveIt() {
        Mockito.when(productRepository.save(productToCreate)).thenReturn(productCreated);
        productCreated = productService.save(productToCreate);
        assertThat(productCreated.getName()).isSameAs(productToCreate.getName());
    }

}
