package com.training.quest2;
import java.util.*;

public class FileDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the type of file extractor: Zip/Jar/Rar");
		String choice = sc.nextLine();
		
		IExtractor extractor;
		
		if(choice.startsWith("z") || choice.startsWith("Z")) {
			extractor = new ZipExtractor();
			extractor.extractFiles("examples.zip");
		} else if(choice.startsWith("r") || choice.startsWith("R")) {
			extractor = new RarExtractor();
			extractor.extractFiles("examples.rar");
		} else if(choice.startsWith("j") || choice.startsWith("J")) {
			extractor = new JarExtractor();
			extractor.extractFiles("examples.jar");
		} else {
			System.out.println("Not a valid file extractor");
		}
	}
}
