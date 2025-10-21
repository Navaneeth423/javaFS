package com.training.scan;
import java.util.*;

public class Registration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] usernames = new String[] {"Robin", "Tom Cruise", "Rajeev", "Jackie"};
		
		System.out.println("Enter name to register: ");
		String name = sc.nextLine();
		
		for (String user : usernames) {
			if(name.equalsIgnoreCase(user)) {
				System.out.println("Name is not unique!");
				return;
			}
		}
		
		System.out.println("You are registered!!");
	}
}
