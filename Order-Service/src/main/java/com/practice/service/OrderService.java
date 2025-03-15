package com.practice.service;

import java.util.List;

import com.practice.entity.Order;

public interface OrderService {
	
	public String saveOrder(Order order);

	public Order getOrderByIDService(Integer id);

	public List<Order> getAllOrdersServcie();

}
