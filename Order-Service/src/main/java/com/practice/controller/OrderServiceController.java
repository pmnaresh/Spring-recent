package com.practice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Order;
import com.practice.service.OrderService;

@RestController
public class OrderServiceController {
	
	@Autowired
	OrderService orderService;
	
	@PostMapping("/saveOrder")
	public String saveOrderController(@RequestBody Order order) {
		return orderService.saveOrder(order);
	}
	
	@GetMapping("/getByOrder/{orderId}")
	public Order getOrderByOrderId(@PathVariable("orderId") Integer id) {
		return orderService.getOrderByIDService(id);
		
	}
	
	@GetMapping("/getAllOrders")
	public List<Order> getAllOrders() {
		return orderService.getAllOrdersServcie();
		
	}
	

}
