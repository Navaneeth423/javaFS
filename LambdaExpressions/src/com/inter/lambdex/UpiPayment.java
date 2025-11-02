package com.inter.lambdex;

public class UpiPayment implements IPayment {

	@Override
	public String processPayment(double amount) {
		System.out.println("Payment using UPI: " + amount);
		if (amount > 5000) 
			return "failed";
		return "success";
	}

}
