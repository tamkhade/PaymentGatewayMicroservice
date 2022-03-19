package com.orderservice.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderservice.entity.Order;

@Repository
public interface OrderRepository extends JpaRepository<Order, Integer> {

}
