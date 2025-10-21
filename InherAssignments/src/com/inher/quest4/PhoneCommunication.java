package com.inher.quest4;

public class PhoneCommunication extends Communication {

	@Override
	void sendMessage() {
		System.out.println("Sending message from Phone");
	}
	
	void callService() {
		System.out.println("Call can be made to Local, International or Subscriber Trunk Dialing (STD)");
	}
}
