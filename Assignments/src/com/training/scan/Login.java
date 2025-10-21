package com.training.scan;
import java.util.*;

public class Login {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] usernames = new String[] {"robinhood", "bondJames", "Alan"};
		
		System.out.println("Enter a username: ");
		String user = sc.nextLine();
		
		for(String name : usernames) {
			if(user.equalsIgnoreCase(name)) {
				System.out.println("You are logged in successfully");
				return;
			}
		}
		
		System.out.println("Invalid User!!");
	}
}
