package com.training.scan;
import java.util.*;

public class MaxOccurence {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String sentence = sc.nextLine();
		
		int[] occurence = new int[256];
		
		for(int i=0;i<sentence.length();i++) {
			char c = sentence.charAt(i);
			occurence[c]++;
		}
		
		int maxCount = -1;
		char maxChar = ' ';
		
		for(int i=0;i<sentence.length();i++) {
			char c = sentence.charAt(i);
			if(occurence[c] > maxCount) {
				maxCount = occurence[c];
				maxChar = c;
			}
		}
		
		System.out.println("Maximum occurence is " + maxChar + " with " + maxCount + " number of times");
	}
}
