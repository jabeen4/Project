package com.deloitte.register.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deloitte.register.entity.RegisterDetails;

@Repository
public interface RegisterRepo extends JpaRepository<RegisterDetails, Integer> {
	
     List<RegisterDetails> findByUserProfileId(Integer userProfileId);
}
