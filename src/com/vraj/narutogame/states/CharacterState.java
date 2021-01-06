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
import com.vraj.narutogame.Handler;
import com.vraj.narutogame.display.Display;
import com.vraj.narutogame.gfx.Assets;
import com.vraj.narutogame.gfx.ImageLoader;


public class CharacterState extends State {
	private boolean nar, sas, sak, kak, nej, roc;
	private boolean chosen;
	//private int p2c1 = 0, p2c2;
	private boolean flag1, flag2, flag3, flag4, flag5, flag6;
	private boolean[] flaq = new boolean[6]; //private boolean flaq1, flaq2, flaq3, flaq4, flaq5, flaq6;
	private static String Player1 = null, Player2 = null; //Their String must be updated once chosen below
	//When implemented the characters sprite sheet,
	//they can be referenced from the string
	public static String getPlayer1() {
		return Player1;
	}
	public static String getPlayer2() {
		return Player2;
	}


	public CharacterState(Handler handler) {
		super(handler);

	}

	private void restart() {
		nar = false; sas = false; sak = false; kak = false; nej = false; roc = false;
		chosen = false;
		flag1= false; flag2= false; flag3= false; flag4= false; flag5= false; flag6= false;
		Player1 = null; Player2 = null;
		for (int i  =0; i  <6; i++) flaq[i] = false;//p2c1 = 0; //p2c2 = 0;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		//while(game.getKeyManager().esc == false)
		//State.setState(game.pauseState);
		//update();

		if(handler.getKeyManager().res) {
			restart();
		}
		if(chosen == true && (!(flag1 || flag2 || flag3 || flag4 || flag5 || flag6))) {
			restart();
		}

		//checks if player2 has more than 1 character
		//if yes, characters reset
		//[case: player2 hits 2 characters simultaneously]
		//(each player is only allowed 1 character)
		for (int i=0; i<6; i++) {
			for (int j=0; j<6; j++) {
				if(flaq[i])
					if((flaq[j])&&j!=i)
						restart();
			}
		}
		//if(flaq1-6 == true)

		//else if(game.getKeyManager().shf)
		// State.setState(game.menuState);

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
			if(handler.getKeyManager().one) {
				nar = true;
				//counter++;//ply2 = true;
				//if(nar == true) nar = false;
				//else nar = true;
			}
			if(handler.getKeyManager().two) {
				sas = true;
				//counter++;//ply2 = true;
				//if(sas == true) sas = false;
				//else sas = true;
			}
			if(handler.getKeyManager().thr) {
				sak = true;
				//counter++;//ply2 = true;
				//if(sak == true) sak = false;
				//else sak = true;
			}
			if(handler.getKeyManager().fou) {
				kak = true;
				//counter++;//ply2 = true;
				//if(kak == true) kak = false;
				//else kak = true;
			}
			if(handler.getKeyManager().fiv) {
				nej = true;
				//counter++;//ply2 = true;
				//if(nej == true) nej = false;
				//else nej = true;
			}
			if(handler.getKeyManager().six) {
				roc = true;
				//counter++;//ply2 = true;
				//if(roc == true) roc = false;
				//else roc = true;
			}
		}

