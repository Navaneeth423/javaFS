package com.capg.training;

public class IncDecDemo {
	public static void main(String[] args) {
		String day = "thursday";
		
		switch(day.toUpperCase()) {
		case "SUNDAY":
		case "SATURDAY":
			System.out.println("Enjoy Weekends");
			break;
		case "MONDAY":
			System.out.println("Gloomy days starting to work");
			break;
		case "TUESDAY":
		case "WEDNESDAY":
		case "THURSDAY":
			System.out.println("Busy with work");
			break;
		case "FRIDAY":
			System.out.println("Waiting for Weekend");
			break;
		default:
			System.out.println("No such days are present in a week");
			break;
		}
	}
}
