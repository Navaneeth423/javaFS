package com.over.quest1;

public class Employee {
	String name;
	String designation;

	public Employee(String name, String designation) {
		this.name = name;
		this.designation = designation;
	}
	
	void getDetails() {
		System.out.println("Employee Name: " + name);
		System.out.println("Designation: " + designation);
	}
	
	void calcBonus(double basicAllowance) {
		System.out.println("Basic Allowance: " + basicAllowance);
		System.out.println();
	}

	void calcBonus(double basicAllowance, String gift) {
		System.out.println("Basic Allowance: " + basicAllowance);
		System.out.println("Gift: " + gift);
		System.out.println();
	}
	
	void calcBonus(double basicAllowance, String gift, double houseAllowance) {
		System.out.println("Basic Allowance: " + basicAllowance);
		System.out.println("Gift: " + gift);
		System.out.println("House Allowance: " + houseAllowance);
		System.out.println();
	}
}
