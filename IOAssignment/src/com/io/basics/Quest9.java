package com.io.basics;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
 * Write a program to read a plain text file. 
 */


public class Quest9 {
	public static void main(String[] args) {
		File filePath = new File("sample.txt");
		
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
