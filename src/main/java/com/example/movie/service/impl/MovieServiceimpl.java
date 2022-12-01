package com.example.movie.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.movie.entity.Movie;
import com.example.movie.repository.MovieDao;
import com.example.movie.service.ifs.MovieService;
import com.example.movie.vo.MovieRes;

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
			resList.add(movie.getMovieName());
			Movie movieRes = new Movie();
			movieRes.setMovieName(movieList);
			movieRes.setMovie(movie);
			resList.add(movieRes);
		}
		return resList;
	}

	@Override
	public List<Movie> findMovieByType(String type) {
		List<Movie> movie = movieDao.findMovieByType(type);
		return movie;
	}

//	@Override
//	public List<Movie> findMovieByType(String type) {
//		List<MovieRes> resList = new ArrayList<>();
//		List<Movie> movieList = movieDao.findMovieByType(type);
//		
//		//判斷movieList如果是空的就回傳null
//		if(movieList.isEmpty()) {
//			return null;
//		}
//		
//		for(Movie movie : movieList) {
//			movieList.add(movie);
//			MovieRes res = new MovieRes();
//			res.setMovieList(movieList);
//			res.setMovie(movie);
//			resList.add(res);
//		}
//		return resList;
//	}

}
