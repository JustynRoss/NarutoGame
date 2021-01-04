package com.vraj.narutogame.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.vraj.narutogame.input.KeyManager;
import com.vraj.narutogame.Game;
import com.vraj.narutogame.display.Display;
import com.vraj.narutogame.gfx.ImageLoader;



public class PauseState extends State {
	
	public PauseState(Game game) {
		super(game);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//while(game.getKeyManager().esc == false) 
			//State.setState(game.pauseState);
			//update();

		if(game.getKeyManager().res) 
			State.setState(game.gameState);
		
		else if(game.getKeyManager().shf) 
			State.setState(game.menuState);
		
		else if(game.getKeyManager().one) {
			Game game1 = new Game("Naruto Battle", 1152, 640, 30);
			//game.setFps(30);
			game1.start();
		}
		else if(game.getKeyManager().two) {
			Game game = new Game("Naruto Battle", 1152, 640, 60);
			game.start();
			//game.setFps(60);
		}
		else if(game.getKeyManager().thr) {
			Game game = new Game("Naruto Battle", 1152, 640, 120);
			game.start();
			//game.setFps(120);
		}
		
	}


	@Override
	public void render(Graphics g) {
		BufferedImage img1 = (ImageLoader.loadImage("/images/narutopause.jpg"));
		g.drawImage(img1, -430, -300, null);
		
		
		g.setColor(Color.ORANGE);
		g.fillRect(380, 175, 380, 40);//Show fps
		g.fillRect(470, 220, 290, 40);//change to 30fps
		g.fillRect(470, 270, 290, 40);//change to 60fps
		g.fillRect(470, 320, 290, 40);//change to 120fps
		g.fillRect(380, 400, 380, 40);//go into game
		g.fillRect(380, 475, 380, 40);//go to main menu
		g.setColor(Color.BLACK);
		g.setFont(new Font("Geeza Pro", Font.BOLD, 18));
		g.drawString("Your current FPS: " + game.getFps(), 400, 200);
		g.drawString("Hold [1] to change to 30 FPS", 490, 245);
		g.drawString("Hold [2] to change to 60 FPS", 490, 295);
		g.drawString("Hold [3] to change to 120 FPS", 490, 345);
		g.drawString("Hold [R] to go into the Game", 400, 420);
		g.drawString("Hold [Shift] to go to Main Menu", 400, 500);
		 
		g.setColor(Color.WHITE);
		g.drawString("You are in the settings/pause menu", 400, 100);
		
		
	}
	
	
	
	
	

}
