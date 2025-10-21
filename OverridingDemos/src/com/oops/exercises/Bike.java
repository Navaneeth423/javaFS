package com.oops.exercises;

public class Bike extends Vehicle {
	int cc;
	boolean isGearless;
	String ignitionType;
	
	public Bike(String brand, double price, String model, int cc, boolean isGearless, String ignitionType) {
		super(brand, price, model);
		this.cc = cc;
		this.isGearless = isGearless;
		this.ignitionType = ignitionType;
	}

	@Override
	void getMileage() {
		super.getMileage();
		System.out.println("Bike Mileage");
		if(isGearless) {
			System.out.println("Smooth Mileage");
		} else {
			System.out.println("Great Mileage");
		}
	}
	
	String[] showBrands(String type) {
		if(type.equalsIgnoreCase("sports")) {
			return new String[] {"Ducatti", "KTM"};
		} else if (type.equalsIgnoreCase("casual")) {
			return new String[] {"Honda", "TVS"};
		} else {
			return new String[] {"RE", "Jawa"};
		}
	}
	
	void bikeInfo() {
		printDetails();
		System.out.println("Bike CC: " + cc);
		System.out.println("Ignition Type: " + ignitionType);
	}
}
