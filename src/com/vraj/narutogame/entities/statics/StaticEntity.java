package com.vraj.narutogame.entities.statics;

import com.vraj.narutogame.Handler;
import com.vraj.narutogame.entities.Entity;

public abstract class StaticEntity extends Entity {
	
	public StaticEntity(Handler handler, float x, float y, int width, int height) {
		super (handler, x, y, width, height);
	}

}
