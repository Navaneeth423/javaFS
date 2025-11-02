package com.training.quest3;
import java.util.*;

public class CompressorMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter what type of file you want compressed: ");
		System.out.println("ZIP / Rar / Jar");
		String fileType = sc.nextLine();
		
		IFileCompressor compressor;
		
		switch(fileType.toLowerCase()) {
		case "zip":
			compressor = new ZipCompressor();
			compressor.compressFile(".txt", ".doc", ".csv");
			break;
		case "rar":
			compressor = new RarCompressor();
			compressor.compressFile(".class", ".ptx", ".xlsx", ".pdf", ".mp3");
			break;
		case "jar":
			compressor = new JarCompressor();
			compressor.compressFile(".md", ".jpeg", ".png", ".md", ".mov", ".awk", ".exe");
			break;
		default:
			System.out.println("No such file compressor present");
			break;
		}
		
	}
}
