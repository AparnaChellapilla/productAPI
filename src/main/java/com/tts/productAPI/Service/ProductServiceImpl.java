package com.tts.productAPI.Service;

import com.tts.productAPI.model.Product;
import com.tts.productAPI.repo.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {

   ProductRepository productRepository;

   public ProductServiceImpl(ProductRepository productRepository) {
       this.productRepository = productRepository;
   }


    @Override
    public Optional<Product> getProduct(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }
}
