package com.practice.model;

import java.util.List;

import com.practice.entity.Customer;

public class CustomerOrder {

	private List<Customer> customerList;
	private List<Order> orderList;

	public List<Customer> getCustomerList() {
		return customerList;
	}

	public void setCustomerList(List<Customer> customerList) {
		this.customerList = customerList;
	}

	public List<Order> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Order> orderList) {
		this.orderList = orderList;
	}

	@Override
	public String toString() {
		return "CustomerOrder [customerList=" + customerList + ", orderList=" + orderList + "]";
	}

}
