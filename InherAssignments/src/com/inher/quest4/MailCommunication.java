package com.inher.quest4;

public class MailCommunication extends Communication {

	@Override
	void sendMessage() {
		System.out.println("Sending message from Mail");
	}
	
	String[] showTypes() {
		return new String[] {"Email", "Telegram", "Letter"};
	}
}
