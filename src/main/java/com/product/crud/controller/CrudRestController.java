package com.product.crud.controller;

import com.product.crud.model.Product;
import com.product.crud.service.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.ArrayList;
import java.util.List;

@RestController
public class CrudRestController {
    @Autowired
    private CrudService service;


    @GetMapping("getproductlist")
    public List<Product> fetchProducList() {
        List<Product> products = new ArrayList<Product>();
        products = service.fetchProductList();
        return products;
    }

    @PostMapping("addproduct")
    public Product saveProduct(@RequestBody Product product) {
        return service.saveProductToDB(product);
    }

    @GetMapping("/getproducbyid/{id}")
    public Product fetchProductById(@PathVariable int id){
        return  service.fetchProductById(id).get();
    }

    @GetMapping("/deleteproductbyid/{id}")
    public String DeleteProdoductById(@PathVariable int id){
        return  service.deleteProductById(id);
    }

    @DeleteMapping("deleteproductbyid/{id}")
    public  String DeleteProducById(@PathVariable int id){
        return service.deleteProductById(id);
    }
}
