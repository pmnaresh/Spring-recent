package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.dao.impl.ProductDaoImpl;
import com.practice.model.ProductDetails;
import com.practice.serivices.ProductDetailsService;

@Service
public class ProductDetailsServiceimpl implements ProductDetailsService {
	
	@Autowired
	ProductDaoImpl prodcuDaoimpl;
	
	public void createProductService(ProductDetails pd) {
		prodcuDaoimpl.createRecord(pd);
		
	}

}
