package com.vraj.narutogame.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.vraj.narutogame.Game;
import com.vraj.narutogame.Handler;
import com.vraj.narutogame.display.Display;
import com.vraj.narutogame.gfx.Assets;
import com.vraj.narutogame.gfx.ImageLoader;



public class PauseState extends State {
	private boolean restart, exit;
	private int frames;
	
	public PauseState(Handler handler) {
		super(handler);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//while(game.getKeyManager().esc == false) 
			//State.setState(game.pauseState);
			//update();

		if(handler.getKeyManager().res) 
			State.setState(handler.getGame().gameState);
		
		else if(handler.getKeyManager().back) {
			JFrame frame = Display.getFrame();
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
		
		else if(handler.getKeyManager().shf) 
			State.setState(handler.getGame().menuState);
		
		else if(handler.getKeyManager().one) {
			restart = true;
			exit = false;
			frames = 1;
			//Game game1 = new Game("Naruto Battle", 1152, 640, 30);
			//game.setFps(30);
			//game1.start();
		}
		else if(handler.getKeyManager().two) {
			restart = true;
			exit = false;
			frames = 2;
			//Game game = new Game("Naruto Battle", 1152, 640, 60);
			//game.start();
			//game.setFps(60);
		}
		else if(handler.getKeyManager().thr) {
			restart = true;
			exit = false;
			frames = 3;
			//Game game = new Game("Naruto Battle", 1152, 640, 120);
			//game.start();
			//game.setFps(120);
		}
		
		if(restart == true && exit == false) {
			if(handler.getKeyManager().esc) exit = true;
			if(handler.getKeyManager().e) {
				restart = false;
				if(frames == 1) {
					handler.getGame().setFps(30);
				}
				else if(frames == 2) {
					Game game = new Game("Naruto Battle", 1152, 640, 60);
					game.start();
				}
				else if(frames == 3) {
					Game game = new Game("Naruto Battle", 1152, 640, 120);
					game.start();
				}
				else exit = true;
			}
		}
		
		
	}


	@Override
	public void render(Graphics g) {
		
		g.drawImage(Assets.pauseBg, -430, -300, null);
		
		
		g.setColor(Color.ORANGE);
		g.fillRect(380, 175, 380, 40);//Show fps
		g.fillRect(470, 220, 290, 40);//change to 30fps
		g.fillRect(470, 270, 290, 40);//change to 60fps
		g.fillRect(470, 320, 290, 40);//change to 120fps
		g.fillRect(380, 400, 380, 40);//go into game
		g.fillRect(380, 475, 380, 40);//go to main menu
		g.fillRect(380, 550, 380, 40);//exit application
		g.setColor(Color.BLACK);
		g.setFont(new Font("Geeza Pro", Font.BOLD, 18));
		g.drawString("Your current FPS: " + handler.getGame().getFps(), 400, 200);
		g.drawString("Hold [1] to change to 30 FPS", 490, 245);
		g.drawString("Hold [2] to change to 60 FPS", 490, 295);
		g.drawString("Hold [3] to change to 120 FPS", 490, 345);
		g.drawString("Hold [R] to go into the Game", 400, 420);
		g.drawString("Hold [Shift] to go to Main Menu", 400, 500);
		g.drawString("Hold [Backspace] to Exit Application", 400, 580);
		 
		g.setColor(Color.WHITE);
		g.drawString("You are in the settings/pause menu", 400, 100);
		
		if(restart == true && exit == false) {
			int alpha = 230; //full opacity = 254
			Color myColour = new Color(0, 0, 0, alpha);
			g.setColor(myColour);
			g.fillRect(100, 50, 952, 540);
			g.setColor(Color.WHITE);
			g.setFont(new Font("Geeza Pro", Font.BOLD, 22));;
			g.drawString("Are you sure you want to change this?", 390, 250);
			g.drawString("(This action will restart the application)", 390, 280);
			g.drawString("[E] to apply changes", 200, 480);
			g.drawString("[esc] to cancel", 750, 480);
		}
		
		
	}
	
	
	
	
	

}
