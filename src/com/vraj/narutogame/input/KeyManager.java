package com.vraj.narutogame.input;


import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyManager implements KeyListener {
	
	private boolean[] keys;
	public boolean up, down, left, right;
	public boolean up2, down2, left2, right2;
	
	public KeyManager() {
		keys = new boolean[256];
	}
	
	public void updatePlayer() {
		up = keys[KeyEvent.VK_UP];
		down = keys[KeyEvent.VK_DOWN];
		left = keys[KeyEvent.VK_LEFT];
		right = keys[KeyEvent.VK_RIGHT];
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
		keys[e.getKeyCode()] = true;
		//System.out.println("Pressed");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = false;
		
	}

}

