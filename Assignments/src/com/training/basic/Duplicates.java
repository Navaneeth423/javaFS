package com.training.basic;

public class Duplicates {
	public static void main(String[] args) {		
		int[] arr = new int[] {10, 20, 10, 10};
		int count = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j])  {
					count++;
				}
			}
		}
		
		System.out.println("Number of duplicates: " + count);
	}
}
