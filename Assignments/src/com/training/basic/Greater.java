package com.training.basic;

public class Greater {
	public static void main(String[] args) {
		int[] arr  = {10, 40, 9, 30, 50};
		int greatest = arr[0];
		for (int i=1;i<arr.length;i++) {
			if (greatest < arr[i]) {
				greatest = arr[i];
			}
		}
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("The greatest in the array: " + greatest);
	}
}
