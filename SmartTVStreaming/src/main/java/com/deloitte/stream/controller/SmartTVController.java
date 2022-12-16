package com.deloitte.stream.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.stream.RegisterDetailsConsumer;
import com.deloitte.stream.Service.SmartTVService;
import com.deloitte.stream.entity.SmartTV;
import com.deloitte.stream.model.FailureResponse;
import com.deloitte.stream.model.MovieSpecs;
import com.deloitte.stream.model.Movies;
import com.deloitte.stream.model.RegisterDetails;
import com.deloitte.stream.model.Response;
import com.deloitte.stream.model.Responsechild;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
@RequestMapping("/smarttv")
public class SmartTVController {
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private SmartTVService smartTVService;
	
	private RegisterDetailsConsumer consumer;
	
	@GetMapping("/getallusers")
	public ResponseEntity<List<SmartTV>> getAllUsers(){
		
		
		List<SmartTV> smartTVList = smartTVService.getAllUsers();
		return new ResponseEntity<List<SmartTV>>(smartTVList,HttpStatus.OK);
	}
	
	
	
	@GetMapping("/getlocation/{location}")
	public ResponseEntity<List<SmartTV>> getUserByLocation(@PathVariable("location") String location){
		
		List<SmartTV> smartTV = smartTVService.getUserByLocation(location);
		
		return new ResponseEntity<List<SmartTV>>(smartTV,HttpStatus.OK);
	}

	@GetMapping("/get/{ott}")
	public ResponseEntity<List<SmartTV>> getUserByOTT(@PathVariable("ott") String ott){
		
		List<SmartTV> smartTV = smartTVService.getUserByOTT(ott);
		
		return new ResponseEntity<List<SmartTV>>(smartTV,HttpStatus.OK);
		
	}
	
	
	
	@GetMapping("/getid/{userProfileId}")
    @HystrixCommand(fallbackMethod = "orderFailureFallback")
	public ResponseEntity<?> getUser(@PathVariable("userProfileId") Integer userProfileId,@PathVariable("userProfileId") Integer movieId) {
		
		SmartTV smartTV = smartTVService.getUser(userProfileId,movieId);
		
		List<Movies> movieList = restTemplate.getForObject("http://localhost:8081/movie/get/"+userProfileId,List.class);
		
		List<MovieSpecs> movieSpecList = restTemplate.getForObject("http://localhost:8082/moviespec/get/"+movieId,List.class);		
		Response response = new Response(smartTV,movieList,movieSpecList);
		
		return new  ResponseEntity<Response>(response,HttpStatus.OK);
		
		
	}
	
	
	public ResponseEntity<?> orderFailureFallback(@PathVariable("userProfileId") Integer userProfileId,@PathVariable("userProfileId") Integer movieId) {
		
		SmartTV smartTV = smartTVService.getUser(userProfileId,movieId);
		
				
		FailureResponse response = new FailureResponse(smartTV,"the Service is down please try again later !!");
		
		return new  ResponseEntity<FailureResponse>(response,HttpStatus.OK);
		
		
	}
	
	
	
	@GetMapping("/getregisterid/{userProfileId}")
	public ResponseEntity<Responsechild> getRegisterUser(@PathVariable("userProfileId") Integer userProfileId) {
		
		SmartTV smartTV = smartTVService.getRegisterUser(userProfileId);
		
		List<RegisterDetails> registerList = restTemplate.getForObject("http://localhost:8083/register/getregister/"+userProfileId,List.class);
		
			
		Responsechild response = new Responsechild(smartTV,registerList);
		
		return new  ResponseEntity<Responsechild>(response,HttpStatus.OK);
		
		
	}
	
	@GetMapping("/feignall")
	public List<RegisterDetails> getAllUser(){
		
		return consumer.getAllUser();
	}
    
	@GetMapping("/feignid")
	public RegisterDetails getById(Integer registerId) {
		return consumer.getById(registerId);
	}
}
