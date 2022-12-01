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
	public Movie findMovieByMovieName(@RequestBody MovieReq req) {
		//�P�_�d�ߤ��e�O�_����
		if(!StringUtils.hasText(req.getMovieName())) {
			return new Movie(MovieRtnCode.EMPTY.getMessage());
		}
		
		Movie movieRes = new Movie();
		List<Movie> movieList = movieService.findMovieByMovieName(req.getMovieName());
		//�ӹq�v�Y���s�b�A�h�^�Ǥ��s�b���T��
		if(movieList == null) {
			return new Movie(MovieRtnCode.EXIST.getMessage());
		}
		//��d�ߦ��\����ܸӳ��q�v���Ҧ����
		movieRes.setMovieList(movieList);
		movieRes.setMessage(MovieRtnCode.SUCCESSFUL.getMessage());
		return movieRes;
	}

	
	@PostMapping(value = "/api/findMovieByType")
	public Movie findMovieByType(@RequestBody MovieReq req) {
		//�P�_�d�ߤ��e�O�_����
		if(!StringUtils.hasText(req.getType())) {
			return new Movie(MovieRtnCode.EMPTY.getMessage());
		}
		
		List<Movie> movie = movieService.findMovieByType(req.getType());
		//�p�G�q�v���s�b�A�h�^�Ǥ��s�b���T��
		if(movie == null) {
			return new Movie(MovieRtnCode.EXIST.getMessage());
		}
		
		Movie res = new Movie(MovieRtnCode.SUCCESSFUL.getMessage());
		return res;
	}
}
