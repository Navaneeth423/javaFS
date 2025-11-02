package com.inter.lambdex;

public class CardPayment implements IPayment {

	@Override
	public String processPayment(double amount) {
		System.out.println("Payment using UPI: " + amount);
		return "success";
	}

}
