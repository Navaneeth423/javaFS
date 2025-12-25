package com.threads.quest1;

public class Counter {
	public static void main(String[] args) {
		TicketCounter ticketCounter = new TicketCounter(100);
		Booking booking1 = new Booking("John Wick", 50, ticketCounter, "A");
		Booking booking2 = new Booking("Tony Stark", 50, ticketCounter, "B");
		Booking booking3 = new Booking("Stewie Griffin", 30, ticketCounter, "C");
	}
}