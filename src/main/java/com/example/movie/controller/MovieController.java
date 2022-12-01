package com.example.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.movie.constants.MovieRtnCode;
import com.example.movie.entity.Movie;
import com.example.movie.service.ifs.MovieService;
import com.example.movie.vo.MovieRes;
import com.example.movie.vo.MovieReq;


@RestController
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@PostMapping(value = "/api/findMovieByMovieName")
	public MovieRes findMovieByMovieName(@RequestBody MovieReq req) {
		//判斷查詢內容是否為空
		if(!StringUtils.hasText(req.getMovieName())) {
			return new MovieRes(MovieRtnCode.MOVIE_EMPTY.getMessage());
		}
		List<Movie> movieList = movieService.findMovieByMovieName(req.getMovieName());
		
		//該電影若不存在，則回傳不存在的訊息
		if(movieList == null) {
			return new MovieRes(MovieRtnCode.MOVIE_EXIST.getMessage());
		}
		//當查詢成功時顯示該部電影的所有資料
		MovieRes movieRes = new MovieRes(movieList,MovieRtnCode.SUCCESSFUL.getMessage());
		return movieRes;
	}

	
	@PostMapping(value = "/api/findMovieByType")
	public MovieRes findMovieByType(@RequestBody MovieReq req) {
		//判斷查詢內容是否為空
		if(!StringUtils.hasText(req.getType())) {
			return new MovieRes(MovieRtnCode.TYPE_EMPTY.getMessage());
		}
		List<Movie> movie = movieService.findMovieByType(req.getType());
		//如果電影不存在，則回傳不存在的訊息
		if(movie == null) {
			return new MovieRes(MovieRtnCode.TYPE_EXIST.getMessage());
		}
		
		MovieRes movieRes = new MovieRes(movie,MovieRtnCode.SUCCESSFUL.getMessage());
		return movieRes;
	}
}
