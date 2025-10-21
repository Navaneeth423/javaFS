package com.training.scan;

import java.util.*;

public class ScanGreater {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Enter 3 numbers: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		System.out.println("The greatest is: " + (num1>num2 ? num1 :(num2>num3?num2:num3)));
	}
}