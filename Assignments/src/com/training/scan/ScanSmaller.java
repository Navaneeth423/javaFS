package com.training.scan;
import java.util.*;

public class ScanSmaller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.println("Enter 3 number: ");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		num3 = sc.nextInt();
		
		if(num1 < num2 && num1 < num3) {
			System.out.println(num1 + " is smaller");
		} else if (num2 < num3) {
			System.out.println(num2 + " is smaller");
		} else {
			System.out.println(num3 + " is smaller");
		}
	}
}
