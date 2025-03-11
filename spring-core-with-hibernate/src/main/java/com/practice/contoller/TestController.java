package com.practice.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.practice.config.AppConfig;
import com.practice.model.ProductDetails;
import com.practice.serivices.ProductDetailsService;
import com.practice.service.impl.ProductDetailsServiceimpl;

public class TestController {

	
	public static void main(String[] args) {
		
		
		ProductDetails pd=new ProductDetails();
		pd.setpId(2445);
		pd.setpName("Mobile");
		pd.setpPrice(12345f);
		
		ApplicationContext context =new AnnotationConfigApplicationContext(AppConfig.class);
		
	ProductDetailsService service=	context.getBean(ProductDetailsServiceimpl.class);
	
	service.createProductService(pd);
		

	}

}
