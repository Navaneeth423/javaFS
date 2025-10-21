package com.oops.override;

public class FrontEnd extends Course{

	@Override
	String[] showCourses() {
		return new String[] {"HTML", "CSS", "JS"};
	}
	
}
