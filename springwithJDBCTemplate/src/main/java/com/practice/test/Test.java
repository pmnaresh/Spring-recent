package com.practice.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.config.ApplicationConfig;
import com.practice.dao.LaptopDao;
import com.practice.model.Laptop;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
		System.out.println("context-->"+context);
	LaptopDao dao=	context.getBean(LaptopDao.class);
	
	dao.insertLpatop();

	}

}
