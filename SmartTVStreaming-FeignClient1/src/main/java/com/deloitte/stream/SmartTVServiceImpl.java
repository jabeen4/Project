package com.deloitte.stream;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class SmartTVServiceImpl  {

	@Autowired
	private SmartTvRepo smartTVRepo;
	
	public List getAllUsers() {
		
		return smartTVRepo.findAll();
	}

	public List<SmartTV> getUserByLocation(String location) {

		return smartTVRepo.findByLocation(location);
	}

	public List<SmartTV> getUserByOTT(String ott) {
		return smartTVRepo.findByOtt(ott);
	}

	public SmartTV getUser(Integer userProfileId,Integer movieId) {
		
		return smartTVRepo.findById(userProfileId).get();
	}

	public SmartTV getRegisterUser(Integer userProfileId) {
		return smartTVRepo.findById(userProfileId).get();
	}

	
	

}
