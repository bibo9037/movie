package com.example.movie.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonInclude;


@Entity
@Table(name = "movie")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Movie {

	@Id
	@Column(name = "movie_code")
	private String movieCode;

	@Column(name = "movie_name")
	private String movieName;

	@Column(name = "day")
	private String day;

	@Column(name = "start_time")
	private LocalTime startTime;

	@Column(name = "price")
	private int price;

	@Column(name = "type")
	private String type;

	@Column(name = "total_ticket")
	private int totalTicket;

	@Column(name = "amount_ticket")
	private int amountTicket;


	public Movie() {
	}

	public Movie(String movieCode, String movieName, String day, LocalTime startTime, int price, String type,
			int totalTicket, int amountTicket) {
		this.movieCode = movieCode;
		this.movieName = movieName;
		this.day = day;
		this.startTime = startTime;
		this.price = price;
		this.type = type;
		this.totalTicket = totalTicket;
		this.amountTicket = amountTicket;
	}

	public String getMovieCode() {
		return movieCode;
	}

	public void setMovieCode(String movieCode) {
		this.movieCode = movieCode;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public LocalTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalTime startTime) {
		this.startTime = startTime;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getTotalTicket() {
		return totalTicket;
	}

	public void setTotalTicket(int totalTicket) {
		this.totalTicket = totalTicket;
	}

	public int getAmountTicket() {
		return amountTicket;
	}

	public void setAmountTicket(int amountTicket) {
		this.amountTicket = amountTicket;
	}

}
