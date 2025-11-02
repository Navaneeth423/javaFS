package com.training.quest2;
import java.util.*;

public class FileDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of file extractor: Zip/Jar/Rar");
		char choice = sc.next().charAt(0);
		
		IExtractor extractor;
		
		if(choice == 'z' || choice == 'Z') {
			extractor = new ZipExtractor();
			extractor.extractFiles("examples.zip");
		} else if(choice == 'r' || choice == 'R') {
			extractor = new RarExtractor();
			extractor.extractFiles("examples.rar");
		} else if(choice == 'j' || choice == 'J') {
			extractor = new JarExtractor();
			extractor.extractFiles("examples.jar");
		} else {
			System.out.println("Not a valid file extractor");
		}
	}
}
