package com.inher.quest3;

public class Oval extends Figures {

	@Override
	void volume(int x, int y) {
		System.out.println("Volume of Oval: " + y*x*y);
	}

}
