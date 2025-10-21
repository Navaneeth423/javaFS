package com.inher.quest4;

public class SMSCommunication extends Communication {

	@Override
	void sendMessage() {
		System.out.println("Sending message from SMS");
	}
	
	void messageLength() {
		System.out.println("Good Morning! Hope you have a Great Day");
	}
}
