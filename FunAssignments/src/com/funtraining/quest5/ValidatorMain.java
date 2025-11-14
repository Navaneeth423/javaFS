package com.funtraining.quest5;

public class ValidatorMain {
	public static void main(String[] args) {
		IValidator register = (name)-> {
			String[] users = {"John", "Hector", "Lakshmi", "Molly"};
			for(String user : users) {
				if(name.equalsIgnoreCase(user))
					return "You are registered " + name;
			}
			
			return "You need to register!!";
		};
		String clientValidation = register.validateUser("Jason");
		System.out.println(clientValidation);
		
		IValidator login = (name)-> {
			String[] users = {"Suvathi", "Jason", "Bond", "Kumar", "Josh", "Nithin"};
			for(String user : users) {
				if(name.equalsIgnoreCase(user))
					return "You are logged in " + name;
			}
			
			return "Please register to Login";
		};
		clientValidation = login.validateUser("Suvathi");
		System.out.println(clientValidation);
	}
}
