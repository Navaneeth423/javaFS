package com.io.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Write a program to read a plain text file. 
 */

public class Quest10 {
	public static void main(String[] args) {
		File file1 = new File("sample.txt");
		StringBuilder fileContent = new StringBuilder();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file1))){
			String line;
			while((line = br.readLine()) != null) {
				fileContent.append(line).append("\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String content = fileContent.toString();
		System.out.println(content);
	}
}
