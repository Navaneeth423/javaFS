package com.inher.quest4;

public class WhatsappCommunication extends Communication {

	@Override
	void sendMessage() {
		System.out.println("Sending message from Whatsapp");
	}
	
	void otherFeatures() {
		System.out.println("Photos, Videos, Documents, Audios can be sent");
	}
}
