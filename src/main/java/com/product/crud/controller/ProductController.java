package com.product.crud.controller;


import com.product.crud.model.Product;
import com.product.crud.service.ProductService;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {
    ProductService productService = new ProductService();
    public void createProduct(Product product){
        productService.save(product);
    }
    public void removeProduct(Product product){
        productService.remove(product);
    }
    public List<Product> showListProduct(){
        return productService.findAll();
    }
}