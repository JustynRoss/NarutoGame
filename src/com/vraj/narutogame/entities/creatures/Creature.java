package com.vraj.narutogame.entities.creatures;

import com.vraj.narutogame.Handler;
import com.vraj.narutogame.entities.Entity;

public abstract class Creature extends Entity {

	public static final int DEFAULT_HEALTH = 10;
	public static final float DEFAULT_SPEED = 3.0f;
	public static final int DEFAULT_CREATURE_WIDTH = 64,
			DEFAULT_CREATURE_HEIGHT = 64;

	protected int health;
	protected float speed;
	protected float xMove, yMove;

	public Creature(Handler handler, float x, float y, int width, int height) {
		super(handler, x, y, width, height);
		health = DEFAULT_HEALTH;
		speed = DEFAULT_SPEED;
		xMove = 0;
		yMove = 0;
	}


	public void move(){
		//CHECK were we are MOVING TO IN THE X ANY Y DIRECTION
		if(!checkCollisions(xMove,0f)) 
			moveX();	

		if(!checkCollisions(0f, yMove)) 
			moveY();	

	}

	public void moveX(){
		x += xMove;
	}

	public void moveY(){
		y+=yMove;
	}


	//GETTERS AND SETTERS

	public float getxMove() {
		return xMove;
	}

	public void setxMove(float xMove) {
		this.xMove = xMove;
	}

	public float getyMove() {
		return yMove;
	}

	public void setyMove(float yMove) {
		this.yMove = yMove;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public float getSpeed() {
		return speed;
	}

	public void setSpeed(float speed) {
		this.speed = speed;
	}


}

