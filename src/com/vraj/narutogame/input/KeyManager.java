package com.vraj.narutogame.input;


import javax.swing.*;
import java.awt.Button;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
	
	private boolean[] keys;
	public boolean up, down, left, right;
	public boolean up2, down2, left2, right2;
	public boolean esc, spc, res, shf, back, one, two, thr, fou, fiv, six;
	
	//public String printer = "";
	  
	public KeyManager() {
		keys = new boolean[256];
	}
	
	public void updatePlayer() {
		up = keys[KeyEvent.VK_UP];//UP
		down = keys[KeyEvent.VK_DOWN];//DOWN
		left = keys[KeyEvent.VK_LEFT];//LEFT
		right = keys[KeyEvent.VK_RIGHT];//RIGHT
		
		
		//esc = keys[KeyEvent.VK_ESCAPE];

		//boolean flag = false;
		//if(esc == true){
			//System.out.println("ahahahahahha");
			//pauseMenu menu = new pauseMenu();
			//pauseMenu menu = new pauseMenu("Pause Menu", 1152, 640);
		//}
	}
	public void checkEscape() {
		esc = keys[KeyEvent.VK_ESCAPE];
		spc = keys[KeyEvent.VK_SPACE];
		res = keys[KeyEvent.VK_R];
		shf = keys[KeyEvent.VK_SHIFT];
		back = keys[KeyEvent.VK_BACK_SPACE];
		one = keys[KeyEvent.VK_1];
		two = keys[KeyEvent.VK_2];
		thr = keys[KeyEvent.VK_3];
		fou = keys[KeyEvent.VK_4];
		fiv = keys[KeyEvent.VK_5];
		six = keys[KeyEvent.VK_6];
	}
	
	public void updateOpponent() {
		up2 = keys[KeyEvent.VK_W];
		down2 = keys[KeyEvent.VK_S];
		left2 = keys[KeyEvent.VK_A];
		right2 = keys[KeyEvent.VK_D];
	}
	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//if(e.getKeyCode() == KeyEvent.VK_ESCAPE)

		keys[e.getKeyCode()] = true;
		//System.out.println("Pressed");
	}
	

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}

}