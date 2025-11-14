package com.funtraining.quest3;

public class MenuMain {
	public static void main(String[] args) {
		IMenu starters = (starterDishes)-> {
			for(String starter : starterDishes) {
				System.out.println(" " + starter);
			}
		};
		System.out.println("Starters: ");
		starters.printMenu(new String[] {"Garlic Bread", "Paneer Tikka", "Corn Fry"});
		
		IMenu mainCourse = (mainCourses)-> {
			for(String course : mainCourses) {
				System.out.println(" " + course);
			}
		};
		System.out.println("Main Course: ");
		mainCourse.printMenu(new String[] {"Full Meals", "Pasta", "Lasgna", "Burger"});
		
		IMenu desserts = (dessertItems)-> {
			for(String dessert : dessertItems) {
				System.out.println(" " + dessert);
			}
		};
		System.out.println("Desserts: ");
		desserts.printMenu(new String[] {"Ice Cream", "Hot Chocolate"});
	}
}
