package com.training.scan;
import java.util.*;

public class SquareRoot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter size of array: ");
		int size = sc.nextInt();
		int[] arr = new int[size];
		
		
		System.out.println("Enter numbers for array: ");
		for(int i=0;i<size;i++) {
			arr[i] = sc.nextInt();
		}
		
		int[] squareRootArr = new int[size];
		
		for(int i=0;i<arr.length;i++) {
			squareRootArr[i] = (int) Math.sqrt(arr[i]);
		}
		
		System.out.println("Square Root Array: ");
		for(int num : squareRootArr) {
			System.out.print(num + " ");
		}
	}
}
