package com.basics.quest2;

public class Bank {
	double balance;

	public Bank(double balance) {
		this.balance = balance;
	}
	
	void withdraw(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient Balance");
		} else {
			balance -= amount;
			System.out.println("Current Balance: " + balance);
		}
	}
	
	void deposit(double amount) {
		balance += amount;
		System.out.println("Amount deposited. Current balance: " + balance);
	}
	
	double getBalance() {
		return balance;
	}
}
