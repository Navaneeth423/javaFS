package com.io.basics;
/*
 * Read from the file and write in the console
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Quest2 {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Reading from file:");
		try (FileReader reader = new FileReader("quest2.txt")){
			int data = reader.read();
			while (data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
		}
	}
}
