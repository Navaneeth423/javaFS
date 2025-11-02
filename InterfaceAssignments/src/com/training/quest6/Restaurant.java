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
		
		ICuisine cuisine;
		
		if (choice.equalsIgnoreCase("Indian")) {
			cuisine = new Indian();
			System.out.println("Enter what you want (Starters/Main Course/Desserts) Indian:");
			mealCourse = sc.nextLine();
			courses = cuisine.showMenus(mealCourse);
			for (String course : courses) {
				System.out.println(course);
			}
		} else if (choice.equalsIgnoreCase("International")) {
			cuisine = new International();
			System.out.println("Enter what you want (Starters/Main Course/Desserts) International:");
			mealCourse = sc.nextLine();
			cuisine.showMenus(mealCourse);
			courses = cuisine.showMenus(mealCourse);
			for (String course : courses) {
				System.out.println(course);
			}
		} else {
			System.out.println("No Cuisines present");
		}
	}
}
