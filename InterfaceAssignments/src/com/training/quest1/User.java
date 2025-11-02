package com.training.quest1;
import java.util.*;

public class User {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter user type: (s for student / e for employee)");
		char choice = sc.next().charAt(0);
		
		IInstitute institute;
		
		if (choice == 's' || choice == 'S') {
			institute = new StudentCourses();
			String[] studentCourses = institute.showCourses();
			System.out.print("Student Courses Available are:");
			for(String courses : studentCourses) {
				System.out.print(" " + courses);
			}
		} else if (choice == 'e' || choice == 'E') {
			institute = new EmployeeCourses();
			String[] employeeCourses = institute.showCourses();
			System.out.print("Employee Courses Available are:");
			for(String courses : employeeCourses) {
				System.out.print(" " + courses);
			}
		} else {
			System.out.println("Enter a valid user type!!");
		}
	}
}
