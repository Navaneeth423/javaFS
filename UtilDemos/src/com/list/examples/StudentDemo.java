package com.list.examples;

import java.util.*;

public class StudentDemo {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		
		students.add(new Student("Jack Sparrow", 101, "Cali"));
		students.add(new Student("Tony Stark", 124, "NYC"));
		students.add(new Student("John Wick", 346, "Boston"));
		students.add(new Student("Russel Giovani", 525, "Bronx"));
		students.add(new Student("Rocky Balboa", 111, "NYC"));
		
		System.out.println(students.size());
		
		ListIterator<Student> it = students.listIterator(students.size());
		while (it.hasPrevious()) {
			Student student = it.previous();
			System.out.println(student.toString());
		}
		
	}
}
