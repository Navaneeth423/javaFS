package com.basics.quest5;

public class MobileMain {
	public static void main(String[] args) {
		Mobile mobile1 = new Mobile("A26", "Samsung", "White");
		Mobile mobile2 = new Mobile("i17", "Apple", "Orange");
		Mobile mobile3 = new Mobile("5T", "OnePlus", "Red");
		Mobile mobile4 = new Mobile("S31", "Samsung", "Black");
		Mobile mobile5 = new Mobile("Fusion 50g", "Motorola", "Blue");
		
		Mobile[] mobileArray = new Mobile[5];
		mobileArray[0] = mobile1;
		mobileArray[1] = mobile2;
		mobileArray[2] = mobile3;
		mobileArray[3] = mobile4;
		mobileArray[4] = mobile5;
		
		for(Mobile mobile : mobileArray) {
			mobile.getDetails();
			System.out.println();
		}
		
		System.out.println("Samsung brand phones details:");
		for(Mobile mobile : mobileArray) {
			if(mobile.brand.equals("Samsung")) {
				System.out.println(mobile.model);
				System.out.println(mobile.color);
				System.out.println();
			}
		}
	}
}
