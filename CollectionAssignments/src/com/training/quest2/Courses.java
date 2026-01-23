package com.training.quest2;

public class Courses {
	private String courseName;
	private String type;
	
	public Courses() {
		super();
	}

	public Courses(String courseName, String type) {
		super();
		this.courseName = courseName;
		this.type = type;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Courses [courseName=" + courseName + ", type=" + type + "]";
	}
	
}
