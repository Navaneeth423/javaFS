package com.abs.quest1;

public abstract class TeamLead extends Employee {

	public TeamLead(String empName, double salary, int empId) {
		super(empName, salary, empId);
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Bonus: " + 1.5*amount);
	}

	void corporateServices() {
		System.out.println("Services provided are: Application Development, Team Management and Time Management");
	}
}
