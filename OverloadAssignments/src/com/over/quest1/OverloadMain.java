package com.over.quest1;
import java.util.*;

public class OverloadMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Employee[] empArray = new Employee[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter name: ");
			String name = sc.nextLine();
			
			System.out.println("Enter your designation (Manager, Programmer or Director): ");
			String designation = sc.nextLine();
			
			Employee employee = new Employee(name, designation);
			empArray[i] = employee;
		}
		
		for(Employee employee : empArray) {
			if(employee.designation.equalsIgnoreCase("Programmer")) {
				employee.getDetails();
				employee.calcBonus(10000);
			} else if(employee.designation.equalsIgnoreCase("Manager")) {
				employee.getDetails();
				employee.calcBonus(20000, "Car");
			} else if(employee.designation.equalsIgnoreCase("Director")) {
				employee.getDetails();
				employee.calcBonus(50000, "House", 10000);
			}
		}
	}
}
