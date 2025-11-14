package com.funtraining.quest6;
import java.util.Arrays;
import java.util.Scanner;

public class CourseMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your role: Frontend / Backend / Database");
		String role = sc.nextLine();
		String type = null;
		switch(role.toLowerCase()) {
		case "frontend":
			ICourses frontend = (roleType)-> {
				if (roleType.equalsIgnoreCase("design"))
					return new String[] {"HTML", "CSS", "Bootstrap", "Material"};
				else if (roleType.equalsIgnoreCase("development"))
					return new String[] {"HTML", "CSS", "Angular", "React"};
				else
					return new String[] {"No courses Avaialable"};
			};
			System.out.println("Enter your frontend type: Design / Development");
			type = sc.nextLine();
			System.out.println("Frontend Courses: " + Arrays.toString(frontend.printCourses(type.toLowerCase())));
			break;
		case "backend":
			ICourses backend = (roleType)-> {
				if (roleType.equalsIgnoreCase("java"))
					return new String[] {"Spring", "Hibernate"};
				else if (roleType.equalsIgnoreCase("python"))
					return new String[] {"Django", "Flask"};
				else
					return new String[] {"No courses Avaialable"};
			};
			System.out.println("Enter your backend type: Java / Python");
			type = sc.nextLine();
			System.out.println("Backend Courses: " + Arrays.toString(backend.printCourses(type.toLowerCase())));
			break;
		case "database":
			ICourses database = (roleType)-> {
				if (roleType.equalsIgnoreCase("sql"))
					return new String[] {"MySQL", "Oracle"};
				else if (roleType.equalsIgnoreCase("nosql"))
					return new String[] {"MongoDB", "CouchDB"};
				else
					return new String[] {"No courses Avaialable"};
			};
			System.out.println("Enter your database type: SQL / NoSQL");
			type = sc.nextLine();
			System.out.println("Database Courses: " + Arrays.toString(database.printCourses(type.toLowerCase())));
			break;
		default:
			System.out.println("No Roles available");
			break;
		}
	}
}
