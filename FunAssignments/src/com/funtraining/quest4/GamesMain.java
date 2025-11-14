package com.funtraining.quest4;

public class GamesMain {
	public static void main(String[] args) {
		IGames indoor = ()-> {
			System.out.println("Indoor Games: Chess, Carrom, Board Games");
		};
		indoor.showGames();
		
		IGames outdoor = ()-> {
			System.out.println("Outdoor Games: Cricket, Football, Basketball, Rugby, Javelin Throw");
		};
		outdoor.showGames();
	}
}
