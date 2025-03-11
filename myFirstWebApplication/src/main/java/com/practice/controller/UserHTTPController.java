package com.practice.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.practice.model.User;
import com.practice.service.UserService;

@WebServlet("/User")
public class UserHTTPController extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserService service = new UserService();
		User user = new User();

		user.setUserId(Integer.parseInt(req.getParameter("userId")));
		user.setUserName(req.getParameter("UserName"));
		user.setUserLocation(req.getParameter("UserLocation"));
		user.setUserPincode(Long.parseLong(req.getParameter("UserPincode")));
		
		System.out.println(user);
		
		service.createUser(user);

	}

}
