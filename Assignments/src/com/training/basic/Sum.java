package com.training.basic;

public class Sum {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		int n = arr.length;
		
		int sum = 0;
		float avg = 0.0f;

		for(int i=0;i<n;i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0;i<n;i++) {
			sum += arr[i];
		}
		
		avg = sum / n;
		
		System.out.println();
		System.out.println("Sum: " + sum + " Average: " + avg);
	}
}
