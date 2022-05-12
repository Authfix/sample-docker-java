package fr.acl.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.acl.demo.models.Product;
import fr.acl.demo.repositories.ProductRepository;

@RestController
@RequestMapping("/api/products")
public class ProductsController {
    
    @Autowired()
    private ProductRepository repository;


    @GetMapping()
    public List<Product> getProducts() {
        return this.repository.findAll();
    }
}
