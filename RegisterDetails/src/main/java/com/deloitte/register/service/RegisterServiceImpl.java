package com.deloitte.register.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.register.entity.RegisterDetails;
import com.deloitte.register.repo.RegisterRepo;

@Service
public class RegisterServiceImpl implements RegisterService {
	
	@Autowired
	private RegisterRepo registerRepo;

	@Override
	public List<RegisterDetails> getAllUsers() {
		return registerRepo.findAll();
	}

	@Override
	public RegisterDetails getById(Integer registerId) {
		return registerRepo.findById(registerId).get();
	}

	@Override
	public List<RegisterDetails> findByUserProfileId(Integer userProfileId) {
		return registerRepo.findByUserProfileId(userProfileId);
	}

}
