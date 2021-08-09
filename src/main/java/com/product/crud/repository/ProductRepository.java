package com.product.crud.repository;

import com.product.crud.model.Product;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository {
    void save(Product product);
    void delete(Product product);
    List<Product> findAll();
}
