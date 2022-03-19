package com.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.orderservice.entity.Payment;

@Repository
public interface PaymentRepository  extends JpaRepository<Payment, Integer>{

	Payment findByOrderId(int orderId);

}
