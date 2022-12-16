package com.deloitte.stream;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class RegisterDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer registerId;
	private String name;
	private String plan;
	private Integer amount;
	private Integer userProfileId;

	public RegisterDetails() {
		super();
	}

	

	public Integer getUserProfileId() {
		return userProfileId;
	}



	public void setUserProfileId(Integer userProfileId) {
		this.userProfileId = userProfileId;
	}



	public RegisterDetails(Integer registerId, String name, String plan, Integer amount, Integer userProfileId) {
		super();
		this.registerId = registerId;
		this.name = name;
		this.plan = plan;
		this.amount = amount;
		this.userProfileId = userProfileId;
	}



	public Integer getRegisterId() {
		return registerId;
	}

	public void setRegisterId(Integer registerId) {
		this.registerId = registerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
