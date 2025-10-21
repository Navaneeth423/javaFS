package com.training.basic;

public class Fibonacci {
	public static void main(String[] args) {
		int first = 0, second = 1;
		int third = first + second;
		System.out.print(first + " " + second);
		while(third < 100) {
			System.out.print(" " + third);
			first = second;
			second = third;
			third = first + second;
		}
	}
}
