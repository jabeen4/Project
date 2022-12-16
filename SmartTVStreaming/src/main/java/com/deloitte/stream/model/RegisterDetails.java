package com.deloitte.stream.model;

public class RegisterDetails {
	
	private Integer registerId;
	private String name;
	private String plan;
	private Integer amount;

	public RegisterDetails() {
		super();
	}

	public RegisterDetails(String name, String plan, Integer amount) {
		super();
		this.name = name;
		this.plan = plan;
		this.amount = amount;
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
