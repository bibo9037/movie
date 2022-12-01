package com.example.movie;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.movie.entity.Movie;
import com.example.movie.repository.MovieDao;

@SpringBootTest(classes = MovieApplication.class)
class MovieApplicationTests {
//	
//	@Autowired
//	private MovieService movieService;

	@Autowired
	private MovieDao movieDao;

	@Test
	public void findMovieByMovieNameTest() {
		List<String> resList = new ArrayList<>();
		resList.add("aaa");
		resList.add("bbb");
		resList.add("ccc");
		resList.add("ddd");
		resList.add("eee");

		List<Movie> movieList = movieDao.findMovieByMovieName("aaa");
		
		System.out.println(movieList);

	}

	@Test
	public void findMovieByType() {
		List<Movie> MovieList = movieDao.findMovieByType("");
		if(MovieList.isEmpty()) {
			System.out.println("null");
		}
		for (Movie movie : MovieList) {
			System.out.printf("電影名稱:%s  電影類型:%s  價格:%d %n", movie.getMovieName(), movie.getType(), movie.getPrice());
		}
	}
}
