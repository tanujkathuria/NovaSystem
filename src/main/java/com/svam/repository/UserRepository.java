package com.svam.repository;

import org.springframework.data.repository.CrudRepository;

import com.svam.models.User;

public interface UserRepository extends CrudRepository<User, Long>{

	User findByName(String name);
}
