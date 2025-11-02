package com.training.quest4;

public class VLCMediaPlayer implements IMediaPlayer {

	@Override
	public void playVideo() {
		System.out.println("Play mkv files");
	}

	@Override
	public void downloadMusic() {
		System.out.println("Download files as mp3");
	}

}
