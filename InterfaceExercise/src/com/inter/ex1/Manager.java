package com.inter.ex1;

public class Manager extends Employee implements IArtsClub{
	String department;

	public Manager(String empName, int empId, String city, String department) {
		super(empName, empId, city);
		this.department = department;
	}

	@Override
	public void showActivities() {
		System.out.println("Manager Activities Available");
	}

	@Override
	public void showPolicyDetails() {
		System.out.println("Manager's Policy details");
	}

	@Override
	public void workshopDetails() {
		System.out.println("Manager Workshop details");
	}

	@Override
	public String[] artClasses() {
		return new String[] {"Painting", "Dance"};
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Manager Bonus: " + amount*2);
	}

	@Override
	void projectDetails() {
		System.out.println("Manager has 4 Activities");
	}
	
	//Own Method
	public String[] reporteesList() {
		return new String[] {"Lakshmi", "Suvathi"};
	}

}
