package com.basics.quest5;

public class Mobile {
	String model;
	String brand;
	String color;
	
	public Mobile(String model, String brand, String color) {
		this.model = model;
		this.brand = brand;
		this.color = color;
	}
	
	void getDetails() {
		System.out.println("Mobile Model: " + model);
		System.out.println("Mobile Brand: " + brand);
		System.out.println("Mobile Color: " + color);
	}
}
