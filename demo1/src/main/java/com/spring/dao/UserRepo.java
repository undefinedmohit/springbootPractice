package com.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.entities.User;

public interface UserRepo extends CrudRepository<User, Integer> {

}
