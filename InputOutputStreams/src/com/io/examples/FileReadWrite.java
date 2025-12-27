package com.io.examples;

import java.io.*;

public class FileReadWrite {
	public static void main(String[] args) {
		
		try(FileReader reader = new FileReader("demo.txt");
			FileWriter writer = new FileWriter("write.txt");) {
			int data = reader.read();
			while(data!=-1) {
				writer.write(data);
				data = reader.read();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
