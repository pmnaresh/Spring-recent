package com.practice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.practice.model.CustomerOrder;
import com.practice.service.CustomerOrderService;

@RestController
public class CustomerOrderController {
	
	@Autowired
	CustomerOrderService customerOrderService;
	
	@GetMapping("/getCustomerOrder")
	public CustomerOrder getCustomerOrder() {
		System.out.println("In get getCustomerOrder method ");
		return customerOrderService.getCustomerOrder();
	}

}
