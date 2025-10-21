package com.training.basic;

public class Armstrong {
	public static void main(String[] args) {
		int num = 153;
		int n = num;
		int sum = 0;
		
		int digits = 0;
		
		while (n != 0) {
			digits++;
			n /= 10;
		}
		n = num;
		
		while (n != 0) {
			int lastDigit = n % 10;
			sum += (int) Math.pow(lastDigit, digits);
			n /= 10;
		}
		
		if (sum == num) {
			System.out.println(num + " is an Armstrong number");
		} else {
			System.out.println(num + " is not an Armstrong number");
		}
	}
}
