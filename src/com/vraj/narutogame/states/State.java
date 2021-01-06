package com.vraj.narutogame.states;

import java.awt.Graphics;

import com.vraj.narutogame.Handler;

public abstract class State {
	
	
	private static State currentState = null;
	
	public static void setState(State state) {
		currentState = state;
	}
	
	public static State getState() {
		return currentState;
	}
	
	
	protected Handler handler;
	
	public State(Handler handler) {
		this.handler = handler;
	}
	//everything a state must have a update and render method
	
	public abstract void update();
	
	public abstract void render(Graphics g);

}

