package com.over.quest2;

public class MessengerMain {
	public static void main(String[] args) {
		Messenger messenger = new Messenger();
		
		messenger.sendMail("Good Morning");
		messenger.sendMail("I'm a huge fan of you sir", "rohitsharma@gmail.com");
		messenger.sendMail("10% increase in gold rate", "investors@gmail.com", "Gold prices off the ROOFF!");
	}
}
