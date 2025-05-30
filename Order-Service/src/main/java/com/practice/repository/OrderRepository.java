package com.practice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.practice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
