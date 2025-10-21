package com.basics.quest3;

public class Student {
	String name;
	String department;
	int[] marks;
	
	public Student(String name, String department, int[] marks) {
		super();
		this.name = name;
		this.department = department;
		this.marks = marks;
	}

	void printDetails() {
		System.out.println("Student Name: " + name);
		System.out.println("Department: " + department);
		System.out.print("Marks:");
		for(int mark: marks) {
			System.out.print(" " + mark);
		}
		System.out.println();
	}
	
	String getGrades(int[] marks) {
		int sum = 0;
		float average = 0.0f;
		int num = 0;
		
		for(int mark : marks) {
			sum += mark;
			num++;
		}
		average = sum / num;
		
		if (average > 90) {
			return "Grade A";
		} else if (average > 80) {
			return "Grade B";
		} else if (average > 70) {
			return "Grade C";
		} else if (average > 60) {
			return "Grade D";
		} else if (average > 50) {
			return "Grade E";
		} else {
			return "Fail";
		}
	}
}
