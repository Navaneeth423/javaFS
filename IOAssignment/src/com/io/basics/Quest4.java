package com.io.basics;

/*
 * Write a program to create a new file
 * and add contents to it 
 */

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Quest4 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the message to be written in file");
		String message = sc.nextLine();
		
		File file = new File("quest4.txt");
		
		if(file.createNewFile()) {
			System.out.println("File created succesfully!!");
		} else {
			System.out.println("File already exists");
		}
		
		try (FileWriter writer = new FileWriter(file);) {
			writer.write(message);
			System.out.println("Message written to file");
		}
		 
	}
}
