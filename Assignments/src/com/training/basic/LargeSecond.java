package com.training.basic;

public class LargeSecond {
	public static void main(String[] args) {
		int[] arr = {90, 20, 30, 10, 80};
		int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(largest < arr[i])
				largest = arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(secondLargest < arr[i] && arr[i] != largest) {
				secondLargest = arr[i];
			}
		}
		
		System.out.println();
		System.out.println("Second largest among the array: " + secondLargest);
	}
}
