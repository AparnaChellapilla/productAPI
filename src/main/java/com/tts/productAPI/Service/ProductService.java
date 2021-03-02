package com.tts.productAPI.Service;

import com.tts.productAPI.model.Product;

import java.util.Optional;

public interface ProductService {

     Optional<Product> getProduct(Long id);
     Iterable<Product> getAllProducts();
}
