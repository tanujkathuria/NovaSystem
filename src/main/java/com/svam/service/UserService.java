package com.svam.service;

import java.util.Optional;

import com.svam.models.User;

public interface UserService {

	public Optional<User> findUser(Long id);
}
