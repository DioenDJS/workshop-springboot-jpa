package com.dioendweb.dioendweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dioendweb.dioendweb.entities.Order;
import com.dioendweb.dioendweb.repositories.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository repository;
	
	public List<Order> findAll(){
		
		return repository.findAll();
	}
	
	public Order findById(Long id) {
		
		Optional<Order> obj = repository.findById(id);
		return obj.get();
				
	}
}
