package com.product.crud.service;


import com.product.crud.model.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    public static List<Product> productList = new ArrayList<>();

    public void save(Product product) {
        productList.add(product);
    }

    public void remove(Product product) {
        productList.remove(product);
    }

    public List<Product> findAll() {
        return productList;
    }

}
