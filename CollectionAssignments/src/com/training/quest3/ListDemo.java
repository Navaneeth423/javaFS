package com.training.quest3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListDemo {
	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		
		list = Arrays.asList(new Employee("John Wick", 131, "NY"),
				new Employee("Jack Sparrow", 424, "Boston"),
				new Employee("Connor McGreggor", 979, "Ireland"),
				new Employee("Khabib", 134, "Ireland"),
				new Employee("T'chala", 647, "Ireland"));
		
		list.forEach(System.out::println);
		
		String city = "Ireland";
		List<Employee> employeesByCity = new ArrayList<>();
		
		for(Employee emp : list) {
			if(emp.getCity().equalsIgnoreCase(city)) {
				employeesByCity.add(emp);
			}
		}
		
		System.out.println("Employees from " + city);
		employeesByCity.forEach(System.out::println);
	}
}