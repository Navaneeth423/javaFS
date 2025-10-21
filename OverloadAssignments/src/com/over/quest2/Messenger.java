package com.over.quest2;

public class Messenger {
	void sendMail(String message) {
		System.out.println("Message: " + message);
		System.out.println();
	}
	void sendMail(String message, String toUsername) {
		System.out.println("Message: " + message);
		System.out.println("To Address: " + toUsername);
		System.out.println();
	}
	void sendMail(String message, String toUsername, String subject) {
		System.out.println("Message: " + message);
		System.out.println("To Address: " + toUsername);
		System.out.println("Subject: " + subject);
		System.out.println();
	}
}
