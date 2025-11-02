package com.inter.ex1;

public abstract class TeamLead extends Employee implements IGames{
	double amount;

	public TeamLead(String empName, int empId, String city, double amount) {
		super(empName, empId, city);
		this.amount = amount;
	}

	@Override
	public void showPolicyDetails() {
		System.out.println("Team Lead Polivy Details");
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Team Lead Bonus: " + amount*1.5);
	}

	@Override
	void projectDetails() {
		System.out.println("Team Leader has some projects");
	}

	@Override
	public String[] indoor() {
		return new String[] {"Chess", "Table Tennis"};
	}
	
	//Own Method
	String[] certificationsDone() {
		return new String[] {"Java", "SQL", "Power Bi"};
	}

}
