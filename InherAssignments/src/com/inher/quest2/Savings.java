package com.inher.quest2;

public class Savings extends Account{

	public Savings(double balance) {
		super(balance);
	}

	@Override
	void withdraw(double amount) {
		if (balance - amount >= 1000) {
			balance -= amount;
			System.out.println("Cuurent Balance after withdraw: " + balance);
		} else {
			System.out.println("Exceeding minimum balance.");
		}
	}

	@Override
	void deposit(double amount) {
		balance += amount;
		double interest = balance * 0.3;
		balance += interest;
		System.out.println("Balance after intereset: " + balance);
	}
	
	
}
