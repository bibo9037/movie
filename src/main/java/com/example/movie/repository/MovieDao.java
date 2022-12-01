package com.example.movie.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.movie.entity.Movie;
import com.example.movie.vo.MovieRes;

@Repository
public interface MovieDao extends JpaRepository <Movie, String>{
	
	public List<Movie> findMovieByMovieName(String movieName);
	
	public List<Movie> findMovieByType(String type);

}
