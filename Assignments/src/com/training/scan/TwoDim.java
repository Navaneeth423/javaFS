package com.training.scan;

import java.util.Scanner;

public class TwoDim {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number of rows: ");
		int rows = sc.nextInt();
		
		System.out.println("Enter number of columns: ");
		int cols = sc.nextInt();
		
		String[][] names = new String[rows][cols];
		sc.nextLine();
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print("Enter name: ");
				names[i][j] = sc.nextLine();
			}
		}
		
		int count = 0;
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if (names[i][j].toLowerCase().startsWith("s")) {
					count++;
				}
			}
		}

		String[] oneDim = new String[count];
		int index = 0;
		
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				if (names[i][j].toLowerCase().startsWith("s")) {
					oneDim[index++] = names[i][j];
				}
			}
		}
		
		System.out.println("Names starting with S: ");
		for(String name : oneDim) {
			System.out.println(name);
		}
	}
}
