package com.vraj.narutogame;

import com.vraj.narutogame.input.KeyManager;
import com.vraj.narutogame.map.Map;

public class Handler {
	
	private Game game;
	
	private Map map;
	
	public Handler(Game game) {
		this.game = game;
	}
	
	public KeyManager getKeyManager() {
		return game.getKeyManager();
		}
	
	public int getWidth() {
		return game.getWidth();
	}
	
	public int getHeight() {
		return game.getWidth();
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Map getMap() {
		return map;
	}

	public void setMap(Map map) {
		this.map = map;
	}

	}


