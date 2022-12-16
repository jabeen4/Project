package com.deloitte.stream.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deloitte.stream.Repository.SmartTvRepo;
import com.deloitte.stream.entity.SmartTV;

@Service
public class SmartTVServiceImpl implements SmartTVService {

	@Autowired
	private SmartTvRepo smartTVRepo;
	
	@Override
	public List getAllUsers() {
		
		return smartTVRepo.findAll();
	}

	@Override
	public List<SmartTV> getUserByLocation(String location) {

		return smartTVRepo.findByLocation(location);
	}

	@Override
	public List<SmartTV> getUserByOTT(String ott) {
		return smartTVRepo.findByOtt(ott);
	}

	@Override
	public SmartTV getUser(Integer userProfileId,Integer movieId) {
		
		return smartTVRepo.findById(userProfileId).get();
	}

	@Override
	public SmartTV getRegisterUser(Integer userProfileId) {
		return smartTVRepo.findById(userProfileId).get();
	}

	
	

}
