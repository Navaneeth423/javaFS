package com.oops.override;

public class BackEnd extends Course{

	@Override
	String[] showCourses() {
		return new String[] {"Java", "MongoDB"};
	}
	
}
