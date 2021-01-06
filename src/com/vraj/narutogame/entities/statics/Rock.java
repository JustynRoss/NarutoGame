package com.vraj.narutogame.entities.statics;

import java.awt.Color;
import java.awt.Graphics;

import com.vraj.narutogame.Handler;
import com.vraj.narutogame.gfx.Assets;

public class Rock extends StaticEntity {

	public Rock(Handler handler, float x, float y) {
		super(handler, x, y, 64, 64);
		// TODO Auto-generated constructor stub
		
		bounds.x = 0;
		bounds.y = 0;
		bounds.width = 64;
		bounds.height = 64;
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(Assets.smallR, (int) x, (int) y, width, height, null);
		//g.setColor(Color.red);
	   //g.fillRect((int) x , (int) y, bounds.width, bounds.height );
	}
	
	

}
