package com.io.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * Write a program to write and read a plain text file.
 */

public class Quest12 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter content to be put in file: ");
		String content = sc.nextLine();
		
		try (FileWriter writer = new FileWriter("sample.txt")) {
			writer.write(content);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//Only when buffer is flushed or writer is closed, data is written to the file
		
		try (FileReader reader = new FileReader("sample.txt")) {
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
