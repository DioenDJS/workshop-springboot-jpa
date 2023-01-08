package com.dioendweb.dioendweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dioendweb.dioendweb.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{

}
