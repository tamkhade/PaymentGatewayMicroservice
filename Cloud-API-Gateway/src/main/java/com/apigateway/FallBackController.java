package com.apigateway;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackController {

	
	@RequestMapping("/orderFallBack")
	public Mono<String> orderServiceFallback() {
		
		return Mono.just("Order service is taking too long respond or is down .please try again later");
	}
	
	
	@RequestMapping("/paymentFallBack")
	public Mono<String> paymentFallBack() {
		
		return Mono.just("Order service is taking too long respond or is down .please try again later");
	}
}
