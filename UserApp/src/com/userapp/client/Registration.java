package com.userapp.client;

import java.util.*;
import com.userapp.exception.*;
import com.userapp.service.*;

public class Registration {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IValidationService validationService = new ValidationServiceImpl();
		
		System.out.println("Enter Username: ");
		String username = sc.nextLine();
		if(username.isEmpty()) {
			System.out.println("Username is Empty. Please enter your username!");
			return;
		}

		try {
			validationService.validateUsername(username);
			System.out.println("Enter password: ");
			String password = sc.nextLine();
			
			try {
				validationService.validatePassword(password);
				System.out.println("Welcome " + username + ". You are Registered!");
			} catch (TooLongException | TooShortException e) {
				System.out.println("Password Error: " + e.getMessage());
			}
		} catch (NameExistsException e) {
			System.out.println("Username Error: " + e.getMessage());
		}
	}
}
