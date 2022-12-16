package com.deloitte.movie.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.deloitte.movie.entity.Movies;


public interface MoviesService {
	
	public List<Movies> getall();
	public List<Movies> findByUserProfileId(Integer userProfileId);
	public Movies getMovie(Integer movieId);

	
	

}
