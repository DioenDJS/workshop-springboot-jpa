package com.dioendweb.dioendweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dioendweb.dioendweb.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
