package com.deloitte.stream;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/smarttv")
public class SmartTVController {



	@Autowired
	private SmartTVServiceImpl smartTVService;

	@Autowired
	private RegisterDetailsConsumer consumer;

	@GetMapping("/getallusers")
	public ResponseEntity<List<SmartTV>> getAllUsers() {

		List<SmartTV> smartTVList = smartTVService.getAllUsers();
		return new ResponseEntity<List<SmartTV>>(smartTVList, HttpStatus.OK);
	}

	@GetMapping("/getlocation/{location}")
	public ResponseEntity<List<SmartTV>> getUserByLocation(@PathVariable("location") String location) {

		List<SmartTV> smartTV = smartTVService.getUserByLocation(location);

		return new ResponseEntity<List<SmartTV>>(smartTV, HttpStatus.OK);
	}

	@GetMapping("/get/{ott}")
	public ResponseEntity<List<SmartTV>> getUserByOTT(@PathVariable("ott") String ott) {

		List<SmartTV> smartTV = smartTVService.getUserByOTT(ott);

		return new ResponseEntity<List<SmartTV>>(smartTV, HttpStatus.OK);

	}
//
//	@GetMapping("/getid/{userProfileId}")
//	public ResponseEntity<Response> getUser(@PathVariable("userProfileId") Integer userProfileId,
//			@PathVariable("userProfileId") Integer movieId) {
//
//		SmartTV smartTV = smartTVService.getUser(userProfileId, movieId);
//
//		List<Movies> movieList = restTemplate.getForObject("http://localhost:8081/movie/get/" + userProfileId,
//				List.class);
//
//		List<MovieSpecs> movieSpecList = restTemplate.getForObject("http://localhost:8082/moviespec/get/" + movieId,
//				List.class);
//		Response response = new Response(smartTV, movieList, movieSpecList);
//
//		return new ResponseEntity<Response>(response, HttpStatus.OK);
//
//	}
//
//	@GetMapping("/getregisterid/{userProfileId}")
//	public ResponseEntity<Responsechild> getRegisterUser(@PathVariable("userProfileId") Integer userProfileId) {
//
//		SmartTV smartTV = smartTVService.getRegisterUser(userProfileId);
//
//		List<RegisterDetails> registerList = restTemplate
//				.getForObject("http://localhost:8083/register/getregister/" + userProfileId, List.class);
//
//		Responsechild response = new Responsechild(smartTV, registerList);
//
//		return new ResponseEntity<Responsechild>(response, HttpStatus.OK);
//
//	}

	@GetMapping("/feignall")
	public List<RegisterDetails> getAllUser() {

		return consumer.getAllUser();
	}

	@GetMapping("/feignid/{registerid}")
	public RegisterDetails getById(@PathVariable("registerid") Integer registerId) {
		return consumer.getById(registerId);
	}

}
