package com.io.basics;

import java.io.File;
import java.util.Date;

/*
 * Write a program to check 
 * a)if a file or directory specified by path name exists or not. 
 * b)if a file or directory has read and write permissions. 
 * c)if the given path name is a directory or a file. 
 * d)to get the file size in bytes, KB, MB. 
 * e)to get the last modified date 
 */

public class Quest7 {
	public static void main(String[] args) {
		String directoryPath = "F:/";
		
		File folder = new File(directoryPath);
		
		if(folder.exists()) {
			System.out.println("File / Directory in " + directoryPath + " is present.");
			
			if(folder.canRead() && folder.canWrite()) {
				System.out.println("File / Directory in " + directoryPath + " has read and write permission.");
			}
			
			if(folder.isFile()) {
				System.out.println("The given path is a File");
			} else if(folder.isDirectory()) {
				System.out.println("The given path is a Directory");
			}
			File file = new File("demo.txt");
			if(file.isFile()) {
				long bytes = file.length();
				long kb = bytes / 1024;
				long mb = kb / 1024;
				
				System.out.println("Size of file in bytes: " + bytes + ", KB: " + kb + ", and MB: " + mb);
			}
			long dateModified = file.lastModified();
			Date date = new Date(dateModified);
			System.out.println("The demo.txt was last modified at " + date);
		}
		
		
	}
}
