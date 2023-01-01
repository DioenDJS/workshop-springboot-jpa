package com.dioendweb.dioendweb.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dioendweb.dioendweb.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

	//criando um method pra ser o endpoint pra acessar os usuarios
	@GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria", "maria@gmail.com", "999999999", "123456");
		return ResponseEntity.ok().body(u);
	}
}
