package com.tts.productAPI.controller;


import com.tts.productAPI.Service.ProductService;
import com.tts.productAPI.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;


@RequestMapping("/product")
@RestController
public class ProductController {

    ProductService productService;

    public ProductController (ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Optional<Product> getProductById(@PathVariable Long id) {
        return productService.getProduct(id);
    }

    @GetMapping("/all")
    public Iterable<Product> getAllProducts() {
        return productService.getAllProducts();
    }


}
