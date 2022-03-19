package com.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.entity.Payment;
import com.orderservice.paymentservice.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	@Autowired
	PaymentService paymentService;
	
	@PostMapping("/paymentservice")
	public Payment savePayment(@RequestBody Payment payment)
	{
		
		return paymentService.savePayment(payment);	
	}
	
	@GetMapping("/{orderId}")
	public Payment findPaymentHistoryByOrderId(@PathVariable int orderId)
	{
		System.out.println("order id "+orderId);
		return paymentService.findPaymentHistoryByOrderId(orderId);
	}
	
}
