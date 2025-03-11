package com.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan("com.practice")
public class ApplicationConfig {
	
	
	@Bean("DataSource")
	public DriverManagerDataSource getDataSource() {
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@DESKTOP-2GU83B7:1521:XE");
		dataSource.setUsername("SYSTEM");
		dataSource.setPassword("system");
		
		return dataSource;
	}
	
	
	@Bean("JDBCTemplate")
	public JdbcTemplate getJDBCtemplate() {
		
		JdbcTemplate jdbc =new JdbcTemplate(getDataSource());
		
		return jdbc;
	}
	

}
