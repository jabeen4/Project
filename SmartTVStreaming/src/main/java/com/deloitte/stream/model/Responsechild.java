package com.deloitte.stream.model;

import java.util.List;

import com.deloitte.stream.entity.SmartTV;

public class Responsechild {

	private SmartTV smartTV;
	private List<RegisterDetails> registeredUser;

	public SmartTV getSmartTV() {
		return smartTV;
	}

	public void setSmartTV(SmartTV smartTV) {
		this.smartTV = smartTV;
	}

	public List<RegisterDetails> getRegisteredUser() {
		return registeredUser;
	}

	public void setRegisteredUser(List<RegisterDetails> registeredUser) {
		this.registeredUser = registeredUser;
	}

	public Responsechild(SmartTV smartTV, List<RegisterDetails> registeredUser) {
		super();
		this.smartTV = smartTV;
		this.registeredUser = registeredUser;
	}

	public Responsechild() {
		super();
		// TODO Auto-generated constructor stub
	}

}
