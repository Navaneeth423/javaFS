package com.training.scan;
import java.util.*;

public class ScanSum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int sum = 0;
		
		System.out.println("Enter elements of array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		
		float avg = sum / size;
		
		System.out.println("Sum: " + sum + "\nAverage: " + avg);
	}
}
