package com.dioendweb.dioendweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dioendweb.dioendweb.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
