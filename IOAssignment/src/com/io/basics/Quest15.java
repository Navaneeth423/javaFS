package com.io.basics;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*
 * Write a program to find the longest word in a text file.
 */

public class Quest15 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		String filePath = "sample.txt";
		String longestWord = "";
		int length = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			line = br.readLine();
			
			while(line != null) {
				String[] words = line.split(" ");
				
				for(String word : words) {
					word = word.replaceAll("[^a-zA-Z]", "");
					
					if (word.length() > longestWord.length()) {
						longestWord = word;
						length = longestWord.length();
					}
				}
				line = br.readLine();
			}
			
			System.out.println("Longest word in the file: " + longestWord);
			System.out.println("Length of the word: " + length);
		}
	}
}
