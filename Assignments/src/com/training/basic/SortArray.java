package com.training.basic;

public class SortArray {
	public static void main(String[] args) {
		int[] arr = new int[] {9, 3, 4, 2, 8, 7};
		
		for(int i=0;i<arr.length;i++) {
			int smallestIndex = i;
			
			for(int j=i+1;j<arr.length;j++) {
				if(arr[j] < arr[smallestIndex]) {
					smallestIndex = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[smallestIndex];
			arr[smallestIndex] = temp;
		}
		
		for(int num : arr) {			
			System.out.print(num + " ");
		}
	}
}
