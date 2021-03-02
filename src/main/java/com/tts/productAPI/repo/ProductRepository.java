package com.tts.productAPI.repo;

import com.tts.productAPI.model.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProductRepository extends CrudRepository<Product,Long> {

}
