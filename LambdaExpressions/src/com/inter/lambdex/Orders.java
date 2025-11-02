package com.inter.lambdex;

public class Orders {
	void processOrders (IPayment payment, double price, int quantity) {
		System.out.println("Processing Orders....");
		double amount = price * quantity;
		System.out.println("Amount to be paid: " + amount);
		String status = payment.processPayment(amount);
		if (status.equals("success")) {
			System.out.println("Payment Sucessful! Order Shipped!");
		} else {
			System.out.println("Payment failed! Try again later");
		}
		
	}
}
