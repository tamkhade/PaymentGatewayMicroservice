package com.orderservice.paymentservice;

import java.util.Random;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderservice.entity.Payment;
import com.orderservice.repository.PaymentRepository;

@Service
public class PaymentService {
	
	
	@Autowired
	PaymentRepository paymentRepository;
	
	public Payment savePayment(Payment payment)
	{
		payment.setPaymentstatus(paymentProcessing());
		payment.setTransactionId(UUID.randomUUID().toString());
	  return paymentRepository.save(payment);
	}
	
	
	public String paymentProcessing()
	{
		//api should third party payment gateway paytm..
		return new Random().nextBoolean() ? "success":"false";
		
	}


	public Payment findPaymentHistoryByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return paymentRepository.findByOrderId(orderId);
	}
	
	

}
