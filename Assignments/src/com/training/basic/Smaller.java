package com.training.basic;

public class Smaller {
	public static void main(String[] args) {
		int[] arr  = {10, 40, 9, 30, 50};
		int smallest = arr[0];
		for (int i=1;i<arr.length;i++) {
			if (smallest > arr[i]) {
				smallest = arr[i];
			}
		}
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The smallest in the array: " + smallest);
	}
}
