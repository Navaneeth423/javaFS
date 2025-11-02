package com.inter.ex1;

public class Developer extends TeamLead {
	String city;

	public Developer(String empName, int empId, String city, double amount, String city2) {
		super(empName, empId, city, amount);
		city = city2;
	}

	@Override
	public String[] outdoor() {
		return new String[] {"Football", "Cricket"};
	}

	@Override
	public void showActivities() {
		System.out.println("Developer Activities");
	}

	@Override
	public void showPolicyDetails() {
		super.showPolicyDetails();
		System.out.println("Policy for Developers");
	}

	@Override
	void calcBonus(double amount) {
		System.out.println("Developer Bonus: " + amount*0.5);
	}

	@Override
	public String[] indoor() {
		return new String[] {"Carrom", "Squash"};
	}
	
	void skillsNeeded() {
		System.out.println("Backend: Java, Spring");
		System.out.println("Frontend: HTML, CSS, JS");
		System.out.println("Devops: Jenkins, Ci/CD Pipelines");
	}

}
