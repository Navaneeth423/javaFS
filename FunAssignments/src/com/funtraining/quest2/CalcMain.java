package com.funtraining.quest2;

public class CalcMain {
	public static void main(String[] args) {
		ICalculator sum = (x, y)-> System.out.println("Sum: " + (x+y));
		sum.calculate(10, 20);
		
		ICalculator product = (x, y)-> System.out.println("Product: " + (x*y));
		product.calculate(20, 30);
		
		ICalculator sqroot = (x, y)-> System.out.println("Square Root: " + Math.sqrt(x));
		sqroot.calculate(100, 0);
		
		ICalculator cube = (x, y)-> System.out.println("Cube: " + (x*x*x));
		cube.calculate(11, 0);
	}
}
