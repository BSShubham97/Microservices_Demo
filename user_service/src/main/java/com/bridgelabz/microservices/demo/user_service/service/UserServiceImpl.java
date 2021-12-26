package com.bridgelabz.microservices.demo.user_service.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabz.microservices.demo.user_service.entity.User;

@Service
public class UserServiceImpl implements UserService {

	//fake user list
	List<User> list = List.of(
			new User(1311L,"Shubham","9004608565"),
			new User(1312L,"Sanjay","9005608665"),
			new User(1313L,"Mukesh","9014609565")
			);
			
	
	@Override
	public User getUser(Long id) {
		return list.stream().filter(user-> user.getUserId().equals(id)).findAny().orElse(null) ;
	}

	
}
