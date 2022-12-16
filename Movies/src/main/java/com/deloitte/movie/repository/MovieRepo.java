package com.deloitte.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.movie.entity.Movies;

@Repository
public interface MovieRepo extends JpaRepository<Movies, Integer> {

	List<Movies> findByUserProfileId(Integer userProfileId);
}
