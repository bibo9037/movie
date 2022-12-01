package com.example.movie.vo;

import java.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonProperty;


public class MovieReq {

	@JsonProperty("movie_code")
	private String movieCode;

	@JsonProperty("movie_name")
	private String movieName;

	@JsonProperty("day")
	private String day;

	@JsonProperty("start_time")
	private LocalTime startTime;

	@JsonProperty("price")
	private int price;

	@JsonProperty("type")
	private String type;

	@JsonProperty("total_ticket")
	private int totalTicket;

	@JsonProperty("amount_ticket")
	private int amountTicket;
	
	public MovieReq() {
		
	}
	
	public MovieReq(String movieCode, String movieName, String day, LocalTime startTime, int price, String type,
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
