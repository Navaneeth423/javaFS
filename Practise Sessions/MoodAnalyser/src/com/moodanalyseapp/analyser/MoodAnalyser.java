package com.moodanalyseapp.analyser;
import java.util.*;

public class MoodAnalyser {
	private String[] positiveWords = new String[] {"Joyful", "Peaceful", "Kind", "Happy", "Energetic", "Confident"};
	private String[] negativeWords = new String[] {"Angry", "Sad", "Stressed", "Anxious", "Hopeless", "Confused"};
	
	String analyseMood(String message) {
		String mood = "neutral";
		String[] words = message.trim().split("\\s+");
		
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<negativeWords.length;j++) {
				if(words[i].equalsIgnoreCase(negativeWords[j]))
					return "negative";
			}
		}
		
		for(int i=0;i<words.length;i++) {
			for(int j=0;j<positiveWords.length;j++) {
				if(words[i].equalsIgnoreCase(positiveWords[j]))
					return "positive";
			}
		}
		
		return mood;
	}
	
	String suggestHelp(String result) {
		String message = "Enjoy";
		
		if(result.contains("negative")) {
			message = "Try to relax, watch a movie";
		} else if (result.contains("positive")) {
			message = "Keep Enjoying till the end of the day";
		}	
		
		return message;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Tell me what is going through your mind!");
		String message = sc.nextLine();
		
		MoodAnalyser moodAnalyser = new MoodAnalyser();
		String result = moodAnalyser.analyseMood(message);
		System.out.println("Result: " + moodAnalyser.suggestHelp(result));
	}
}
