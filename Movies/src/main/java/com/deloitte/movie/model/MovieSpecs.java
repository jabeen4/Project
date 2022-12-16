package com.deloitte.movie.model;

public class MovieSpecs {
	
	private Integer id;
	private String genre;
	private String smovies;
	private Boolean MyList;
	private Integer movieId;

	public MovieSpecs( String genre, String smovies, Boolean myList, Integer movieId) {
		super();
		this.genre = genre;
		this.smovies = smovies;
		MyList = myList;
		this.movieId = movieId;
	}

	public MovieSpecs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSmovies() {
		return smovies;
	}

	public void setSmovies(String smovies) {
		this.smovies = smovies;
	}

	public boolean isMyList() {
		return MyList;
	}

	public void setMyList(Boolean myList) {
		MyList = myList;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}


}
