package com.example.FirstSpringProject.service;

import com.example.FirstSpringProject.model.Product;
import com.example.FirstSpringProject.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Service
public class ProductService {
    @Autowired
    ProductRepo productRepo ;
//  List<Product> products =  new ArrayList<>(Arrays.asList( new Product(101,"Iphone",5000),new Product(102,"Canon Camera",7000),new Product(103,"Surez Mic",10000)));
    public List<Product> getProducts(){
        return productRepo.findAll();

    };

    public Product getProductById(int id) {
        return productRepo.findById(id).orElse(new Product());
    }

    public  void addProduct(Product prod){
        productRepo.save(prod);
    }

    public void updateProduct(Product prod) {
        productRepo.save(prod);



    }

    public void deleteProduct(int prodId) {
     productRepo.deleteById(prodId);
    }
}
