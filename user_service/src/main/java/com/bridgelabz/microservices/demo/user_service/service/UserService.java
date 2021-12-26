package com.bridgelabz.microservices.demo.user_service.service;

import com.bridgelabz.microservices.demo.user_service.entity.User;

public interface UserService {

	public User getUser(Long id);
}
