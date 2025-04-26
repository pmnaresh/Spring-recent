package com.practice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.practice.entity.Customer;
import com.practice.model.GetByPinandNameRequest;
import com.practice.service.CustomerServcie;

@RestController
public class CustomerController {

	@Autowired
	CustomerServcie customerServcie;

	@GetMapping("/saveCustomer")
	public String saveCustomer( @RequestBody Customer customer) {
		System.out.println("in customer controller class"+customer);
		return customerServcie.saveCustomerService(customer);
	}

	@GetMapping("/getBycustomerId/{customerId}")
	public Optional<Customer> getBycustomerId(@PathVariable("customerId") int customerId) {
		customerServcie.getByCustomerId(customerId);
		return null;
	}

	@GetMapping("/getByNameAndPincode")
	public List<Customer> getByPincodeandName(@RequestBody GetByPinandNameRequest getByPinandNameRequest) {
		System.out.println("in getByPincodeandName method ");
		return customerServcie.getByPincodeandNameServcie(getByPinandNameRequest);
	}

	@GetMapping("/getAllCustomers")
	public List<Customer> getAllCustomers() {
		System.out.println("in getAllCustomers method ");
		return customerServcie.getAllCustomer();

	}

}
