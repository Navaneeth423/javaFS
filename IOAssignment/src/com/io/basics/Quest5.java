package com.io.basics;

import java.io.File;

/*
 * Write a program to get the list of all
 * file/directory names in the given directory 
 */

public class Quest5 {
	public static void main(String[] args) {
		String directoryPath = "F:/";
		
		File directory = new File(directoryPath);
		
		if(directory.exists() && directory.isDirectory()) {
			File[] files = directory.listFiles();
			
			if(files != null) {
				System.out.println("Files & Directory in " + directoryPath);
				
				for (File file : files) {
					if(file.isDirectory()) {						
						System.out.println("[DIR]: " + file.getName());
					} else {
						System.out.println("[FILE]: " + file.getName());
					}
				}
			}
		} else {
			System.out.println("Invalid Directory path");
		}
	}
}
