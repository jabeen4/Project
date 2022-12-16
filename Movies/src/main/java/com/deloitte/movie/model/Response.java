package com.deloitte.movie.model;

import java.util.List;

import com.deloitte.movie.entity.Movies;

public class Response {

	private List<MovieSpecs> list;
	private Movies moviess;
	
	

	public Response( Movies moviess,List<MovieSpecs> movieList) {
		super();
		
		this.moviess = moviess;
		this.list = movieList;
	}


	public List<MovieSpecs> getList() {
		return list;
	}

	public void setList(List<MovieSpecs> list) {
		this.list = list;
	}


	public Response() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Movies getMoviess() {
		return moviess;
	}

	public void setMoviess(Movies moviess) {
		this.moviess = moviess;
	}

	
}
