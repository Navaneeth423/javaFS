package com.threads.quest1;

public class Booking implements Runnable {
	String name;
	int noOfTickets;
	TicketCounter ticketCounter;
	String passengerClass;
	Thread t;
	
	public Booking(String name, int noOfTickets, TicketCounter ticketCounter, String passengerClass) {
		super();
		this.name = name;
		this.noOfTickets = noOfTickets;
		this.ticketCounter = ticketCounter;
		this.passengerClass = passengerClass;
		
		t = new Thread(this);
		t.start();
	}

	@Override
	public void run() {
		System.out.println("Thread started for " + name);
		
		synchronized (ticketCounter) {
			System.out.println("Booking started for: " + name);
			double totalAmount = ticketCounter.bookTickets(name, noOfTickets, passengerClass);
			System.out.println("Total Amount: " + totalAmount);
		}
		System.out.println("Thread ended for " + name);		
	}

}
