package com.example.FirstSpringProject.controller;

import com.example.FirstSpringProject.model.Product;
import com.example.FirstSpringProject.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
public class ProductController {
    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts(){
     return service.getProducts();
    };

    @GetMapping("/products/{id}")
    public  Product getProductById( @PathVariable int id){
        return service.getProductById(id);


    }

    @PostMapping("/products")
    public  void addProduct( @RequestBody Product product){
        System.out.println(product);
        service.addProduct(product);
    }

    @PutMapping("/products")
    public  void updateProduct(@RequestBody Product prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/products/{prodId}")
    public  void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
