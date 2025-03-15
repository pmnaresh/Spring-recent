package com.practice.service;

import java.util.List;
import java.util.Optional;

import com.practice.entity.Customer;
import com.practice.model.GetByPinandNameRequest;

public interface CustomerServcie {
	
	public String saveCustomerService(Customer customer);
	public Optional<Customer> getByCustomerId(int customerId);
	public List<Customer> getByPincodeandNameServcie(GetByPinandNameRequest getByPinandNameRequest);
	public List<Customer> getAllCustomer();

}
