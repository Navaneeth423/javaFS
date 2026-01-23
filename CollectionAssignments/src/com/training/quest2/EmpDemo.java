package com.training.quest2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EmpDemo {
	public static void main(String[] args) {
		Map<Courses, List<Employee>> map = new LinkedHashMap<>();
		
		Courses backendCourse = new Courses("Spring", "Backend");
		Courses frontendCourse = new Courses("HTML", "Frontend");
		Courses finanaceCourse = new Courses("Policies", "Finance");
		Courses managementCourse = new Courses("Time Management", "Management");
		
		List<Employee> frontEndEmployees = Arrays.asList(new Employee("John Wick", "Frontend", "NY"), new Employee("Tony Stark", "Frontend", "CA"), new Employee("Jacl Sparrow", "Frontend", "Boston"));

		List<Employee> backEndEmployees = Arrays.asList(new Employee("John Doe", "Backend", "Paris"), new Employee("Jacques Cluso", "Backend", "Kenya"), new Employee("Harry Potter", "Backend", "Hogwarts"));
		
		List<Employee> financeEmployees = Arrays.asList(new Employee("Itadori Yuji", "Finance", "Tokyo"), new Employee("Wong Ling Lee", "Finance", "Hong Kong"), new Employee("Abdul Rahim", "Finance", "Turkey"));
		
		map.put(finanaceCourse, financeEmployees);
		map.put(backendCourse, backEndEmployees);
		map.put(frontendCourse, frontEndEmployees);
		map.put(managementCourse, null);
		
		for (Map.Entry<Courses, List<Employee>> entry : map.entrySet()) {
			Courses key = entry.getKey();
			List<Employee> val = entry.getValue();
			System.out.println(key + " " + val);
		}
	}
}
