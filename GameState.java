package com.vraj.narutogame.states;


import java.awt.Graphics;

import com.vraj.narutogame.Game;
import com.vraj.narutogame.Handler;
import com.vraj.narutogame.entities.creatures.Opponent;
import com.vraj.narutogame.entities.creatures.Player;
import com.vraj.narutogame.map.Map;
import com.vraj.narutogame.tiles.Tile;


public class GameState extends State {

	private Player player;

	private Opponent player2;
	
	

	private Map map;
	private Map map2;
	private Map map3;


	public GameState(Game game) {
		super(game);
		map = new Map();
		//map2 = new Map("resources/map/map2.txt");
		//map3 = new Map("resources/map/map3.txt");

		player = new Player(game, 100,100);
		player2 = new Opponent(game, 0, 0);
		
		
		


	}

	@Override
	public void update() {
		
		map.update();
		//map2.update();
		//map3.update();
		
		player.update(); 
		player2.update();
		//tile.update();
		//tile2.update();


	}

	@Override
	public void render(Graphics g) {
		
		
		//tile2.render2(g);
		
		
		//g.drawImage(Assets.hedge3, 1154, 594, 128, 128, null);
	//	g.drawImage(Assets.hedge4, 0, 594, 128, 128, null);*/
		
		
		//tile.render(g, 0, 0, 640, 480);
		
		map.render(g);
		
	  //  map2.render(g);
	    
	    /*
	    for (int i =15; i  < 280 ; i += 70) {
	    	for (int j = 200; j < 450; j+=50) {
		    Tile.tiles[13].render(g, i, j, 70, 50);
		    }
	}
	    
	    for (int i = 1065; i  > 800 ; i -= 70) {
	    	for (int j = 200; j < 450; j+=50) {
		    Tile.tiles[13].render(g, i, j, 70, 50);
		    }
	}
	    
	    Tile.tiles[11].render(g, 450, 370, 50, 100);
	    Tile.tiles[10].render(g, 500, 370, 100, 50);
	    Tile.tiles[9].render(g, 450, 520, 50, 50);
	    Tile.tiles[10].render(g, 500, 520, 100, 50);
	    Tile.tiles[12].render(g, 600, 370, 50, 50);
	    Tile.tiles[13].render(g, 500, 420, 90, 50);
	    Tile.tiles[13].render(g, 500, 470, 90, 50);
	    Tile.tiles[13].render(g, 590, 420, 90, 50);
	    Tile.tiles[13].render(g, 590, 470, 90, 50);
	   
	    
	    
	    
	    //map3.render2(g);
	    Tile.tiles[9].render(g, 15, 150, 50, 50);
	    Tile.tiles[12].render(g, 65, 150, 50, 50);
	    Tile.tiles[9].render(g, 115, 150, 50, 50);
	    Tile.tiles[10].render(g, 165, 150, 100, 50);
	    Tile.tiles[11].render(g, 265, 150, 50, 100);
	    
	    
	    Tile.tiles[9].render(g, 15, 450, 50, 50);
	    Tile.tiles[12].render(g, 65, 450, 50, 50);
	    Tile.tiles[9].render(g, 115, 450, 50, 50);
	    Tile.tiles[10].render(g, 165, 450, 100, 50);
	    Tile.tiles[11].render(g, 265, 400, 50, 100);
	    
	    
	    
	    Tile.tiles[9].render(g, 1087, 150, 50, 50);
	    Tile.tiles[12].render(g, 1037 , 150, 50, 50);
	    Tile.tiles[9].render(g, 987, 150, 50, 50);
	    Tile.tiles[10].render(g, 887, 150, 100, 50);
	    Tile.tiles[11].render(g, 837, 150, 50, 100);
	    
	    
	    Tile.tiles[9].render(g, 1087, 450, 50, 50);
	    Tile.tiles[12].render(g, 1037 , 450, 50, 50);
	    Tile.tiles[9].render(g, 987, 450, 50, 50);
	    Tile.tiles[10].render(g, 887, 450, 100, 50);
	    Tile.tiles[11].render(g, 837, 400, 50, 100);
	    
	    
	  */  
	    
		player.render(g);
		player2.render(g);

	}






}

