package com.vraj.narutogame.map;
import java.awt.Graphics;

import com.vraj.narutogame.tiles.Tile;
import com.vraj.narutogame.utils.Utils;

public class Map {

	private int width, height;
	private int spawnX, spawnY;
	private int[][] tiles;

	public Map() {
		
	}

	public void update() {

	}

	public void render(Graphics g) {
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

	}
	

	
/*	public Tile getTile(int x, int y) {
		Tile t = Tile.tiles[tiles[x][y]];
		if (t == null)
			return Tile.hedgeTile;
		return t;
	}

*/

/*	private void loadWorld(String path) {
		
		String file = Utils.loadFileAsString(path);
		String[] tokens = file.split("\\s+");
		width = Utils.parseInt(tokens[0]);
		height = Utils.parseInt(tokens[1]);
		spawnX = Utils.parseInt(tokens[2]);
		spawnY = Utils.parseInt(tokens[3]);
		
		tiles =  new int[width][height];
		for (int y= 0; y < height; y++) {
			for(int x= 0; x < width; x++) {
				tiles[x][y] = Utils.parseInt(tokens[(x + y * width) + 4]);
			}
		}
	}*/

}

