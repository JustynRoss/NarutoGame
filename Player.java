package com.vraj.narutogame.entities.creatures;


import java.awt.Graphics;

import com.vraj.narutogame.Game;
import com.vraj.narutogame.gfx.Assets;

public class Player extends Creature{
	private Game game;
	
	public Player(Game game, float x, float y) {
		super(x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		this.game = game;
	}

	@Override
	public void update() {
		getInput();
		move();
	
	}
	
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if (game.getKeyManager().up)
			yMove = -speed;
		
		if (game.getKeyManager().down)
			yMove = speed;
		
		if (game.getKeyManager().left)
			xMove = -speed;
		
		if (game.getKeyManager().right)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		// (int) converts to int
		g.drawImage(Assets.player, (int) x, (int) y, null); 
		//g.drawImage(Assets.bg2, (int)x, (int) y, null);
		//g.drawImage(Assets.map, (int) x, (int) y, 1280, 720, null);
	}

}
