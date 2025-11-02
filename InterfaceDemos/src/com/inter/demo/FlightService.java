package com.inter.demo;

public class FlightService implements IBooking{

	@Override
	public void bookTickets(int noOfTickets) {
		System.out.println("Booking tickets in Flight");
		System.out.println(noOfTickets + " booked");
	}

	@Override
	public void cancelTickets(int noOfTickets) {
		System.out.println("Canceling tickets in Flight");
		System.out.println(noOfTickets + "cancelled");
	}
	
	void showFacilities() {
		System.out.println("Food and Refreshments provided	");
	}

}
