package com.practice.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.practice.entity.Customer;
import com.practice.model.GetByPinandNameRequest;
import com.practice.repository.CustomerRepository;
import com.practice.service.CustomerServcie;


@Service
public class CustomerServiceImpl implements CustomerServcie {
	
	@Autowired
	CustomerRepository custRepo;

	@Override
	public String saveCustomerService(Customer customer) {
		System.out.println("in customerserviceimpl class-->"+customer);
		custRepo.save(customer);
		return "success";
	}
	@Override
	public Optional<Customer> getByCustomerId(int customerId){
		System.out.println("in getbypincode method ");
		
		return custRepo.findById(customerId);
		
		
	}

	@Override
	public List<Customer> getByPincodeandNameServcie(GetByPinandNameRequest getByPinandNameRequest) {
		System.out.println("in repo class");
		return custRepo.findBycPincodeAndcName(getByPinandNameRequest.getCpincode(),getByPinandNameRequest.getcName());
	}
	@Override
	public List<Customer> getAllCustomer() {
		System.out.println("getAllCustomer in repo");
		List<Customer> listOfCustomer=	(List<Customer>) custRepo.findAll();
		return listOfCustomer;
	}
}
