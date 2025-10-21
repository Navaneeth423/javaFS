package com.training.scan;
import java.util.*;

public class LongestWord {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a sentence: ");
		String sentence = sc.nextLine();
		
		String[] words = sentence.split("\\s");
		String longestWord = words[0];
		
		for(String word : words) {
			if(word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		
		System.out.println("The longest word in the sentence: " + longestWord);
	}
}
