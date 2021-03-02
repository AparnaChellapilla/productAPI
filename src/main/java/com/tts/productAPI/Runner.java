package com.tts.productAPI;

import com.tts.productAPI.model.Product;
import com.tts.productAPI.repo.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner  implements CommandLineRunner {

    @Autowired
    ProductRepository productRepository;


    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product("iPhone","Apple","Designed in USA",1200));
        productRepository.save(new Product("Android S21","Samsung","Vietnam",800));

    }
}
