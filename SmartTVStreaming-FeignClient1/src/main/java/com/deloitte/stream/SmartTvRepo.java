package com.deloitte.stream;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface SmartTvRepo extends JpaRepository<SmartTV, Integer> {

	List<SmartTV> findByLocation(String location);
	List<SmartTV> findByOtt(String ott);
	SmartTV findByUserProfile(String userProfile);
}
