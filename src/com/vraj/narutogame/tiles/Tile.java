package com.vraj.narutogame.tiles;

import java.awt.Graphics;
import java.awt.image.BufferedImage;

import com.vraj.narutogame.gfx.Assets;

public class Tile {
	//static stuff here
	public static Tile[] tiles = new Tile[256];
	//this array is gonna hold an instance of every single tile in the map
	public static Tile hedgeTile = new HedgeTile(0);
	public static Tile wallTile = new WallTile(1);
	public static Tile hedgeTile2 = new HedgeTile2(2);
	public static Tile wallTile2 = new WallTile2(3);
	public static Tile hedgeTile3= new HedgeTile3(4);
	public static Tile wallTile3 = new WallTile3(5);
	public static Tile hedgeTile4 = new HedgeTile4(6);
	public static Tile wallTile4 = new WallTile4(7);
	public static Tile floorTile = new FloorTile(8);
	public static Tile smallRock = new SmallRockTile(9);
	public static Tile bigRock = new BigRockTile(10);
	public static Tile bigRock2 = new BigRockTile2(11);
	public static Tile grass = new GrassTile(12);
	public static Tile metalTile = new MetalTile(13);
	
	
	
	
	//Class
	
	public static final int TILEWIDTH = 128, TILEHEIGHT = 128;
	
	protected BufferedImage texture;
	protected final int id;
	
	public Tile(BufferedImage texture, int id) {
		this.texture = texture;
		this.id = id;
		
		tiles[id] = this;
		
	}
	
	public void update() {
		
	}
	
	public void render(Graphics g, int x, int y) {
		
		g.drawImage(texture, x, y, TILEWIDTH, TILEHEIGHT, null);
		
	}
	
	public void render(Graphics g, int x, int y, int widthSize, int heightSize) {
		
		g.drawImage(texture, x, y, widthSize, heightSize, null);
		
	}
	public boolean isSolid() {
		return false;
	}
	
	public int getId() {
		return id;
	}
	

}
