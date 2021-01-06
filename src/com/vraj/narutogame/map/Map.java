package com.vraj.narutogame.map;
import java.awt.Graphics;

import com.vraj.narutogame.Handler;
import com.vraj.narutogame.entities.EntityManager;
import com.vraj.narutogame.entities.creatures.Player;
import com.vraj.narutogame.entities.statics.Rock;
import com.vraj.narutogame.utils.Utils;

public class Map {

	private Handler handler;
	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;
	
	private EntityManager entityManager;
	
	public Map(Handler handler) {
		this.handler = handler;	 
		entityManager = new EntityManager(handler, new Player(handler, 100, 100));
		entityManager.addEntity(new Rock(handler,100,250 ));
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void update() {
		entityManager.update();
	}

	public void render(Graphics g) {
		
		entityManager.render(g);

	}



}

