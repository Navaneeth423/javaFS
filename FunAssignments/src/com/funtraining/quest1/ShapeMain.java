package com.funtraining.quest1;

public class ShapeMain{
	public static void main(String[] args) {
		IShape rect = (x, y)-> System.out.println("Rectangle Area: " + (x*y));
		rect.area(10, 20);
		
		IShape triangle = (b, h)-> System.out.println("Triangle Area: " + (0.5*b*h));
		triangle.area(20, 30);
		
		IShape square = (x, y)-> System.out.println("Square Area: " + (x*x));
		square.area(10, 0);
	}

}
