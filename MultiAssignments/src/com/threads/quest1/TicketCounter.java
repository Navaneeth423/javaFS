package com.threads.quest1;

public class TicketCounter {
	int totalTickets;

	public TicketCounter(int totalTickets) {
		super();
		this.totalTickets = totalTickets;
	}
	
	double bookTickets(String name, int noOfTickets, String passengerClass) {
		double totalAmount = 0;
		
		if(noOfTickets > totalTickets) {
			System.out.println("Not enough tickets available for " + name);
			return 0;
		}
		System.out.println("Name: " + name);
		if (passengerClass.equalsIgnoreCase("A")) {
			totalAmount = noOfTickets * 320;
		} else if (passengerClass.equalsIgnoreCase("B")) {
			totalAmount = noOfTickets * 200;
		} else if (passengerClass.equalsIgnoreCase("C")) {
			totalAmount = noOfTickets * 120;
		} else {
			System.out.println("No such passenger class exists!");
		}
		
		totalTickets -= noOfTickets;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Tickets Booked: " + noOfTickets);
		System.out.println("Class: " + passengerClass);
		System.out.println("Remaining Tickets: " + totalTickets);
		
		return totalAmount;
	}
}
