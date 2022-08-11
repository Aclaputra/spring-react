package com.spring.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.crud.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

    /**
     * make new method findByName from ProductService
     * @param name
     * @return
     */
    Product findByName(String name);
    
}