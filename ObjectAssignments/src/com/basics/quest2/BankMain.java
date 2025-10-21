package com.basics.quest2;
import java.util.*;

public class BankMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank bank = new Bank(10000.0f);
		int choice;
		
		do {
			System.out.println("Enter your choice:\n1.Deposit\n2.Withdraw\n3.Exit");
			choice = sc.nextInt();
			System.out.println();
			switch(choice) {
			case 1:
				System.out.println("Enter amount to deposit: ");
				int depositAmount = sc.nextInt();
				bank.deposit(depositAmount);
				System.out.println();
				break;
			case 2:
				System.out.println("Enter amount to withdraw: ");
				int withdrawAmount = sc.nextInt();
				bank.withdraw(withdrawAmount);
				System.out.println();
				break;
			case 3:
				System.out.println("Exiting the Bank!");
				break;
			default:
				System.out.println("Invalid option");
				break;
			}
		}while(choice != 3);
	}
}
