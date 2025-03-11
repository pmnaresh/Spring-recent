package com.practice.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.practice.model.User;
import com.practice.pojo.Address;

@Configuration  // it will configure the bean this is like bean factory which contains multiple beans
@ComponentScan("com.practice")   // it will scan the base packages mentioned 
public class ApplicationConfig {
	
	@Bean(name="userBean")
	public User getUser() {
		return new User(1010, "Naresh", 9999999, new Address());
	}
	
	@Bean(name="address1")
	public Address getAddress1() {
		return new Address(123, "Maruthi nagar");
	}
	
	@Bean(name="address2")
	public Address getAddress2() {
		return new Address(13, "nagar");
	}

}
