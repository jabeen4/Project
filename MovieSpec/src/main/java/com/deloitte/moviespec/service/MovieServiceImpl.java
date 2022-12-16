package com.deloitte.moviespec.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.moviespec.entity.MovieSpecs;
import com.deloitte.moviespec.repository.MovieSpecRepo;

@Service
public class MovieServiceImpl implements MovieSpecService {
	
	@Autowired
	private MovieSpecRepo movieSpecRepo;

	@Override
	public List<MovieSpecs> getAllMovies() {
		return movieSpecRepo.findAll();
	}

	@Override
	public List<MovieSpecs> findByMovieId(Integer movieId) {
		return movieSpecRepo.findByMovieId(movieId);
	}

}
