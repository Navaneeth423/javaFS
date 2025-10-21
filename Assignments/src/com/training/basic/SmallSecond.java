package com.training.basic;

public class SmallSecond {
	public static void main(String[] args) {
		int[] arr = {90, 20, 30, 10, 80};
		int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
		
		for (int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		
		for(int i=0;i<arr.length;i++) {
			if(smallest > arr[i])
				smallest = arr[i];
		}
		
		for(int i=0;i<arr.length;i++) {
			if(secondSmallest > arr[i] && arr[i] != smallest) {
				secondSmallest = arr[i];
			}
		}
		
		System.out.println();
		System.out.println("Second smallest among the array: " + secondSmallest);
	}
}
