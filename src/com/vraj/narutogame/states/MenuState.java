package com.vraj.narutogame.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;

import com.vraj.narutogame.Handler;
import com.vraj.narutogame.display.Display;
import com.vraj.narutogame.gfx.Assets;
import com.vraj.narutogame.gfx.ImageLoader;



public class MenuState extends State{
	//private JButton button = new JButton("Press [esc] to Start Game");
	//private JButton setButton = new JButton("Settings");
	
	 
	public MenuState(Handler handler) {
		//EVERYTIME WE COME BACK TO MENU, GAME RESETS
		//ALL HP, DAMAGE, CHARACTERS ALL GO DEFAULT
		super(handler);
		
		
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		if(handler.getKeyManager().spc) {
			State.setState(handler.getGame().characterState);
//			button.setVisible(false);
		}
//		if(game.getKeyManager().esc)
//			State.setState(game.pauseState);
		
		if(handler.getKeyManager().back) {
			JFrame frame = Display.getFrame();
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
		
		} 

	@Override
	public void render(Graphics g){  
		//BufferedImage img1 = (ImageLoader.loadImage("/images/bigRock.png"));
		//BufferedImage img2 = (ImageLoader.loadImage("/images/narutobackground.jpg"));
		//JFrame frame = Display.getFrame();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		g.drawImage(Assets.narutoBg, -800, -250, null);
		
		g.drawImage(Assets.bigRock, 450, 50, null);
		g.setColor(Color.GREEN);
		g.setFont(new Font("Serif", Font.BOLD, 22)); 
		g.drawString("Welcome to", 515, 110);
		g.drawString("Naruto Fight Game!", 480, 140);
		
		g.setColor(Color.ORANGE);
		g.fillRect(680, 375, 380, 40);
		//g.fillRect(680, 275, 380, 40);
		g.fillRect(680, 475, 380, 40);
		g.setColor(Color.BLACK);
		g.setFont(new Font("Geeza Pro", Font.BOLD, 18));
		g.drawString("Click [space] bar to choose Characters", 700, 400);
		//g.drawString("Click [esc] bar to go to Settings", 700, 300);
		g.drawString("Click [Backspace] to Exit Application", 700, 500);
		
		
		
		//g.setColor(Color.RED);
		//g.fillOval(100, 100, 200, 200);
		//g.setColor(Color.RED);
		//g.drawRect(40, 20, 150, 80)
	}
	
	
	
	

}