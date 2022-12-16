package com.deloitte.stream.model;

import java.util.List;

import com.deloitte.stream.entity.SmartTV;

public class Response {

	private SmartTV smartTV;
	private List<Movies> watching;
	private List<MovieSpecs> suggestion;

	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Response(SmartTV smartTV, List<Movies> watching, List<MovieSpecs> suggestion) {
		super();
		this.smartTV = smartTV;
		this.watching = watching;
		this.suggestion = suggestion;
	}

	public SmartTV getSmartTV() {
		return smartTV;
	}

	public void setSmartTV(SmartTV smartTV) {
		this.smartTV = smartTV;
	}

	public List<Movies> getWatching() {
		return watching;
	}

	public void setWatching(List<Movies> watching) {
		this.watching = watching;
	}

	public List<MovieSpecs> getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(List<MovieSpecs> suggestion) {
		this.suggestion = suggestion;
	}

}
