package com.basics.quest3;
import java.util.*;

public class StudentMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of subjects: ");
		int numberOfSubjects = sc.nextInt();
		
		int[] marks = new int[numberOfSubjects];
		System.out.println("Enter marks of subjects for student 1: ");
		for(int i=0;i<numberOfSubjects;i++) {
			marks[i] = sc.nextInt();
		}
		Student student1 = new Student("Joe", "CSE", marks);
		student1.printDetails();
		String grade = student1.getGrades(marks);
		System.out.println(grade);
		
		System.out.println("Enter marks of subjects for student 2: ");
		for(int i=0;i<numberOfSubjects;i++) {
			marks[i] = sc.nextInt();
		}
		Student student2 = new Student("Joe", "CSE", marks);
		student2.printDetails();
		grade = student2.getGrades(marks);
		System.out.println(grade);

	}
}
