package com.svam.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.svam.models.User;
import com.svam.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService{

	@Autowired 
	UserRepository userRepository;
	
	@Override
	public Optional<User> findUser(Long id) {
		return userRepository.findById(id);
	}

}
