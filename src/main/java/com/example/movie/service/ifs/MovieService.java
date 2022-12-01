package com.example.movie.service.ifs;

import java.util.List;

import com.example.movie.entity.Movie;

public interface MovieService {
	
	public List<Movie> findMovieByMovieName(String movieName);
	
	public List<Movie> findMovieByType(String type);
	
}
