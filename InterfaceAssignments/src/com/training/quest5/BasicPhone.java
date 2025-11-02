package com.training.quest5;

public class BasicPhone implements IFeaturePhone{

	@Override
	public void call() {
		System.out.println("Calling using buttons");
	}

	@Override
	public void messaging() {
		System.out.println("SMS Services");
	}

}
