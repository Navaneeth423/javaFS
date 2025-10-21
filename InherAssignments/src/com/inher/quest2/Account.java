package com.inher.quest2;

public class Account {
	double balance;

	public Account(double balance) {
		this.balance = balance;
	}
	
	void withdraw(double amount) {
		if (amount > balance) {
			System.out.println("Amount exceeding balance, cannot withdraw");
		} else {
			balance -= amount;
			System.out.println("Current Balance after withdraw: " + balance);
		}
	}
	
	void deposit(double amount) {
		balance += amount;
		System.out.println("Cuurent Balance after deposit: " + balance);
	}
	
	double getBalance() {
		return balance;
	}
}
