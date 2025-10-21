package com.oops.basics;

public class Project {
	String name;
	float price;
	String brand;
	int id;
	
	Project(String name, float price, String brand, int id) {
		name = this.name;
		price = this.price;
		brand = this.brand;
		id = this.id;
	}
	
	void printInfo() {
		System.out.println(name + " " + price + " " + brand + " " + id);
	}
	
	String[] showModels (String brand) {
		return null;
		
	}
	
	double totalCost (int quantity) {
		return price * quantity;
	}
}
