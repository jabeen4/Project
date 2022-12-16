package com.deloitte.stream;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@FeignClient(name = "REGISTER-SERVICE")
public interface RegisterDetailsConsumer {
	
	
	@GetMapping("/register/getid/{registerId}")
	public RegisterDetails getById(@PathVariable("registerId")  Integer registerId);
	
	@GetMapping("/register/getall")
	public List<RegisterDetails> getAllUser();
	

}
