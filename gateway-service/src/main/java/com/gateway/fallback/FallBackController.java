package com.gateway.fallback;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@RestController
public class FallBackController {
	
	@RequestMapping("/studentFallback")
	Mono<String> studentFallBack() {
		return Mono.just("student-service is down");
	}
	
	
}
