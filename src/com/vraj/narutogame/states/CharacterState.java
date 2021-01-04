package com.vraj.narutogame.states;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.swing.JFrame;

import com.vraj.narutogame.Game;
import com.vraj.narutogame.display.Display;
import com.vraj.narutogame.gfx.ImageLoader;


public class CharacterState extends State {
	private boolean nar, sas, sak, kak, nej, roc;
	private boolean chosen;
	private boolean ply2;
	private boolean flag1, flag2, flag3, flag4, flag5, flag6;
	
	public CharacterState(Game game) {
		super(game);
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//while(game.getKeyManager().esc == false) 
			//State.setState(game.pauseState);
			//update();

		//if(game.getKeyManager().res) 
		//	State.setState(game.gameState);
		
		//else if(game.getKeyManager().shf) 
		//	State.setState(game.menuState);
		
		if(nar == true) {
			if(sas == true) chosen = true;
			else if(sak == true) chosen = true;
			else if(kak == true) chosen = true;
			else if(nej == true) chosen = true;
			else if(roc == true) chosen = true;
		}
		else if (sas == true) {
			if(nar == true) chosen = true;
			else if(sak == true) chosen = true;
			else if(kak == true) chosen = true;
			else if(nej == true) chosen = true;
			else if(roc == true) chosen = true;
		}
		else if(sak == true) {
			if(sas == true) chosen = true;
			else if(nar == true) chosen = true;
			else if(kak == true) chosen = true;
			else if(nej == true) chosen = true;
			else if(roc == true) chosen = true;
		}
		else if(kak == true){
			if(sas == true) chosen = true;
			else if(sak == true) chosen = true;
			else if(nar == true) chosen = true;
			else if(nej == true) chosen = true;
			else if(roc == true) chosen = true;
		}
		else if(nej == true) {
			if(sas == true) chosen = true;
			else if(sak == true) chosen = true;
			else if(kak == true) chosen = true;
			else if(nar == true) chosen = true;
			else if(roc == true) chosen = true;
		}
		else if(roc == true) {
			if(sas == true) chosen = true;
			else if(sak == true) chosen = true;
			else if(kak == true) chosen = true;
			else if(nej == true) chosen = true;
			else if(nar == true) chosen = true;
		}
		
		//if(chosen == true) 
			//State.setState(game.gameState);
		
		//else {
		if(chosen != true) { 
			if(game.getKeyManager().one) {
				nar = true;
				//ply2 = true;
				//if(nar == true) nar = false;
				//else nar = true;
			}
			if(game.getKeyManager().two) {
				sas = true;
				//ply2 = true;
				//if(sas == true) sas = false;
				//else sas = true;
			}
			if(game.getKeyManager().thr) {
				sak = true;
				//ply2 = true;
				//if(sak == true) sak = false;
				//else sak = true;
			}
			if(game.getKeyManager().fou) {
				kak = true;
				//ply2 = true;
				//if(kak == true) kak = false;
				//else kak = true;
			}
			if(game.getKeyManager().fiv) {
				nej = true;
				//ply2 = true;
				//if(nej == true) nej = false;
				//else nej = true;
			}
			if(game.getKeyManager().six) {
				roc = true;
				//ply2 = true;
				//if(roc == true) roc = false;
				//else roc = true;
			}
		}
		
		if(game.getKeyManager().back) {
			JFrame frame = Display.getFrame();
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
		
	}
	
	public static BufferedImage resizeImage(BufferedImage originalImage, int targetWidth, int targetHeight) { 
	    BufferedImage resizedImage = new BufferedImage(targetWidth, targetHeight, BufferedImage.TYPE_INT_RGB);
	    Graphics2D graphics2D = resizedImage.createGraphics();
	    graphics2D.drawImage(originalImage, 0, 0, targetWidth, targetHeight, null);
	    graphics2D.dispose();
	    return resizedImage;
	}
	
	@Override
	public void render(Graphics g) {
		//BufferedImage img1 = (ImageLoader.loadImage("/images/characterSelection.jpg"));
		//g.drawImage(img1, -70, -10, null);
		BufferedImage img1 = (ImageLoader.loadImage("/images/zfinalimg.jpg"));
		BufferedImage img2 = resizeImage(img1, 1152, 640);
		g.drawImage(img2, 0, 0, null);
		
		int alpha = 127; // 50% transparent
		Color myColour = new Color(255, 0, 0, alpha);
		g.setFont(new Font("Geeza Pro", Font.BOLD, 22));
		if (nar == true) {
			g.setColor(myColour);
			g.fillRect(28, 230, 166, 322);//naruto chosen
			g.setColor(Color.BLACK);
			g.drawString("Naruto", 40, 370);
			g.drawString("was Chosen", 40, 390);
			//if(ply2 == false) g.drawString("by Player1", 40, 410);
			//else g.drawString("by Player2", 40, 410);
			ply2 = true;
		}
		if (sas == true) {
			g.setColor(myColour);
			g.fillRect(214, 230, 166, 322);//sasuke chosen 
			g.setColor(Color.BLACK);
			g.drawString("Sasuke", 226, 370);
			g.drawString("was Chosen", 226, 390);
			//if(ply2 == false) g.drawString("by Player1", 226, 410);
			//else g.drawString("by Player2", 226, 410);
			ply2 = true;
		}
		if(sak == true) {
			g.setColor(myColour);
			g.fillRect(400, 230, 166, 322);//sakura chosen
			g.setColor(Color.BLACK);
			g.drawString("Sakura", 412, 370);
			g.drawString("was Chosen", 412, 390);
			//if(ply2 == false) g.drawString("by Player1", 412, 410);
			//else g.drawString("by Player2", 412, 410);
			ply2 = true;
		}
		if(kak == true) {
			g.setColor(myColour);
			g.fillRect(590, 230, 166, 322);//kakashi chosen
			g.setColor(Color.BLACK);
			g.drawString("Kakashi", 602, 370);
			g.drawString("was Chosen", 602, 390);
			//if(ply2 == false) g.drawString("by Player1", 602, 410);
			//else g.drawString("by Player2", 602, 410);
			ply2 = true;
		}
		if(nej == true) {
			g.setColor(myColour);
			g.fillRect(780, 230, 166, 322);//neji chosen
			g.setColor(Color.BLACK);
			g.drawString("Neji", 792, 370);
			g.drawString("was Chosen", 792, 390);
			//if(ply2 == false) g.drawString("by Player1", 792, 410);
			//else g.drawString("by Player2", 792, 410);
			ply2 = true;
		}
		if(roc == true) {
			g.setColor(myColour);
			g.fillRect(967, 230, 166, 322);//rock lee chosen
			g.setColor(Color.BLACK);
			g.drawString("Rock Lee", 979, 370);
			g.drawString("was Chosen", 979, 390);
			//if(ply2 == false) g.drawString("by Player1", 979, 410);
			//else g.drawString("by Player2", 979, 410);
			ply2 = true;
		}
		
		//g.setColor(Color.WHITE);
		//g.setFont(new Font("Serif", Font.BOLD, 22)); 
		//g.drawString("Choose your", 515, 20);
		//g.drawString("Naruto Characters!", 480, 50);
		
		//g.setColor(Color.ORANGE);
		//g.fillRect(680, 375, 350, 40);
		//g.fillRect(680, 275, 350, 40);
		//g.setColor(Color.BLACK);
		//g.setFont(new Font("Geeza Pro", Font.BOLD, 18));
		//g.drawString("Hold [R] to go into the Game", 700, 400);
		//g.drawString("Hold [Shift] to go to Main Menu", 700, 500);
		//g.drawString("Click [esc] bar to go to Settings", 700, 300);
		
	}
	
	
	
	
	

}