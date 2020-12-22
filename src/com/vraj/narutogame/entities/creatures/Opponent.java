package com.vraj.narutogame.entities.creatures;

import java.awt.Graphics;

import com.vraj.narutogame.Game;
import com.vraj.narutogame.gfx.Assets;

public class Opponent extends Creature{
	private Game game;
	
	public Opponent(Game game, float x, float y) {
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
		
		if (game.getKeyManager().up2)
			yMove = -speed;
		
		if (game.getKeyManager().down2)
			yMove = speed;
		
		if (game.getKeyManager().left2)
			xMove = -speed;
		
		if (game.getKeyManager().right2)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		// (int) converts to int
		g.drawImage(Assets.player2, (int) x, (int) y, null); 
		
	}

}

