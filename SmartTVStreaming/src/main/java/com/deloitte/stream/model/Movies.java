package com.deloitte.stream.model;

public class Movies {
	
	private Integer movieId;
	private Integer userProfileId;
	private String movieName;
	private Integer rating;
	private String ott;

	public Movies(Integer movieId, Integer userProfileId, String movieName, Integer rating, String ott) {
		super();
		this.movieId = movieId;
		this.userProfileId = userProfileId;
		this.movieName = movieName;
		this.rating = rating;
		this.ott = ott;
	}

	public Movies() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public Integer getUserProfileId() {
		return userProfileId;
	}

	public void setUserProfileId(Integer userProfileId) {
		this.userProfileId = userProfileId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getOtt() {
		return ott;
	}

	public void setOtt(String ott) {
		this.ott = ott;
	}

	@Override
	public String toString() {
		return "Movies [userProfileId=" + userProfileId + ", movieName=" + movieName + ", rating=" + rating + ", ott="
				+ ott + "]";
	}


}
