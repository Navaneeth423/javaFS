package com.inher.quest5;

public class SmartPhone extends Mobile {

	@Override
	void call() {
		System.out.println("Call being made from SmartPhone");
	}
	
	String[] apps() {
		return new String[] {"Youtube", "Whatsapp", "Clash of Clans"};
	}
}
