package com.vraj.narutogame.pausemenu;

import com.vraj.narutogame.*;

import javax.swing.JFrame;

public class pauseMenu {
	private Game game;
	
	public int width, height;
	public String title;

	public pauseMenu(Game game) {
		//if (game.getEscapeKey().esc)
			menuRun("Pause Menu", 1152, 640);
	}
	
	public void menuRun(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;
		JFrame frame = new JFrame(title);
		frame.setSize(width, height);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
}
