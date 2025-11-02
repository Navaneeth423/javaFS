package com.training.quest5;
import java.util.*;

public class Customer {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter which mobile you want: Touch Screen or Basic ");
		String choice = sc.nextLine();
		
		if(choice.equalsIgnoreCase("Touch Screen")) {
			ISmartPhone smartPhone = new TouchScreenMobile();
			smartPhone.showApps();
			smartPhone.useCamera();
			smartPhone.downloadMusic();
			smartPhone.payBills("Prepaid");
			ISmartPhone.brandInfo();
		} else if (choice.equalsIgnoreCase("Basic")) {
			IFeaturePhone featurePhone = new BasicPhone();
			featurePhone.call();
			featurePhone.messaging();
			featurePhone.playGames();
			IFeaturePhone.brandInfo();
		}
	}
}
