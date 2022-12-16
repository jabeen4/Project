package com.deloitte.moviespec.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deloitte.moviespec.entity.MovieSpecs;


public interface MovieSpecService {
	
	public List<MovieSpecs> getAllMovies();
	public List<MovieSpecs> findByMovieId(Integer movieId);
	

}
