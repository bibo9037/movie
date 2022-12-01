package com.example.movie.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Entity
@Table(name = "customer")
public class Customer {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@CreationTimestamp
	@Column(name = "order_date")
	private LocalDateTime orderDate;

	@Column(name = "movie_code")
	private String buyMovieCode;

	@Column(name = "ticket_quantity")
	private int ticketQuantity;

	@Column(name = "total_price")
	private int totalPrice;

	public Customer() {

	}

	public Customer(int id, String name, LocalDateTime orderDate, String buyMovieCode, int ticketQuantity,
			int totalPrice) {
		this.id = id;
		this.name = name;
		this.orderDate = orderDate;
		this.buyMovieCode = buyMovieCode;
		this.ticketQuantity = ticketQuantity;
		this.totalPrice = totalPrice;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	public String getBuyMovieCode() {
		return buyMovieCode;
	}

	public void setBuyMovieCode(String buyMovieCode) {
		this.buyMovieCode = buyMovieCode;
	}

	public int getTicketQuantity() {
		return ticketQuantity;
	}

	public void setTicketQuantity(int ticketQuantity) {
		this.ticketQuantity = ticketQuantity;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
