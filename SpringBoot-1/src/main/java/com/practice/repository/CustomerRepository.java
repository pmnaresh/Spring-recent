package com.practice.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.practice.entity.Customer;

import jakarta.transaction.Transactional;


@Repository
public interface CustomerRepository extends CrudRepository<Customer, Integer>{
	
	@Query(value ="select * from customer_details c where c.CUSTOMER_PINCODE=(:pincode) and c.CUSTOMER_NAME=(:name)",nativeQuery=true)
	List<Customer> findBycPincodeAndcName(@Param("pincode") long pincode ,@Param("name") String name);

}
