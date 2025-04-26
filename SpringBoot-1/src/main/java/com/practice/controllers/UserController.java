package com.practice.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.User;

@RestController
public class UserController {

	@GetMapping("/users")
	public List<User> getAllUsers() {

		List<User> userList = new ArrayList<>();
		userList.add(new User("John", 30));
		userList.add(new User("Jane", 25));

		return userList;

	}

}
