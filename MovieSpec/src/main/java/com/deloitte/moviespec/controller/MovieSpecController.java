package com.deloitte.moviespec.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.deloitte.moviespec.entity.MovieSpecs;
import com.deloitte.moviespec.service.MovieSpecService;

@RestController
@RequestMapping("/moviespec")
public class MovieSpecController {
	
	@Autowired
	private MovieSpecService movieSpecService;
	
	@GetMapping("/getall")
	public ResponseEntity<List<MovieSpecs>> getAllMovies(){
		
		List<MovieSpecs> movies = movieSpecService.getAllMovies();
		return new ResponseEntity<List<MovieSpecs>>(movies,HttpStatus.OK);
	}
	
	@GetMapping("/get/{movieId}")
	public ResponseEntity<List<MovieSpecs>> findByMovieId(@PathVariable("movieId") Integer movieId){
		
		List<MovieSpecs> movies = movieSpecService.findByMovieId(movieId);
		return new ResponseEntity<List<MovieSpecs>>(movies,HttpStatus.OK);
		
	}

}
