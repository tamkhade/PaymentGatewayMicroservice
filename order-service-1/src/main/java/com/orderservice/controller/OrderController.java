package com.orderservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderservice.commonapi.Payment;
import com.orderservice.commonapi.TransactionRequest;
import com.orderservice.commonapi.TransactionResponse;
import com.orderservice.entity.Order;
import com.orderservice.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {
	
	@Autowired
	private OrderService service;
	
	@PostMapping("/bookOrder")
	public TransactionResponse bookOrder(@RequestBody TransactionRequest transactionRequest)
	{
	     
		return service.saveOrders(transactionRequest);	
	}
	
	

}
