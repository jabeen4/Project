package com.deloitte.stream;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class SmartTV {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer userProfileId;
	private String userProfile;
	private String ott;
	private String location;

	public SmartTV() {
		super();
		// TODO Auto-generated constructor stub
	}

	public SmartTV(Integer userProfileId,String userProfile, String ott, String location) {
		super();
		this.userProfileId = userProfileId;
		this.userProfile = userProfile;
		this.ott = ott;
		this.location = location;
	}

	public Integer getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(Integer userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getOtt() {
		return ott;
	}

	public void setOtt(String ott) {
		this.ott = ott;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
	

	public String getUserProfile() {
		return userProfile;
	}

	public void setUserProfile(String userProfile) {
		this.userProfile = userProfile;
	}

	@Override
	public String toString() {
		return "SmartTV [userProfile=" + userProfileId + ", ott=" + ott + ", location=" + location + "]";
	}

}
