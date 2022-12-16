package com.deloitte.stream.model;

import com.deloitte.stream.entity.SmartTV;

public class FailureResponse {
	
	private SmartTV smartTV;
	private String message;
	public SmartTV getSmartTV() {
		return smartTV;
	}
	public void setSmartTV(SmartTV smartTV) {
		this.smartTV = smartTV;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public FailureResponse(SmartTV smartTV, String message) {
		super();
		this.smartTV = smartTV;
		this.message = message;
	}
	public FailureResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
