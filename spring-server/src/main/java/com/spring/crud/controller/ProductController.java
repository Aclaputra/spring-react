package com.spring.crud.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.crud.entity.Product;
import com.spring.crud.service.ProductService;

@RestController
public class ProductController {
    
    /**
     * @Autowired ProductService
     * nyambung dengan function function pada ProductService.java
     */
    @Autowired
    private ProductService service;

    // POST

    /**
     * addProduct function
     * @param product
     * @return
     */
    @PostMapping("/addproduct")
    public Product addProduct(@RequestBody Product product) {
        return service.saveProduct(product);
    } 
    /**
     * addProducts function
     * @param products
     * @return
     */
    @PostMapping("/addproducts")
    public List<Product> addProducts(@RequestBody List<Product> products) {
        return service.saveProducts(products);
    } 

    // GET

    /**
     * findAllProducts function
     * @return
     */
    @GetMapping("/products")
    public List<Product> findAllProducts() {
        return service.getProducts();
    }
    /**
     * findProductById function
     * @param id
     * @return
     */
    @GetMapping("/productById/{id}")
    public Product findProductById(@PathVariable int id) {
        return service.getProductById(id);
    }
    /**
     * findProductByName function
     * @param name
     * @return
     */
    @GetMapping("/product/{name}")
    public Product findProductByName(@PathVariable String name) {
        return service.getProductByName(name);
    }

    // PUT

    /**
     * updateProduct function
     * @param product
     * @return
     */
    @PutMapping("/updateProduct")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    // DELETE

    /**
     * deleteProduct function
     * @param id
     * @return
     */
    @DeleteMapping("/deleteProduct/{id}")
    public String deleteProduct(@PathVariable int id) {
        return service.deleteProduct(id);
    }

    
}