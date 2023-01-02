package com.dioendweb.dioendweb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dioendweb.dioendweb.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
