package com.training.basic;

public class Factorial {
	public static void main(String[] args) {
		int num = 5;
		int fact = 1;
		int n = num;
		
		if(num == 1 || num == 0) {
			System.out.println("Factorial of " + num + ": 1");
		} else {
			while(n != 0) {
				fact *= n;
				n--;
			}
		}
		System.out.println("Factorial of " + num + ": " + fact);
	}
}
