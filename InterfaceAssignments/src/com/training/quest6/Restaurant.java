package com.training.quest6;
import java.util.*;

public class Restaurant {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which cuisine you want:");
		System.out.println("Indian or International");
		String choice = sc.nextLine();
		String mealCourse;
		String[] courses = {};
		
		ICuisine cuisine = null;
		
		if (choice.equalsIgnoreCase("Indian")) {
			cuisine = new Indian();
		} else if (choice.equalsIgnoreCase("International")) {
			cuisine = new International();
		} else {
			System.out.println("No Cuisines present");
		}
		System.out.println("Enter what you want (Starters/Main Course/Desserts) Indian:");
		mealCourse = sc.nextLine();
		courses = cuisine.showMenus(mealCourse);
		if(courses != null) {			
			for (String course : courses) {
				System.out.println(course);
			}
		} else {
			System.out.println("Please enter an option. Input cannot be NULL");
			System.exit(0);
		}
	}
}
