package com.practice.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class UserUtil {

	public Connection getConnetction() {

		Properties properties = new Properties();
		Connection con = null;
		try {
			properties.load(new FileInputStream("C:\\Naresh\\dbproperties.properties"));
			
			System.out.println(properties.getProperty("oracle.driver"));
			System.out.println(properties.getProperty("oracle.url"));
			System.out.println(properties.getProperty("oracle.username"));
			System.out.println(properties.getProperty("oracle.pass"));
			
			Class.forName(properties.getProperty("oracle.driver"));
			con = DriverManager.getConnection(properties.getProperty("oracle.url"),
					properties.getProperty("oracle.username"), properties.getProperty("oracle.pass"));

			System.out.println("successfully loaded");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return con;

	}
}
