package com.training.basic;

public class Prime {
	public static void main(String[] args) {
		int num = 23;
		
		for(int i = 2; i < Math.sqrt(num);i++) {
			if(num % i == 0) {
				System.out.println(num + " is not a prime number");
				return;
			}
		}
		
		System.out.println(num + " is a prime number");
	}
}
