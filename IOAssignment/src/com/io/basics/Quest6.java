package com.io.basics;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

/*
 * Write a program to get specific files
 * with extensions from a specified folder. 
 */

public class Quest6 {
	public static void main(String[] args) {
		String directoryPath = "F:/";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the file extension to search: ");
		String extension = sc.nextLine();
		
		File folder = new File(directoryPath);
		
		if(folder.exists() && folder.isDirectory()) {
			FilenameFilter filter = (dir, name) -> name.endsWith(extension);
			File[] files =  folder.listFiles(filter);
			
			if(files != null && files.length > 0) {
				System.out.println("Files with extension " + extension + ":");
				for (File file : files) {
					System.out.println(file);
				}
			} else {
				System.out.println("No such files with " + extension + " exists");
			}
		} else {
			System.out.println("Invalid Folder path");
		}
		
	}
}
