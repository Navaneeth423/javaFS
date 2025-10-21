package com.oops.exercises;

public class Car extends Vehicle{
	String color;
	String type;
	
	public Car(String brand, double price, String model, String color, String type) {
		super(brand, price, model);
		this.color = color;
		this.type = type;
	}

	@Override
	void getMileage() {
		super.getMileage();
		System.out.println("Car Mileage");
	}
	
	String[] printAccessories() {
		return new String[] {"Car Cover", "Rear AC", "Music System"};
	}
	
	void carInfo() {
		printDetails();
		System.out.println("Color: " + color + "\nType: " + type);
	}
}
