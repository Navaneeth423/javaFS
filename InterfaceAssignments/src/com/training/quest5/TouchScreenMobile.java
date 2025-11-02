package com.training.quest5;

public class TouchScreenMobile extends BasicPhone implements ISmartPhone{

	@Override
	public String[] showApps() {
		return new String[] {"Whatsapp", "Clash of Clans"};
	}

	@Override
	public void useCamera() {
		System.out.println("Picture taken from TouchScreenMobile");
	}

	@Override
	public void payBills(String type) {
		System.out.println("Bills paid for " + type);
	}

	@Override
	public void downloadMusic() {
		System.out.println("Music download in TouchScreenMobile");
	}

}
