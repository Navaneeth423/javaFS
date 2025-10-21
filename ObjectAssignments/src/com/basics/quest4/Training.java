package com.basics.quest4;

public class Training {
	String[] showCourses() {
		return new String[] {"Java", "HTML", "CSS"};
	}
	
	void showTrainers(String... names) {
		System.out.println("Trainers Names: ");
		for(String trainer : names) {
			System.out.println(trainer);
		}
	}
}
