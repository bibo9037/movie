package com.example.movie.vo;

import java.util.List;

import com.example.movie.entity.Movie;


public class MovieRes {
	
	private Movie movie;
	
	private String message;
	
	private List<Movie> movieList;

	public MovieRes() {
	}

	public MovieRes(String message) {
		this.message = message;
	}
	
	public MovieRes(List<Movie> movieList, String message) {
		this.movieList = movieList;
		this.message = message;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<Movie> getMovieList() {
		return movieList;
	}

	public void setMovieList(List<Movie> movieList) {
		this.movieList = movieList;
	}

}
