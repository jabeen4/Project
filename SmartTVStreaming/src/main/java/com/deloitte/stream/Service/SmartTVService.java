package com.deloitte.stream.Service;

import java.util.List;

import com.deloitte.stream.entity.SmartTV;

public interface SmartTVService {
	
	public List getAllUsers();
	public List<SmartTV> getUserByLocation(String location);
	public List<SmartTV> getUserByOTT(String ott);
	public SmartTV getUser(Integer userProfileId, Integer movieId);
	public SmartTV getRegisterUser(Integer userProfileId);

	

}
