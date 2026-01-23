package com.io.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Write a program to read the first 3 lines of a file 
 */

public class Quest14 {
	public static void main(String[] args) {
		String filePath = "sample.txt";
		int count = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			while (count != 3) {
				System.out.println(line);
				line = br.readLine();
				count++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
