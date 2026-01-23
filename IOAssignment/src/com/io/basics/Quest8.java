package com.io.basics;

import java.io.File;

/*
 * Write a program to compare two files lexicographically. 
 */


public class Quest8 {
	public static void main(String[] args) {
		File file1 = new File("F:/Gfg1.txt");
		File file2 = new File("F:/Gfg2.txt");
		
		int value = file1.compareTo(file2);
		if (value == 0) {
			System.out.println("Both files are equal");
		} else if (value > 0) {
			System.out.println("Gfg1 is greater than Gfg2");
		} else {
			System.out.println("Gfg2 is greater than Gfg1");
		}
	}
}
