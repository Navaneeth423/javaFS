package com.oops.override;

public class CourseOverride {
	public static void main(String[] args) {
		Course course = new FrontEnd();
		String[] frontLang = course.showCourses();
		for(String lang : frontLang) {
			System.out.println(lang);
		}
		course.trainingInfo();
		System.out.println();
		
		course = new BackEnd();
		String[] backLang = course.showCourses();
		for(String lang : backLang) {
			System.out.println(lang);
		}
		course.trainingInfo();
	}
}