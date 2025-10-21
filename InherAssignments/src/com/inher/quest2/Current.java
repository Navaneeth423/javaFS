package com.inher.quest2;

public class Current extends Account{

	public Current(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Amount exceeding balance, cannot withdraw");
		} else {
			balance -= amount;
			System.out.println("Current Balance in Current Account: " + balance);
		}
	}

	@Override
	void deposit(double amount) {
		balance += amount;
		System.out.println("Cuurent balance in Current Account: " + balance);
	}
	
	
}
