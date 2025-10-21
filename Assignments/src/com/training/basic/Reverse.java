package com.training.basic;

public class Reverse {
	public static void main(String[] args) {
		int num = 12;
		int n = num;
		int numOfDigits = 0;
		
		while (n != 0) {
			numOfDigits++;
			n /= 10;
		}
		numOfDigits--;
		n = num;
		int reverse = 0;
		while(n != 0) {
			int lastDigit = n % 10;
			reverse += (int) (lastDigit * Math.pow(10, numOfDigits--));
			n /= 10;
		}
		
		System.out.println("Reverse of " + num + ": " + reverse);
	}
}
