package com.capg.training;

public class Demo {
	public static void main(String[] args) {
		byte b = 100;
		int x = b * 2;
		long y = x + 2;
		float a = x + y +b;
		double num = a * 2;
		System.out.println(num);
		
		//Downcasting
		float num1 = (float) (num / 2);
		long num2 = (long) (num1 + 10);
		int num3 = (int) (num2 / 2);
		System.out.println(num3);
	}
}
