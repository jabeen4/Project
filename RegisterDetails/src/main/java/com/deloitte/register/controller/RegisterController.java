package com.deloitte.register.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.register.entity.RegisterDetails;
import com.deloitte.register.service.RegisterService;

@RestController
@RequestMapping("/register")
public class RegisterController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private RegisterService registerService;
	
	@GetMapping("/getall")
	public ResponseEntity<List<RegisterDetails>> getAllUser(){
		
		List<RegisterDetails> registerList = registerService.getAllUsers();
		
		return new ResponseEntity<List<RegisterDetails>>(registerList,HttpStatus.OK);
		
	}
	
	@GetMapping("/getid/{registerId}")
	public ResponseEntity<RegisterDetails> getById(@PathVariable("registerId") Integer registerId){
		
		RegisterDetails register = registerService.getById(registerId);
		
		return new ResponseEntity<RegisterDetails>(register,HttpStatus.OK);
		
	}
	
	@GetMapping("/getregister/{userProfileId}")
	public ResponseEntity<List<RegisterDetails>> findByUserProfileId(@PathVariable("userProfileId") Integer userProfileId){
		
		List<RegisterDetails> register = registerService.findByUserProfileId(userProfileId);
		
		return new ResponseEntity<List<RegisterDetails>>(register,HttpStatus.OK);
		
	}
	

}
