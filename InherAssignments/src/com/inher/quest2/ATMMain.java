package com.inher.quest2;
import java.util.*;

public class ATMMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter what you want to access: ");
		System.out.println("1.Savings\n2.Current\n3.Exit");
		int choice = sc.nextInt();
		sc.nextLine();
		
		switch(choice) {
		case 1:
			Account savingAcc = new Savings(10000.0);
			System.out.println("Your balance in savings account: " + savingAcc.getBalance());
			System.out.println("Would you like to withdraw or deposit?");
			String oprnSavings = sc.nextLine();
			if(oprnSavings.equalsIgnoreCase("withdraw")) {
				System.out.println("Enter amount to wihthdraw: ");
				int amount = sc.nextInt();
				savingAcc.withdraw(amount);
			} else if(oprnSavings.equalsIgnoreCase("deposit")) {
				System.out.println("Enter amount to deposit: ");
				int amount = sc.nextInt();
				savingAcc.deposit(amount);				
			} else {
				System.out.println("Not a valid operation!!!");
			}
			System.out.println("Thank you! Visit again!");
			break;
		case 2:
			Account currentAcc = new Current(20000.0);
			System.out.println("Your balance in current account: " + currentAcc.getBalance());
			System.out.println("Would you like to withdraw or deposit?");
			String oprnCurrent = sc.nextLine();
			if(oprnCurrent.equalsIgnoreCase("withdraw")) {
				System.out.println("Enter amount to wihthdraw: ");
				int amount = sc.nextInt();
				currentAcc.withdraw(amount);
			} else if(oprnCurrent.equalsIgnoreCase("deposit")) {
				System.out.println("Enter amount to deposit: ");
				int amount = sc.nextInt();
				currentAcc.deposit(amount);				
			} else {
				System.out.println("Not a valid operation!!!");
			}
			System.out.println("Thank you! Visit again!");
			break;
		case 3:
			System.out.println("Exiting the ATM");
			break;
		default:
			System.out.println("Invlid choice!!!");
			break;
		}
	}
}
