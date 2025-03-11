package com.practice.service;

import com.practice.dao.UserDao;
import com.practice.model.User;

public class UserService {
	
	UserDao userDao=new UserDao();
	
	public void createUser(User user) {
		userDao.createUserDao(user);
	}

}
