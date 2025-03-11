package com.practice.dao.impl;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import com.practice.model.ProductDetails;

@Repository
public class ProductDaoImpl {
	
	@Autowired
	@Qualifier("session")
	Session session;
	
	public void createRecord(ProductDetails pd) {
		
		session.save(pd);
		session.beginTransaction().commit();
		session.close();
		System.out.println("success");
	}

}
