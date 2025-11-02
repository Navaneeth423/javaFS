package com.inter.lambdex;

public class Billing {
	public static void main(String[] args) {
		Orders orders = new Orders();
		
		//Creating a IPayment Reference
		IPayment payment = new UpiPayment();
		orders.processOrders(payment, 120, 20);
		System.out.println();
		
		payment = new CardPayment();
		orders.processOrders(payment, 200, 100);
		System.out.println();
		
		//Using Lambda
		System.out.println("Using Lambda");
		IPayment upipayment = amount -> {
			System.out.println("Payment using UPI: " + amount);
			if (amount > 5000) 
				return "failed";
			return "success";
		};
		orders.processOrders(upipayment, 100, 100);
		System.out.println();
		
		orders.processOrders(amount->{
			System.out.println("Payment using Card: " + amount);
			return "success";
		}, 120, 20);
	}
}
