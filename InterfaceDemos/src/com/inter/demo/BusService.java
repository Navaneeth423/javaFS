package com.inter.demo;

public abstract class BusService implements IBooking{

	@Override
	public void bookTickets(int noOfTickets) {
		System.out.println("Booking tickets in Bus");
		System.out.println(noOfTickets + " booked");
	}
	
	
}
