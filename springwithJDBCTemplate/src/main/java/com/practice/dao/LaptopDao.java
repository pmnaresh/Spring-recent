package com.practice.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class LaptopDao {
	
	@Autowired
	@Qualifier("JDBCTemplate")
	JdbcTemplate jdbcTemplate;
	
	public void insertLpatop() {
		
		String query="insert into laptop values (1010 ,'DELL')";
		
		jdbcTemplate.update(query);
		System.out.println("success");
		
	}
	
	

}
