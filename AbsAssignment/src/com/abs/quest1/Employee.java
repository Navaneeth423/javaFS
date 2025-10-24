package com.abs.quest1;

public abstract class Employee {
	String empName;
	double salary;
	int empId;
	final String COMPANYNAME = "Microsoft";
	
	public Employee(String empName, double salary, int empId) {
		this.empName = empName;
		this.salary = salary;
		this.empId = empId;
	}
	
	abstract void calcBonus(double amount);
	abstract void showProjects();
	
	void printDetails() {
		System.out.println("Employee Name: " + empName);
		System.out.println("Salary: " + salary);
		System.out.println("Employee ID: " + empId);
		System.out.println("Company Name: " + COMPANYNAME);
	}
	
	String[] showCourses() {
		return new String[] {"Java", "Full Stack", "Data Analyst"};
	}
	
	
	final void showRules() {
		officeHours();
		System.out.println("Leave Policies");
		System.out.println("OD Policies");
	}
	
	private void officeHours() {
		System.out.println("14 hours per day");
	}
}
