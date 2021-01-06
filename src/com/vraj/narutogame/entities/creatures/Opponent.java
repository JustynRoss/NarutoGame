package com.vraj.narutogame.entities.creatures;

import java.awt.Graphics;

import com.vraj.narutogame.Handler;
import com.vraj.narutogame.gfx.Assets;

public class Opponent extends Creature{
	
	
	public Opponent(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
	}

	@Override
	public void update() {
		getInput();
		move();
	
	}
	
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if (handler.getKeyManager().up2)
			yMove = -speed;
		
		if (handler.getKeyManager().down2)
			yMove = speed;
		
		if (handler.getKeyManager().left2)
			xMove = -speed;
		
		if (handler.getKeyManager().right2)
			xMove = speed;
	}

	@Override
	public void render(Graphics g) {
		// (int) converts to int
		g.drawImage(Assets.player2, (int) x, (int) y, null); 
		
	}

}

