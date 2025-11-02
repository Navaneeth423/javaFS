package com.training.quest6;

public class International implements ICuisine{

	@Override
	public String[] showMenus(String type) {
		if (type.equalsIgnoreCase("starters")) {
			return new String[] {"Ceasar Salad", "Garlic Bread"};
		} else if (type.equalsIgnoreCase("desserts")) {
			return new String[] {"Creme Brulee", "Tiramisu", "Baklava"};
		} else if (type.equalsIgnoreCase("main course")) {
			return new String[] {"Lasgna", "Spaghetti", "Fish and Chips", "Pad Thai"};
		}
		return null;
	}
	
}
