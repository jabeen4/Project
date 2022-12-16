package com.deloitte.moviespec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.moviespec.entity.MovieSpecs;

@Repository
public interface MovieSpecRepo extends JpaRepository<MovieSpecs, Integer> {
	
	List<MovieSpecs> findByMovieId(Integer movieId);

}
