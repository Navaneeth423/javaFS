package com.io.basics;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 * Read from the file and write into a file
 */
public class Quest3 {
	public static void main(String[] args) throws IOException {
		try (FileReader reader = new FileReader("quest3read.txt");
			 FileWriter writer = new FileWriter("quest3write.txt");) {
			int data = reader.read();
			while (data != -1) {
				writer.write(data);
				data = reader.read();
			}
		}
	}
}
