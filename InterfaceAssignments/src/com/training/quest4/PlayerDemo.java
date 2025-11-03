package com.training.quest4;
import java.util.*;

public class PlayerDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which media player would you like to use?");
		System.out.println("VLC / Windows Player");
		String choice = sc.nextLine();
		
		IMediaPlayer player = null;
		
		if (choice.equalsIgnoreCase("VLC")) {
			player = new VLCMediaPlayer();
		} else if (choice.equalsIgnoreCase("Windows Player")) {
			player = new WindowsMediaPlayer11();
		} else {
			System.out.println("No such media player exists!");
			System.exit(0);
		}
		player.playVideo();
		player.downloadMusic();
	}
}