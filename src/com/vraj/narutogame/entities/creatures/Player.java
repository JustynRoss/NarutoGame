package com.vraj.narutogame.entities.creatures;


import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.vraj.narutogame.Handler;
import com.vraj.narutogame.gfx.Assets;

public class Player extends Creature{
	

	
	public Player(Handler handler, float x, float y) {
		super(handler, x, y, Creature.DEFAULT_CREATURE_WIDTH, Creature.DEFAULT_CREATURE_HEIGHT);
		
		//bounds.x = 2;
		//bounds.y = 2;
		bounds.width = Assets.player.getWidth();
		bounds.height = Assets.player.getHeight();
		
		//walkLeft = new Animation(Assets.walkingLeft, 10);
	}

	@Override
	public void update() {
		
		//walkLeft.update();
		getInput();
		move();
	
	}
	
	private void getInput() {
		xMove = 0;
		yMove = 0;
		
		if (handler.getKeyManager().up)
			yMove = -speed;
		
		if (handler.getKeyManager().down)
			yMove = speed;
		
		if (handler.getKeyManager().left)
			xMove = -speed;
		
		if (handler.getKeyManager().right)
			xMove = speed;
		
		
			
	}

	@Override
	public void render(Graphics g) {
		// (int) converts to int
		
		g.drawImage(Assets.player, (int) x, (int) y, null);
		//g.setColor(Color.red);
		//g.fillRect((int) x , (int) y, bounds.width, bounds.height );
		//g.drawImage(Assets.bg2, (int)x, (int) y, null);
		//g.drawImage(Assets.map, (int) x, (int) y, 1280, 720, null);
	}
	
}
