package com.training.scan;
import java.util.*;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a word: ");
		String word = sc.nextLine();
		String reverseWord = "";
		
		for(int i=word.length() - 1;i>=0;i--) {
			reverseWord += word.charAt(i);
		}
		
		if (reverseWord.equalsIgnoreCase(word)) {
			System.out.println(word + " is a palindrome");
		} else {
			System.out.println(word + " is not a palindrome");
		}
	}
}
