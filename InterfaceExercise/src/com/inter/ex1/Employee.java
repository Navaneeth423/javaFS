package com.inter.ex1;

public abstract class Employee implements IInsurance, IActivityClubs{
	private String empName;
	private int empId;
	private String city;
	public Employee(String empName, int empId, String city) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.city = city;
	}
	
	void printDetails() {
		System.out.println("Name: " + empName);
		System.out.println("ID: " + empId);
		System.out.println("City: " + city);
	}
	
	abstract void calcBonus(double amount);
	abstract void projectDetails();
}
