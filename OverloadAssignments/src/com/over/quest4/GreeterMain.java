package com.over.quest4;

public class GreeterMain {
	public static void main(String[] args) {
		Greeter greeter1 = new Greeter("Sara");
		greeter1.greetUser("Welcome", "Great Day");
		greeter1.greetUser("Have Tea", "Good Day", "Enjoy Learning");	
		
		Greeter greeter2 = new Greeter();
		greeter2.sayHello("Sri", "Priya");
		greeter2.sayHello("Sara", "Anna", "Reena", "Rohan");
		greeter2.sayHello("Jo", "Roni");
	}
}
