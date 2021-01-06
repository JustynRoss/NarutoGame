package com.vraj.narutogame;

//import com.vraj.narutogame.input.EscapeKey;

public class Launcher {
	public static void main (String[] args) {
		Game game = new Game("Naruto Battle", 1152, 640, 120);
		//Game game = new Game("Naruto Battle", 1920, 1080, 120);
		game.start();
		//EscapeKey.getGame(game);
	}

}
