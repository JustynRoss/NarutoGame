package com.vraj.narutogame.states;

import com.vraj.narutogame.display.Display;

import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.MenuComponent;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.vraj.narutogame.Game;
import com.vraj.narutogame.gfx.ImageLoader;
import com.vraj.narutogame.tiles.Tile;
import com.vraj.narutogame.states.*;



public class MenuState extends State{
	//private JButton button = new JButton("Press [esc] to Start Game");
	//private JButton setButton = new JButton("Settings");
	
	 
	public MenuState(Game game) {
		//EVERYTIME WE COME BACK TO MENU, GAME RESETS
		//ALL HP, DAMAGE, CHARACTERS ALL GO DEFAULT
		super(game);
		
		
		
//		if(State.getState() == game.menuState)
//		button = new JButton("Start Game");
//	else if(State.getState() == game.pauseState)
//		button = new JButton("Resume Game");
	//JFrame frame = new JFrame();//Display.getFrame();
	
//	button.addActionListener(new ActionListener(){
		
//        public void actionPerformed(ActionEvent e) {
//        	State.setState(game.gameState);
        	//button.setVisible(false);
        	//canvas.remove(button);
           //canvas.repaint();
//        }
//    });
	//frame.add(setButton, BorderLayout.WEST);
	
	//button.setPreferredSize(new Dimension(10, 40));
	//button.setBounds(0, 0, 10, 10);
	//frame.add(button);
	//frame.add(button, BorderLayout.SOUTH);
	//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	//frame.pack();
    //frame.setVisible(true);
	//button.setVisible(true);
	//frame.getContentPane().validate();
	}
	
	@Override
	public void update() {
		// TODO Auto-generated method stub
		
		if(game.getKeyManager().spc) {
			State.setState(game.characterState);
//			button.setVisible(false);
		}
//		if(game.getKeyManager().esc)
//			State.setState(game.pauseState);
		
		if(game.getKeyManager().back) {
			JFrame frame = Display.getFrame();
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
		
		} 

	@Override
	public void render(Graphics g){  
		BufferedImage img1 = (ImageLoader.loadImage("/images/bigRock.png"));
		BufferedImage img2 = (ImageLoader.loadImage("/images/narutobackground.jpg"));
		//JFrame frame = Display.getFrame();
		//frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		g.drawImage(img2, -800, -250, null);
		
		g.drawImage(img1, 450, 50, null);
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
