package com.product.crud.service;

import com.product.crud.model.Product;
import com.product.crud.repo.CrudRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@Service
public class CrudService {
    @Autowired
    private CrudRepo repo;

    public List<Product> fetchProductList(){
    return repo.findAll();
    }

    public Product saveProductToDB(Product product)
    {
       return repo.save(product);
    }

    public Optional<Product> fetchProductById(int id){
        return repo.findById(id);
    }

    public String deleteProductById(int id){
        String result;
        try{
            repo.deleteById(id);
            result = "product succesfully delete";
        }catch (Exception e){
            result = "product with id is not delete";
        }
        return result;
    }
}
