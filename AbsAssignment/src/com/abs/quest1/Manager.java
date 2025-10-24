package com.abs.quest1;

public class Manager extends Employee {
	String activity;
	
	public Manager(String empName, double salary, int empId, String activity) {
		super(empName, salary, empId);
		this.activity = activity;
	}
	
	@Override
	void calcBonus(double amount) {
		System.out.println("Manager Bonus: " + 2*amount);
	}

	@Override
	void showProjects() {
		System.out.println("Manager has 4 projects with him.");
	}

	@Override
	String[] showCourses() {
		return super.showCourses();
	}

	void funClub() {
		System.out.println("Activity: " + activity);
	}

}
