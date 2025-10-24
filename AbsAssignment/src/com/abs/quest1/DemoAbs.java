package com.abs.quest1;
import java.util.*;

public class DemoAbs {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your designation in the company: ");
		String designation = sc.nextLine();
		
		switch(designation.toLowerCase()) {
		case "manager":
			System.out.println("Enter Manager's name: ");
			String mgrName = sc.nextLine();
			System.out.println("Enter Manager's salary: ");
			double mgrSalary = sc.nextDouble();
			System.out.println("Enter Manager's EmpID: ");
			int mgrEmpId = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter Manager's fun activity: ");
			String activity = sc.nextLine();
			Employee manager = new Manager(mgrName, mgrSalary, mgrEmpId, activity);
			manager.printDetails();
			manager.showRules();
			manager.calcBonus(mgrSalary);
			manager.showCourses();
			manager.showProjects();
			((Manager)manager).funClub();
			break;
		case "developer":
			System.out.println("Enter Developer's name: ");
			String devName = sc.nextLine();
			System.out.println("Enter Developer's salary: ");
			double devSalary = sc.nextDouble();
			System.out.println("Enter Developer's EmpID: ");
			int devEmpId = sc.nextInt();
			String[] hobbies = {"Music", "Boxing"};
			Employee developer = new Developer(devName, devSalary, devEmpId, hobbies);
			developer.printDetails();
			developer.showRules();
			developer.showCourses();
			((Developer)developer).showHobbies();
			break;
		case "team lead":
			System.out.println("Enter TL name: ");
			String tlName = sc.nextLine();
			System.out.println("Enter TL salary: ");
			double tlSalary = sc.nextDouble();
			System.out.println("Enter TL EmpID: ");
			int tlEmpId = sc.nextInt();
			String[] tlHobbies = {"Dancing", "Art"};
			TeamLead teamlead = new Developer(tlName, tlSalary, tlEmpId, tlHobbies);
			teamlead.printDetails();
			teamlead.showRules();
			teamlead.showCourses();
			teamlead.calcBonus(tlSalary);
			teamlead.corporateServices();
			break;
		default:
			System.out.println("Not a valid designation!!");
			break;
		}
	}
}
