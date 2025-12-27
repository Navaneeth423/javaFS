package com.io.examples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadWrite {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader reader = new BufferedReader(ir);
		System.out.println("Reading from console:");
		
		try {
			char val = (char) reader.read();
			while(val != 'q') {
				System.out.print(val);
				val = (char) reader.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
