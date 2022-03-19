package com.orderservice.commonapi;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Payment {
	
	
	private int paymentid;
	private String paymentstatus;
	private String transactionId;
	private double amount;
	private int orderId;
	
}
