package com.example.movie.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.entity.Movie;
import com.example.movie.repository.MovieDao;
import com.example.movie.service.ifs.MovieService;

@Service
public class MovieServiceimpl implements MovieService {

	@Autowired
	private MovieDao movieDao;

	@Override
	public List<Movie> findMovieByMovieName(String movieName) {
		List<Movie> resList = new ArrayList<>();
		List<Movie> movieList = movieDao.findMovieByMovieName(movieName);

			//判斷是否為空的
		if (movieList.isEmpty()) {
			return null;
		}

		for (Movie movie : movieList) {
			resList.add(movie);
		}
		return resList;
	}

	@Override
	public List<Movie> findMovieByType(String type) {
		List<Movie> movie = movieDao.findMovieByType(type);
		return movie;
	}
}
