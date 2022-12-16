package com.deloitte.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.movie.entity.Movies;
import com.deloitte.movie.repository.MovieRepo;

@Service
public class MovieServiceImpl implements MoviesService{
	
	@Autowired
	private MovieRepo movieRepo;
	
	

	@Override
	public List<Movies> getall() {
		return movieRepo.findAll();
	}



	@Override
	public List<Movies> findByUserProfileId(Integer userProfileId) {
		
		return movieRepo.findByUserProfileId(userProfileId);
	}



	@Override
	public Movies getMovie(Integer movieId) {
		return movieRepo.findById(movieId).get();
	}
	

}
