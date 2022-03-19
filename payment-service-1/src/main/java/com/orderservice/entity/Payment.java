package com.orderservice.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="payment")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment {
	
	@Id
	@GeneratedValue
	private int paymentid;
	private String paymentstatus;
	private String transactionId;
	private int orderId;
	private double amount;
	

}
