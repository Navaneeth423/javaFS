package com.training.quest5;

public interface IFeaturePhone {
	void call();
	void messaging();
	static void brandInfo() {
		System.out.println("Brand Info from IFeaturePhone");
	}
	default void playGames() {
		System.out.println("Playing brick and snake games");
	}
}
