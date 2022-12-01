package com.example.movie.vo;

import java.util.List;


public class MovieRes {
	
	private MovieRes movie;
	
	private String message;
	
	private List<MovieRes> movieList;

	public MovieRes() {
	}

	public MovieRes(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<MovieRes> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<MovieRes> movieList) {
		this.movieList = movieList;
	}

	public MovieRes getMovie() {
		return movie;
	}

	public void setMovie(MovieRes movie) {
		this.movie = movie;
	}

}
