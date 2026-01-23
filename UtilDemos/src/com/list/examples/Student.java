package com.list.examples;

public class Student {
	private String name;
	private int StudentId;
	private String city;
	
	public Student() {
		super();
	}

	public Student(String name, int studentId, String city) {
		super();
		this.name = name;
		StudentId = studentId;
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStudentId() {
		return StudentId;
	}

	public void setStudentId(int studentId) {
		StudentId = studentId;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", StudentId=" + StudentId + ", city=" + city + "]";
	}
}
