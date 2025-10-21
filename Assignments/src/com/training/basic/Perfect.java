package com.training.basic;

public class Perfect {
	public static void main(String[] args) {
		int num = 6;
		if (num <= 1) {
			System.out.println(num + " is NOT a perfect number");
			return;
		}
		
		int sum = 1;
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				sum += i;
				int divisor = num / i;
				if (divisor != i) sum += divisor;
			}
		}
		
		if (sum == num) {			
			System.out.println(num + " is a perfect number");
		} else {
			System.out.println(num + " is NOT a perfect number");
		}
	}
}
