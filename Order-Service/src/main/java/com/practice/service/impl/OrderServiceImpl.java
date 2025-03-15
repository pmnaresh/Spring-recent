package com.practice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Order;
import com.practice.repository.OrderRepository;
import com.practice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	OrderRepository orderRepository;
	
	@Override
	public String saveOrder(Order order) {
		Order order1=	orderRepository.saveAndFlush(order);
		System.out.println(order1);
		
		return "Successfully added to order details table";
	}

	@Override
	public Order getOrderByIDService(Integer id) {
	Optional<Order> order	=orderRepository.findById(id);
		return order.get();
	}

	@Override
	public List<Order> getAllOrdersServcie() {
		// TODO Auto-generated method stub
		return orderRepository.findAll();
	}

}
