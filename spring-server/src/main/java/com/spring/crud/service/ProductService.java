package com.spring.crud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.crud.entity.Product;
import com.spring.crud.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    /**
     * @Autowired ProductRepository
     * nyambung dengan function function pada ProductRepositry.java
     */
    @Autowired
    private ProductRepository repository;

    /**
     * Post methods
     * @param product
     * @return
     */
    public Product saveProduct(Product product) {
        return repository.save(product);
    }
    public List<Product> saveProducts(List<Product> products) {
        return repository.saveAll(products);
    }

    /**
     * Get methods
     * @return
     */
    public List<Product> getProducts() {
        return repository.findAll();
    }
    public Product getProductById(int id) {
        return repository.findById(id).orElse(null);
    }
    /**
     * findByName not listed in library we have to make custom
     * by making new method in ProductRepository
     * @param name
     * @return
     */
    public Product getProductByName(String name) {
        return repository.findByName(name);
    }
    public String deleteProduct(int id) {
        repository.deleteById(id);
        return "product removed !! " + id;
    }
    public Product updateProduct(Product product) {
        Product existingProduct = repository.findById(product.getId()).orElse(null);
        existingProduct.setName(product.getName());
        existingProduct.setQuantity(product.getQuantity());
        existingProduct.setPrice(product.getPrice());
        return repository.save(existingProduct);
    }

}