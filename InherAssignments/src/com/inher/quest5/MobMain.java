package com.inher.quest5;

public class MobMain {
	public static void main(String[] args) {
		Mobile feature = new FeaturePhone();
		feature.call();
		
		Mobile smartPhone = new SmartPhone();
		smartPhone.call();
		String[] apps = ((SmartPhone)smartPhone).apps();
		for(String app : apps) {
			System.out.println(app);
		}
	}
}
