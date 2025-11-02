package com.bankapp.client;
import com.bankapp.service.*;
import java.util.*;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("Select Account Type");
			System.out.println("1. Savings Account");
			System.out.println("2. Current Account");
			System.out.println("3. Exit");
			int accountChoice = sc.nextInt();
			switch(accountChoice) {
			case 1:
				Account savings = new Savings(10000.0);
				System.out.println("Enter Savings Account action to be performed: ");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Check Balance");
				System.out.println("4. Exit");
				int savingsChoice = sc.nextInt();
				int savingsAmount;
				switch(savingsChoice) {
				case 1:
					System.out.println("Enter amount to withdraw: ");
					savingsAmount = sc.nextInt();
					savings.withdraw(savingsAmount);
					break;
				case 2:
					((Savings)savings).showDepositSchemes();
					System.out.println("Enter amount to deposit: ");
					savingsAmount = sc.nextInt();
					savings.deposit(savingsAmount);
					break;
				case 3:
					System.out.println("Savings Account Balance: " + savings.getBalance());
					break;
				default:
					System.out.println("Invalid option!");
					break;
				}
				break;
			case 2:
				Account current = new Current(15000.0);
				System.out.println("Enter Current Account action to be performed: ");
				System.out.println("1. Withdraw");
				System.out.println("2. Deposit");
				System.out.println("3. Check Balance");
				System.out.println("4. Exit");
				int currentChoice = sc.nextInt();
				((Current)current).transactionsAllowed();
				int currentAmount;
				switch(currentChoice) {
				case 1:
					System.out.println("Enter amount to withdraw: ");
					currentAmount = sc.nextInt();
					current.withdraw(currentAmount);
					break;
				case 2:
					System.out.println("Enter amount to deposit: ");
					currentAmount = sc.nextInt();
					current.deposit(currentAmount);
					break;
				case 3:
					System.out.println("Current Account Balance: " + current.getBalance());
					break;
				default:
					System.out.println("Invalid option!");
					break;
				}
				break;
			case 3:
				System.out.println("Thank you for visting the ATM!!");
				System.exit(0);
			default:
				System.out.println("Invalid choice!");
				break;
			}
			sc.nextLine();
			System.out.println("Do you want to continue transactions? YES or NO");
			String continueTransaction = sc.nextLine();
			
			if (continueTransaction.equalsIgnoreCase("no")) {
				System.out.println("Thank you for visting the ATM!!");
				return;
			}
		}
	}
}
