package com.training.quest6;

public class Indian implements ICuisine{

	@Override
	public String[] showMenus(String type) {
		if (type.equalsIgnoreCase("starters")) {
			return new String[] {"Paneer Tikka", "Aloo Chaat", "Prawn Koliwada"};
		} else if (type.equalsIgnoreCase("desserts")) {
			return new String[] {"Jalebi", "Kheer", "Mysore Pak"};
		} else if (type.equalsIgnoreCase("main course")) {
			return new String[] {"Rogan Josh", "Palak Paneer", "Fish Curry", "Butter Chicken with Naan"};
		}
		return null;
	}
	
}
