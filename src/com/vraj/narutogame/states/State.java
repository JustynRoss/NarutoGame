package com.vraj.narutogame.states;

import java.awt.Graphics;
import java.io.IOException;

import javax.swing.JPanel;

import com.vraj.narutogame.Game;

public abstract class State{
	
	
	private static State currentState = null;
	
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
	
	
	protected Game game;
	
	public State(Game game) {
		this.game = game;
	}
	//everything a state must have a update and render method
	
	public abstract void update();
	
	public abstract void render(Graphics g) ;

}
