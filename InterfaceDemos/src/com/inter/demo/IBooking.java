package com.inter.demo;

public interface IBooking {
	String TRAVELAGENCY = "KPN";
	void bookTickets(int noOfTickets);
	void cancelTickets(int noOfTickets);
}
