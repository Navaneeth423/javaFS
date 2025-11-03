package com.training.quest1;
import java.util.*;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user type: (Student/Em[loyee)");
		String choice = sc.nextLine();
		
		IInstitute institute = null;
		
		if (choice.startsWith("s") || choice.startsWith("S")) {
			institute = new StudentCourses();
		} else if (choice.startsWith("e") || choice.startsWith("E")) {
			institute = new EmployeeCourses();
		} else {
			System.out.println("Enter a valid user type!!");
		}
		String[] employeeCourses = institute.showCourses();
		System.out.print("Courses Available are:");
		for(String courses : employeeCourses) {
			System.out.print(" " + courses);
		}
	}
}
