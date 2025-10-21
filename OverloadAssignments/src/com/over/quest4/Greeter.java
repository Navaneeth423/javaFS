package com.over.quest4;

public class Greeter {
	String name;

	
	public Greeter() {
		System.out.println("Default Constructor");
	}

	public Greeter(String name) {
		this.name = name;
	}
	
	void greetUser(String... messages) {
		for(String message : messages) {
			System.out.println(message + " " + name);
		}
	}
	
	void sayHello(String... names) {
		for(String name : names) {
			System.out.println("Welcome " + name);
		}
	}
}
