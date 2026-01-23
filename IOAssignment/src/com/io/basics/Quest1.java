package com.io.basics;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/*
 * Read from the console and write into a file 
 */

public class Quest1 {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(ir);
		System.out.println("Reading from the console:");

		try (FileWriter writer = new FileWriter("quest1.txt")){
			char val = (char) reader.read();
			while (val != 'q') {
				System.out.print(val);
				writer.write(val);
				val = (char) reader.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
