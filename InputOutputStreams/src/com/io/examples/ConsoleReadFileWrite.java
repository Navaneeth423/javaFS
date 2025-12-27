package com.io.examples;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleReadFileWrite {
	public static void main(String[] args) {
		InputStreamReader ir = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(ir);
		
		try (FileWriter writer = new FileWriter("consoletofile.txt");) {
			int data = br.read();
			while(data!='q') {
				writer.write(data);
				data = br.read();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
