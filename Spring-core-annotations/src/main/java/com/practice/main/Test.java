package com.practice.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.config.ApplicationConfig;
import com.practice.model.User;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println(context);

		User user = (User) context.getBean("userBean");

		System.out.println(user);

	}

}
