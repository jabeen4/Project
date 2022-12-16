package com.deloitte.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.deloitte.movie.entity.Movies;
import com.deloitte.movie.service.MoviesService;
import com.deloitte.movie.model.MovieSpecs;
import com.deloitte.movie.model.Response;

@RestController
@RequestMapping("/movie")
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private MoviesService movieService;

	@GetMapping("/getall")
	public ResponseEntity<List<Movies>> getall() {

		List<Movies> movieList = movieService.getall();
		return new ResponseEntity<List<Movies>>(movieList, HttpStatus.OK);
	}

	@GetMapping("/get/{userProfileId}")
	public ResponseEntity<List<Movies>> findByUserProfileId(@PathVariable("userProfileId") Integer userProfileId) {

		List<Movies> movieList = movieService.findByUserProfileId(userProfileId);

		return new ResponseEntity<List<Movies>>(movieList, HttpStatus.OK);
	}
    
	
	@GetMapping("/getid/{movieId}")
	public ResponseEntity<Response> getMovie(@PathVariable("movieId") Integer movieId) {

		Movies movie = movieService.getMovie(movieId);

		List<MovieSpecs> movieList = restTemplate.getForObject("http://localhost:8082/moviespec/get/"+movieId,List.class);

		Response response = new Response(movie, movieList);

		return new ResponseEntity<Response>(response, HttpStatus.OK);

	}

}
