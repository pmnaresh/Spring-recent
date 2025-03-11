package com.practice.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.practice.model.User;
import com.practice.util.UserUtil;

public class UserDao {

	UserUtil util = new UserUtil();

	public void createUserDao(User user) {

		Connection con = util.getConnetction();

		String insertQuery = "insert into user1 values (" + user.getUserId() + ",'" + user.getUserName() + "','"
				+ user.getUserLocation() + "'," + user.getUserPincode() + ")";

		System.out.println("insert query" + insertQuery);
		Statement stmt;
		try {
			stmt = con.createStatement();
			stmt.execute(insertQuery);
			
			System.out.println("succesfully user was created");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
