package com.io.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Write a program to append text to an existing file. 
 */

public class Quest13 {
	public static void main(String[] args) {
		String filePath = "sample.txt";
		
		System.out.println("Before Appending, file content: ");
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter content to append:");
		String content = sc.nextLine();
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath, true))) {
			bw.write(content);
			System.out.println("Content has been appended");
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println();
		
		System.out.println("After appending in file:");
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line = br.readLine();
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
