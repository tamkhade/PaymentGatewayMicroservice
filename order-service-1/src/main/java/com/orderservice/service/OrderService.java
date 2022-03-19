package com.orderservice.service;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.orderservice.commonapi.Payment;
import com.orderservice.commonapi.TransactionRequest;
import com.orderservice.commonapi.TransactionResponse;
import com.orderservice.dao.OrderRepository;
import com.orderservice.entity.Order;

@Service
public class OrderService {
	
@Autowired

private OrderRepository orderRepository;

@Autowired

private RestTemplate restTemplate;


public TransactionResponse saveOrders(TransactionRequest transactionRequest)
{
	String response;
	 Order order = transactionRequest.getOrder();	
	    Payment payment = transactionRequest.getPayment();
	    payment.setOrderId(order.getId());
	    payment.setAmount(order.getPrice());
	    
     	Payment paymentresponse =  restTemplate.postForObject("http://PAYMENT-SERVICE/payment/paymentservice", payment, Payment.class);
	    response = paymentresponse.getPaymentstatus().equals("success") ? "paumentprocess successfully and order sccessfully place":"payment fail";
	
	    orderRepository.save(order);
	return new TransactionResponse(order, paymentresponse.getTransactionId(), payment.getAmount(), response);
}
}
