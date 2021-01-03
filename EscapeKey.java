package com.vraj.narutogame.input;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import com.vraj.narutogame.pausemenu.pauseMenu;
import com.vraj.narutogame.*;

public class EscapeKey implements KeyListener {
	private static Game game;
	
	private boolean[] keys;
	public boolean esc;
	private pauseMenu menu;
	
	public EscapeKey() {
		keys = new boolean[256];
	}
	public static void getGame(Game game1) {
		game = game1;
	}
	public void checkEsc() {
		esc = keys[KeyEvent.VK_F]; System.out.println(esc);
		
		//boolean flag = false;
		if(esc == true){
			//System.out.println("ahahahahahha");
			menu = new pauseMenu(game);
			//pauseMenu menu = new pauseMenu();
			//pauseMenu menu = new pauseMenu("Pause Menu", 1152, 640);
			}
		
		
		
		
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
