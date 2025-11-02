package com.training.quest5;

public interface ISmartPhone extends IFeaturePhone{
	String[] showApps();
	void useCamera();
	static void brandInfo() {
		System.out.println("Brand Info from ISmartPhone");
	}
	void payBills(String type);
	default void downloadMusic() {
		System.out.println("Downloading Music from smart phone");
	}
}
