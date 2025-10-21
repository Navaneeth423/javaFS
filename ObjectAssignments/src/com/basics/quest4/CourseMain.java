package com.basics.quest4;
import java.util.*;

public class CourseMain {
	public static void main(String[] args) {		
		Training training = new Training();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of trainers");
		int numberOfTrainers = sc.nextInt();
		sc.nextLine();
		
		String[] trainers = new String[numberOfTrainers];
		System.out.println("Enter trainer names: ");
		for(int i=0;i<numberOfTrainers;i++) {
			trainers[i] = sc.nextLine();
		}
		
		String[] courses = training.showCourses();
		System.out.println("Available Courses: ");
		for(String course : courses) {
			System.out.println(course);
		}
		
		training.showTrainers(trainers);
	}
}
