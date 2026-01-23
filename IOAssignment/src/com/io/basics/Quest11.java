package com.io.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
 * Write a program to store text file content
 * line by line in an array. 
 */

public class Quest11 {
	public static void main(String[] args) {
		File file1 = new File("sample.txt");
		List<String> contentList = new ArrayList<>();
		
		try(BufferedReader br = new BufferedReader(new FileReader(file1))){
			String line;
			while((line = br.readLine()) != null) {
				contentList.add(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String[] array = contentList.toArray(new String[0]);
		
		for(String list : array)
			System.out.println(list);
	}
}
