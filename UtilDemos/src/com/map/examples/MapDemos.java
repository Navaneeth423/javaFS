package com.map.examples;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class MapDemos {
	public static void main(String[] args) {
		Map<Department, List<Student>> map = new HashMap<>();

		Department cse = new Department(101, "CSE", "John Wick");
		Department ece = new Department(201, "ECE", "Jack Sparrow");
		Department ai = new Department(105, "AI", "Will Legend");
		Department eee = new Department(204, "EEE", "Albert Einstein");

		List<Student> cseStudents = Arrays.asList(new Student(785, "John", "CA"), new Student(998, "Theo", "NY"),
				new Student(252, "Ron", "Hogwarts"));

		List<Student> eceStudents = Arrays.asList(new Student(121, "Kumar", "IN"), new Student(513, "Leo", "AM"),
				new Student(252, "Harry", "Marvel"));

		List<Student> aiStudents = Arrays.asList(new Student(786, "Navan", "IN"), new Student(684, "Renner", "LA"),
				new Student(127, "Jeremy", "DC"));

		map.put(cse, cseStudents);
		map.put(ece, eceStudents);
		map.put(ai, aiStudents);
		map.put(eee, null);

		for (Map.Entry<Department, List<Student>> entry : map.entrySet()) {
			if (entry.getValue() == null) {
				map.put(entry.getKey(), Arrays.asList(new Student(786, "Kums", "FL"), 
						                              new Student(134, "Lik", "Pok")));
			}
			System.out.println(entry.getKey());
			entry.getValue().forEach(System.out::println);
			System.out.println();

		}
	}
}