		if(handler.getKeyManager().back) {
			JFrame frame = Display.getFrame();
			frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
		}
		if(chosen == true && (flag1 || flag2 || flag3 || flag4 || flag5 || flag6)) {
			if(handler.getKeyManager().e) State.setState(handler.getGame().gameState);
		}

	}

	

	@Override
	public void render(Graphics g) {
		//BufferedImage img1 = (ImageLoader.loadImage("/images/characterSelection.jpg"));
		//g.drawImage(img1, -70, -10, null);
		
		g.drawImage(Assets.characterBg, 0, 0, null);

		int alpha = 127; // 50% transparent
		Color myColour = new Color(255, 0, 0, alpha);
		g.setFont(new Font("Geeza Pro", Font.BOLD, 22));
		if (nar == true) {
			g.setColor(myColour);
			g.fillRect(28, 230, 166, 322);//naruto chosen
			g.setColor(Color.BLACK);
			g.drawString("Naruto", 40, 370);
			g.drawString("was Chosen", 40, 390);
			if((sas || sak || kak || nej || roc) && flag1 == false) {
				g.drawString("by Player2", 40, 410);
				Player2 = "Naruto";
				flaq[0] = true;//p2Counter=1;
			}
			else if(!(sas && sak && kak && nej && roc)) {
				g.drawString("by Player1", 40, 410);//if(ply2 == false)
				flag1 = true;
				Player1 = "Naruto";
			}
			//ply2 = true;
		}
		if (sas == true) {
			g.setColor(myColour);
			g.fillRect(214, 230, 166, 322);//sasuke chosen
			g.setColor(Color.BLACK);
			g.drawString("Sasuke", 226, 370);
			g.drawString("was Chosen", 226, 390);
			if((nar || sak || kak || nej || roc) && flag2 == false) {
				g.drawString("by Player2", 226, 410);
				Player2 = "Sasuke";
				flaq[1] = true;//p2Counter++;
			}
			else if(!(nar && sak && kak && nej && roc)) {
				g.drawString("by Player1", 226, 410);//if(ply2 == false)
				flag2 = true;
				Player1 = "Sasuke";
			}
			//ply2 = true;
		}
		if(sak == true) {
			g.setColor(myColour);
			g.fillRect(400, 230, 166, 322);//sakura chosen
			g.setColor(Color.BLACK);
			g.drawString("Sakura", 412, 370);
			g.drawString("was Chosen", 412, 390);
			if((nar || sas || kak || nej || roc) && flag3 == false) {
				g.drawString("by Player2", 412, 410);
				Player2 = "Sakura";
				flaq[2] = true;//p2Counter++;
			}
			else if(!(nar && sas && kak && nej && roc)) {
				g.drawString("by Player1", 412, 410);//if(ply2 == false)
				flag3 = true;
				Player1 = "Sakura";
			}
			//ply2 = true;
		}
		if(kak == true) {
			g.setColor(myColour);
			g.fillRect(590, 230, 166, 322);//kakashi chosen
			g.setColor(Color.BLACK);
			g.drawString("Kakashi", 602, 370);
			g.drawString("was Chosen", 602, 390);
			if((nar || sas || sak || nej || roc) && flag4 == false) {
				g.drawString("by Player2", 602, 410);
				Player2 = "Kakashi";
				flaq[3] = true;//p2Counter++;
			}
			else if(!(nar && sas && sak && nej && roc)) {
				g.drawString("by Player1", 602, 410);//if(ply2 == false)
				flag4 = true;
				Player1 = "Kakashi";
			}
			//ply2 = true;
		}
		if(nej == true) {
			g.setColor(myColour);
			g.fillRect(780, 230, 166, 322);//neji chosen
			g.setColor(Color.BLACK);
			g.drawString("Neji", 792, 370);
			g.drawString("was Chosen", 792, 390);
			if((nar || sas || sak || kak || roc) && flag5 == false) {
				g.drawString("by Player2", 792, 410);
				Player2 = "Neji";
				flaq[4] = true;//p2Counter++;
			}
			else if(!(nar && sas && sak && kak && roc)) {
				g.drawString("by Player1", 792, 410);//if(ply2 == false) g.drawString("by Player1", 792, 410);
				flag5 = true;
				Player1 = "Neji";
			}
			//ply2 = true;
		}
		if(roc == true) {
			g.setColor(myColour);
			g.fillRect(967, 230, 166, 322);//rock lee chosen
			g.setColor(Color.BLACK);
			g.drawString("Rock Lee", 979, 370);
			g.drawString("was Chosen", 979, 390);
			if((nar || sas || sak || kak || nej) && flag6 == false) {
				g.drawString("by Player2", 979, 410);
				Player2 = "Rock Lee";
				flaq[5] = true;//p2Counter++;
			}
			else if(!(nar && sas && sak && kak && nej)) {
				g.drawString("by Player1", 979, 410);//if(ply2 == false) g.drawString("by Player1", 979, 410);
				flag6 = true;
				Player1 = "Rock Lee";
			}
			//ply2 = true;
		}

		if(chosen == true && (flag1 || flag2 || flag3 || flag4 || flag5 || flag6)) {
			g.setColor(Color.YELLOW);
			g.fillRect(485, 570, 200, 55);
			g.setColor(Color.BLACK);
			g.drawString("[E] to Start Game", 500, 600);
		}

		g.setColor(Color.WHITE);
		g.drawString("Hold [R] to Reset", 15, 25);
		g.drawString("Character Choices", 15, 50);
		g.drawString("Click [Backspace] to", 920, 25);
		g.drawString("Exit Application", 970, 50);

		//if(!(nar && sas && sak && kak && nej && roc)) {
		//if (!(flag1 && flag2 && flag3 && flag4 && flag5 && flag6)) {
		if(Player1 == null) {
			g.drawString("Player 1, Choose your Character", 400, 200);
		}
		else if (Player1 != null && Player2 == null) g.drawString("Player 2, Choose your Character", 400, 200);
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