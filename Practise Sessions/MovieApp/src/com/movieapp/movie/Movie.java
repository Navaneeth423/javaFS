package com.movieapp.movie;

public class Movie {
	private Integer movieId;
	private String movieName;
	private double ticketPrice;
	private String director;
	
	public Movie() {
		super();
	}
	
	public Movie(Integer movieId, String movieName, double ticketPrice, String director) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.ticketPrice = ticketPrice;
		this.director = director;
	}

	public Integer getMovieId() {
		return movieId;
	}

	public void setMovieId(Integer movieId) {
		this.movieId = movieId;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public double getTicketPrice() {
		return ticketPrice;
	}

	public void setTicketPrice(double ticketPrice) {
		this.ticketPrice = ticketPrice;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", movieName=" + movieName + ", ticketPrice=" + ticketPrice + ", director="
				+ director + "]";
	}
}
