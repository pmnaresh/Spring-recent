package com.practice.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.practice.entity.Customer;
import com.practice.model.CustomerOrder;
import com.practice.model.Order;
import com.practice.service.CustomerOrderService;
import com.practice.service.CustomerServcie;

@Service
public class CustomerOrderServiceImpl implements CustomerOrderService {

	@Autowired
	CustomerServcie customerServcie;

	@Autowired
	@Qualifier("getRestTemplate")
	RestTemplate restTemplate;

	@Override
	public CustomerOrder getCustomerOrder() {
		List<Customer> listOfCustomer = customerServcie.getAllCustomer();
		System.out.println("listOfCustomer-->" + listOfCustomer);

		List<Order> listOfOrders = Arrays
				.asList(restTemplate.getForObject("http://localhost:8081/getAllOrders", Order[].class));

		System.out.println("listOfOrders-->" + listOfOrders);

		CustomerOrder customerOrder = new CustomerOrder();
		customerOrder.setCustomerList(listOfCustomer);
		customerOrder.setOrderList(listOfOrders);

		return customerOrder;
	}

}
