package com.deloitte.register.service;

import java.util.List;

import com.deloitte.register.entity.RegisterDetails;

public interface RegisterService {
	
	public List<RegisterDetails> getAllUsers();
	
	public RegisterDetails getById(Integer registerId);
	
	public List<RegisterDetails> findByUserProfileId(Integer userProfileId);

}
